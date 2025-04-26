import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // inicializar
        Data.initialize();

        ArrayList<Pokemon> pokemons = Data.getPokemons();
        Random random = new Random();

        //usar un for para mostrar 3 pokemones aleatorios
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(pokemons.size());
            Pokemon randomPokemon = pokemons.get(randomIndex);
            System.out.println("Nombre: " + randomPokemon.getNombre() + " - Tipo: " + randomPokemon.getTipo());
        }
    }
}
