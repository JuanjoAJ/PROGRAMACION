package modelPartidoAnidada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartidoAnidada {
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugador;
    private int golesLocal, golesVisitante;

    public PartidoAnidada() {
    }

    public PartidoAnidada(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Equipo crearEquipoLocal(String nombre){
        if (equipoLocal==null){
            return equipoLocal=new Equipo(nombre);
        }else{
            System.out.println("El equipo ya existe");
            return equipoLocal;
        }
    }

    public Equipo crearEquipoVisitante(String nombre){
        if (equipoVisitante==null){
            return equipoVisitante=new Equipo(nombre);
        }else{
            System.out.println("El equipo ya existe");
            return equipoVisitante;
        }
    }

    public void resultado(){
        if (golesLocal>golesVisitante) equipoLocal.setPuntos(equipoLocal.getPuntos()+3);
        else if(golesLocal<golesVisitante) equipoVisitante.setPuntos(equipoVisitante.getPuntos()+3);
        else {
            equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
            equipoVisitante.setPuntos(equipoVisitante.getPuntos()+1);
        }
    }

    public void clasificacion(){
        if (equipoLocal.getPuntos()>equipoVisitante.getPuntos()) System.out.println("1º " + equipoLocal + ", 2º " + equipoVisitante);
        else System.out.println("1º " + equipoVisitante + ", 2º " + equipoLocal);

    }
    public void reset(){
        golesLocal=0;
        golesVisitante=0;
    }
    public int marcarGoles(String equipo){
        if (equipo.equalsIgnoreCase("Local")) return golesLocal+=(int) (Math.random()*3);
        else return golesVisitante+=(int) (Math.random()*3);

    }
    public void mostrarResultado(){
        System.out.println("El resultado actual del partido es de " + equipoLocal.getNombre() + ": " + golesLocal +
                " - "+equipoVisitante.getNombre()+ " : " + golesVisitante);
    }

   class Equipo{
        int puntos;
        String nombre;

        public Equipo() {
        }

        public Equipo(String nombre) {
            this.nombre = nombre;
        }

       @Override
       public String toString() {
           return nombre + " " + puntos + " puntos";
       }

       public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
