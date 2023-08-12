package section02;
/*
 * 
 * 
 */

public class Variable07 {
	public static void main(String[] args) {
		byte 1Byte = 10;
		int iInt = 1Byte;  // 자동으로 형변환
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		
		//다운캐스팅 - overflow 주의
		int iInt2 = 130; // 128 : -128, 129: -127,130: -126
		byte iByte2 = (byte)iInt2;
		System.out.println("iByte2: " + iByte);
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; // 소수부분 절삭
		System.out.println("iInt3: " + iInt3);
		
	}

}
