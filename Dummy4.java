class Dummy4
   {
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("\n" +  (a+b));
		System.out.println("-----------");

		//declaring an array
		int Roll[] = new int[3];
		for(int i=0;i<=2;i++)
		{
			Roll[i]=i+100;
		}
		for(int i=0;i<=2;i++)
		{
			System.out.println(Roll[i]+ "\t");
		}
        //Using Method
        Array myobj = new Array();
        myobj.arr1();

	}
   }
class Array
   {
    void arr1()
    {
    	System.out.println("-----------");
     int Roll2[][] = new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				Roll2[i][j]=i+100;
			}
		}
		System.out.println("\n-----------\n");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(Roll2[i][j]+ "\t");
			}
		 System.out.println();
		}
    }	
   } 