package sou;

/**
 * @ClassName TestB
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/30 1:38 PM
 * @Version : 1.0
 **/
public class TestB {
	private TestC testC;


	public void b(){
		testC.c();
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
