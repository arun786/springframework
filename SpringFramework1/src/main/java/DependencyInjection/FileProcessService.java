package DependencyInjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileProcessService implements IFileProcessingService {

	@Autowired
	private IFileReadService frs;
	
	@Value("${report.filename}")
	private String filename;

	public void processAFile() {
		List<String> lstOfLines = frs.readAFile(filename);
		lstOfLines.forEach(System.out::println);
	}
}
