public class Subsequence {
    public static void main(String[] args) {
        String a = "abcd";
        subseq("", a);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1)); //once taking the character 
        subseq(p, up.substring(1)); // once ignoring the character

    }
}
