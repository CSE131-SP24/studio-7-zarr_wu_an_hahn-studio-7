package studio7;

public class Die {
	
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public int dieThrown() {
		return (int)(Math.random() * n + 1);
	}

	public static void main(String[] args) {
		Die die1 = new Die(7);
		System.out.println(die1.dieThrown());
	}

}
