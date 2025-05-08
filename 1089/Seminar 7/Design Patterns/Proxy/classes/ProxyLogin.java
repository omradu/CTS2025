public class ProxyLogin implements AbstractLogin{
    AbstractLogin servicuLogin;

    private int nrIncercari = 0;

    public ProxyLogin(AbstractLogin loginService) {

        this.servicuLogin = loginService;
    }

    @Override
    public boolean login(String username, String password) {
        if(nrIncercari > 2) {
            System.out.println("Cont blocat");
            return false;
        } else {
            if(servicuLogin.login(username,password)) {
                nrIncercari = 0;
                System.out.println("Bun venit in cont!");
                return true;
            } else {
                nrIncercari++;
                System.out.println("Username si/sau parola gresite. Mai aveti " + (3- nrIncercari) + " incercari ramase");
                return false;
            }
        }
    }
}
