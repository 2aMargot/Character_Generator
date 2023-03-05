package character_generator.entity.character_class;

public class Bard extends AbstractCharacterClass {
    private static int HEALTH_DICE = 8;
    public Bard(String className, int healthDice) {
        super("Bard", HEALTH_DICE);
    }
}
