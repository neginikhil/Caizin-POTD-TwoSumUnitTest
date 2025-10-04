import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    int[] bruteForce(int[] arr, int targetSum){
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==targetSum && i!=j){
                    res[0] = arr[i];
                    res[1] = arr[j];
                    return res;
                }
            }
        }
        return null;
    }

    int[] usingMap(int arr[], int targetSum){
        Map<Integer, Integer> mp = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<arr.length;i++) {
            int left = targetSum - arr[i];
            if (mp.containsKey(left)) {
                res[0] = arr[i];
                res[1] = left;
                return res;
            }
            mp.put(arr[i], i);
        }
        return null;
    }

    int[] twoPointer(int[] arr, int targetSum){
        Arrays.sort(arr);
        int[] res = new int[2];
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==targetSum){
                res[0] = arr[i];
                res[1] = arr[j];
                return res;
            }
            else if(arr[i]+arr[j]<targetSum){
                i++;
            }
            else{
                j--;
            }
        }
        return null;
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Number at index : "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targetSum : ");
        int targetSum = sc.nextInt();
        int res[] = bruteForce(arr,targetSum);
        for (int i : res){
            System.out.println(i);
        }
    }

}

