package compiletimepolymorphism;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p= new Parent();
 p= new Child1();
 p.display();
 
 p= new Childclass2();
 p.display();
 
 }
}
