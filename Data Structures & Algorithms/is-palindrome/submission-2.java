public class Solution{
    public static boolean isPalindrome(String s){
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            newStr.append(Character.toLowerCase(c));
        }
    }
    return newStr.toString().equals(newStr.reverse().toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        System.out.print(result);
    }
}