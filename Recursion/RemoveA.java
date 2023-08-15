public class RemoveA {
    public static void main(String[] args) {
        String a = "Hellovaikyahaal";
        String s = skip(a);
        System.out.println(s);
    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip(str.substring(1));
        }else{
            return ch + skip(str.substring(1));
        }
    }
}
