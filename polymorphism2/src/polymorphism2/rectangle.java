package polymorphism2;

public class rectangle extends shape {
	
	double length, width;
	
	rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	
	double area() {
		return length*width;
	}
	

}
