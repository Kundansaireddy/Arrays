public class removeDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,4};
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                k++;
                arr[k]=arr[i];
            }
        }
        for(int i=0;i<=k;i++){
            System.out.println(arr[i]);
        }
    }
}
