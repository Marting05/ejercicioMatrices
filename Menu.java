
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatriz[][] MD = new ObjMatriz[n][n];
        while(continuar){
                System.out.println("Que desea realizar 1: llenar matriz de enteros"
                    +"2 Mostrar Matriz de enteros, 3 Llenar matriz Objetual 4 Mostrar matriz");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        ME = m.LLenarMatrizEntera(ME);
                        break;
                    case 2:
                        m.MostrarMatrizEntera(ME);
                        break;
                    case 3:
                        MD = m.LLenarMatrizObjetual(MD);
                        break;
                    case 4:
                        m.MostrarMatrizObjetual(ME);
                        break;
                    case 5:
                        System.out.println("hasta luego");
                        continuar = false;
                        break;                                                                                                
                    default:
                        System.out.println("esta opcion no existe por favor validar...");
                        break;
                }    
        }
    }
}
