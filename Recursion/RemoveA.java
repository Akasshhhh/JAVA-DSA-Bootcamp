public class RemoveA {
    public static void main(String[] args) {
        String a = "Hellovaikyahaal";
        String s = skip(a);
        System.out.println(s);

        String b = "appleistasty";
        String x = skipString(b);
        System.out.println(x);
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

    //For a situation if we want to skip a string for example "Apple"
    static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        
        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }else{
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
