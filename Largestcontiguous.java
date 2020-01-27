import java.util.*;

class Largestcontiguous{
    void maxLength(int arr[],int n){
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum==0){
                maxlen = Math.max(maxlen, i+1);
            }
            else{
                if(map.containsKey(sum)==0){
                    maxlen = Math.max(maxlen, i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements in array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxLength(arr,n);
    }
}