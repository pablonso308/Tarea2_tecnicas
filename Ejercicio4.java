import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduzca la distancia recorrida (km): ");
        double distancia = scanner.nextDouble();


        System.out.print("Introduzca el tiempo empleado (horas): ");
        double tiempo = scanner.nextDouble();


        double velocidadMedia = calcularVelocidadMedia(distancia, tiempo);

        System.out.println("La velocidad media es: " + velocidadMedia + " km/h.");

    }
    public static double calcularVelocidadMedia(double distancia, double tiempo) {
        return distancia / tiempo;
    }
}

//para poder integrar este calculo a un gran sistema de inteligencia artificial es necesaria una arquitectura modular y flexible que permita la integracion de otros componentes.
//Además, el uso de estándares y protocolos abiertos facilita la interoperabilidad con otras aplicaciones y sistemas externos.
//otros paramatros que pueden ser utiles para analizar en ese contexto son:
//Congestión de Tráfico
//Eficiencia de Combustible
//Tiempo de Espera en Semáforos y Cruces
//Modos de Transporte Utilizados
//Niveles de Contaminación del Aire
//Accidentes de Tráfico
//Patrones de Movilidad de Peatones