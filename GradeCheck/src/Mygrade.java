
public class Mygrade {
	public static void main(String[] args) {
		//�� ���� ����
		//�̰��� �ڵ带 �ۼ��ϼ���.
		int koreanScore;
		koreanScore=86;
		
		int mathScore;
		mathScore=94;
		
		int scienceScore = 87;
		int computerScore= 100;
		//��� ����
		//�̰��� �ڵ带 �ۼ��ϼ���.
		int sum;
		sum=koreanScore + mathScore + scienceScore + computerScore;
		System.out.println("�� ���� :"+sum);
		
		double average;
	    int count=4;
		average=(double)sum/count;
		System.out.println("������� :"+average);
	}
}
