//method overriding lab exercise 2

class college{
	public void move() {
		
		System.out.println("Collage is open");
		
	}	
}
class univ extends college{
	
	public void move() {
		
		System.out.println("university is open to students");
	}
}
class softwareDepartment extends univ{
	
	public void move() {
		System.out.println("software dep't is open to developers  ");
	}
}





public class Stud {

	public static void main(String[] args) {
		college c1 = new college();
		college c2 = new univ();
		college c3 = new softwareDepartment();
c1.move();
c2.move();
c3.move();
	} 
}
