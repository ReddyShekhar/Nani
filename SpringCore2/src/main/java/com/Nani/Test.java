package com.Nani;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
public static void main(String[] args)
{
	Resource  rs=new ClassPathResource("Beans.xml");
	BeanFactory bn=new XmlBeanFactory(rs);
	Customer c=(Customer)bn.getBean("cst1");
	c.disp();


}

}
