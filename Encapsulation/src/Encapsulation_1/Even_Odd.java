package Encapsulation_1;

public class Even_Odd {
	 private static int x;
	 private static boolean return1;
	 static void setValue(int a) {
		 x=a;
	 }
		 
	   static void evenodd() {
	    if (x % 2 == 0)
	      return1=true;
	    else
	      return1=false;
	  }
	   static boolean getRes() {
		   return return1;
	   }

}
