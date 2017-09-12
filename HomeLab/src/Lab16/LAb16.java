package Lab16;//Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.

public class LAb16 {
    public static void main (String[] args){
        int [] mas = new int[15];
        for (int i = 2; i < 15; i++){//for (int i = 2; i <= 30; i = i + 2)
            mas[i] = 2 + i*2; //mas[i/2-1] = i;
        }
        for (int i = 2; i <= 15; i++){
            System.out.println(mas[i]);
        }
    }
}
