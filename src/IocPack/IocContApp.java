package IocPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
*/
public class IocContApp {
	
    public static void main(String[] args) {
    	System.out.println("Step 0");
    	ApplicationContext context = new AnnotationConfigApplicationContext(Container.class);
    	System.out.println("Step 1");
    	BeanT beanT1 = context.getBean(BeanT.class);
    	System.out.println("Step 2");
    	BeanT beanT2 = context.getBean(BeanT.class);
    	System.out.println("Just before getting BeanComp");
    	BeanComp beanC1 = context.getBean(BeanComp.class);
    	
    	//testing scopes
    	beanT1.setMessage("message for BeanT1");
    	beanT2.setMessage("message for BeanT2");
    	System.out.println(beanT1.getMessage());
    	System.out.println(beanT2.getMessage());
    	
    	//close
    	((ConfigurableApplicationContext)context).close();
    	
   }
}