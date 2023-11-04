public class binary {
    static int search(int[] arr,int target,int s, int e){
        if (s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m]==target){
            return m;
        } else if (arr[m]>target) {
            return search(arr,target,s,m-1);
        } else {
            return search(arr,target,m+1,e);
        }
    }
    public static void main(String[] args) {
        int [] a = {1,3,6,10,14,21,29,32,45,50};
        System.out.println(search(a,28,0,a.length-1));
    }
}
