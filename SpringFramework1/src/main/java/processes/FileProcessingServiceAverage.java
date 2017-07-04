package processes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import Services.IFileReadService;
import beans.CartierBean;

public class FileProcessingServiceAverage implements IFileProcessingService {

	@Autowired
	IFileReadService frs;

	@Value("${report.filename}")
	String filename;

	@Override
	public void processAFile() {

	}

	@Override
	public void processAFileInBeanFormat() {
		List<CartierBean> lstOfCartier = frs.readAFileInCartierBean(filename);
	}

}
