package part1;

public class StarTree {
	
	void draw(int row) {
		if(row <= 0) {
			System.out.print("Row Value Need To Be Greater Than Zero");
			return;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
