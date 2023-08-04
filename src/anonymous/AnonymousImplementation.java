package anonymous;

public class AnonymousImplementation {

	AnonymousImplementation ac = new AnonymousImplementation() {
		public void m2() {
			ParentClass p = new ParentClass();
			p.m1();
			// outside there is no scope for this method
		}

	};

	ParentClass p = new ParentClass() {

		public void m1() {
			m2();
		}

		public void m2() {
			// outside there is no scope for this method
		}

	};

	ParentInterface p1 = new ParentInterface() {

		@Override
		public void m1() {

			m2();
		}

		public void m2() {
			// outside there is no scope for this method
		}

	};

}
