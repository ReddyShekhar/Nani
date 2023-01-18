package Com.Nani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContent.xml");  
	      
	    EmpDao dao=(EmpDao)ctx.getBean("edao");  
	   /*int status=dao.saveEmployee(new Employee(101,"priya",35000));  
	    System.out.println(status);                               
	    System.out.println("Done.");
	          
	    int status=dao.updateEmployee(new Employee(101,"bhavya",15000)); 
	  System.out.println(status); */
	     
	          
	    Employee e=new Employee(); 
	  e.setId(101); 
	  e.setName("Shekhar");
	  
	  int status=dao.deleteEmployee(e); 
	   System.out.println(status);  
	      
	} 
}	

