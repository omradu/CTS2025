public class Main {
    public static void main(String[] args) {
        Login loginSite = new Login("admin", "1234Admin!");
        System.out.println(loginSite.login("admin", "1234Admin!"));

        ProxyLogin loginSiteProxy = new ProxyLogin(loginSite);
        loginSiteProxy.login("admin","123");
        loginSiteProxy.login("admin","123333");
        loginSiteProxy.login("admin","1233332244");
        loginSiteProxy.login("admin","1233HHBG");
        loginSiteProxy.login("admin","1233HHBGuw2eqgiu");
        loginSiteProxy.login("admin","1233HHBGuw2eqgiu");
    }
}
