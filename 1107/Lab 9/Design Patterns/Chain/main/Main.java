public class Main {
    public static void main(String[] args) {
        ManagerM1 M1 = new ManagerM1();
        ManagerM2 M2 = new ManagerM2();
        VicePresident VP = new VicePresident();

        M1.setNextApprover(M2);
        M2.setNextApprover(VP);

        M1.approveBudget(150);
        System.out.println("--------------------------");
        M1.approveBudget(1000);
        System.out.println("--------------------------");
        M1.approveBudget(5000);

    }
}
