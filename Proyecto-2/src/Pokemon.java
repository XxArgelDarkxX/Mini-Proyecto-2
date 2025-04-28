import java.util.ArrayList;
import java.util.List;

public class Pokemon{
    
    private String nombre;
    
    public enum Type {
        FUEGO, AGUA, PLANTA, TIERRA,
    }
    
    private Type tipo;
    private int hp, at, df, ats, des, vel;
    private List<Ataque> ataques; 

    // Constructor con parámetros
    public Pokemon(String nombre, Type tipo, int hp, int at, int df, int ats, int des, int vel,
                   List<Ataque> ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        this.at = at;
        this.df = df;
        this.ats = ats;
        this.des = des;
        this.vel = vel;
        this.ataques = ataques != null ? ataques : new ArrayList<>(); // Aseguramos que nunca sea null
    }

    // Constructor adicional sin 'PokemonList' y mejorando la creación de ataques
    public Pokemon(String nombre, String tipoStr, int hp, int at, int df, int ats, int des, int vel,
                   List<Ataque> ataques) {
        this(nombre, Type.valueOf(tipoStr.toUpperCase()), hp, at, df, ats, des, vel, ataques);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Type getTipo() {
        return tipo;
    }

    public int getHp() {
        return hp;
    }

    public int getAt() {
        return at;
    }

    public int getDf() {
        return df;
    }

    public int getAts() {
        return ats;
    }

    public int getDes() {
        return des;
    }

    public int getVel() {
        return vel;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

}