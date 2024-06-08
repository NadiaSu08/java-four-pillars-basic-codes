package encapsulation;

class area {
	
 private int length;
 private int breadth;
  
   
    
    area(int length, int breadth)
 {
    	this.length=length;
    	this.breadth=breadth;
    }
      
   public void getArea() {
    	int area= length*breadth;
    	System.out.println("area : " +area);
    }
}
