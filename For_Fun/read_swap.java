import java.io.*;
import java.util.*;

public class read_swap {
	public static void main(String[] args) {
		// declare string to hold swap file we will open
		String swap_file;

		try {		
			// set up buffered reader
			BufferedReader br = new BufferedReader(new FileReader("swap.java"));
			
			// if there is a line in the file
			while((swap_file = br.readLine()) != null) {
				//print that line
				System.out.println(swap_file);
			}

			//close buffered reader
			br.close();

		} catch (FileNotFoundException e) {

			System.err.println("Caught error" + e);

		} catch (IOException e) {

			System.err.println("Caught error" + e);
		}
	}
}
