public class DrugLord extends RPGCharacter {
	private static final String NAME = "DrugLord";
	private static final int BASE_ATTACK = 15;
	private static final int HP = 100;

	public DrugLord() {
		super(NAME, HP);
	} 

	public int attack() {
		return BASE_ATTACK;
	}

}