package configurations;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import beans.Student;
import processes.IFileProcessingService;

@Configuration
@ComponentScan(basePackages = { "processes", "Services" })
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration
public class ConfigurationFileReadingApp {

	/*
	 * @Configuration annotation indicates that the class can be used by Spring
	 * IOC container as a source of bean definitions
	 */

	/*
	 * @ComponentScan annotation is used to scan beans automatically from
	 * different packages
	 */

	/* @PropertySource is used to read the properties file */
	static Logger logger = Logger.getLogger(ConfigurationFileReadingApp.class);

	/**
	 * 
	 * @return
	 * 
	 * 		PropertySourcesPlaceholderConfigurer is used for reading a
	 *         property file
	 */

	/*
	 * @Bean is used to denote that the below will return an object which is
	 * registered in bring application context, it is equivalent to the beans
	 * defined in xml configuration
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public Student getStudentBelow21() {
		return new Student("Arun", 23);
	}

	@Bean
	public Student getStudentAbove21() {
		return new Student("Adwiti", 3);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigurationFileReadingApp.class, args);
		IFileProcessingService fps = (IFileProcessingService) context.getBean("fileProcessService");
		logger.info("Read a File in String Format");
		fps.processAFile();
		logger.info("read a File setting it to a bean");
		fps.processAFileInBeanFormat();
	}

}
