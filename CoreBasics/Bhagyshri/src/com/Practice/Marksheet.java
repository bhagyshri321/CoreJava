
package com.Practice;
public class Marksheet /*implements Comparable  <Marksheet>*/{
	
	private String Fname;
	private String Lname;
	private String Rollno;
	private int Math;
	private int Phy;
	private int Chem;
	
	public Marksheet() {
		
		
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getRollno() {
		return Rollno;
	}

	public void setRollno(String Rollno) {
		this.Rollno = Rollno;
	}

	public int  getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getPhy() {
		return Phy;
	}

	public void setPhy(int phy) {
		Phy = phy;
	}

	public int getChem() {
		return Chem;
	}

	public void setChem(int chem) {
		Chem = chem;
	}

	
	
	
	/*public int compareTo(Marksheet m) {
		
		return Rollno.compareTo(m.Rollno);
	}*/

	
	
	
	
	
}
