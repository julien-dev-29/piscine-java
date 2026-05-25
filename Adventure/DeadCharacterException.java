package Adventure;

public class DeadCharacterException extends Exception {
    private final Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    public String getMessage() {
        return "The " +
                getCharacterClass() +
                " " +
                this.character.getName() +
                " is dead.";
    }

    private String getCharacterClass() {
        return this.character.getClass().getSimpleName();
    }
}
