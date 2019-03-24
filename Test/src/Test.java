
public class Test {

	  public static void main(String[] args) {
		         System.out.println(new Test().test());
		         
		         System.out.println("hebing zhugan ");
		       }
		   
		       static int test() {
		           int x = 0;
		         try {  
	           return x;
		         } finally {
		              ++x;
		        }
		     }


}
