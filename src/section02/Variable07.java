package section02;
/*
 * 
 * 
 */

public class Variable07 {
	public static void main(String[] args) {
		byte 1Byte = 10;
		int iInt = 1Byte;  // �ڵ����� ����ȯ
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // �ڵ����� ����ȯ
		
		//�ٿ�ĳ���� - overflow ����
		int iInt2 = 130; // 128 : -128, 129: -127,130: -126
		byte iByte2 = (byte)iInt2;
		System.out.println("iByte2: " + iByte);
		
		// �Ǽ� -> ���� ����ȯ ��
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; // �Ҽ��κ� ����
		System.out.println("iInt3: " + iInt3);
		
	}

}
