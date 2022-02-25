
public class Employee extends Person  {
 private String designation;
  public Employee() {
	
}
  public Employee(String fn, String ln, String des) {
	  super (fn, ln);
	  designation = des;
	  System.out.println("3params constructor");
  }
}
