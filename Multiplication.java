class Multiplication
{
	public static void main(String[] args) {
		 int n=Integer.parseInt(args[0]);
		 int m=Integer.parseInt(args[1]);
		 int mul=0;
         for(int i=1;i<=m;i++)
         {
         	mul=n*i;
         	System.out.println(n + "*" + m + "=" +mul);
         }
	}
}