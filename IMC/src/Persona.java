public class Persona {

 String nombre;
 String sexo;
 int edad;
 double peso;
 double altura;

   

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
 
public Persona(String nombre,String sexo,int edad, double peso,double altura){
    this.nombre=nombre;
    this.sexo=sexo;
    this.edad=edad;
    this.peso=peso;
    this.altura=altura;
}
   public void MostrarDatos(){
System.out.println ("Nombre:"+nombre+" "+"\n Sexo:"+" "+sexo+" "+"\n Edad:"+" "+edad+" "+"\n Peso:"+" "+peso+" "+"\n Altura:"+altura);
 
}

}
