package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class rockets_1 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("roc_numbers");

		List<Integer> hh = new ArrayList<>();

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			int temp = Integer.parseInt(line);

			hh.add(temp);

			//System.out.println(temp);

		}
		sc.close();
		
		int sum = 0;
		
		for (int i = 0; i < hh.size(); i++) {

			int fuel = (int)Math.floor(hh.get(i)/3) - 2;

			sum = sum + fuel;
		}
		System.out.println(sum);

	}

}


