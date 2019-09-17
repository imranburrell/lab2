
public class IterationMathlib extends Mathlib{

	@Override
	public int gcd(int x, int y) {
		int remain=0;
		while (y !=0){
			remain=y;
			y = x%y;
			x= remain;
		}
		return 0;
			
		}
		
	

	@Override
	public int ack(int x, int y) {
		System.out.println("");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fib(int x) {
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hanoi(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
