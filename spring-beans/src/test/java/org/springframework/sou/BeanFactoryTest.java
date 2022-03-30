package org.springframework.sou;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import sou.MyTestBean;

/**
 * @ClassName BeanFactoryTest
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/28 5:20 PM
 * @Version : 1.0
 **/
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		Assert.assertEquals("testStr1", bean.getTestStr());

	}
}
