public class Code02_BubbleSort {

    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int e = arr.length-1; e >0; e--){
            for (int i = 0; i < e; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,  i+1);
                }
            }
        }
    }

    //swap arr[i] and arr[j]
    //使用前提：i位置不等于j位置，否则N^N（同一个位置自己算）异或得0⃣️
    public static void swap(int[] arr, int i ,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


}
