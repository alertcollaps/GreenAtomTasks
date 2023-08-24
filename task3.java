

public class task3 {
    public static void main(String[] args) {
        String str = "Лёша на полке клопа нашёл";
        System.out.println("[reg is false]: \"" + str + "\" is palidrom? -> " + isPalindrom(str, false));
        System.out.println("[reg is true]: \"" + str + "\" is palidrom? -> " + isPalindrom(str, true));

    }
    /*
     * @param register add feeling to letter case;
     * Example:
     * isPalindrom("Oppo", true) returns false;
     * isPalindrom("Oppo", false) returns true;
         
    */
    public static boolean isPalindrom(String str, boolean register){ 
        if (!register){
            str = str.toUpperCase();
        }
        str = str.replaceAll("\\s", "");
        int len = str.length();
        for (int i = 0; i < len/2; i++){
            if (str.charAt(i) != str.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
