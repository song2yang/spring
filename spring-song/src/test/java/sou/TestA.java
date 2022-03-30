package sou;

/**
 * @ClassName TestA
 * @Description : TODO
 * @Author : songyangyang
 * @Date : 2022/3/30 1:38 PM
 * @Version : 1.0
 **/
public class TestA {

	private TestB testB;


	public void a(){
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
