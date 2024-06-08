package encap_ex;

public class area {
int Length;
int Breadth;
 

area(int Length, int Breadth){
 
	this.Length=Length;
	this.Breadth=Breadth;
}
 
 public void getArea()
 {
	 int Area =  Length*Breadth;
	 System.out.println("Area:" +Area);
 }
}
