package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		String fileLocation = "/Users/earltstephens/eclipse-workspace/UdemyPractice/FileLocations/test.txt";
		
		System.out.println(new File(fileLocation).exists());
	}

}
