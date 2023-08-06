package Tutorial_Basics;

public class TypeConversion {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // float num1 = input.nextFloat();
        // System.out.println(num1);

        // type casting
        int num = (int) (568.34f);
        System.out.println(num);

        // automatic type promotion in expressions
        // a byte can store max value of 256
        int a = 257;
        byte b = (byte) (a);
        // it gives an output 1 as it is not able to store anything above 256
        // 257 % 256 = 1
        System.out.println(b);

        // Getting ASCII values in Java
        int number = 'a';
        System.out.println(number);
        // returns 97
    }
}

/*
 * Java’s Automatic Conversions
 * When one type of data is assigned to another type of variable, an automatic
 * type conversion will take place if the
 * following two conditions are met:
 * • The two types are compatible.
 * • The destination type is larger than the source type.
 * i.e. If LHS has datatype which is greater than RHS datatype it will not give
 * an error
 * For example : float on LHS and int on RHS
 * 
 * Java also performs an automatic type conversion when storing a literal
 * integer constant into variables of type
 * byte, short, long, or char.
 * 
 * Casting Incompatible Types
 * Although the automatic type conversions are helpful, they will not fulfill
 * all needs. For example, what if you want to
 * assign an int value to a byte variable? This conversion will not be performed
 * automatically, because a byte is smaller
 * than an int. This kind of conversion is sometimes called a narrowing
 * conversion, since you are explicitly making the
 * value narrower so that it will fit into the target type.
 * 
 * 
 * When we do operations on a byte such as multiplication, division it already
 * assigns byte as an int
 * Therefore,
 * byte b = 50;
 * b = b*2;
 * This will give an error as it cannot store int type in byte
 */