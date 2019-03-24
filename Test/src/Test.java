
public class Test {

	  public static void main(String[] args) {
		         System.out.println(new Test().test());
		         
		         System.out.println("123123");
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
