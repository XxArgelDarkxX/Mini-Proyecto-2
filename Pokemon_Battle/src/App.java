import Data.Pokemons;
import Pokemon.Pokemon;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pokemons.initializeData();
        ArrayList<Pokemon> pokemonList = Pokemons.getPokemons();
    }
}