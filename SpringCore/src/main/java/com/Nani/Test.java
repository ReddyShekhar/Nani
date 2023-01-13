package com.Nani;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
public static void main(String[] args)
{
Resource  rs=new ClassPathResource("NewFile.xml");
BeanFactory bn=new XmlBeanFactory(rs);
Student st=(Student)bn.getBean("Student");
st.disp();
}

}
