public class Principal {
    public static void main(String[] args) {
        ManagerM1 M1 = new ManagerM1();
        ManagerM2 M2 = new ManagerM2();
        VicePresedinte VP = new VicePresedinte();

        M1.seteazaUrmatorulAprobator(M2);
        M2.seteazaUrmatorulAprobator(VP);

        M1.aprobaBuget(150);
        System.out.println("------------------------");
        M1.aprobaBuget(10000);
    }
}
