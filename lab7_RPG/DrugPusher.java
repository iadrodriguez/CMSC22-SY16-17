public class DrugPusher extends RPGCharacter {
	private static final String NAME = "DrugPusher";
	private static final int BASE_ATTACK = 5;
	private static final int HP = 35;

    public DrugPusher() {
    	super(NAME, HP);
    }

    public int attack() {
        return BASE_ATTACK;
    }

}