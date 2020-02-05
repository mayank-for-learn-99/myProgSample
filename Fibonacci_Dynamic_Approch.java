import java.util.*;
class Fibonacci_Dynamic_Approch{//Dynamic Programming by using backtracking
	static ArrayList<Long> arr = new ArrayList<Long>();
	static long fib(int n)
	{
		arr.add(1L);
		arr.add(1L);
		arr.add(1L);
				for(int i=3;i<=n;i++)
			    { 
					long res =arr.get(i-1)+arr.get(i-2);
			        arr.add(i,res);
				}
			return arr.get(n);
	}
	public static void main(String [] args){
	
		int n=500;
		long sum=fib(n);
		System.out.println(sum);
			
	}
	}