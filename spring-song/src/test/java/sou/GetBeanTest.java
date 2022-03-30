package sou;

/**
 * @ClassName GetBeanTest
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/29 1:59 PM
 * @Version : 1.0
 **/
public abstract class GetBeanTest {
	public abstract User getBean();

	public void showMe() {
		this.getBean().showMe();
	}
}
