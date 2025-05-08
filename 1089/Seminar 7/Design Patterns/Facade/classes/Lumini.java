public class Lumini {
    protected boolean suntAprinse = false;
    protected String culoare = "Alb";

    public void aprinde() {
        suntAprinse = true;
    }

    public void stinge() {
        suntAprinse = false;
    }
    
    public void seteazaCuloarea(String culoare) {
        this.culoare = culoare;
    }
}
