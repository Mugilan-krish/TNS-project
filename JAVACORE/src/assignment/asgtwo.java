package assignment;

public class asgtwo {

	public static void main(String[] args) {
		for (int i=1;i<=5;i=i+1)
		{
		    for(int j=1;j<=5;j=j+1)
		    {
		    	if(i==1 ) {
		    		System.out.print(j);
		    		
		    	}
		    	
		    	else if(j==1  )
		    	{
		    		System.out.print(i);
		    	}
		    	
		    	
		    	else if(i==5  )
		    	{
		    		System.out.print(5-j+1);
		    	}
		    	else if(j==5  )
		    	{
		    		System.out.print(5-i+1);
		    	}
		    	
		       
		    	
		    	else
		    	{
		    		System.out.print(" ");
		    	}

		    }
		    

		    System.out.println();
		}

	}

}
