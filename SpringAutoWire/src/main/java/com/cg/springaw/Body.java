package com.cg.springaw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human human=c.getBean(Human.class);
		human.display();

	}

}
