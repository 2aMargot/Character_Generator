package character_generator.entity.character_class;

public class Rogue extends AbstractCharacterClass{
    private static int HEALTH_DICE = 8;
    public Rogue(String className, int healthDice) {
        super("Rogue", HEALTH_DICE);
    }
}
