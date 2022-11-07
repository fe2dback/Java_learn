package Chapter_1;

public class test {
	
	public static void main(String[] args) {
						
		System.out.println(solution(41, 30));
	}
	
	
	public static long solution(int balls, int share) {

        share = Math.min(balls - share, share);

        if (share == 0)
            return 1L;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
        
        
    }
	
}
