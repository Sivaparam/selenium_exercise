package jan11;

public class Calculator {
	
	public int add(int[]nums) {
		
		int sum = 0;
		
		for(int n : nums) {
			sum += n;
		}
		
		return sum;
		
	}

}
