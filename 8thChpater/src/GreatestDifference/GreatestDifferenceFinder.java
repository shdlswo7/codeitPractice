package GreatestDifference;

public class GreatestDifferenceFinder {
	int greatestDifference(int[] intArray) {
		if(intArray.length<2) {
			return 0;			
		}
		//intArray 0��° �� ����
		int max=intArray[0];
		int min=intArray[0];
		//�ݺ������� �ִ밪, �ּҰ����ϱ�
		//num = intArray[0];������ ����
		//num�� ���� ���� ������ ������ ������ min
		//num�� ���� ���� ������ ������ ũ��  max
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
