class Digits
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);

		int i=0;
		while(n!=0)
		{
           i++;
          n=n/10;
         
		}

		System.out.println(i);
	}
}