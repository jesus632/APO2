import java.util.Random;

public class Tablatemp {

    public static void main(String[] args) {
        Random numRan = new Random();
        int FILA = 101;
        int COLUMNA = 6;
        int[][] temperatura = new int[FILA][COLUMNA];
        String[] ciudades = {"Bogotá", "Cali", "Medellín", "Pasto", "Barranquilla", "Manizales"};

        
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                temperatura[i][j] = 10 + numRan.nextInt(31); 
            }
        }

        
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Fila", ciudades[0], ciudades[1], ciudades[2], ciudades[3], ciudades[4], ciudades[5]);
        for (int i = 0; i < FILA; i++) {
            System.out.printf("%-15d", i + 1);
            for (int j = 0; j < COLUMNA; j++) {
                System.out.printf("%-12d", temperatura[i][j]);
            }
            System.out.println();
        }
    }
}
