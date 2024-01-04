import java.util.Arrays;

public class Find_element_occuring_once_when_all_other_are_present_thrice {
        static int singleElement(int[] arr , int N) {
        // code here
        Arrays.sort(arr);
        for(int i=0; i< N-3;i=i+3){
            if(arr[i] != arr[i+2]){
                return arr[i];
                
            }
        }
        return arr[N-1];
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,34,34,1,2,34,2,1};
        int N = 10;
        System.out.println(singleElement(arr, N));
    }
}
