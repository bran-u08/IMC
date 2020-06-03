/*
Solorzano Trejo Brandon Uriel
2S11
IMC
Clase operaciones
 */
package indicemasacorporal;
import java.util.Scanner;

public class operaciones {
Scanner teclado=new Scanner(System.in);
double peso,altura,imc;
 
        public void operaciones(){
        System.out.println("Ahora ingresa tu peso ");
        peso= teclado.nextDouble();
        System.out.println("De igual manera ingresa tu estatura ");
        altura= teclado.nextDouble();
        imc= peso/(altura*altura);
        System.out.println("TU IMC ES: "+imc);
         
        if (imc<18.5){
        System.out.println("Tu peso esta bajo");
        } 
        
        else if (imc>=18.5 && imc<=24.9) {
        System.out.println("Estas normal");
        } 
        
        else if (imc>=25 && imc<=29.9) {
        System.out.println("Tienes sobrepeso");
        } 
        
        else {
        System.out.println("Eres obeso");
        }
      }
    }


 
