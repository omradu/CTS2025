//Caretaker 
public class EditorText {
    private List<DocumentMemento> istoric = new ArrayList<DocumentMemento>();

    public void adaugaMemento(DocumentMemento documentMemento) {
        this.istoric.add(documentMemento);
    }

    public DocumentMemento obtineMemento() {
        if (istoric.size() != 0) {
            DocumentMemento memento = istoric.get(istoric.size() - 1);
            istoric.remove(istoric.size() - 1);
            return memento;
        } else {
            return new DocumentMemento("");
        }
    }
}
