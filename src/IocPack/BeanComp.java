package IocPack;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class BeanComp implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	
	public void setMessage(String s){this.message = s;}
	public String getMessage(){return this.message;}
	
	public BeanComp() {System.out.println("Inside BeanComp Constructor");}
	
}