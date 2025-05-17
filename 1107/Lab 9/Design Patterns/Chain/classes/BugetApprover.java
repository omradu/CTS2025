public abstract class BugetApprover {
    protected BugetApprover nextApprover;

    public void setNextApprover(BugetApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveBudget(float amount);
}
