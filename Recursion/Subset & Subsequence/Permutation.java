import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

        ArrayList<String> ans = permutationArrayList("", "abc");
        System.out.println(ans);
    }

    static void permutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        
        char ch = unprocessed.charAt(0);

        for(int i = 0; i <= processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i,processed.length());
            permutation(first + ch + second, unprocessed.substring(1));
        }
    }
    static ArrayList<String> permutationArrayList(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        
        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i,processed.length());
            ans.addAll(permutationArrayList(first + ch + second, unprocessed.substring(1)));
        }

        return ans;
    }
}
