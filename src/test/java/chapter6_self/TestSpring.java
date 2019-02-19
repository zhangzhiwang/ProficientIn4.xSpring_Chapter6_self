package chapter6_self;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext_zzw.xml");
		Object bean = applicationContext.getBean("car");
		System.out.println(bean);
	}
}
