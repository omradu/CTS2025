public class VirtualMachineLazyThreadSafeBetter {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static VirtualMachineLazyThreadSafeBetter instance = null;

    private VirtualMachineLazyThreadSafeBetter() {
        this.connectionPort = 3389;
        this.ipAddress = "10.0.0.1";
        this.virtualMachineName = "lazyThreadSafeBetterDatabaseVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }

    public static VirtualMachineLazyThreadSafeBetter getInstance() {
        //The use of synchronized in the method signature reduces performance
        //To avoid extra overhead we are using the double-checked locking principle
        //We will use a synchronized block inside the if condition
        //Plus an additional check to ensure that only one instance of a singleton class is created
        if (instance == null) {
            synchronized (VirtualMachineLazyThreadSafeBetter.class) {
                if(instance==null) {
                    instance = new VirtualMachineLazyThreadSafeBetter();
                }
            }
        }

        return instance;
    }
}
