
public class Mygrade {
	public static void main(String[] args) {
		//각 과목 점수
		//이곳에 코드를 작성하세요.
		int koreanScore;
		koreanScore=86;
		
		int mathScore;
		mathScore=94;
		
		int scienceScore = 87;
		int computerScore= 100;
		//평균 점수
		//이곳에 코드를 작성하세요.
		int sum;
		sum=koreanScore + mathScore + scienceScore + computerScore;
		System.out.println("총 점수 :"+sum);
		
		double average;
	    int count=4;
		average=(double)sum/count;
		System.out.println("평균점수 :"+average);
	}
}
