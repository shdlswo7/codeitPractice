package ShapePrinter;

public class ShapeMain {
	public static void main(String[] args) {
        Shape printer = new Shape();

        // �׽�Ʈ
       // printer.printTriangle(3);
       // System.out.println("----------");
       // printer.printTriangle(5);
       // System.out.println("----------");
       // printer.printTriangle(10);
        

        // �׽�Ʈ
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}