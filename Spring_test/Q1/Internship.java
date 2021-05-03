package com;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Internship {
	public static void main(String[] args) {
	//ApplicationContext con= new ClassPathXmlApplicationContext("applicationContext.xml");
	 Resource r=new ClassPathResource("applicationContext.xml");  
	  BeanFactory factory=new XmlBeanFactory(r); 
	Cohorts cohortobj = (Cohorts) factory.getBean("one");
	cohortobj.show();
	Cognizant cognizantobj = (Cognizant) factory.getBean("two");
	cognizantobj.show1();
	//how to print all parameters ?
	
	
}
}
