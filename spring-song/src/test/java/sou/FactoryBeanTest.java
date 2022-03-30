package sou;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName CustomTagTest
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 4:45 PM
 * @Version : 1.0
 **/
public class FactoryBeanTest {

	@Test
	public void customTag() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("factorybean.xml"));
		Object bean = bf.getBean("car");
		System.out.println(bean.getClass());
		//Car car = (Car) bf.getBean("&car");
		//System.out.println(car.getBrand() + "," + car.getPrice());
	}

	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleByConstructor() throws Throwable {
		new ClassPathXmlApplicationContext("circle-test.xml");

		try {
			//new XmlBeanFactory(new ClassPathResource("circle-test.xml"));
		} catch (Exception e) {
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}

	@Test
	public void testCircleBySetterAndPrototype() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("circle-prototype.xml");
		System.out.println(ctx.getBean("testA"));

	}

	@Test
	public void testAware() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestAware testAware = (TestAware) ctx.getBean("test");
		testAware.testAware();
	}

	@Test
	public void customXmlApplicationContext() {
		ApplicationContext bf = new MyClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestAware testAware = (TestAware) bf.getBean("test");
	}

	@Test
	public void beanMessage() {
		ApplicationContext bf = new MyClassPathXmlApplicationContext("beanFactoryTest.xml");
		Hello hello = (Hello) bf.getBean("message");
		System.out.println(hello.getMes());
	}

	@Test
	public void propertyConfigureTest(){
		ConfigurableListableBeanFactory bf =  new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) bf.getBean("bfpp");
		bfpp.postProcessBeanFactory(bf);
		System.out.println(bf.getBean("simpleBean"));


	}
}
