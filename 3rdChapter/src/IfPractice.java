
public class IfPractice {
	public static void main(String[] args){
		int a=38, b=38;
		if(a==b){
			System.out.println("a=b="+a);
		}else{
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
			if(a>b){
				System.out.println("a�� b����"+(a-b)+"��ŭ �� Ů�ϴ�.");
			}else if(a<b){
				System.out.println("b�� a����"+(b-a)+"��ŭ �� Ů�ϴ�.");
			}
		}
		
	}
}
