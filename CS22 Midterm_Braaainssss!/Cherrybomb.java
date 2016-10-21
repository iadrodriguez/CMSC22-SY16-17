import java.util.*;

public class Cherrybomb extends Plant implements SplashAttacker {
	private int turnCount = 2;
	private final static int HP = 10;
	private final static int ATTACK = 150;
	private final static int SUNLIGHTCOST = 150;

	public Cherrybomb() {
		super(HP, ATTACK, SUNLIGHTCOST);
	}

	public void splashAttack(List<Zombie> defenders) {
		if (turnCount == 0) {
			for (Zombie zombie : defenders) {
				zombie.takeDamage(ATTACK);
			}
			super.takeDamage(getDamage());
		}
		turnCount--;
	}
}