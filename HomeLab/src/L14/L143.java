package L14;

public class L143 {
    public static void main (String [] agrs){
        int AND = 123;
        short OR = 210;
        float NOT = (float) 98.12;
        double XOR = (double) 321.12312;
        boolean a = AND < OR;
        boolean b = NOT > XOR;
        System.out.println("Result AND < OR= " +a);
        System.out.println("Result NOT > XOR= " +b);
    }
}
