public class ManagerM1 extends BugetApprover{
    public static final int MAXIMUM_BUDGET = 500;

    @Override
    public void approveBudget(float amount) {
        if(amount < MAXIMUM_BUDGET) {
            System.out.println("Budget approved by M1");
        } else
        {
            if(nextApprover!=null) {
                System.out.println("Budget not approved by M1, going to next level");
                nextApprover.approveBudget(amount);
            } else {
                System.out.println("Budget rejected!");
            }
        }
    }
}
