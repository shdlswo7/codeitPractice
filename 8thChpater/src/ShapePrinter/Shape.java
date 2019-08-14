package ShapePrinter;

public class Shape {
	public void printTriangle(int height) {
		
		for(int i=1; i<=height; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printPyramid(int height) {
		for(int i=1; i<=height; i++){ 
				//È¦¼ö Áõ°¡
			for(int j=1; j<=height-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}				
			System.out.println();
		}
	}
}
