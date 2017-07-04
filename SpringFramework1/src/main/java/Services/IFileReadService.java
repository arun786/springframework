/**
 * 
 */
package Services;

import java.util.List;

import beans.CartierBean;

/**
 * @author Adwiti
 *
 */
public interface IFileReadService {
	
	List<String> readAFile(String filename);
	
	List<CartierBean> readAFileInCartierBean(String filename);

}
