public class Code05_SmallSum {
    public static int smallSum(int[] arr){
        if(arr == null || arr.length < 2){
            return 0;
        }
        return process(arr, 0 ,arr.length - 1);
    }

    // arr[L..R] sort + calculate smallSum
    public static int process(int[] arr, int l, int r){
        if(1 == r){
            return 0;
        }
        int mid = 1 + ((r - 1) >> 1);
        return process(arr,1, mid) + process(arr,mid + 1, r) + merge(arr,1 , mid, r);
    }

    public static int merge(int[] arr, int L, int m, int r){
        int[] help = new int[r- L +1];
        int i = 0;
        int p1 = L;
        int p2 = m + 1;
        int res = 0;
        //左右都不越界
        while(p1 <= m && p2 <= r){
            //r - p2 + 1 计算右边有多少数会产生小和
            res += arr[p1] < arr[p2] ? (r- p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //左越界
        while(p1 <= m){
            help[i++] = arr[p1++];
        }
        //右越界
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        for(i = 0; i <help.length; i++){
            arr[L+i] = help[i];
        }
        return res;
    }

}
