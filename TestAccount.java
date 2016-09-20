/**
* created by @ann_icel on 9/14/16
*/

/*
 * A Test Driver for the Account class.
 */

public class TestAccount {
	public static void main(String[] args) {
		Account p1 = new Account(4545);
		Account p2 = new Account(4546, 1000);
		p2.credit(500);
		p2.debit(300);

		System.out.println(p1);
		System.out.println(p2);
		p2.debit(5000);
		System.out.println(p2);
	}	
}