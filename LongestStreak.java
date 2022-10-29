public class LongestStreak {
    public static void main(String[] args) {
        longestStreak("CCAAAAATTT!");
    }
    public static void longestStreak(String str) {
        char mxch=' ', curch=' ';
        int ct=0, mxct=-1;    
        for (int i=0;i<str.length();i++) {        
            if (curch == str.charAt(i)) {
                ct++;        
            } else {
                if (ct>mxct) {
                    mxct = ct;
                    mxch = curch;
                }
                ct=1;
                curch = str.charAt(i);
            }
        }
        System.out.print(mxch+" "+mxct);
    }
}
