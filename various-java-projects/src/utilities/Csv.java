package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Csv {

	public List<String[]> read(String file) throws IOException {
		List<String[]> data = new LinkedList<String[]>();
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while ((line = br.readLine()) != null) {
				String[] elements = line.split(",");
				data.add(elements);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file!");
			e.printStackTrace();
		}
		return data;
	}

}
