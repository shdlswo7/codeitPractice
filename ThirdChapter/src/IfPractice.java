
public class IfPractice {
	public static void main(String[] args){
		int a=38, b=38;
		if(a==b){
			System.out.println("a=b="+a);
		}else{
			System.out.println("a와 b는 같지 않습니다.");
			if(a>b){
				System.out.println("a가 b보다"+(a-b)+"만큼 더 큽니다.");
			}else if(a<b){
				System.out.println("b가 a보다"+(b-a)+"만큼 더 큽니다.");
			}
		}
		
	}
}
