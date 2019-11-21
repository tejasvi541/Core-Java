class Bill
{
	public static void main(String[] args) {
		int cho=Integer.parseInt(args[0]);
		double amt,bill;

		if(cho==1)
		  amt=90.000000;
		if(cho==2)
          amt=150.000000;
        if(cho==3)
          amt=180.000000;
        else if(cho==4)
          amt=250.000000;
      bill=amt;
       
       int cho=Integer.parseInt(args[1]);
         if(cho==2)
         bill=new disc().dis();
         
       int cho=Integer.parseInt(args[2]);
         if(cho==2)
         bill=new disc().dis();
       int cho=Integer.parseInt(args[3]);
         if(cho==1)
         	bill=bill+100;

         bill=bill+(bill*0.18);
         System.out.println(bill);


	}
}
class disc
{
	float dis()
	  {
       return (bill-(amt*0.10));
	  }
}
