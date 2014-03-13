// I fell asleep before I could finish working on this.
import java.util.ArrayList;

// qsort(L):
//    if length of L <= 1:
//       return L
//    otherwise:
//       select pivot (randomly from within L)
//  	 partition the list into lower and upper halves:
//  	 R1 = qsort(lower half)
//  	 R2 = qsort(upper half)
//  	 combine R1 + pivot + R2 into L


public class QuickSort {

    public int[] quicksort(int[] a){
	if ( a.length <= 1 ){
	    return a;
	}
	int pivotindex = (int)Math.random()*a.length;
	int pivot = a[pivotindex];
	ArrayList<Integer> r1 = new ArrayList<Integer>();
	ArrayList<Integer> r2 = new ArrayList<Integer>();
	for (int x: a){
	    if (x <= pivot){
		r1.add(x);
	    }
	    else if (x > pivot){
		r2.add(x);
	    }
	}
	int[] s1;
	int[] s2;
	System.out.println(r1);
	System.out.println(r2);
	return a;
    }

    public static void main( String[] args ){
	QuickSort s = new QuickSort();
	int[] test = new int[100];
	for (int i = 0; i < 100; i++){
	    int x = (int)Math.random() * 100 + 1;
	    test[i] = x;
	}
	s.quicksort(test);
    }

}
