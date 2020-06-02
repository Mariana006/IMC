import java.util.Scanner;
public class Principal {
    public static void main (String []args){
    Scanner entrada=new Scanner (System.in);
    System.out.println("Ingresa tu Nombre");
    String nombre=entrada.nextLine();
    System.out.println("Sexo  [Masculino] ó [Femenino]");
    String sexo=entrada.nextLine();
    System.out.println("Ingresa tu Edad");
    int edad=entrada.nextInt();
    System.out.println("Ingresa tu Peso en Kg   <<Ejemplo: 50>>");
    double peso=entrada.nextDouble();
    System.out.println("Ingresa tu Altura en m  <<Ejemplo: 1.80>>");
    double altura=entrada.nextDouble();
   
   
    Persona da=new Persona(nombre,sexo,edad,peso,altura);
    da.MostrarDatos();
    
    Operaciones  op =new Operaciones(nombre,sexo,edad,peso,altura); 
    op.ope();
}
 
}
