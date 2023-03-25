import java.util.Scanner;
public class Tarea_Bifurcaciones_1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x,y,z;

        System.out.println("Ingrese el primer número: ");
        x=entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        y=entrada.nextInt();
        System.out.println("Ingrese el tercer número: ");
        z=entrada.nextInt();

        int max = x;
        if(y>x){
            max=y;
        }
        if(z>max){
            max=z;
        }
        System.out.println("El mayor número es: "+max);

    }
    
}
