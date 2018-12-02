package Template;

public abstract class AbstractSort {
    abstract boolean needSwap(int a, int b);

    public final void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (needSwap(arr[i],arr[j])) {
                    swap(arr,i,j);
                }
            }
        }
    }
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
