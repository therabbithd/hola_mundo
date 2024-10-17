/**
 * HolaMundo
 */
import java.util.Scanner;
public class hello_word {

    public static void main(String[] args) {
        
    }

    public static void holaMundo() {
        
    }

    public static void saludo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pon tu nombre");
        String nombre =  scanner.nextLine();
        System.out.println("hola "+ nombre);   
        scanner.close();
    }

    public static void despedida() {
        
    }


}