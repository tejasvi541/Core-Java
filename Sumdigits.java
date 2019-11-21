class Sumdigits
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);

		int i=0,r,sum=0;
		while(n!=0)
		{
          r=n%10; 
          n=n/10;
          sum=sum+r;
          i++;
         
		}

		System.out.println(sum);
	}
}