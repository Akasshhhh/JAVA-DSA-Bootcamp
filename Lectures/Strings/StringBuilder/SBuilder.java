package Lectures.Strings.StringBuilder;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            builder.append((char) ('a' + i));
        }

        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
