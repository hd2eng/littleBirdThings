package dd2;
/**
 * 静态变量与非静态变量的区别
 * @author Administrator
 *
 */
public final class StaticVariableDemo {
	/**静态变量*/
	public static int numCount=0;
	/**非静态变量*/
	int size=0;
	/**
	 * 构造方法
	 */
	public StaticVariableDemo() {
		numCount++;
		System.out.println("此时此刻的numCount的值为："+numCount);
		System.out.println("此时此刻的size的值为："+size);
	}
	
}
