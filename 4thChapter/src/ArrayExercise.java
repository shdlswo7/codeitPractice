
public class ArrayExercise {
	public static void main(String[] args) {
		int[] intArray = new int[30];
		
		intArray[0] = 1001;
		for(int i=0; i<intArray.length; i++) {
			intArray[i]= i+intArray[0];
			//System.out.println(intArray[i]);
		}
		String[] remainders= {"Zero","One","Two","Three"};
//		for(int i : intArray) {
//			if(i%4==0) {
//				System.out.println(remainders[0]);
//			}else if(i%4==1) {
//				System.out.println(remainders[1]);				
//			}else if(i%4==2) {
//				System.out.println(remainders[2]);
//			}else {
//				System.out.println(remainders[3]);
//			}
//		}
		for(int i : intArray) {
			//int i의  i값은 intArray[i]의 값들이다. 1001,1002,.......1030
			System.out.println(remainders[i%4]);
		}
	}
}
