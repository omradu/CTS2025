public class Main {
    public static void main(String[] args) {
        EditorText editor = new EditorText(); 
        Document fisierText = new Document("ceva.txt");

        fisierText.adaugaText("Hello world!");
        fisierText.adaugaText(" In test");

        editor.adaugaMemento(fisierText.salveaza());

        fisierText.adaugaText(" This is going great");

        System.out.println(fisierText.obtineText());

        fisierText.restaureaza(editor.obtineMemento());
        System.out.println("-------------------");
        System.out.println(fisierText.obtineText());
    }
}
