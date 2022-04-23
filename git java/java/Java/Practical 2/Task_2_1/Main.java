import java.util.*;

class Main{
	public static void main(String args[]){
		//System.out.println("Hello world");
		//Scanner sc = new Scanner(System.in);
		
		Array arr = new Array(new int[]{2,3,52,67,90} );
		
		arr.reverse_array();
		System.out.println("The maximum of array is : "+arr.maximum_of_array());
		System.out.println("The maximum of array is : "+arr.average_of_array());
	
		arr.sorting();
		arr.display();
		System.out.println("The size of array "+ arr.size());
		System.out.println("The index of 3 is : "+ arr.search(3));
		arr.display();
		
		System.out.println();
		
		Array ar2 = new Array();
		
		ar2.reverse_array();
		System.out.println("The maximum of array is : "+ar2.maximum_of_array());
		System.out.println("The maximum of array is : "+ar2.average_of_array());

		ar2.sorting();
		ar2.display();
		System.out.println("The size of array "+ ar2.size());
		System.out.println("The index of 3 is : "+ ar2.search(3));
		arr.display();
	}
}

class Array{
	Scanner sc = new Scanner(System.in);
	//Field
	private int data[];
	
	//Function
	public Array(){
		int[] data = {10,20,30,50,12,40,90,84,23,7};
		
		this.data = data;
	}
	
	public Array(int size){
		int[] data = new int[size];
		for(int i=0; i<data.length; i++){
			System.out.print("Enter the element "+ i+" : ");
			data[i] = sc.nextInt();
			System.out.println();
		}
		this.data = data;
	}
	
	public Array(int data[]){
		this.data = data;
	}
	
	void reverse_array(){
		System.out.print("The reverse array is :");
		for(int i=data.length-1; i>=0; i--){
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	int maximum_of_array(){
		int max = data[0];
		for(int value:data){
			max = (value>max) ? value : max;
		}
		return max;
	}
	
	float average_of_array(){
		float sum=0;
		float avg;
		
		for(int value:data){
			sum = sum + (float)value;
		}
		
		avg = sum / (float)data.length;
		
		return avg;
	}
	
	void sorting(){
		for(int i=0; i<data.length - 1; i++){
			for(int j=i+1; j<data.length; j++){
				if(data[i]>data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	
	void display(){
		System.out.print("The array is : ");
		for(int value : data){
			System.out.print(value + ", ");
		}
		System.out.println();
	}
	
	int search(int no){
		int index = -1;
		for(int i = 0; i<data.length; i++){
			index = (data[i]==no)?i:index;
		}
		return index;
	}
	
	int size(){
		return data.length;
	}
}