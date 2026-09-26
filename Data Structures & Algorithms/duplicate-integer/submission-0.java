
class Solution {
    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for(int nums: arr){
            if(seen.contains(nums)){
                return true;
            }
            seen.add(nums);
        }return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean r = hasDuplicate(arr);
        System.out.print(r);
    }
}