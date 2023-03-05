package character_generator.entity.character_class;

public abstract class AbstractCharacterClass {
    private String className;
    private int healthDice;

    public AbstractCharacterClass(String className, int healthDice) {
        this.className = className;
        this.healthDice = healthDice;
    }

    public String getClassName() {
        return className;
    }

    public int getHealthDice() {
        return healthDice;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setHealthDice(int healthDice) {
        this.healthDice = healthDice;
    }
}
