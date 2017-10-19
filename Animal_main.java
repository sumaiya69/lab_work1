package lab_project;

public class Animal_main {

	public static void main(String[] args) {
		
		Animal T;
		static void doSomething(Animal T)
		{
			void getMessage()
			{
				System.out.println("the features are ready");
			}
		Birds b=new Birds();
	    
		T=b;
		try
		{
			if(T instanceof Oviporous)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Oviporous");
			}			
			
			if(T instanceof Mammal)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Mammal");
			}	
			if(T instanceof Birds)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Birds");
			}	
			if(T instanceof Insectes)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Insectes");
			}	
			if(T instanceof Land)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Land");
			}	
			if(T instanceof Water)
			{
				System.out.println(T.type());
				System.out.println(T.is_can_move());
				System.out.println(T.can_fly());
				System.out.println("Water");
			}	
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		}

	}

}
