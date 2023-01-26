package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class rockets_2 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("roc_numbers");

		List<Integer> hh = new ArrayList<>();

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			int temp = Integer.parseInt(line);

			hh.add(temp);

		}
		sc.close();

		int sum = 0;

		for (int i = 0; i < hh.size(); i++) {

			int mass = hh.get(i);
			int fuel = calculateFuel(mass);

			sum = sum + fuel;
		}

		System.out.println(sum);
	}

	public static int calculateFuel(int mass) {

		int fuel = (int) Math.floor(mass / 3) - 2;

		if (fuel <= 0) {
			return 0;
		}

		return fuel + calculateFuel(fuel);

	}

}




