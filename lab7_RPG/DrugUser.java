public class DrugUser extends RPGCharacter {
	private static final String NAME = "DrugUser";
	private static final int BASE_ATTACK = 10;
	private static final int HP = 60;

	public DrugUser() {
		super(NAME, HP);
	} 

	public int attack() {
		return BASE_ATTACK;
	}

}