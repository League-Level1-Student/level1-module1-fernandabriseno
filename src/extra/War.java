package extra;

public class War {
	public static void main(String[] args) {
		testDeck();
	}

	private static void testDeck() {
		Deck d = new Deck();
		System.out.println(d); 
		d.shuffle(); 
		System.out.println(d);  
		int card = d.dealCard(); 
		

	}
}
