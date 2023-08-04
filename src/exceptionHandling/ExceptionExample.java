package exceptionHandling;

public class ExceptionExample {

	public void m1() throws NullPointerException {

	}

	public void m2() {

		/*
		 * ExceptionExample ee = new ExceptionExample(); ee.m1();
		 */

		try { // the code in which there is chance to raise exception
			ExceptionExample ee = new ExceptionExample();
			ee.m1();

		} catch (NullPointerException | NumberFormatException ne) { //

		}

		finally { // the code which exceution is must

		}

	}

	public void m3() {

	}

}
