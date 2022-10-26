public class Code07_EvenTimesOddTimes {
    public static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for(int cur:arr){
            eor ^= cur;
        }
        System.out.println(eor);
    }


    public static void printOddTimesNum2(int[] arr){
        int eor =0;
        for(int cur:arr){
            eor ^= cur;
        }
        //eor = a^b;
        //eor != 0;
        //eor 二进制位必定有一个1；
        int rightOne = eor & (~eor +1); //提取最右的1
        // eor  : 1010111100
        //~eor  : 0101000011
        //~ero+1: 0101000100
        //&     : 0000000100
        int onlyOne = 0;
        for (int cur:arr){
            if((cur & rightOne) == 1){
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }
}
