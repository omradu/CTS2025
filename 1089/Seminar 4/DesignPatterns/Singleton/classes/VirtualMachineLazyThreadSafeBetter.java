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
        //Utilizarea cuvântului cheie synchronized în semnătura metodei reduce performanța
        //Pentru a evita costurile suplimentare, folosim principiul de blocare dublu verificată
        //Vom utiliza un bloc synchronized în interiorul condiției if
        //Plus o verificare suplimentară pentru a ne asigura că este creată doar o singură instanță a unei clase singleton
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
