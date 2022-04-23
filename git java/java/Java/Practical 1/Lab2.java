/*
	Practical 2.2: Perform fibonaki series.
*/

public class Lab2{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		
		int first = 0;
		int second = 1;
		int next = 0;
		
		for(int i=0; i <n; i++){
			next = first + second;
			System.out.print(first + " ");
			first = second;
			second = next;
		}
	}
}