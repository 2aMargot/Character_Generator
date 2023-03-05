package character_generator.entity.character_class;

public class Warrior extends AbstractCharacterClass {
    private static int HEALTH_DICE = 10;
    public Warrior(String className, int healthDice) {
        super("Warrior", HEALTH_DICE);
    }
}
