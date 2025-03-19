public class VirtualMachineRegistry {
    private int connectionPort;
    private String ipAddress;
    private String virtualMachineName;
    private String username;

    private static HashMap<String, VirtualMachineRegistry> virtualMachineRegistry = new HashMap<String, VirtualMachineRegistry>();

    private VirtualMachineRegistry(int connectionPort, String ipAddress, String virtualMachineName, String username) {
        this.connectionPort = connectionPort;
        this.ipAddress = ipAddress;
        this.virtualMachineName = virtualMachineName;
        this.username = username;
    }

    public static synchronized VirtualMachineRegistry getInstance(int connectionPort, String ipAddress, String virtualMachineName, String username) {
        VirtualMachineRegistry virtualMachineConnection = virtualMachineRegistry.get(ipAddress);
        if(virtualMachineConnection == null) {
            virtualMachineConnection = new VirtualMachineRegistry(connectionPort, ipAddress, virtualMachineName, username);
            virtualMachineRegistry.put(ipAddress, virtualMachineConnection);
        }

        return virtualMachineConnection;
    }

    @Override
    public String toString() {
        return "User " + username + " is connecting to " + virtualMachineName + " vm with the ip " + ipAddress + " on port " + connectionPort;
    }
}
