import java.util.Scanner;
public class Tarea_Bifurcaciones_3{
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
       
       System.out.println("Inserte un número entero: ");
       int x = entrada.nextInt();

       int y = x%7;
       if(y==0){
        System.out.println(" Es múltiplo de 7 ");
       }else{
        System.out.println(" No es múltiplo de 7");
       }

    }
}