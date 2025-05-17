public class Character implements PrintableCharacter{
    private final String character;

    public Character(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public void print(CharacterContext context) {
        System.out.println(this.character + " is on position " + context.getCharacterLocation());
    }
}
