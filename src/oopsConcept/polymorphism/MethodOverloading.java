package oopsConcept.polymorphism;

import pojo.Customer;
import pojo.Employee;

public class MethodOverloading {

	public void m1(String str) throws NullPointerException {
		
	}

	public String m1(String str, Integer i) throws NumberFormatException {
		return str;
	}
	
	public static void main(String[] args) {
		Customer c = new Customer("Tom", 20);
		Customer c1 = new Customer("Tom", 20);
		Employee e = new Employee();
		Employee e2 = new Employee();
		
		System.out.println(e.equals(c));
		System.out.println(e.equals(e2));
		System.out.println(c1.equals(c));

		String s1 = new String("abc");
		String s2 = new String("abc");
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		System.out.println(s1.equals(s2));
		System.out.println(i.equals(i1));
		
		System.out.println("integer is"+s1==s2);
		
	}

}
