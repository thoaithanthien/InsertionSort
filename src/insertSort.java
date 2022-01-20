
public class insertSort {
	
	// Sap xep chen
	// Theo thu tu cua mang tu dau toi cuoi so nho hon so dung truoc se dc chuyen sang dau mang[]
	
public static void printArray(int no, int[] a) {
		
	    System.out.printf("%d: ", no);
	    for (int i = 0; i < a.length; i++) {
	        System.out.printf("%d ", a[i]);
	    }       
	    System.out.println();
	}
	
	public static void insertionSort(int [] a) {
	
	    int n = a.length;
	    for (int i = 1; i < n; i++) {
	       // Chen a[i] vao day 0 -> i-1
	        int ai = a[i];
	        int j = i-1;
	        while (j >= 0 && a[j] > ai) {
	        	a[j+1] = a[j];
	        	j--;
	        }
	        	a[j+1] = ai;
	        	printArray(i, a);
	    }         
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5, 3, 2 ,7, 8, 1, 2 }; 
		insertionSort(a);
	}

}
