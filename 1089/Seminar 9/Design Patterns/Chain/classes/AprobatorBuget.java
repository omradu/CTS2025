public abstract class AprobatorBuget {
    protected AprobatorBuget urmatorulAprobator;

    public void seteazaUrmatorulAprobator(AprobatorBuget urmatorulAprobator) {
        this.urmatorulAprobator = urmatorulAprobator;
    }

    public abstract void aprobaBuget(float suma);
}
