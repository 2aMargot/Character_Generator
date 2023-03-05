package character_generator.entity.character_class;

public class Sorcerer extends AbstractCharacterClass{
    private static int HEALTH_DICE = 6;
    public Sorcerer(String className, int healthDice) {
        super("Sorcerer", HEALTH_DICE);
    }
}
