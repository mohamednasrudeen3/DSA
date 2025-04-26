package NasruPracticeforDSA.javaPractice.Matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {



    int array[][] = {{5,6,7},{3,4,5}};
    int array1[][] = {{1,2},{3,4},{5,6}};
                /* array2 is the resulting product matrix.. assign any random dimension.. here i have used 12 X 12*/
		int array2[][] = new int[12][12];
		int x = array.length;
		System.out.println("Array Length --> "+ array.length);
		System.out.println("Array1 Length -->"+ array1.length);
		System.out.println("Array Length -->"+ array2.length);
		for(int i=0;i<x;i++) {
			for(int j=0;j<=x;j++) {
				System.out.println(" "+ array[i][j]);
			}
			System.out.println();
	}
	int y = array1.length;
	for(int i=0;i<y;i++) {
		for(int j=0;j<y-1;j++) {
			System.out.println(" "+ array1[i][j]);
		}
		System.out.println();
	}
	for(int i=0;i<x;i++) {
		for(int j=0;j<y-1;j++) {
			for(int k=0;k<y;k++) {
				array2[i][j] += array[i][k]*array1[k][j];
			}
		}
	}
	System.out.println("Result");
	for(int i=0;i<x;i++) {
		for(int j=0;j<y-1;j++) {
			System.out.println(" "+array2[i][j]);
		}
		System.out.println();
	}
	}
}
