
public class RecursiveMathlib
extends Mathlib {

	@Override
	public int gcd(int x, int y) {
		if (y==0){ 
			return x;
		}else 
		if (x>y && x!=0){
		 return gcd(y,x%y);
		}
		return 0;
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ack(int x, int y) {
	if(x ==0){
		return y+1;
	}
	if (y==0){
		return ack(x-1,1);
	}
	if (x!=0&&y!=0){
		return ack(x-1, ack(x,y-1));
	}
		return 0;
	}

	@Override
	public int fib(int x) {
		if (x==0){
			return 0;
			
		}
		if(x==1 ){
			return 1;
		}
		if(x>1){
		return fib(x-1)+fib(x-2);
		}
		return 0;
	}

	@Override
	public int hanoi(int n) {
		if (n==1){
			return 1;
		}
			if(n>1){
				return 2*hanoi(n-1)+1;
			}
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	
		
	


}