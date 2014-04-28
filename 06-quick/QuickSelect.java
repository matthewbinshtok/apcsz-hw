// I fell asleep before I could finish working on this.

public class QuickSelect {

    public int quickselect(int[] a, int k, int low, int high){
	if ( low >= high ){
	    return a[low];
	}
	int pivot = a[(int)(Math.random()*(high-low))];
	int[] t = new int[high-low];
	int tlow = low;
	int thigh = high;
	for (int i = low; i < high; i++){
	    if (a[i] <= pivot){
		t[tlow] = a[i];
		tlow++;
	    }
	    else if (a[i] > pivot){
		t[thigh] = a[i];
		thigh--;
	    }
	}
	t[tlow] = pivot;
	for (int i = low; i < high; i++){
	    a[i] = t[i-low];
	}
	if (tlow == k){
	    return pivot;
	}
	else if (tlow < k){
	    return quickselect(a,k,tlow,high);
	}
	return quickselect(a,k,low,thigh);
    }
    
    public static void main( String[] args ){
	QuickSelect q = new QuickSelect();
	int[] test = new int[100];
	for (int i = 0; i < 100; i++){
	    int x = (int)Math.random() * 100 + 1;
	    test[i] = x;
	}
	int p = q.quickselect(test,21,0,99);
	System.out.println("The value of the element at index 21 is "+p+".");
    }
	

}
