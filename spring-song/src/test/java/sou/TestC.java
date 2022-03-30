package sou;

/**
 * @ClassName TestC
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/30 1:38 PM
 * @Version : 1.0
 **/
public class TestC {
	private TestA testA;

	public void c() {
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
