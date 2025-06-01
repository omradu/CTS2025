//Care Taker
public class TextEditor {
    private List<DocumentMemento> history = new ArrayList<DocumentMemento>();

    public void addMemento(DocumentMemento documentMemento) {
        this.history.add(documentMemento);
    }

    public DocumentMemento getMemento() {
        if(history.size()!=0) {
            DocumentMemento memento = history.get(history.size()-1);
            history.remove(history.size()-1);
            return memento;
        } else {
            return new DocumentMemento("");
        }
    }
}
