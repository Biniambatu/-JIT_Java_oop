class CalculateSquare{
	public void square() {
		System.out.println("  no parameter method called");
	}
	
	public void square(int num) {
		int square = num * num;
		System.out.println("method with integer argument called:"+square);
	}
	
	
	public void square(double num) {
		
		double square = num *num;
		System.out.println("method with float afrgument called:"+square);
	}
}
public class Main {

	public static void main(String[] args) {
	CalculateSquare obj= new CalculateSquare();
	obj.square();
	obj.square(4);
	obj.square(2.5);
	}
}

