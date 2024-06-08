package polymorphism2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            shape[] s= new shape[3];
            
            s[0]=new shape();
            s[1]=new rectangle(10,20);
            s[2]=new triangle(15,20);
            
            for (int i=0; i<3; i++) {
            	System.out.println(s[i].area());
            }
            
            //System.out.println(s[0].area());
            //System.out.println(s[1].area());
            //System.out.println(s[2].area());
            //System.out.println(s.area());
            //rectangle r= new rectangle(10,20);
            //triangle t= new triangle(15,20);
            //s=new rectangle(10,20); 
            //System.out.println(s.area());
            //s=new triangle(15,20);
            //System.out.println(s.area());
            
            }

}
