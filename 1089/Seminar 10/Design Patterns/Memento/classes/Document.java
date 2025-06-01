//Originator 
public class Document {
    private String nume;
    private StringBuilder continut;

    public Document(String nume) {
        this.nume = nume;
        this.continut = new StringBuilder();
    }

    public void adaugaText(String text) {
        continut.append(text);
    }

    public String obtineText() {
        return this.continut.toString();
    }

    public DocumentMemento salveaza() {
        return new DocumentMemento(this.continut.toString());
    }

    public void restaureaza(DocumentMemento documentSalvat) {
        this.continut = new StringBuilder();
        this.continut.append(documentSalvat.getSavedContent());
    }
}
