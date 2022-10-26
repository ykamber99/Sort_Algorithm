public class Code06_QuickSort {
    //arr[1...r]排序
    public static void quickSort(int[] arr, int L, int R){
        if(L < R){
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1); // < 区
            quickSort(arr, p[1] + 1, R); // > 区
        }
    }

    //处理arr[1...r]的函数
    //默认以arr[r]划分, arr[r] -> p <p ==p >p
    //返回等于区域（左边界，右边界），所以返回一个长度为2的数组res，res[0] res[1]
    public static int[] partition(int[] arr, int L, int R){
        int less = L - 1;
        int more = R;
        while(L < more){
            if (arr[L] < arr[R]){
                swap(arr, ++less, L++);
            }
            else if(arr[L] > arr[R]){
                swap(arr, -- more, L);
            }
            else{
                L++;
            }
        }
        swap(arr, more, R);
        return new int[] {less + 1, more};
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
