public class Main {
    public static void main(String[] args) {
        Login loginWebsite = new Login("admin", "1234Admin!");
        System.out.println(loginWebsite.login("admin", "1234Admin!"));

        LoginProxy loginWebsiteProxy = new LoginProxy(loginWebsite);
        loginWebsiteProxy.login("admin","123");
        loginWebsiteProxy.login("admin","123333");
        loginWebsiteProxy.login("admin","1233332244");
        loginWebsiteProxy.login("admin","1233HHBG");
        loginWebsiteProxy.login("admin","1233HHBGuw2eqgiu");
        loginWebsiteProxy.login("admin","1233HHBGuw2eqgiu");

    }
}
