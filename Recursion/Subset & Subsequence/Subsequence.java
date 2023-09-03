import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subset2("", "abc"));
    }

    static void subSeq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subSeq(processed + ch, unprocessed.substring(1));
        subSeq(processed, unprocessed.substring(1));
    }

    static ArrayList<String> subset2(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subset2(processed+ch, unprocessed.substring(1));
        ArrayList<String> right = subset2(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }
}
