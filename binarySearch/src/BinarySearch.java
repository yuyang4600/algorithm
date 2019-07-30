public class BinarySearch {
    public int binarySearch(int[] arr, int key) {
        int low=0; //数组最小索引值
        int high=arr.length-1; //数组最大索引值
        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }else if(key>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            //嗯嗯
        }
        return -1; //low>high的情况，这种情况下key的值大于arr中最大的元素值或者key的值小于arr中最小的元素值
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,6,6,7,7,8,9};
        System.out.println(binarySearch.binarySearch(arr, 5));
    }
}
