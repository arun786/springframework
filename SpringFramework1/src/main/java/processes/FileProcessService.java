package processes;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import Services.IFileReadService;
import beans.CartierBean;
import beans.Student;

@Component
public class FileProcessService implements IFileProcessingService {

	@Autowired
	private IFileReadService frs;

	@Autowired
	private Student getStudentBelow21;

	/*
	 * @Qualifier is to identify a bean if the same type is defined twice in
	 * configuration
	 */
	@Autowired
	@Qualifier(value = "getStudentAbove21")
	private Student student;

	Logger logger = Logger.getLogger(FileProcessService.class);

	@Value("${report.filename}")
	private String filename;

	public void processAFile() {
		logger.info("Processing the file");
		List<String> lstOfLines = frs.readAFile(filename);
		lstOfLines.forEach(System.out::println);
	}

	public void processAFileInBeanFormat() {
		List<CartierBean> lists = frs.readAFileInCartierBean(filename);
		lists.forEach(System.out::println);
		System.out.println(getStudentBelow21.getName());
		System.out.println(student.getAge());
	}
}
