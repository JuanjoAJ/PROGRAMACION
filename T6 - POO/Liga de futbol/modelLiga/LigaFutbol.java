package modelLiga;

import java.util.*;

public class LigaFutbol {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    private ArrayList<EquipoFutbol> equiposPrimera;
    private ArrayList<PartidoFutbol> partidosLiga;
    private ArrayList<Integer> bomboIda, bomboVuelta;

    //Constructor
    public LigaFutbol() {
        this.equiposPrimera = new ArrayList<>();
        this.partidosLiga = new ArrayList<>();
        bomboIda = new ArrayList<>();
        bomboVuelta = new ArrayList<>();

    }

    public LigaFutbol(ArrayList<EquipoFutbol> equiposPrimera, ArrayList<PartidoFutbol> partidosLiga) {
        this.equiposPrimera = equiposPrimera;
        this.partidosLiga = partidosLiga;
    }

    // Llenar la liga de equipos y jugadores
    public void introducirEquiposManual() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce el nombre del equipo " + (i + 1));
            equiposPrimera.add(new EquipoFutbol(s.next()));
        }
    }

    public void introducirEquiposAuto() {
        equiposPrimera.add(new EquipoFutbol("Real Madrid"));
        equiposPrimera.add(new EquipoFutbol("Girona"));
        equiposPrimera.add(new EquipoFutbol("FC Barcelona"));
        equiposPrimera.add(new EquipoFutbol("Atlético de Madrid"));
        equiposPrimera.add(new EquipoFutbol("Athletic Club de Bilbao"));
        equiposPrimera.add(new EquipoFutbol("Real Sociedad"));
        equiposPrimera.add(new EquipoFutbol("Valencia"));
        equiposPrimera.add(new EquipoFutbol("Real Betis"));
        equiposPrimera.add(new EquipoFutbol("UD Las Palmas"));
        equiposPrimera.add(new EquipoFutbol("Getafe"));
        equiposPrimera.add(new EquipoFutbol("Deportivo Alavés"));
        equiposPrimera.add(new EquipoFutbol("Osasuna"));
        equiposPrimera.add(new EquipoFutbol("Rayo Vallecano"));
        equiposPrimera.add(new EquipoFutbol("Villarreal"));
        equiposPrimera.add(new EquipoFutbol("Sevilla"));
        equiposPrimera.add(new EquipoFutbol("Celta de Vigo"));
        equiposPrimera.add(new EquipoFutbol("Mallorca"));
        equiposPrimera.add(new EquipoFutbol("Cádiz"));
        equiposPrimera.add(new EquipoFutbol("Granada"));
        equiposPrimera.add(new EquipoFutbol("Almería"));

        System.out.println("¿Quieres importar la plantilla de jugadores automáticamente?");
        if (s.next().equalsIgnoreCase("SI")) plantillaAuto();
    }

    public void introducirPlantillaManual() {
        System.out.println("Introduce el nombre del Equipo");
        for (int i = 0; i < equiposPrimera.size(); i++) {
            if (equiposPrimera.get(0) != null && equiposPrimera.get(i).getNombre().equalsIgnoreCase(s.next()))
                equiposPrimera.get(i).agregarJugadores();
        }
    }

    public void plantillaAuto() {
        JugadorFutbol[] jugadoresRM = {
                new JugadorFutbol("Thibaut Courtois", "portero", 1, 90),
                new JugadorFutbol("Dani Carvajal", "defensa", 2, 82),
                new JugadorFutbol("Antonio Rüdiger", "defensa", 3, 85),
                new JugadorFutbol("Éder Militão", "defensa", 4, 86),
                new JugadorFutbol("David Alaba", "defensa", 5, 85),
                new JugadorFutbol("Federico Valverde", "centrocampista", 15, 88),
                new JugadorFutbol("Toni Kroos", "centrocampista", 8, 86),
                new JugadorFutbol("Luka Modrić", "centrocampista", 10, 87),
                new JugadorFutbol("Jude Bellingham", "centrocampista", 22, 88),
                new JugadorFutbol("Rodrygo", "delantero", 25, 85),
                new JugadorFutbol("Vinicius Jr.", "delantero", 20, 89)
        };
        equiposPrimera.get(0).setOnceInicial(jugadoresRM);
        JugadorFutbol[] jugadoresGirona = {
                new JugadorFutbol("Gazzaniga", "portero", 1, 70),
                new JugadorFutbol("Couto", "defensa", 2, 50),
                new JugadorFutbol("Arnau", "defensa", 3, 75),
                new JugadorFutbol("Blind", "defensa", 4, 80),
                new JugadorFutbol("Miguel", "defensa", 5, 75),
                new JugadorFutbol("Aleix García", "centrocampista", 15, 68),
                new JugadorFutbol("Yangel Herrera", "centrocampista", 8, 76),
                new JugadorFutbol("Dovbyk", "delantero", 10, 67),
                new JugadorFutbol("Stuani", "delantero", 22, 78),
                new JugadorFutbol("Portu", "delantero", 25, 65),
                new JugadorFutbol("Savinho", "delantero", 20, 79)
        };
        equiposPrimera.get(1).setOnceInicial(jugadoresGirona);
        JugadorFutbol[] jugadoresBarcelona = {
                new JugadorFutbol("Ter Stegen", "portero", 1, 90),
                new JugadorFutbol("Araujo", "defensa", 4, 85),
                new JugadorFutbol("Koundé", "defensa", 5, 85),
                new JugadorFutbol("Iñigo Martínez", "defensa", 15, 87),
                new JugadorFutbol("Cancelo", "defensa", 17, 88),
                new JugadorFutbol("Gündogan", "centrocampista", 8, 86),
                new JugadorFutbol("Fermín López", "centrocampista", 10, 87),
                new JugadorFutbol("Pedri", "centrocampista", 22, 88),
                new JugadorFutbol("Lamine Yamal", "delantero", 25, 85),
                new JugadorFutbol("Lewandowski", "delantero", 20, 89),
                new JugadorFutbol("Joao Félix", "delantero", 11, 86)
        };
        equiposPrimera.get(2).setOnceInicial(jugadoresBarcelona);
        JugadorFutbol[] jugadoresAM = {
                new JugadorFutbol("Oblak", "portero", 1, 95),
                new JugadorFutbol("Molina", "defensa", 2, 80),
                new JugadorFutbol("Savic", "defensa", 3, 85),
                new JugadorFutbol("Giménez", "defensa", 4, 85),
                new JugadorFutbol("Reinildo", "defensa", 5, 73),
                new JugadorFutbol("Correa", "delantero", 6, 68),
                new JugadorFutbol("Kondogbia", "centrocampista", 7, 80),
                new JugadorFutbol("Witsel", "centrocampista", 8, 81),
                new JugadorFutbol("Saúl", "centrocampista", 9, 76),
                new JugadorFutbol("Morata", "delantero", 10, 84),
                new JugadorFutbol("Griezmann", "delantero", 11, 73)
        };
        equiposPrimera.get(3).setOnceInicial(jugadoresAM);

        JugadorFutbol[] jugadoresBilbao = {
                new JugadorFutbol("Unai Simón", "portero", 1, 95),
                new JugadorFutbol("De Marcos", "defensa", 2, 80),
                new JugadorFutbol("Vivian", "defensa", 3, 60),
                new JugadorFutbol("Paredes", "defensa", 4, 90),
                new JugadorFutbol("Yuri", "defensa", 5, 90),
                new JugadorFutbol("Vesga", "centrocampista", 6, 70),
                new JugadorFutbol("R. de Galarreta", "centrocampista", 7, 80),
                new JugadorFutbol("Berenguer", "delantero", 8, 40),
                new JugadorFutbol("Sancet", "centrocampista", 9, 80),
                new JugadorFutbol("N. Williams", "delantero", 10, 50),
                new JugadorFutbol("Guruzeta", "delantero", 11, 80)
        };
        equiposPrimera.get(4).setOnceInicial(jugadoresBilbao);

        JugadorFutbol[] jugadoresRSociedad = {new JugadorFutbol("Remiro", "portero", 1, 90),
                new JugadorFutbol("Gorosabel", "defensa", 2, 80),
                new JugadorFutbol("Pacheco", "defensa", 3, 70),
                new JugadorFutbol("Le Normand", "defensa", 4, 85),
                new JugadorFutbol("Aritz", "defensa", 5, 80),
                new JugadorFutbol("Guevara", "centrocampista", 6, 75),
                new JugadorFutbol("Merino", "centrocampista", 7, 85),
                new JugadorFutbol("Silva", "centrocampista", 8, 90),
                new JugadorFutbol("Portu", "delantero", 9, 80),
                new JugadorFutbol("Oyarzabal", "delantero", 10, 85),
                new JugadorFutbol("Sorloth", "delantero", 11, 75)
        };
        equiposPrimera.get(5).setOnceInicial(jugadoresRSociedad);
        JugadorFutbol[] jugadoresValencia = {new JugadorFutbol("Mamardashvili", "portero", 1, 77),
                new JugadorFutbol("Thierry", "defensa", 2, 76),
                new JugadorFutbol("Cömert", "defensa", 3, 71),
                new JugadorFutbol("Diakhaby", "defensa", 4, 73),
                new JugadorFutbol("Gayà", "defensa", 5, 82),
                new JugadorFutbol("Hugo Guillamón", "centrocampista", 6, 74),
                new JugadorFutbol("André Almeida", "centrocampista", 7, 73),
                new JugadorFutbol("Yunus Musah", "centrocampista", 8, 73),
                new JugadorFutbol("Samuel Lino", "delantero", 9, 75),
                new JugadorFutbol("Kluivert", "delantero", 10, 76),
                new JugadorFutbol("Hugo Duro", "delantero", 11, 77)
        };
        equiposPrimera.get(6).setOnceInicial(jugadoresValencia);
        JugadorFutbol[] jugadoresBetis = {
                new JugadorFutbol("Claudio Bravo", "portero", 1, 83),
                new JugadorFutbol("Abner", "defensa", 2, 72),
                new JugadorFutbol("Chadi Riad", "defensa", 3, 70),
                new JugadorFutbol("Germán Pezzella", "defensa", 4, 78),
                new JugadorFutbol("Héctor Bellerín", "defensa", 5, 80),
                new JugadorFutbol("Marc Roca", "centrocampista", 6, 77),
                new JugadorFutbol("Guido Rodríguez", "centrocampista", 7, 82),
                new JugadorFutbol("Rodri", "centrocampista", 8, 73),
                new JugadorFutbol("Isco", "delantero", 9, 81),
                new JugadorFutbol("Assane Diao", "delantero", 10, 72),
                new JugadorFutbol("Ayoze Pérez", "delantero", 11, 78)
        };
        equiposPrimera.get(7).setOnceInicial(jugadoresBetis);
        JugadorFutbol[] jugadoresPalmas = {
                new JugadorFutbol("Álvaro Valles", "portero", 1, 75),
                new JugadorFutbol("Álex Suárez", "defensa", 2, 70),
                new JugadorFutbol("Saúl Coco", "defensa", 3, 70),
                new JugadorFutbol("Mika Mármol", "defensa", 4, 70),
                new JugadorFutbol("Sergi Cardona", "defensa", 5, 70),
                new JugadorFutbol("Maxi Perrone", "centrocampista", 6, 70),
                new JugadorFutbol("Javi Muñoz", "centrocampista", 7, 70),
                new JugadorFutbol("Kirian Rodríguez", "centrocampista", 8, 70),
                new JugadorFutbol("Marvin Park", "delantero", 9, 70),
                new JugadorFutbol("Munir El Haddadi", "delantero", 10, 75),
                new JugadorFutbol("Marc Cardona", "delantero", 11, 70)
        };
        equiposPrimera.get(8).setOnceInicial(jugadoresPalmas);
        JugadorFutbol[] jugadoresGetafe = {
                new JugadorFutbol("Soria", "portero", 1, 78),
                new JugadorFutbol("Damián", "defensa", 2, 72),
                new JugadorFutbol("Djené", "defensa", 3, 78),
                new JugadorFutbol("Mitrovic", "defensa", 4, 72),
                new JugadorFutbol("Cuenca", "defensa", 5, 72),
                new JugadorFutbol("Olivera", "centrocampista", 6, 72),
                new JugadorFutbol("Maksimovic", "centrocampista", 7, 75),
                new JugadorFutbol("Arambarri", "centrocampista", 8, 77),
                new JugadorFutbol("Aleñá", "delantero", 9, 77),
                new JugadorFutbol("Sandro", "delantero", 10, 73),
                new JugadorFutbol("Enes Unal", "delantero", 11, 76)
        };
        equiposPrimera.get(9).setOnceInicial(jugadoresGetafe);
        JugadorFutbol[] jugadoresAlaves = {
                new JugadorFutbol("Sivera", "portero", 1, 75),
                new JugadorFutbol("Gorosabel", "defensa", 2, 72),
                new JugadorFutbol("Rafa Marín", "defensa", 3, 70),
                new JugadorFutbol("Sedlar", "defensa", 4, 70),
                new JugadorFutbol("Duarte", "defensa", 5, 75),
                new JugadorFutbol("Blanco", "centrocampista", 6, 74),
                new JugadorFutbol("Guevara", "centrocampista", 7, 75),
                new JugadorFutbol("Rioja", "delantero", 8, 76),
                new JugadorFutbol("Sola", "delantero", 9, 71),
                new JugadorFutbol("Guridi", "delantero", 10, 74),
                new JugadorFutbol("Samu Omorodion", "delantero", 11, 72)
        };
        equiposPrimera.get(10).setOnceInicial(jugadoresAlaves);
        JugadorFutbol[] jugadoresOsasuna = {
                new JugadorFutbol("Sergio Herrera", "Portero", 1, 70),
                new JugadorFutbol("Rubén Peña", "Defensa", 2, 75),
                new JugadorFutbol("David García", "Defensa", 3, 72),
                new JugadorFutbol("Catena", "Defensa", 4, 70),
                new JugadorFutbol("Juan Cruz", "Defensa", 5, 73),
                new JugadorFutbol("Mojica", "Defensa", 6, 72),
                new JugadorFutbol("Iker Muñoz", "Centrocampista", 7, 68),
                new JugadorFutbol("Moi Gómez", "Centrocampista", 8, 76),
                new JugadorFutbol("Pablo Ibañez", "Centrocampista", 9, 67),
                new JugadorFutbol("Budimir", "Delantero", 10, 76),
                new JugadorFutbol("Raúl García", "Delantero", 11, 77),
        };
        equiposPrimera.get(11).setOnceInicial(jugadoresOsasuna);
        JugadorFutbol[] jugadoresVallecano = {
                new JugadorFutbol("Dimitrievski", "Portero", 1, 78),
                new JugadorFutbol("Balliu", "Defensa", 2, 75),
                new JugadorFutbol("Mumin", "Defensa", 3, 70),
                new JugadorFutbol("Lejeune", "Defensa", 4, 85),
                new JugadorFutbol("Espino", "Defensa", 5, 75),
                new JugadorFutbol("Óscar Valentín", "Centrocampista", 6, 74),
                new JugadorFutbol("Unai López", "Centrocampista", 7, 77),
                new JugadorFutbol("Trejo", "Centrocampista", 8, 79),
                new JugadorFutbol("Isi Palazón", "Delantero", 9, 90),
                new JugadorFutbol("Sergio Camello", "Delantero", 10, 72),
                new JugadorFutbol("Álvaro García", "Delantero", 11, 76)
        };
        equiposPrimera.get(12).setOnceInicial(jugadoresVallecano);
        JugadorFutbol[] jugadoresVillareal = {
                new JugadorFutbol("Jörgensen", "Portero", 1, 73),
                new JugadorFutbol("Foyth", "Defensa", 2, 80),
                new JugadorFutbol("Albiol", "Defensa", 3, 80),
                new JugadorFutbol("Cuenca", "Defensa", 4, 74),
                new JugadorFutbol("Pedraza", "Defensa", 5, 78),
                new JugadorFutbol("Santi Comesaña", "Centrocampista", 6, 77),
                new JugadorFutbol("Parejo", "Centrocampista", 7, 84),
                new JugadorFutbol("Álex Baena", "Centrocampista", 8, 76),
                new JugadorFutbol("Gerard Moreno", "Delantero", 9, 83),
                new JugadorFutbol("A. Sørloth", "Delantero", 10, 79),
                new JugadorFutbol("Morales", "Delantero", 11, 78)

        };
        equiposPrimera.get(13).setOnceInicial(jugadoresVillareal);
        JugadorFutbol[] jugadoresSevilla = {
                new JugadorFutbol("Bono", "Portero", 1, 80),
                new JugadorFutbol("Navas", "Defensa", 2, 80),
                new JugadorFutbol("Diego Carlos", "Defensa", 3, 83),
                new JugadorFutbol("Koundé", "Defensa", 4, 86),
                new JugadorFutbol("Acuña", "Defensa", 5, 82),
                new JugadorFutbol("Fernando", "Centrocampista", 6, 79),
                new JugadorFutbol("Rakitic", "Centrocampista", 7, 82),
                new JugadorFutbol("Óliver Torres", "Centrocampista", 8, 79),
                new JugadorFutbol("Ocampos", "Delantero", 9, 82),
                new JugadorFutbol("En-Nesyri", "Delantero", 10, 78),
                new JugadorFutbol("Suso", "Delantero", 11, 81)
        };
        equiposPrimera.get(14).setOnceInicial(jugadoresSevilla);
        JugadorFutbol[] jugadoresVigo = {
                new JugadorFutbol("Guaita", "Portero", 1, 78),
                new JugadorFutbol("Manquillo", "Defensa", 2, 75),
                new JugadorFutbol("Unai Núñez", "Defensa", 3, 79),
                new JugadorFutbol("Renato Tapia", "Defensa", 4, 78),
                new JugadorFutbol("Carlos Domínguez", "Defensa", 5, 70),
                new JugadorFutbol("Jailson", "Centrocampista", 6, 70),
                new JugadorFutbol("Fran Beltrán", "Centrocampista", 8, 80),
                new JugadorFutbol("Óscar Mingueza", "Centrocampista", 5, 76),
                new JugadorFutbol("Luca de la Torre", "Delantero", 23, 71),
                new JugadorFutbol("Strand Larsen", "Delantero", 18, 73),
                new JugadorFutbol("Iago Aspas", "Delantero", 10, 85)
        };
        equiposPrimera.get(15).setOnceInicial(jugadoresVigo);
        JugadorFutbol[] jugadoresMallorca = {
                new JugadorFutbol("Predrag Rajkovic", "Portero", 1, 78),
                new JugadorFutbol("Giovanni González", "Defensa", 20, 72),
                new JugadorFutbol("Martin Valjent", "Defensa", 24, 76),
                new JugadorFutbol("Antonio Raíllo", "Defensa", 21, 74),
                new JugadorFutbol("Matija Nastasic", "Defensa", 2, 74),
                new JugadorFutbol("Toni Lato", "Defensa", 3, 77),
                new JugadorFutbol("Samú Costa", "Centrocampista", 12, 74),
                new JugadorFutbol("Manu Morlanes", "Centrocampista", 8, 73),
                new JugadorFutbol("Sergi Darder", "Centrocampista", 10, 75),
                new JugadorFutbol("Dani Rodríguez", "Centrocampista", 14, 77),
                new JugadorFutbol("Vedat Muriqi", "Delantero", 7, 79)
        };
        equiposPrimera.get(16).setOnceInicial(jugadoresMallorca);
        JugadorFutbol[] jugadoresCadiz = {
                new JugadorFutbol("Conan Ledesma", "Portero", 1, 80),
                new JugadorFutbol("Iza Carcelén", "Defensa", 20, 73),
                new JugadorFutbol("Fali", "Defensa", 3, 76),
                new JugadorFutbol("Víctor Chust", "Defensa", 5, 75),
                new JugadorFutbol("Lucas Pires", "Defensa", 33, 70),
                new JugadorFutbol("Gonzalo Escalante", "Centrocampista", 17, 76),
                new JugadorFutbol("Rubén Alcaraz", "Centrocampista", 4, 76),
                new JugadorFutbol("Robert Navarro", "Centrocampista", 27, 72),
                new JugadorFutbol("Iván Alejo", "Centrocampista", 11, 74),
                new JugadorFutbol("Rubén Sobrino", "Delantero", 7, 73),
                new JugadorFutbol("Chris Ramos", "Delantero", 16, 70)
        };
        equiposPrimera.get(17).setOnceInicial(jugadoresCadiz);
        JugadorFutbol[] jugadoresGranada = {
                new JugadorFutbol("Raúl Fernández", "Portero", 1, 69),
                new JugadorFutbol("Ricard Sánchez", "Defensa", 28, 67),
                new JugadorFutbol("Miguel Rubio", "Defensa", 4, 68),
                new JugadorFutbol("Ignasi Miquel", "Defensa", 14, 69),
                new JugadorFutbol("Quini", "Defensa", 17, 72),
                new JugadorFutbol("Y. Bodiger", "Centrocampista", 6, 71),
                new JugadorFutbol("Óscar Melendo", "Centrocampista", 21, 76),
                new JugadorFutbol("Sergio Ruiz", "Centrocampista", 20, 70),
                new JugadorFutbol("Myrto Uzuni", "Delantero", 11, 75),
                new JugadorFutbol("José Callejón", "Delantero", 9, 75),
                new JugadorFutbol("M. Arezo", "Delantero", 8, 68)
        };
        equiposPrimera.get(18).setOnceInicial(jugadoresGranada);
        JugadorFutbol[] jugadoresAlmeria = {
                new JugadorFutbol("Fernando Martínez", "Portero", 13, 76),
                new JugadorFutbol("Marc Pubill", "Defensa", 18, 70),
                new JugadorFutbol("Aleksandar Radovanovic", "Defensa", 16, 70),
                new JugadorFutbol("Chumi", "Defensa", 21, 70),
                new JugadorFutbol("Álex Centelles", "Defensa", 20, 73),
                new JugadorFutbol("Iddrisu Baba", "Centrocampista", 4, 72),
                new JugadorFutbol("Lucas Robertone", "Centrocampista", 5, 76),
                new JugadorFutbol("Sergio Arribas", "Centrocampista", 19, 73),
                new JugadorFutbol("Largie Ramazani", "Delantero", 7, 73),
                new JugadorFutbol("Léo Baptistão", "Delantero", 12, 76),
                new JugadorFutbol("Luis Suárez", "Delantero", 9, 76)
        };
        equiposPrimera.get(19).setOnceInicial(jugadoresAlmeria);
        asignarCalidad();
    }

    public void asignarCalidad() {
        for (int i = 0; i < equiposPrimera.size(); i++) {
            for (int j = 0; j < equiposPrimera.get(0).getOnceInicial().length; j++) {
                equiposPrimera.get(i).asignarNivelEquipo(equiposPrimera.get(i).getOnceInicial()[j]);
            }
        }
    }


    //sorteo Equipos

    //Mitad y mitad -> Orden alfabético -> Módulo local /Visitante ORDENAMOS ALFABÉTICAMENTE, después jugamos la mitad de los equipos contra la mitad en modo "local" y la otra mitad contra la mitad
    //en modo visitante. HAY que darle una vuelta ya que todos los equipos deberian jugar contra todos (¿se podría ir cambiando la posición del arraylist?¿juega 1 contra todos, pasa a ultima posición y asi?)

    //SORTEO OTRA FORMA

    public void asignarPartidos(){
        Collections.shuffle(equiposPrimera);
        for (int i = 0; i < equiposPrimera.size(); i++) {
            for (int j = 0; j < equiposPrimera.size(); j++) {
                if (i != j) {
                    if (i%2== 0) {
                        if (j % 2 == 0) partidosLiga.add(new PartidoFutbol(equiposPrimera.get(i),equiposPrimera.get(j)));
                        else partidosLiga.add(new PartidoFutbol(equiposPrimera.get(j),equiposPrimera.get(i)));
                    }else {
                        if (j % 2 == 0) partidosLiga.add(new PartidoFutbol(equiposPrimera.get(j),equiposPrimera.get(i)));
                        else partidosLiga.add(new PartidoFutbol(equiposPrimera.get(j),equiposPrimera.get(i)));
                    }
                }
            }
            System.out.println();
        }
    }



    // Listar equipos // Listar Partidos
    public void listarEquipos() {
        System.out.println("Los equipos de la liga son: ");
        for (EquipoFutbol imp : equiposPrimera) {
            System.out.println(imp.getNombre());
        }
    }

    public void listarJugadores() {
        System.out.println("Indica el equipo que quiere buscar");
        String busqueda = s.nextLine(); //bufferREADER TODO
        for (int i = 0; i < equiposPrimera.size(); i++) {
            if (equiposPrimera.get(i).getNombre().equalsIgnoreCase(busqueda)) {
                equiposPrimera.get(i).listarOnceInicial();
            }
        }
    }

    public void listarPartidos() {
        for (PartidoFutbol imp : partidosLiga) {
            imp.mostrarPartido();
        }
    }

    //Dar comienzo la Liga

    public void jugarLiga() {
        System.out.println("DA COMIENZO LA LIGA DE FUTBOL\n\n\n");
        for (int i = 0; i < partidosLiga.size(); i++) {
            partidosLiga.get(i).mostrarPartido();
            partidosLiga.get(i).iniciarPartido();
        }

    }


    public void verClasificacion() {
        equiposPrimera.sort(new Comparator<EquipoFutbol>() {
            @Override
            public int compare(EquipoFutbol o1, EquipoFutbol o2) {
                if (o1.getPuntos() < o2.getPuntos()) return 1;
                else if (o1.getPuntos() > o2.getPuntos()) return -1;
                else return 0;
            }
        });
        for (int i = 0; i < equiposPrimera.size(); i++) {
            System.out.println((i + 1) + "º Clasificado: " + equiposPrimera.get(i).getNombre() + " con " + equiposPrimera.get(i).getPuntos() + " puntos.");
        }


    }


//Getter & Setter


    public ArrayList<EquipoFutbol> getEquiposPrimera() {
        return equiposPrimera;
    }

    public void setEquiposPrimera(ArrayList<EquipoFutbol> equiposPrimera) {
        this.equiposPrimera = equiposPrimera;
    }

    public ArrayList<PartidoFutbol> getPartidosLiga() {
        return partidosLiga;
    }

    public void setPartidosLiga(ArrayList<PartidoFutbol> partidosLiga) {
        this.partidosLiga = partidosLiga;
    }

    public ArrayList<Integer> getBomboIda() {
        return bomboIda;
    }

    public void setBomboIda(ArrayList<Integer> bomboIda) {
        this.bomboIda = bomboIda;
    }

    public ArrayList<Integer> getBomboVuelta() {
        return bomboVuelta;
    }

    public void setBomboVuelta(ArrayList<Integer> bomboVuelta) {
        this.bomboVuelta = bomboVuelta;
    }
}
