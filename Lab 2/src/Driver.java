
public class Driver {

	public static void main(String[] args) {
		IterationMathlib iterationLibrary =
				new IterationMathlib();
		RecursiveMathlib recursionLibrary =
				new RecursiveMathlib();
		System.out.println("---Recursion---");
		runTestCode(recursionLibrary);
		System.out.println("---Iteration---");
		runTestCode(iterationLibrary);
		// TODO Auto-generated method stub

	}
public static void runTestCode(Mathlib library){
	System.out.println("GCD(4,2)="+library.gcd(4, 2));
	System.out.println("Ackerman="+library.ack(4, 5));
}
}
