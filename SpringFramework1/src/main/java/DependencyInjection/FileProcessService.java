package DependencyInjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProcessService implements IFileProcessingService {

	@Autowired
	private IFileReadService frs;

	public void processAFile() {
		List<String> lstOfLines = frs.readAFile("Cartier+7-day+auctions.csv");
		lstOfLines.forEach(System.out::println);
	}
}
