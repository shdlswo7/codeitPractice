package GreatestDifference;

public class GreatestDifferenceFinder {
	int greatestDifference(int[] intArray) {
		if(intArray.length<2) {
			return 0;			
		}
		//intArray 0번째 값 세팅
		int max=intArray[0];
		int min=intArray[0];
		//반복문으로 최대값, 최소값구하기
		//num = intArray[0];값으로 시작
		//num의 다음 값이 이전의 값보다 적으면 min
		//num의 다음 값이 이전의 값보다 크면  max
		for(int num:intArray){
			if(num>max) {
				 max=num;
			}if(num<min){
				 min=num;
			}
		}
		return max-min;
	}
}
