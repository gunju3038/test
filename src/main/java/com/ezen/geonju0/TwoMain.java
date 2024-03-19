package com.ezen.geonju0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TwoMain {

	public static void main(String[] args) {
//		Two tt = new Two();
//		tt.a = 5;
//		tt.b = 10;
//		System.out.println(tt);

		String path = "classpath:sample.xml";
		AbstractApplicationContext acct =  new GenericXmlApplicationContext(path);
		Two tt = acct.getBean("sam",Two.class);
		System.out.println(tt);
		tt.call();
//		
//		AnnotationConfigApplicationContext acct = new AnnotationConfigApplicationContext(TwoConfig.class);
//		Two tt = acct.getBean("aa",Two.class);
//		System.out.println(tt);
		
	}

}
