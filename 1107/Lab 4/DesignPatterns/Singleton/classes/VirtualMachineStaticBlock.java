public class VirtualMachineStaticBlock {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static final VirtualMachineStaticBlock instance;
    
    //instance is created when the app loads
    static {
        try {
            instance = new VirtualMachineStaticBlock();
        } catch(Exception e) {
            throw new RuntimeException("Error while creating singleton instance");
        }
    }

    private VirtualMachineStaticBlock() {
        this.connectionPort = 3389;
        this.ipAddress = "10.0.0.1";
        this.virtualMachineName = "staticDatabaseVM";
        this.username = "admin";
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }

    public static VirtualMachineStaticBlock getInstance() {
        return instance;
    }
}
