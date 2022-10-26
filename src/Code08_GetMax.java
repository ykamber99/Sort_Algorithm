public class Code08_GetMax {
    public static int getMax(int[] arr){
        return process(arr,0,arr.length - 1);
    }

    //find the largest number on arr[L...R]
    public static int process(int[] arr, int L, int R){
        if(L==R){
            //only 1 number in arr[L...R], return it directly
            //base case
            return arr[L];
        }
        //mid = (R + L) / 2 --> may overflow
        //mid = L + (R - L)/2 <--> L + ((R_L) >> 1)
        int mid = L + ((R - L) >> 1);
        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid + 1, R);
        return Math.max(leftMax, rightMax);
    }
}
