public class Palindrome {
    public static void main(String[] args) {
        String name = "abccba";
        System.out.println(isPalindrome(name));
    }
    static boolean isPalindrome(String name){
        if(name.length() == 0 || name == null){
            return false;
        }
        int start = 0;
        int end = name.length()-1;
        while(start <= end){
            if(name.charAt(start) != name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
