public class LoginProxy implements AbstractLogin{
    AbstractLogin loginService;

    private int numberOfAttempts = 0;

    public LoginProxy(AbstractLogin loginService) {
        this.loginService = loginService;
    }

    @Override
    public boolean login(String username, String password) {
        if(numberOfAttempts > 2) {
            System.out.println("Account blocked");
            return false;
        } else {
            if(loginService.login(username,password)) {
                numberOfAttempts = 0;
                System.out.println("Login successful");
                return true;
            } else {
                numberOfAttempts++;
                System.out.println("Wrong username or password. You have " + (3-numberOfAttempts) + " attempts left");
                return false;
            }
        }
    }
}
