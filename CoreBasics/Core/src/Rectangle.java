
public class Rectangle extends Shape {
 private int len;
 private int breadth;
 
   public Rectangle() {}
   public Rectangle (int i, int j) {
    this.len=   i;
   this.breadth   =  j;  
    }

public void area() {
	System.out.println(len* breadth);
}
   
  
}