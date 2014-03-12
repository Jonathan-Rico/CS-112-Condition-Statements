
import java.util.Scanner;
public class Condition1 {

	public static void main(String[] args) {
		System.out.printf("Hello,  please input 0 to indicate that you are thirsty, or 1 if you are not thirsty\n");
		
		Scanner input = new Scanner( System.in );
		int x = input.nextInt();
		
		System.out.printf("Are you Hungry? Type 0 for yes or 1 for no.\n");
		int y = input.nextInt();
		
		if (x == 0 && y == 0) {
			System.out.printf("You should buy a soda and some lunch");
		}
		if (x == 1 && y == 0) {
			System.out.printf("You should buy some lunch");
		}
		if (x == 1 && y == 1) {
				System.out.printf("Your hunger and thirst are satisfied.");
		}
		if (x == 0 && y == 1) {
			System.out.printf("You should buy a soda");
			
		}
	}

}
