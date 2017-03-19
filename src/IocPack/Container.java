package IocPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"IocPack"})
public class Container {
	public Container() {System.out.println("Inside Container Constructor");}
	
	@Bean  //task #3 
	//@Scope("singleton") //task #6 test
	@Scope("prototype") //task #6
	public BeanT beanT(){return new BeanT();}
	
	 //task #2
	@Autowired
	@Qualifier("BeanComp")
	public BeanComp beanComp(){return new BeanComp();}
	
}
