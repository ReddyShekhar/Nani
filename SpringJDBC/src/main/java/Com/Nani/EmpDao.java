package Com.Nani;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Employee e){  
	    String query="insert into b1 values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	
	public int updateEmployee(Employee e){  
	    String query="update b1 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} 
	
	
	public int deleteEmployee(Employee e){  
	    String query="delete from b1 where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	  
	} 
