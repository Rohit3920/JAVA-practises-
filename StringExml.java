public class StringExml {
    public static void main(String[] args) {
        String str = "This is string in java";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 15));
        System.out.println(str.replace("java", "JAVA"));
        System.out.println(str.isEmpty());

        //Char Array in java and its convert char array to string 
        char[] charArray = {'R', 'O', 'H', 'I', 'T'};
        String str2 = new String(charArray);
        System.out.println(str2);

    }
}
