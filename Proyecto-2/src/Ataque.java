public class Ataque {
    
    public enum Type {
        FISICO, ESPECIAL
    };
    private String name;
    public Type type;
    private byte power;

    public Ataque(){}

    public Ataque(String name, String type, byte power) {
        this.name = name;
        this.type = Type.valueOf(type.toUpperCase());
        this.power = power;
    }

    public String getName() {
        return name;
    }
    
    public Type getType() {
        return type;
    }
   
    public byte getPower() {
        return power;
    }
   

}