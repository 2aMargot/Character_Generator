package character_generator.entity.character_class;

public class Monk extends AbstractCharacterClass{
    private static int HEALTH_DICE = 8;
    public Monk(String className, int healthDice) {
        super("Monk", HEALTH_DICE);
    }
}
