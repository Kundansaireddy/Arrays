public class leadersOfArray {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        int max = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}
