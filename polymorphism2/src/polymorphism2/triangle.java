package polymorphism2;

public class triangle extends shape{
	double base, height;
	
	triangle(double base, double height){
		this.base=base;
		this.height=height;
	}
	
	double area() {
		return 0.5*base*height;
	}

}
