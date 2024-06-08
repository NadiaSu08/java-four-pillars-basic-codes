package polymorphism;

class poly_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    {
	        // Calling method by passing
	        // input as in arguments
	        System.out.println(poly.Multiply(2, 4));
	        System.out.println(poly.Multiply(5.5, 6.3));
	        
	        poly nadia;
	        
	        nadia = new poly();
	        nadia.Print();
	        
	        parent_poly a;
	        
	        // Now we will be calling print methods
	        // inside main() method
	 
	        a = new child_1();
	        a.Print();
	 
	        a = new child_2();
	        a.Print();
	    }
	}

}
