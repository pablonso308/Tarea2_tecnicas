import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduzca la distancia recorrida (km): ");
        double distancia = scanner.nextDouble();


        System.out.print("Introduzca el tiempo empleado (horas): ");
        double tiempo = scanner.nextDouble();


    }
    public static double calcularVelocidadMedia(double distancia, double tiempo) {
        return distancia / tiempo;
    }
}