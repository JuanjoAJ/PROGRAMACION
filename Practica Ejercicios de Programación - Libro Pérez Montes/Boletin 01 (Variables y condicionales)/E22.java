//Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduzca un número entre 0 a 99");
        int num= s.nextInt();
        String numFinal="";
        int d=num/10;
        int u=num%10;

        switch (d){
            case 2:
                if (u==0){
                    numFinal="Veinte";
                }
                else numFinal="Veinti";
                break;
            case 3:
                if (u==0) numFinal="Treinta";
                else numFinal="Treinta y ";
                break;
            case 4:
                if (u==0) numFinal="Cuarenta";
                else numFinal="Cuarenta y ";
                break;
            case 5:
                numFinal="Cincuenta";
                if(u>0) numFinal=numFinal+" y ";
                break;
            case 6:
                numFinal="Sesenta";
                if(u>0) numFinal=numFinal+" y ";
                break;
            case 7:
                numFinal="Setenta";
                if(u>0) numFinal=numFinal+" y ";
                break;
            case 8:
                numFinal="Ochenta";
                if(u>0) numFinal=numFinal+" y ";
                break;
            case 9:
                numFinal="Noventa";
                if(u>0) numFinal=numFinal+" y ";
                break;
            case 0:
            case 1:
                break;
            default:
                System.out.println("Número fuera de parámetros");
                break;
        }
        if(u==0) System.out.println(numFinal);

        switch (u) {
            case 1:
                if (d==1) System.out.println("Once");
                else {
                    numFinal+="uno";
                    System.out.println(numFinal);
                }
                break;
            case 2:
                if (d==1) System.out.println("Doce");
                else{
                    numFinal+="dos";
                    System.out.println(numFinal);
                }
                break;
            case 3:
                if (d==1) System.out.println("Trece");
                else {
                    numFinal+="tres";
                    System.out.println(numFinal);
                }
                break;
            case 4:
                if (d==1) System.out.println("Catorce");
                else{
                    numFinal+="cuatro";
                    System.out.println(numFinal);
                }
                break;
            case 5:
                if (d==1) System.out.println("Quince");
                else{
                    numFinal+="cinco";
                    System.out.println(numFinal);
                }
                break;
            case 6:
                if (d==1) System.out.println("Dieciseis");
                else{
                    numFinal+="seis";
                    System.out.println(numFinal);
                }
                break;
            case 7:
                if (d==1) System.out.println("Diecisiete");
                else{
                    numFinal+="siete";
                    System.out.println(numFinal);
                }
                break;
            case 8:
                if (d==1) System.out.println("Dieciocho");
                else{
                    numFinal+="ocho";
                    System.out.println(numFinal);
                }
                break;
            case 9:
                if (d==1) System.out.println("Diecinueve");
                else{
                    numFinal+="nueve";
                    System.out.println(numFinal);
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Lo siento el número introducido no es correcto");
                break;


        }


    }
}
