import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan({""})
//@Component
public class IocCont {
	
	public IocCont() {System.out.println("Inside Container Constructor");}
	
	@Bean  //task #3 
	//@Scope("singleton") //task #6 test
	@Scope("prototype") //task #6
	public BeanT beanT(){return new BeanT();}
	
    public static void main(String[] args) {
      
    	ApplicationContext context = new AnnotationConfigApplicationContext(IocCont.class);
    	BeanT beanT1 = context.getBean(BeanT.class);
    	BeanT beanT2 = context.getBean(BeanT.class);
    	
    	//testing scopes
    	beanT1.setMessage("message for BeanT1");
    	beanT2.setMessage("message for BeanT2");
    	System.out.println(beanT1.getMessage());
    	System.out.println(beanT2.getMessage());
   }
}