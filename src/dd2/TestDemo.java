package dd2;
/**
 * 测试静态变量跟非静态变量的区别
 * @author Administrator
 *
 */

public class TestDemo {

	public static void main(String[] args) {
		StaticVariableDemo[] dd2=new StaticVariableDemo[5];
		dd2[0]=new StaticVariableDemo();
		dd2[1]=new StaticVariableDemo();
		dd2[2]=new StaticVariableDemo();
		dd2[3]=new StaticVariableDemo();
		dd2[4]=new StaticVariableDemo();
	}

}
