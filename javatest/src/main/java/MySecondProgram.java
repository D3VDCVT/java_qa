public class MySecondProgram {

	public static void main(String[] args) {

		Point ab = new Point(4,2, 8, 2);

		System.out.println("Точка А имеет координаты " + "(" + ab.x1 + "," + ab.y1 + ")");
		System.out.println("Точка B имеет координаты " + "(" + ab.x2 + "," + ab.y2 + ")");
		System.out.println("Длина прямой АB равна " + ab.result());
	}

}