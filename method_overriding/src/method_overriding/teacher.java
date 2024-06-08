package method_overriding;

public class teacher extends person {
	
	String qualification;
	 
	 @Override
	void display() {
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Qual : "+qualification);
	System.out.println("\n");
	
}

}
