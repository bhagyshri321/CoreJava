
public class Person {
 private String name;
 private String lastname;
 private String address;
 
 public Person() {
	System.out.println("Person default con");}
 
 
 public Person(String fn, String ln) {
	 
	 

	 System.out.println("2 params contr is called"); }
 
 public Person (String fn, String ln, String address ) {
	
	  System.out.println("3 params const is called");
			  
 }
	 public static void main(String[] args) {
		Person p = new Person( "bHAGYSHRI","sAXENA" ,"hkjlhuoih" );
	}	 
	 

	
	

 
}
