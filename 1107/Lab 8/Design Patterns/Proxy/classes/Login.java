public class Login implements AbstractLogin{
    String username;
    String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password))
            return true;
        else
            return false;
    }
}
