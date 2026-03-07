import java.util.Scanner;

public class App{

    static Scanner sc = new Scanner(System.in);


    // datos de produccion
    static int stockPrima = 500;
    static int materialPieza = 25;
    static int maxPiezas = 20;

    static int piezas = 0;

    // estado de la máquina
    static boolean operativo = true;
    static String reporteMaquina = "";

    public static void main(String[] args) {
        
        login();

    }

    public static void login() {
        
        // datos operario
        final int COD_OPERARIO = 4567;
        int turno = 0;
        int intentos = 0;
        
        do {

            System.out.print("\nIntroduzca el código del empleado: ");
            
            int intentoCodigo = sc.nextInt();

            System.out.print("Digite el número de su turno: ");
            turno = sc.nextInt();
            intentos++;

            if (intentoCodigo == COD_OPERARIO && turno <= 3 && turno >= 1) {

                intentos = 3;
                menu();

            } else {

                System.out.println("Acceso denegado");

            }

        } while (intentos < 3);

    }

    public static void menu() {
        int opcion;
    do{
        System.out.println("""
            \n1. Producir piezas
            2. Ver stock de materia prima
            3. Reportar daño de máquina
            4. Cerrar turno
                """);
                
        System.out.print("\nIngrese el número de la opcion: ");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número de piezas a fabricar: ");
                sc.nextLine();
                piezas = sc.nextInt();
                int materialNecesarios = piezas * materialPieza;

                if(piezas > 0 && piezas <= 20 && stockPrima >= materialNecesarios && operativo){

                    stockPrima -= materialNecesarios;

                    System.out.println("\nProducción realizada con éxito");
                    System.out.println("Stock restante: " + stockPrima);

                } else {
                    System.out.println("Materia prima insuficiente o producción detenida");
                }

                break;
            case 2:

                System.out.println("\nStock restante: " + stockPrima);
                
                break;
            case 3:
                System.out.print("\nRegistre el daño: ");
                sc.nextLine();
                reporteMaquina = sc.nextLine();
                operativo = false;
                System.out.println("Maquina en mantenimiento...");
                break;
            case 4:
                System.out.println("\nTotal de piezas producidas: " + piezas);
                System.out.println("Materia prima restante: " + stockPrima);
                System.out.println("Estado de la máquina: " + reporteMaquina);
                System.out.println("Finalizando turno...");
                break;
            default:
                System.out.println("Opcion inválida, intente de nuevo");
                break;
            }
        } while (opcion != 4);
        sc.nextLine();
    }

}