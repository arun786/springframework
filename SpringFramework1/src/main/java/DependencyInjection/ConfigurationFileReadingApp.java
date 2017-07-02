package DependencyInjection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class ConfigurationFileReadingApp {
	
	static Logger logger = Logger.getLogger(ConfigurationFileReadingApp.class);

	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFileReadingApp.class);
		IFileProcessingService fps = (IFileProcessingService) context.getBean("fileProcessService");
		logger.info("Read a File in String Format");
		fps.processAFile();
		logger.info("read a File setting it to a bean");
		fps.processAFileInBeanFormat();
	}

}
