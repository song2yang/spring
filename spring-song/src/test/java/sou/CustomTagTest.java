package sou;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName CustomTagTest
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 4:45 PM
 * @Version : 1.0
 **/
public class CustomTagTest {

	@Test
	public void customTag(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("customtag-test.xml"));
		User user = (User) bf.getBean("testbean");
		System.out.println(user.getUserName() + "," + user.getEmail());


	}
}
