package character_generator.entity.character_class;

public class Magician extends AbstractCharacterClass{
    private static int HEALTH_DICE = 6;
    public Magician(String className, int healthDice) {
        super("Magician", HEALTH_DICE);
    }
}
