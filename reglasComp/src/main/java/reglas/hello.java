package reglas;

public class hello {
	public static void main(String[] args) {
       
        System.out.println("Hello, World");
        if(menor(2, 5) == true)  System.out.println("5 menor a 2");
    }
	
	
	public static boolean mayor(int a, int b)
	{
		return  a >= b;
		
	}
	public static boolean menor (int a, int b)
	{
		return a <= b;
		
	}
	public static boolean igual (int a, int b)
	{
		return a == b;
		
	}
	
}
