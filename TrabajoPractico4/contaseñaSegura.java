import java.util.Scanner;

public class contaseñaSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá una contraseña: ");
        String contrasenia = scanner.nextLine();

        
        boolean largoOk = tiene8Caracteres(contrasenia);
        boolean numeroOk = tieneNumero(contrasenia);
        boolean especialOk = tieneCaracterEspecial(contrasenia);

        // Muestra si cumple 
        System.out.println("Más de 8 caracteres: " + largoOk);
        System.out.println("Contiene número: " + numeroOk);
        System.out.println("Contiene carácter especial: " + especialOk);

        // Resultado final
        if (largoOk && numeroOk && especialOk) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura.");
        }

        scanner.close();
    }

    // 1. Verifica si tiene al menos 8 caracteres
    public static boolean tiene8Caracteres(String pass) {
        return pass.length() >= 8;
    }

    // 2. Verifica si tiene al menos un número
    public static boolean tieneNumero(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // 3. Verifica si tiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String pass) {
        String especiales = "!@#$%^&*";
        for (int i = 0; i < pass.length(); i++) {
            if (especiales.contains(String.valueOf(pass.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}