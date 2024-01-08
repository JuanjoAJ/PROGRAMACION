import java.util.Scanner;

/*.Ídem con una tabla.*/
public class bol06e13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min;
        int[] t=new int[3];
        for (int i = 0; i < t.length; i++) {
            t[i]=(int)(Math.random()*100+1);
        }
        min= min(t);
        System.out.printf("El máximo común divisor entre %d, %d y %d es %d",t[0],t[1],t[2],mcd(t,min));

    }
    public static int min(int[] t){
        int min=200;
        for (int i = 0; i < t.length; i++) {
            if(min>t[i]) min=t[i];
        }
        return min;
    }
    public static int mcd(int[]array, int min){
        int mcd=1;
        for (int i = 2; i < min; i++) {
            if(array[0]%i==0 && array[1]%i==0 && array[2]%i==0) mcd=i;
        }
        return mcd;
    }

}
