public abstract class RPGCharacter { // abstract because of abstract function na attack that's need to be implemented in subclasses!

    private String name;
    private int hp; // life

    public RPGCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // implement in subclass
    public abstract int attack();

    // checks to see if character is still alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    // may be overriden in subclass, damage is dependent on hero type
    public int takeDamage(int damage) {
        hp -= damage;
        return hp;
    }

    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}