public class leftRotateByN {
    static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 3;
        reverse(arr,0,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
