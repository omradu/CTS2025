public class MasinaSpalat {
    protected boolean esteInchisa = true;
    protected int nrOreFunctionareProgram = 0;

    public void opreste(){
        this.esteInchisa = true;
    }

    public void porneste(){
        this.esteInchisa = false;
    }
    
    public void seteazaNrOreProgram(int nrOre) {
        nrOreFunctionareProgram = nrOre;
    }
}
