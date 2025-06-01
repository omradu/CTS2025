//Memento 
public class DocumentMemento {
    //nu e obligatoriu să fie final
    private final String text;
    private Date dataSalvare;

    public DocumentMemento(String text) {
        this.text = text;
        dataSalvare = new Date();
    }

    public String obtineContinutSalvat() {
        return text;
    }
}
