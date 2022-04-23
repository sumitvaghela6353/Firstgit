import java.util.Scanner;

class Matrix{
	
	Scanner scan = new Scanner(System.in);
	//Field
	private int row;
	private int column;
	private float mat[][];

	//Function
	public Matrix(float a[][]){
		this.mat = a;
		this.row = mat.length;
		this.column = mat[0].length;
	}
	
	public Matrix(){
		this.mat = new float[][]{{1,2,3}, {2,5,7}, {8,10,35}};
		row = mat.length;
		column = mat[0].length;
	}
	
	public Matrix(int row, int col){
		this.row = row;
		this.column = col;
	}
	
	public void readMatrix(){
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
			System.out.print("Enter the number ["+i+"]["+j+"] = ");
			scan.nextInt();
			}
		}
	}
	
	public float[][] transpose(){
		float tr[][] = new float[row][column];
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				tr[j][i] = mat[i][j];
 			}
		}
		this.mat = tr;
		return mat;
	}
	
	public float[][] matrixMultiplication(float[][] mat2){
		
		int row = mat.length;
		int col = mat2[0].length;
		float[][] mult = new float[row][col];
		if(mat[0].length == mat2.length){
			
			
			
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					int sum = 0;
					for(int k=0; k<mat[0].length; k++){
						sum+=mat[i][k]*mat2[k][j];
					}
					mult[i][j] = sum;
				}
			}
		}
		else{
			System.out.println("The matrix multiplication is not applicable.");
		}
		
		return mult;
	}
	
	public void displayMatrix(float a[][]){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public void displayMatrix(){
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
	
	public float maxOfArray(){
		float max = mat[0][0]; 
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				max = (max<mat[i][j])?mat[i][j]:max;
			}
			//System.out.println();
		}
		return max;
	}
	
	public float avgOfArray(){
		float sum = 0;
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				sum += mat[i][j];
			}
			//System.out.println();
		}
		return sum/((mat.length)*(mat[0].length));
	}
}