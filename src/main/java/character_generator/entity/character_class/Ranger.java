package character_generator.entity.character_class;

public class Ranger extends AbstractCharacterClass{
    private static int HEALTH_DICE = 10;
    public Ranger(String className, int healthDice) {
        super("Ranger", HEALTH_DICE);
    }
}
