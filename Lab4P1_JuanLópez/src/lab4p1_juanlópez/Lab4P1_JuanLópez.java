/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_juanlópez;
import java.util.Scanner;
/**
 *
 * @author jjlm1
 */
public class Lab4P1_JuanLópez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("************MENÚ************");
        System.out.println("1. Inversión Especial");
        System.out.println("2. Balanza de Cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("Ingrese la opción deseada");
        int opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cadena a invertir:");
                    leer.nextLine();
                    String cad=leer.nextLine();
                    int j=cad.length();
                    String cadinvertida="";
                    String cadi="";
                    String cadfinal="";
                    if (cad.length()>=5){
                        for (int i=0;i<cad.length();i++){
                            char caracter=cad.charAt(i);
                            cadi=caracter+cadi;
                            if (caracter==' '){
                                
                                cadfinal+=cadi;
                                cadfinal+=caracter;
                                cadi="";
                            }
                            
                        }
                        cadfinal+=cadi;
                        
                    }else{
                        System.out.println("La cadena es muy corta");
                    }
                    System.out.println("Cadena invertida:"+cadfinal);
                    break;
                    
                case 2:
                    System.out.println("Ingrese cadena 1:");
                    leer.nextLine();
                    String cad1=leer.nextLine();
                    int peso1=0;
                    System.out.println("Ingrese cadena 2:");
                    
                    String cad2=leer.nextLine();
                    int peso2=0;
                    System.out.println("Ingrese cadena 3:");
                    
                    String cad3=leer.nextLine();
                    int peso3=0;
                    for (int i=0;i<cad1.length();i++){
                        cad1.charAt(i);
                        peso1=peso1+cad1.charAt(i);
                    }
                    for (int i=0;i<cad2.length();i++){
                        cad2.charAt(i);
                        peso2=peso2+cad2.charAt(i);
                    }
                    for (int i=0;i<cad3.length();i++){
                        cad3.charAt(i);
                        peso3=peso3+cad3.charAt(i);
                    }
                    System.out.println("Peso cadena 1: "+peso1);
                    System.out.println("Peso cadena 2: "+peso2);
                    System.out.println("Peso cadena 3: "+peso3);
                    if (peso1>peso2&&peso1>peso3){
                        System.out.println("La cadena 1 es la más pesada");
                    }
                    if (peso2>peso1&&peso2>peso3){
                        System.out.println("La cadena 2 es la más pesada");
                    }
                    if (peso3>peso2&&peso3>peso1){
                        System.out.println("La cadena 3 es la más pesada");
                    }
                    if (peso1==peso2){
                        System.out.println("Peso 1 y 2 iguales");
                    }if (peso1==peso3){
                        System.out.println("Peso 1 y 3 iguales");
                    }if (peso2==peso3){
                        System.out.println("Peso 2 y 3 iguales");
                    }


                    
                    break;
                case 3:
                    System.out.println("Ingrese mensaje a descifrar:");
                    leer.nextLine();
                    String mensaje=leer.nextLine();
                    String cod="";
                    if (mensaje.length()>0){
                    for (int i=0;i<mensaje.length();i++){
                        int codi=mensaje.charAt(i)+2;
                        char x = (char)codi;
                        cod=cod+x;
                    }
                    System.out.println(cod);
                    }else{
                    System.out.println("Cadena no puede ser nula");
                    }
                    break;
            }
            System.out.println("************MENÚ************");
        System.out.println("1. Inversión Especial");
        System.out.println("2. Balanza de Cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("Ingrese la opción deseada");
         opcion=leer.nextInt();
        }
    }
    
}
