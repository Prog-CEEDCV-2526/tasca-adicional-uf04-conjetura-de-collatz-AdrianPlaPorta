package gvaCEED;
import java.util.Scanner;

public class Collatz{
    public static void main(String[] args) {

        Scanner teclat = new Scanner (System.in);
        int cont=0;
        
        System.out.println("Introdueix un nombre positiu: ");
        int num = teclat.nextInt();
        System.out.println("Seqüència de Collatz per al nombre: "+num);

        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;
                System.out.print(num + " --> ");
            }else{
                num = (num * 3) +1;
                System.out.print(num + " --> ");
            } 
            cont++;
        }

        System.out.println("Nombre total de passos: "+cont);   
    }
}

