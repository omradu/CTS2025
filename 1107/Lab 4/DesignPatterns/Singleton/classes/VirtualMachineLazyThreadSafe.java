public class VirtualMachineLazyThreadSafe {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static VirtualMachineLazyThreadSafe instance = null;

    private VirtualMachineLazyThreadSafe() {
        this.connectionPort = 3389;
        this.ipAddress = "10.0.0.1";
        this.virtualMachineName = "lazyThreadSafeDatabaseVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }

    public static synchronized VirtualMachineLazyThreadSafe getInstance() {
        if(instance == null) {
            instance = new VirtualMachineLazyThreadSafe();
        }

        return instance;
    }
}
