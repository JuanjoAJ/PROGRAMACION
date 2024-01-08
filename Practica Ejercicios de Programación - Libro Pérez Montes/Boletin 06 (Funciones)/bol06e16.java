/*Ídem con una tabla.*/
public class bol06e16 {
    public static void main(String[] args) {
        int[]array=new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*100)+1;
        }

        System.out.printf("El minimo común múltiplo de %d, %d y %d es %d", array[0], array[1], array[2], mcm(max(array),array ));

    }
    public static int max(int[] array){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max ) max=array[i];
        }
        return max;
    }
    public static int mcm(int max, int[] array){
        int mcm = 0, i=1;
        while (mcm%array[0]!=0 || mcm%array[1]!=0 || mcm%array[2]!=0){
            i++;
            mcm=max*i;
        }
        return mcm;
    }
}
