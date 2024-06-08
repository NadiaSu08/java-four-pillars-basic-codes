package get_set;

class GetSet {
	
	private int num;
	 
    // Method 1 - Setter
    public void setNumber(int number)
    {
        // Checking if number is between 1 to 10 exclusive
        if (number < 1 || number > 10) {
 
            throw new IllegalArgumentException();
        }
        num = number;
    }
 
    // Method 2 - Getter
    public int getNumber() { return num; }
	 // Member variable of this class
    //private String name;
 
    // Method 1 - Getter
    //public String getName() { return name; }
 
    // Method 2 - Setter
   // public void setName(String N)
    //{
 
        // This keyword refers to current instance itself
        //this.name = N;
    	
    	
    //}
}
