public class EntradaInstanciaLista {
    public static void main(String[] args) {
        MiLista<Integer> enteros=new MiLista<>();
        MiLista<String> cadenas=new MiLista<>();

        enteros.agregarElementos(20);
        enteros.agregarElementos(30);
        enteros.agregarElementos(40);
        System.out.println(enteros.estaEnLista(10));
        System.out.println(enteros.estaEnLista(20));

        cadenas.agregarElementos("20");
        cadenas.agregarElementos("Juanjo");
        cadenas.agregarElementos("DAW");
        System.out.println(cadenas.estaEnLista("Juanjo"));
        System.out.println(cadenas.estaEnLista("Borja"));
        cadenas.imprimirLista();
        enteros.imprimirLista();

    }
}
