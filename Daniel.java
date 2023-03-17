
package daniel;
import java.util.Scanner;

public class Daniel {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre =sc.nextLine();
        System.out.println("hola " +nombre);
        System.out.println("porfavor ingrese un numero:");
        
        int numero = sc.nextInt();
        
        
     if(numero<=10){
    System.out.println("el numero ingresado es menor que 10");
}else{
        System.out.println("el numero ingresado es mayor que 10");
        
     }
    
}
}

    
