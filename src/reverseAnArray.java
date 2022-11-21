public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int low=0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;high--;
        }
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
