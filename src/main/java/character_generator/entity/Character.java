package character_generator.entity;

import character_generator.entity.character_class.AbstractCharacterClass;

//Represent a character his name, race and class
public class Character {
    private String name;
    private String race;
    private AbstractCharacterClass characterClass;

    public Character(String name, String race, AbstractCharacterClass characterClass) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public AbstractCharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setCharacterClass(AbstractCharacterClass characterClass) {
        this.characterClass = characterClass;
    }
}


