public class CharacterFactory {
    private Map<String, Character> characters = new HashMap<String,Character>();

    public Character getCharacter(String characterValue) {
        Character character = characters.get(characterValue);
        if(character == null) {
            character = new Character(characterValue);
            characters.put(characterValue, character);
        }

        return character;
    }
}
