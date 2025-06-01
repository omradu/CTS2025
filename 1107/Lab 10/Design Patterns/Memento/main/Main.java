public class Main {
   public static void main(String[] args) {
       TextEditor notepad = new TextEditor();
       Document textFile = new Document("ceva.txt");

       textFile.addText("Hello world!");
       textFile.addText(" In test");

       notepad.addMemento(textFile.save());

       textFile.addText(" This is going great");

       System.out.println(textFile.getText());

       textFile.restore(notepad.getMemento());
       System.out.println("-------------------");
       System.out.println(textFile.getText());
   }
}
