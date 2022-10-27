package prakt3.GB_java_homwork3;
//Реализовать алгоритм сортировки слиянием
import java.util.Arrays;
import java.util.logging.Logger;

public class task1 {
    public static void main(String[] args) {
        int[] a1 = new int[]{17,32,15,12,12,76,47,17};
        int[] a2 = new int[]{17,86,32,54,37,76};
        int[] a3 = new int[a1.length + a2.length];
        Logger log = Logger.getAnonymousLogger();

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        log.info(ConvertArray(DelletDouble(a3)));
    }
        private static String ConvertArray(int [] nums){
            Arrays.sort(nums);
            String a= Arrays.toString(nums);
            String ar[]=a.substring(1,a.length()-1).split(", ");
            Arrays.toString(ar);
            return a;
        }
    public static int[] DelletDouble(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        Arrays.sort(arr);
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) n++;
        }
        int[] res = new int[n];
        res[0] = arr[0];
        n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) res[n++] = arr[i];
        }
        return res;
    }
    }
