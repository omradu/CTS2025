public class ManagerM1 extends AprobatorBuget {
    public static final int BUGET_MAXIM = 1000;

    @Override
    public void aprobaBuget(float suma) {
        if(suma < BUGET_MAXIM) {
            System.out.println("Buget aprobat de M1");
        } else {
            if(urmatorulAprobator != null) {
                urmatorulAprobator.aprobaBuget(suma);
            } else {
                System.out.println("Buget respins");
            }
        }
    }
}
