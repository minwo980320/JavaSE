package section02;
/*
 * 변수(Variable)
 * 데이터를 저장하고 창조하기 위환 메모리 공간을 나타내는 이름
 * 변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 잃거나 수정할 수 있다.
 * 
 * 변수 선언 및 초기화 방법
 * 자료형 변수명=값;
 * 
 * 기본 자료형 (8가지)
 * 자바에서 기본적으로 제공해주는 자료형
 * 정수형-byte,short,int,long
 * 실수형-float,double
 * 문자형-char
 * 논리형-boolean
 * 
 */



public class Variable {
	public static void main(String[] args) {
		//정수형 변수 선언하고 값 대입하기
		int numInt; //변수 선언
		
		numInt=10;   //값 대입(처음 값 대입을 초기화)
		
		numInt=3;  // 변수 값 수정하기
		
		
		//실수형 변수 선언하고 값 대입하기
		double numDouble=10.7;
		
		//문자열 변수 선언하고 값 대입하기
		
		String str="Hello";
		
		System.out.println(numInt);
		System.out.println(numDouble);
		System.out.println(str);
		
		
		
		
		
	}
	
}
