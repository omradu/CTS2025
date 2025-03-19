public class VirtualMachineLazy {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static VirtualMachineLazy instance = null;

    private VirtualMachineLazy() {
        this.connectionPort = 3389;
        this.ipAddress = "10.0.0.1";
        this.virtualMachineName = "lazyDatabaseVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }

    public static VirtualMachineLazy getInstance() {
        if(instance == null) {
            instance = new VirtualMachineLazy();
        }

        return instance;
    }
}
