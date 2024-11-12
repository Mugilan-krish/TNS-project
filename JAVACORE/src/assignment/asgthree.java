package assignment;

public class asgthree {

	public static void main(String[] args) {
		int n=10;
		int m=30;
		int N=4;
		
		for(int i=n;i<=m;i=i+1)
		{
			int a=i;
			int sum=0;
			while(a!=0) {
				int d=a%10;
				sum+=d;
				d/=10;
			}
			if(sum==N) {
				System.out.println(i);
			}
			
			
		}


	}

}
