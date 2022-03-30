package org.springframework.sou;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import sou.GetBeanTest;

/**
 * @ClassName LookUpTest
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 2:01 PM
 * @Version : 1.0
 **/
public class LookUpTest {
	@Test
	public void main() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("lookup-test.xml"));
		GetBeanTest getBeanTest = (GetBeanTest) bf.getBean("getBeanTest");
		getBeanTest.showMe();

	}
}
