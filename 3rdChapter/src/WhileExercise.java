
public class WhileExercise {
	public static void main(String[] args) {
		int num = 10000;
		int key = 153;
		int i = 1;  //key�� ����� �����ֱ� ���� ���� ����.
		
		while(key * i<=num) {
			if((i+1)*key>num) { 
			  System.out.println(key*i);
			  break;
			}
			i=i+1;
		}
	}
}
