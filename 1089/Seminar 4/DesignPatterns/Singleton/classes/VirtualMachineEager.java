public class VirtualMachineEager {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static final VirtualMachineEager instance = new VirtualMachineEager();

    private VirtualMachineEager() {
        this.connectionPort = 3389;
        this.ipAddress = "10.0.0.1";
        this.virtualMachineName = "eagerDatabaseVM";
        this.username = "admin";
    }

    public int getConnectionPort() {
        return connectionPort;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getVirtualMachineName() {
        return virtualMachineName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }

    public static VirtualMachineEager getInstance() {
        return instance;
    }
}
