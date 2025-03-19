public class VirtualMachine {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    public VirtualMachine(int connectionPort, String ipAddress, String virtualMachineName, String username) {
        this.connectionPort = connectionPort;
        this.ipAddress = ipAddress;
        this.virtualMachineName = virtualMachineName;
        this.username = username;
    }

    public int getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(int connectionPort) {
        this.connectionPort = connectionPort;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getVirtualMachineName() {
        return virtualMachineName;
    }

    public void setVirtualMachineName(String virtualMachineName) {
        this.virtualMachineName = virtualMachineName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }
}
