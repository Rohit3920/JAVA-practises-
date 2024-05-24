public class Literal{
    public static void main(String[] args){
        System.out.println("Leteral in JAVA");

        int i1 = 256;   //Desimal - output : 256
        int i2 = 045;   //Octal - output :37
        int i3 = 0x10;   //Hexa decimal - output :16
        int i4 = 0b0101;   //Bianry - output :5

        char c1 = 'R';   //character - output : R
        char c2 = '\u0021';   //character code - output : !

        boolean bool = true;

        String str1 = "ABCD";
        String str2 = null;

        System.out.println("Decimal : "+ i1);
        System.out.println("Octal : "+ i2);
        System.out.println("Hexadecimal : "+ i3);
        System.out.println("Binary : "+ i4);

        System.out.println("Simple Character : "+ c1);
        System.out.println("Code character : "+ c2);

        System.out.println("Boolean value : "+ bool);

        System.out.println("String  : "+ str1);
        System.out.println("Null String : "+ str2);
    }
}