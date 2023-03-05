package character_generator.entity.character_class;

public class Paladin extends AbstractCharacterClass{
    private static int HEALTH_DICE = 10;
    public Paladin(String className, int healthDice) {
        super("Paladin", HEALTH_DICE);
    }
}
