package DependencyInjection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class FileReadService implements IFileReadService {
	
	Logger logger = Logger.getLogger(FileReadService.class);

	/**
	 * It reads a file line by line and stores in a list
	 */
	public List<String> readAFile(String filename) {
		logger.info("Reads a file");
		List<String> lstFiles = new ArrayList<String>();
		try {
			lstFiles = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lstFiles;
	}

}
