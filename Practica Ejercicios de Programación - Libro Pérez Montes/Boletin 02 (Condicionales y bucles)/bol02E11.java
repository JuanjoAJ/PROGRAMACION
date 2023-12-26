/*Diseñar un programa que muestre el producto de los 10 primeros números impares.*/
public class bol02E11 {
    public static void main(String[] args) {
        int impar=1;
        for (int i=0; i<20;i++){
            if(i%2!=0){
                impar*=i;
            }
        }
        System.out.println(impar);
        impar=1;
        for (int i=1; i<20;i+=2){
            impar*=i;
        }
        System.out.println(impar);
    }
}
