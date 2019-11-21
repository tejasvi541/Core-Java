 class A
  {
    void show()
        {
         System.out.println("I am from class A");
         } 
   }

class B
   {
      void showB()
         {
            System.out.println("I m in class B"); 
         }   
 
   }

class Dummy3
   {
     public static void main(String args[])
    {
        A myobj = new A();
        myobj.show();
        new B().showB();
        System.out.println("Hello" + " | " + "world " +  args[0] + " " + args[1]);
        System.out.print("Thanks");
    }

   }//println means that \n,
    //we can also write print  simplyy add \n later