package oopsConcept.polymorphism;

public class MethodOverriding extends MethodOverloading {

	public void m1(String str) throws NumberFormatException {
		// TODO Auto-generated method stub
		super.m1(str);
	}

	public String m1(String str, Integer i) throws NullPointerException {
		// TODO Auto-generated method stub
		return super.m1(str, i);
	}

}
