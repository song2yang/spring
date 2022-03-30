package sou;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @ClassName Test
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/30 4:10 PM
 * @Version : 1.0
 **/
public class TestAware implements BeanFactoryAware {
	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void testAware(){
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.say();
	}
}

