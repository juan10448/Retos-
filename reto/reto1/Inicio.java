package Salud;

public class Inicio 
{
    public static void main(String[] args)
    {
        Persona Ejecutar = new Persona();
        Ejecutar.pedirDatos();
        Ejecutar.mostrarPersona();
        Ejecutar.calcularImc();
        Ejecutar.mayorEdad();
    }    
}
