package part1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Numeric Value For Row: ");
		int row = scanner.nextInt();

		StarTree starTree = new StarTree();
		starTree.draw(row);

		scanner.close();
	}

}
