package lambadasExepresionSession;

public class A2 {
   public static void main(String[] args) {
	 A a1 = (int x , int y)->{
		 return x+y;
	 };
	  int value1 = a1.test1(20,30) ;
	  System.out.println("Add of X and Y " +value1);
	  
	  A1 a2 = (int x , int y)->{
		  return x-y;
	  };
	  int value2 = a2.test2(39,20);
	  System.out.println(value2);
	  
	  A1 a3 = (int x , int y)->{
		  return x*y;
	  };
	  int value3 = a3.test2(39,20);
	  System.out.println(value3);
	
  }
}
