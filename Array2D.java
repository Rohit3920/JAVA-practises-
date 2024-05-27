public class Array2D {
        public static void main(String[] args) {
            System.out.println("Two dimentional Array in JAVA");

            int d1 = 3, d2 = 3;
            String name[][] = new String[d1][d2];

            name[0][0] = " Mr";
            name[0][1] = " Rohit";
            name[0][2] = " NIttawadekar";

            name[1][0] = " master";
            name[1][1] = " Gaurav";
            name[1][2] = " Jadhav";

            name[2][0] = " Don";
            name[2][1] = " Rohan";
            name[2][2] = " Jadhav";

            for (int i = 0; i <name.length; i++) {
                System.out.println("\n-------------------------------------");
                for (int j = 0; j < name[i].length; j++) {
                    System.out.print(name[i][j]);
                }
            }


        }
}
