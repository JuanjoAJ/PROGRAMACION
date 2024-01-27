package model;
/*Desarrollar una clase llamada Motor que:

- Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
- Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para los litros.*/
public class Motor {
    private int litrosAceite, CV;
    //constructor
    public Motor(){

    }
    public Motor(int CV){
        this.CV=CV;
    }

    //Metodos

    public int incrementoAceite(){
        return this.litrosAceite+=10;
    }


    //Getter & Setter
    public int getCV() {
        return this.CV;
    }
    public int getAceite(){
        return litrosAceite;
    }
    public void setAceite(int litrosAceite){
        this.litrosAceite=litrosAceite;
    }



}
