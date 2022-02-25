package com.rays.basics;

public class saxena {
public static void main(String[] args) {
	String s= new String ("Bhagyshri  saxena");
	System.out.println("Stringlength" + s.length() );
    System.out.println(s.charAt(6));
    System.out.println(s.indexOf("bhag"));
    System.out.println(s.indexOf("g"));
    System.out.println(s.lastIndexOf("e"));
    System.out.println(s.replace("a", "A"));
    System.out.println(s.replaceAll("h", "s"));
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s.startsWith(s));
    System.out.println(s.endsWith("ena"));
    System.out.println(s.substring(6));

}
}
