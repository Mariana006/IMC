
public class Operaciones extends Persona {
    double imc;
    
  public  Operaciones(String nombre, String sexo,int edad, double peso,double altura){
    super(nombre,sexo,edad,peso,altura);
    this.imc=imc;
}


   public void ope(){ 
imc =peso/(altura*altura);

if(imc<18.5){
    System.out.println("Estas baja de peso su masa es de:"+imc);
}
else if(imc >18.5 && imc <=24.9 ){
 System.out.println(" Peso Normal su masa es de:"+imc);   
}
if(imc >25 && imc <= 29.9){
    System.out.println("Estas en Sobrepeso su masa es de:"+imc);   
}
else if(imc >30 && imc <= 34.9){
  System.out.println("Estas en la etapa I de Obesidad su masa es de:"+imc);  
}
if(imc >35 && imc<=39.9){
   System.out.println("Estas en la etapa II de Obesidad su masa es de:"+imc);   
}
else if(imc >40 && imc <= 49.9 ){
    System.out.println("Estas en la etapa III de Obesidad su masa es de:"+imc);   
}
if(imc >=50){
    System.out.println("Estas en la etapa IV de Obesidad su masa es de:"+imc);   
}
  }
        
    }

