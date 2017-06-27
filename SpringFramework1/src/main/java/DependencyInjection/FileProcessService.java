package DependencyInjection;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileProcessService implements IFileProcessingService {

	@Autowired
	private IFileReadService frs;
	
	Logger logger = Logger.getLogger(FileProcessService.class);
	
	@Value("${report.filename}")
	private String filename;

	public void processAFile() {
		logger.info("Processing the file");
		List<String> lstOfLines = frs.readAFile(filename);
		lstOfLines.forEach(System.out::println);
	}
}
