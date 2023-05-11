package testing;

public class Piramid {
	public static void main(String args[]) {
		int i = 1;
		int j;
		String output = "";
		
		do {
			j=1;
			while (j <= i) {
				output += "*";
				j++;
			}
			
			output += "\n";
			i++;
		} while(i <=5);
		
		System.out.print(output);
	}
}
