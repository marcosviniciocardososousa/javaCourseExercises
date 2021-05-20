package desafioOperadoresAritméticos;

public class Main {

	public static void main(String[] args) {
		int part1 = (6 * (3 + 2));
		part1 = (int)Math.pow(part1, 2);
		part1 = (part1 / (3 * 2));
		
		int part2 = ((1 - 5) * (2 - 7))/2;
		part2 = (int)Math.pow(part2, 2);
		
		int part3 = (part1 - part2);
		part3 = (int)(Math.pow(part3, 3));
		
		part1 = (int)((part3) / Math.pow(10, 3));
		
		System.out.println(part1);
		
	}

}
