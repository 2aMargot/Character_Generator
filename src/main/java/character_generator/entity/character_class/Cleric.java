package character_generator.entity.character_class;

public class Cleric extends AbstractCharacterClass{
    private static int HEALTH_DICE = 8;
    public Cleric(String className, int healthDice) {
        super("Cleric", HEALTH_DICE);
    }
}
