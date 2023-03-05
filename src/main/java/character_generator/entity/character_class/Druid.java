package character_generator.entity.character_class;

public class Druid extends AbstractCharacterClass {
    private static int HEALTH_DICE = 8;
    public Druid(String className, int healthDice) {
        super("Druid", HEALTH_DICE);
    }
}
