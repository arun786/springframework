/**
 * 
 */
package DependencyInjection;

import java.util.List;

/**
 * @author Adwiti
 *
 */
public interface IFileReadService {
	
	List<String> readAFile(String filename);
	
	List<CartierBean> readAFileInCartierBean(String filename);

}
