/**
 * 
 */
package Service;

import java.util.List;

import bean.CartierBean;

/**
 * @author Adwiti
 *
 */
public interface IFileReadService {
	
	List<String> readAFile(String filename);
	
	List<CartierBean> readAFileInCartierBean(String filename);

}
