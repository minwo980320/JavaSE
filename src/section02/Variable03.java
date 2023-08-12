package section02;
/*
 * 3.정수형
 * byte (1byte):-128~+127
 * short(2byte):-32768~+32768
 * int   (4byte): -21억~+21억
 * long  (8byte):-90억~+90억
 * 
 * 
 */

public class Variable03 {
	
	public static void main(String[] args) {
		//정수형변수 선언과 동시에 값 대입하기
		byte iByte=10;
		short iShort=100;
		int iInt= 10000;
		int iLong=1000000000;
		
		System.out.println("byte형:"+iByte);
		System.out.println("short형:"+iShort);
		System.out.println("int형:"+iInt);
		System.out.println("long형:"+iLong);
		
		iByte+=120; //iByte=iByte+120;
		System.out.println("byte overflow"+iByte);
	}

}
