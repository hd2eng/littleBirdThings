package dd2;
/**
 * ��̬������Ǿ�̬����������
 * @author Administrator
 *
 */
public final class StaticVariableDemo {
	/**��̬����*/
	public static int numCount=0;
	/**�Ǿ�̬����*/
	int size=0;
	/**
	 * ���췽��
	 */
	public StaticVariableDemo() {
		numCount++;
		System.out.println("��ʱ�˿̵�numCount��ֵΪ��"+numCount);
		System.out.println("��ʱ�˿̵�size��ֵΪ��"+size);
	}
	
}
