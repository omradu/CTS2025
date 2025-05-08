public class Alexa {
    Frigider frigider;
    Lumini luminiBucatarie;
    Lumini luminiSufragerie;
    Lumini luminiDormitor;
    MasinaSpalat masinaSpalat;
    Aspirator aspirator;

    public Alexa(Frigider frigider, Lumini luminiBucatarie, Lumini luminiSufragerie, Lumini luminiDormitor, MasinaSpalat masinaSpalat, Aspirator aspirator) {
        this.frigider = frigider;
        this.luminiBucatarie = luminiBucatarie;
        this.luminiSufragerie = luminiSufragerie;
        this.luminiDormitor = luminiDormitor;
        this.masinaSpalat = masinaSpalat;
        this.aspirator = aspirator;
    }

    public void bunaDimineata(){
        this.luminiDormitor.aprinde();
        this.luminiBucatarie.aprinde();

        System.out.println("Buna dimineata la cafeluta!");
    }

    public void noapteBuna() {
        this.frigider.inchide();
        this.luminiBucatarie.stinge();
        this.luminiDormitor.stinge();
        this.luminiSufragerie.stinge();
        this.masinaSpalat.opreste();
        this.aspirator.opreste();
        
        System.out.println("Noapte buna!");
    }
    
    public void sporLaGatit(){
        this.luminiBucatarie.seteazaCuloarea("Roz");
        this.luminiBucatarie.aprinde();
        this.frigider.deschide();
        
        System.out.println("Spor la gatit!");
    }

}
