package java8Lambda;
/**
 * 
 * @author act21
 * @implNote Lambda expression can be used only for Functional Interfaces
 *
 */
public class LambdaDeclaration {

	public static void main(String[] args) {

		// Lambda expression
		LambdaWebPage w1 = (value) -> System.out.println("Hi" + value);

		// Normal Expression
		LambdaWebPage w2 = new LambdaWebPage() {

			@Override
			public void header(String value) {
				System.out.println("Hello" + value);
			}
		};
		w1.header("google");
		w2.header("facebook");
	}

}
