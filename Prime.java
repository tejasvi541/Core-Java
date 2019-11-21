class Prime
{
	public static void main(String[] args)
	 {
		int count=0,opt=0;
	 int n=Integer.parseInt(args[0]);

	  	int i=2;
	  	while(i<n)
	  	{
	  		if(n%i==0)
	  		{
	  			opt=1;
	  			break;
	  		}
	  		i++;
	  	}

	  
      if(opt==0)
      	{
      		System.out.println("Number is Prime");
      	}
       else
       	System.out.println("Number is not prime");
    }
}