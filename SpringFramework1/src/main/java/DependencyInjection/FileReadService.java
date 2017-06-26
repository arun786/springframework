package DependencyInjection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileReadService implements IFileReadService {

	/**
	 * It reads a file line by line and stores in a list
	 */
	public List<String> readAFile(String filename) {
		List<String> lstFiles = new ArrayList<String>();
		try {
			lstFiles = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lstFiles;
	}

}
