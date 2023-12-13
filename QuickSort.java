package javaPractice;
	import java.util.Scanner;
	public class QuickSort {
	    public static void swap(String[] a, int i, int j) {
	        String temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	    public static int partition(String[] a, int low, int high) {
	        String pivot = a[low]; 
	        int i = low;
	        for (int j = low + 1; j <= high; j++) {
	            if (a[j].compareTo(pivot) < 0) {
	                i++;
	                swap(a, i, j);
	            }
	        }
	        swap(a, low, i); 
	        return i;
	    }

	    public static void quickSort(String[] a, int low, int high) {
	        if (low < high) {
	            int pivot = partition(a, low, high);
	            quickSort(a, low, pivot - 1);
	            quickSort(a, pivot + 1, high);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the limit: ");
	        int limit = sc.nextInt();
	        sc.nextLine(); 

	        String[] strings = new String[limit];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < limit; i++) {
	            strings[i] = sc.nextLine();
	        }

	        quickSort(strings, 0, limit - 1);

	        System.out.print("Sorted strings : ");
	        for (int i = 0; i < limit; i++) {
	            System.out.print(strings[i]+"  ");
	        }
	    }
	}

