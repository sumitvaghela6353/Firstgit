/*
	To perform command line calculator.
*/

public class Lab{
	public static void main(String[] args){
		float args1;
		String args2 = args[1];
		float args3;
		float output=0;
		
		args1 = Float.parseFloat(args[0]);
		args3 = Float.parseFloat(args[2]);
		
		switch(args[1]){
			case "+":
				output = args1 + args3;
				break;
				
			case "-":
				output = args1 - args3;
				break;
			
			case "'*'":
				output = args1 * args3;
				break;
			
			case "/":
				output = args1 / args3;
				break;
		}
		
		System.out.println("The output is ");
		System.out.println(args1 + " " + args2 + " "+ args3 +" = " + output);
	}
}