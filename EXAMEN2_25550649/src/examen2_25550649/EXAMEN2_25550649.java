package examen2_25550649;
import java.util.*;
public class EXAMEN2_25550649 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numUser, respuesta;
        String cerrar;
        boolean estado = true;
        do{
            System.out.println("Elige un numero:");
            numUser = Integer.parseInt(input.nextLine());
            System.out.println("Desea  imprimir numeros primos o no primos: "
                    + "\nPrimos(1) "
                    + "\nNo primos(2)");
            respuesta = Integer.parseInt(input.nextLine());
            switch(respuesta){
                case 1:
                    System.out.println("Los numeros primos antes del " + numUser + " son:");
                    Saberprimos(numUser);
                    System.out.println("\nExtra: (En asteriscos)");
                    crearAstPrimos(numUser);
                    break;

                case 2:
                    System.out.println("Los numeros no primos antes del " + numUser + " son:");
                    SaberNoprimos(numUser);
                    System.out.println("\nExtra: (En asteriscos)");
                    crearAstNoPrimos(numUser);
                    break;

            }
            System.out.println("¿Quieres volver a realizarlo?(s/n)");
            cerrar = input.nextLine();
            
            if(cerrar.equals("n")){
                estado = false;
            }
        }while(estado);      
    }
    public static void Saberprimos(int numUser){
        int residuo;
        for (int i = 2; i <= numUser; i++) {
            residuo =  i % 2 ;
            if(residuo == 1){
                for (int j = 2; j <= i; j++) {
                    residuo = i % j;
                    if((residuo == 0 && i == j)){
                        System.out.print(i + " ");
                        break;  
                    }else if(residuo == 0 ){
                        break;
                        
                    }
                        
                }
            }
        }
        System.out.println();
    }
    public static void SaberNoprimos(int numUser){
        int residuo;
        for (int i = 2; i <= numUser; i++) {
            residuo =  i % 2 ;
            if(residuo == 0){
                for (int j = 2; j <= i; j++) {
                    residuo = i % j;
                    if((residuo == 0 && i == j)){
                        System.out.print(i + " ");
                        break;  
                    }else if(residuo == 1 ){
                        
                    }
                        
                }
            }
        }
        System.out.println();
    }
    public static void crearAstPrimos(int numUser){
        int residuo;
        for (int i = 2; i <= numUser; i++) {
            residuo =  i % 2 ;
            if(residuo == 1){
                for (int j = 2; j <= i; j++) {
                    residuo = i % j;
                    if((residuo == 0 && i == j)){
                        for (int h = 1; h <= i; h++) {
                            System.out.print("*");    
                        }
                        System.out.println();
                        break;  
                    }else if(residuo == 0 ){
                        break;
                        
                    }
                        
                }
            }
        
        
        }
    }
    public static void crearAstNoPrimos(int numUser){
        int residuo;
        for (int i = 2; i <= numUser; i++) {
            residuo =  i % 2 ;
            if(residuo == 0){
                for (int j = 2; j <= i; j++) {
                    residuo = i % j;
                    if((residuo == 0 && i == j)){
                        for (int h = 1; h <= i; h++) {
                            System.out.print("*");    
                        }
                        System.out.println();
                        break;  
                    }else if(residuo == 1 ){
                        
                    }
                        
                }
            }
        }
        
        
    }
}