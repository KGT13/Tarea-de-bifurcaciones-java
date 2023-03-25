import java.util.Scanner;
public class Tarea_Bifurcaciones_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inserte un número entero: ");
        int x = entrada.nextInt();
        
        if(x>= 100 && x<=999){
            System.out.println("El número tiene tres dígitos");
           
        }
        else{
            System.out.println("El número no tiene tres dígitos");
        }
        
    }
}
