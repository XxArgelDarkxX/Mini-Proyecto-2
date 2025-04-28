import java.util.ArrayList;

public class Data {

    private static final ArrayList<Ataque> fireMoves = new ArrayList<>();
    private static final ArrayList<Ataque> waterMoves = new ArrayList<>();
    private static final ArrayList<Ataque> grassMoves = new ArrayList<>();
    private static final ArrayList<Ataque> groundMoves = new ArrayList<>();

    private static final ArrayList<Pokemon> pokemons = new ArrayList<>();

    public static void initializeMoves() {
        fireMoves.clear();
        fireMoves.add(new Ataque("Lanzallamas", "ESPECIAL", (byte) 90));
        fireMoves.add(new Ataque("Llamarada", "ESPECIAL", (byte) 110));
        fireMoves.add(new Ataque("Puño Fuego", "FISICO", (byte) 75));
        fireMoves.add(new Ataque("Giro Fuego", "ESPECIAL", (byte) 35));
        fireMoves.add(new Ataque("Rueda Fuego", "FISICO", (byte) 60));

        waterMoves.clear();
        waterMoves.add(new Ataque("Surf", "ESPECIAL", (byte) 90));
        waterMoves.add(new Ataque("Hidrobomba", "ESPECIAL", (byte) 110));
        waterMoves.add(new Ataque("Acua Jet", "FISICO", (byte) 40));
        waterMoves.add(new Ataque("Chorro de Agua", "ESPECIAL", (byte) 40));
        waterMoves.add(new Ataque("Pistola Agua", "ESPECIAL", (byte) 50));

        grassMoves.clear();
        grassMoves.add(new Ataque("Rayo Solar", "ESPECIAL", (byte) 120));
        grassMoves.add(new Ataque("Hoja Afilada", "FISICO", (byte) 55));
        grassMoves.add(new Ataque("Hoja Mágica", "ESPECIAL", (byte) 60));
        grassMoves.add(new Ataque("Bomba Germen", "ESPECIAL", (byte) 80));
        grassMoves.add(new Ataque("Látigo Cepa", "FISICO", (byte) 45));

        groundMoves.clear();
        groundMoves.add(new Ataque("Terremoto", "FISICO", (byte) 100));
        groundMoves.add(new Ataque("Excavar", "FISICO", (byte) 80));
        groundMoves.add(new Ataque("Bofetón Lodo", "ESPECIAL", (byte) 20));
        groundMoves.add(new Ataque("Tierra Viva", "ESPECIAL", (byte) 90));
        groundMoves.add(new Ataque("Disparo Lodo", "ESPECIAL", (byte) 55));
    }

    public static void initializePokemons() {
        ArrayList<Ataque> charmanderMoves = new ArrayList<>(fireMoves.subList(0, 4));
        ArrayList<Ataque> magmarMoves = new ArrayList<>(fireMoves.subList(1, 5));
        ArrayList<Ataque> blazikenMoves = new ArrayList<>(fireMoves.subList(0, 4));
        ArrayList<Ataque> flareonMoves = new ArrayList<>(fireMoves.subList(1, 5));

        pokemons.add(new Pokemon("Charmander", "Fuego", 39, 52, 43, 60, 50, 65, charmanderMoves));
        pokemons.add(new Pokemon("Magmar", "Fuego", 65, 95, 57, 100, 85, 93, magmarMoves));
        pokemons.add(new Pokemon("Blaziken", "Fuego", 80, 120, 70, 110, 70, 80, blazikenMoves));
        pokemons.add(new Pokemon("Flareon", "Fuego", 65, 130, 60, 95, 110, 65, flareonMoves));

        ArrayList<Ataque> squirtleMoves = new ArrayList<>(waterMoves.subList(0, 4));
        ArrayList<Ataque> vaporeonMoves = new ArrayList<>(waterMoves.subList(1, 5));
        ArrayList<Ataque> kinglerMoves = new ArrayList<>(waterMoves.subList(0, 4));
        ArrayList<Ataque> miloticMoves = new ArrayList<>(waterMoves.subList(1, 5));

        pokemons.add(new Pokemon("Squirtle", "Agua", 44, 48, 65, 50, 64, 43, squirtleMoves));
        pokemons.add(new Pokemon("Vaporeon", "Agua", 130, 65, 60, 110, 95, 65, vaporeonMoves));
        pokemons.add(new Pokemon("Kingler", "Agua", 55, 130, 115, 50, 50, 75, kinglerMoves));
        pokemons.add(new Pokemon("Milotic", "Agua", 95, 60, 79, 100, 125, 81, miloticMoves));

        ArrayList<Ataque> bulbasaurMoves = new ArrayList<>(grassMoves.subList(0, 4));
        ArrayList<Ataque> leafeonMoves = new ArrayList<>(grassMoves.subList(1, 5));
        ArrayList<Ataque> roseradeMoves = new ArrayList<>(grassMoves.subList(0, 4));
        ArrayList<Ataque> torterraMoves = new ArrayList<>(grassMoves.subList(1, 5));

        pokemons.add(new Pokemon("Bulbasaur", "Planta", 45, 49, 49, 65, 65, 45, bulbasaurMoves));
        pokemons.add(new Pokemon("Leafeon", "Planta", 65, 110, 60, 60, 130, 95, leafeonMoves));
        pokemons.add(new Pokemon("Roserade", "Planta", 60, 70, 65, 125, 105, 90, roseradeMoves));
        pokemons.add(new Pokemon("Torterra", "Planta", 95, 109, 105, 75, 85, 56, torterraMoves));

        ArrayList<Ataque> sandshrewMoves = new ArrayList<>(groundMoves.subList(0, 4));
        ArrayList<Ataque> garchompMoves = new ArrayList<>(groundMoves.subList(0, 4));
        ArrayList<Ataque> donphanMoves = new ArrayList<>(groundMoves.subList(0, 4));
        ArrayList<Ataque> mudsdaleMoves = new ArrayList<>(groundMoves.subList(1, 5));

        pokemons.add(new Pokemon("Sandshrew", "Tierra", 50, 75, 85, 20, 30, 40, sandshrewMoves));
        pokemons.add(new Pokemon("Garchomp", "Tierra", 108, 130, 95, 80, 65, 102, garchompMoves));
        pokemons.add(new Pokemon("Donphan", "Tierra", 90, 120, 120, 60, 60, 50, donphanMoves));
        pokemons.add(new Pokemon("Mudsdale", "Tierra", 100, 125, 100, 55, 85, 35, mudsdaleMoves));
    }

    public static void initialize() {
        initializeMoves();
        initializePokemons();
    }

    public static ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public static ArrayList<Ataque> getAtaques(Pokemon.Type type) {
        initializeMoves();
        switch (type) {
            case FUEGO -> {
                return fireMoves;
            }
            case AGUA -> {
                return waterMoves;
            }
            case PLANTA -> {
                return grassMoves;
            }
            case TIERRA -> {
                return groundMoves;
            }
            default -> throw new IllegalArgumentException("Tipo de Pokemon Desconocido: " + type);
        }
    }
}
