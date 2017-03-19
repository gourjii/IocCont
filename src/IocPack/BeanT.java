package IocPack;

import java.io.Serializable;

/*import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
*/

//@Component
public class BeanT implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public void setMessage(String s){this.message = s;}
	public String getMessage(){return this.message;}
	
	public BeanT() {System.out.println("Inside BeanT Constructor");}
	
}
