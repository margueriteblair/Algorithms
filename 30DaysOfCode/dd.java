import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        parsedamageDie("2d4");
        parsedamageDie("31d44");
        
    }

    public static void parsedamageDie(String damageDie) {
        System.out.println(Arrays.toString(damageDie.split("d")));
    }
}