public class Sunflower extends Plant implements Producer {
	private final static int HP = 30;
	private final static int ATTACK = 0;
	private final static int SUNLIGHTCOST = 50;
	private int sunlight;

	public Sunflower() {
		super(HP, ATTACK, SUNLIGHTCOST);
	}

	public int produce() {
		return 100;
	}
}