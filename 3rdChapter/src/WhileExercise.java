
public class WhileExercise {
	public static void main(String[] args) {
		int num = 10000;
		int key = 153;
		int i = 1;  //key의 배수를 곱해주기 위한 변수 선언.
		
		while(key * i<=num) {
			if((i+1)*key>num) { 
			  System.out.println(key*i);
			  break;
			}
			i=i+1;
		}
	}
}
