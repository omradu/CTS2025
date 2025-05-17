public class Main {
    private static Character[] textCharacters = new Character[100];
    private static CharacterContext[] characterContexts = new CharacterContext[100];
    private static int nbCharacters = 0;

    public static void pressKey(String character, int location, CharacterFactory characterFactory) {
        textCharacters[nbCharacters] = characterFactory.getCharacter(character);
        characterContexts[nbCharacters] = new CharacterContext(location);
        nbCharacters++;
    }

    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();
        pressKey("A", nbCharacters, characterFactory);
        pressKey("n", nbCharacters, characterFactory);
        pressKey("a", nbCharacters, characterFactory);
        pressKey("a", nbCharacters, characterFactory);
        pressKey("r", nbCharacters, characterFactory);
        pressKey("e", nbCharacters, characterFactory);
        pressKey("m", nbCharacters, characterFactory);
        pressKey("e", nbCharacters, characterFactory);
        pressKey("r", nbCharacters, characterFactory);
        pressKey("e", nbCharacters, characterFactory);

        for(int i=0; i<nbCharacters; i++) {
            (textCharacters[i]).print(characterContexts[i]);
        }
    }
}
