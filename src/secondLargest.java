public class secondLargest {
    static int getLargest(int[] arr){
        int max = arr[0];
        for(int i=0;i< arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    static int getSecondLargest(int[] arr){
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1 = arr[i];
            }
            else if(arr[i]<max1){
                if(max2<arr[i]) max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,20,10};
        int res1 = getLargest(arr);
        int res2 = getSecondLargest(arr);
        System.out.println(res1+" "+res2);
    }
}
