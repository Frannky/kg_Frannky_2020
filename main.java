import java.util.Arrays;
public class main {
    public static boolean mapping(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int ascii_number = 128;
        int[] s1_map = new int[ascii_number];
        int[] s2_map = new int[ascii_number];
        Arrays.fill(s1_map,-1);
        Arrays.fill(s2_map,-1);
        for (int i = 0; i< s1.length();i++){
            //loop through s1
            if(s1_map[s1.charAt(i)] == -1){
                if (s2_map[s2.charAt(i)] == 1){
                    return false;
                }
                s2_map[s2.charAt(i)] = 1;
                s1_map[s1.charAt(i)] = s2.charAt(i);
            }
            else if (s1_map[s1.charAt(i)] != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
         *Determine whether a one-to-one character mapping exists from one string, s1, to another string, s2.
         *For example, given s1 = abc and s2 = bcd, print "true" into stdout since we can map each
         *character in "abc" to a character in "bcd".
         *Given s1 = foo and s2 = bar, print "false" since the character 'o' cannot map to two characters.
         *But given s1 = bar and s2 = foo, print "true" since each character in "bar" can be mapped to a
         *character in "foo".
         */
        if(args.length < 2){
            System.out.println("please type two strings!");
        }
        String s1 = args[0];
        String s2 = args[1];
        boolean ret = mapping(s1,s2);
        if (ret){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}