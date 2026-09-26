class Solution {
    public static boolean isAnagram(String s, String t) {
           if(s.length()!= t.length()){
           return false;
           }
           char[] sSort = s.toCharArray();
           char[] tSort = t.toCharArray();
           Arrays.sort(sSort);
           Arrays.sort(tSort);
           return Arrays.equals(sSort, tSort);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean result = isAnagram(s, t);
    }
}
