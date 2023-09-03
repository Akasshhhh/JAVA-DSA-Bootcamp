
public class SkipACharacter {
    public static void main(String[] args) {
        String str = "bccaaddarre";
        String ans = skip(str, "");
        System.out.println(ans);

        String str2 = "bacjabaiaaadddd";
        String ans2 = skip2(str2);
        System.out.println(ans2);

        String str3 = "heheheapplehehehehapp";
        String ans3 = skipApple(str3);
        System.out.println(ans3);
    }

    static String skip(String unprocessed, String processed){
        if(unprocessed.isEmpty()){
            return processed;
        }
        if(unprocessed.charAt(0) == 'a'){
            return skip(unprocessed.substring(1),processed);
        }else{
            return skip(unprocessed.substring(1),processed + unprocessed.charAt(0));
        }
        
    }

    static String skip2(String unprocessed){
        String processed = "" ; 
        if(unprocessed.isEmpty()){
            return processed;
        }
        if(unprocessed.charAt(0) == 'a'){
            return processed = processed + skip2(unprocessed.substring(1));
        }else{
            return processed = unprocessed.charAt(0) + skip2(unprocessed.substring(1));
        }
        
    }

    static String skipApple(String unprocessed){
        String processed = "";
        if(unprocessed.isEmpty()){
            return processed;
        }
        if(unprocessed.startsWith("apple")){
            return processed += skipApple(unprocessed.substring(5));
        }else{
            return processed += unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}
