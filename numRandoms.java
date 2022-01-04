import java.util.Random;
import java.util.Scanner;
public class numRandoms {
    public static void main(String[] args) {

        try {
            Thread.sleep(3*1000);
        }catch (Exception e) {
            System.out.println(e);
        }

        System.out.println ("START GAME");
        int i = 0;
        do{
            try {
                Thread.sleep(1*1000);
            }catch (Exception e) {
                System.out.println(e);
            }
            System.out.print (".");
            i++;
        }while(i<5);
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int n = r.nextInt(100)+1;
        
        int resp = 0;
        int cont = 0;
        
        System.out.println();
        
        int vidas = 5;
        
        do{
            System.out.println("Vidas restantes: " + vidas);
            System.out.print("Digiteun número entre 1 y 100: ");
            resp = s.nextInt();
            
            if (resp == n){
                System.out.println("A acertado el número");
                cont = 1;
            }else{
                vidas--;
                if(vidas==0){
                    cont = 1;
                }
            }
        }while(cont==0);
        
        if (vidas==0){
            System.out.println("Juego terminado, usted perdio");
        }else{
            System.out.println("Vidas restantes: " + vidas);
        }
    }
    
}
