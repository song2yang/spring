package sou;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @ClassName UserBeanDefinitionParser
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 4:37 PM
 * @Version : 1.0
 **/
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	protected Class getBeanClass(Element element) {
		return User.class;
	}

	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		//将提取的数据放入到BeanDefinitionBuilder中，待到完成所有bean的解析后统一注册到beanFactory中
		if (StringUtils.hasText(userName)) {
			bean.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)) {
			bean.addPropertyValue("email", email);
		}
	}
}
