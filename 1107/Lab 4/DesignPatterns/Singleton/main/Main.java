public class Main {
    public static void main(String[] args) {
        //Simple virtual machine
        VirtualMachine virtualMachine = new VirtualMachine(22, "10.0.0.3", "linuxWebServer", "pageAdmin");
        System.out.println(virtualMachine.toString());

        //Eager initialization
        VirtualMachineEager virtualMachineEager = VirtualMachineEager.getInstance();
        System.out.println(virtualMachineEager);

        //Static block initialization
        VirtualMachineStaticBlock virtualMachineStaticBlock = VirtualMachineStaticBlock.getInstance();
        System.out.println(virtualMachineStaticBlock.toString());

        //Lazy initialization
        VirtualMachineLazy virtualMachineLazy = VirtualMachineLazy.getInstance();
        System.out.println(virtualMachineLazy.toString());

        //Lazy initialization thread safe
        VirtualMachineLazyThreadSafe virtualMachineLazyThreadSafe = VirtualMachineLazyThreadSafe.getInstance();
        System.out.println(virtualMachineLazyThreadSafe.toString());

        //Lazy initialization thread safe better (double-checked locking)
        VirtualMachineLazyThreadSafeBetter virtualMachineLazyThreadSafeBetter = VirtualMachineLazyThreadSafeBetter.getInstance();
        System.out.println(virtualMachineLazyThreadSafeBetter);

        //Enum
        VirtualMachineEnum virtualMachineEnum = VirtualMachineEnum.INSTANCE;
        virtualMachineEnum.doSomething();

        //registry
        VirtualMachineRegistry virtualMachineConnection = VirtualMachineRegistry.getInstance(22, "10.0.0.3", "linuxWebServer", "pageAdmin");
        VirtualMachineRegistry virtualMachineConnection2 = VirtualMachineRegistry.getInstance(3389, "10.0.0.2", "anotherWinWebServer", "admin007");
        System.out.println(virtualMachineConnection.toString());
        System.out.println(virtualMachineConnection2.toString());

    }
}
