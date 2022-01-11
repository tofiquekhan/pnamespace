package myproject.pnamespace.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.pnamespace.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myproject/pnamespace/resources/applicationContext.xml");
		Employee empBean = (Employee) context.getBean("empBean");
		empBean.getEmployeeDetails();
	}

}
