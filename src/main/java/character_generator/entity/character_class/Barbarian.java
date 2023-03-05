package character_generator.entity.character_class;

public class Barbarian extends AbstractCharacterClass {
    private static int HEALTH_DICE = 12;

    public Barbarian() {
        super("Barbarian", HEALTH_DICE);


    }
}
