import java.util.Scanner;
public class practica_do_while {
     public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        int contador=0;
        int suma=0;
        int A = 0;
       do {
        System.out.println("Introduce un número :");
        
        A = leer.nextInt();
        
        contador=contador+1;
        suma=suma+A;
       }while(contador<10);
        System.out.println("La suma es: "+suma);
}}
