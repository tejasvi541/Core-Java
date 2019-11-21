class Fibb
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum=0,pre=0,po=1;
		for(int i=1;i<=n;i++)
		{
			sum=pre+po;
			pre=po;
			po=sum;

				System.out.println(sum);
			}
	}
}