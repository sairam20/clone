public class MainClass {

	public static void main(String[] args) {
    
    Clone c=new Clone(10,20);
    System.out.println(c.getA());
    System.out.println(c.getB());
    if(c.getA()==c.getB())
    {
    	System.out.println("Both are same");
    }
    else
    {
    	System.out.println("Both are different");
    }
    }

}
