package Salud;

import java.util.Scanner;

public class Empleado extends Persona
{
    private String cargo, departamento;
    private Float  valorhora, horastrabajadas;
    private double total, precio;
    Scanner terminal = new Scanner(System.in);

    public Empleado(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, String cargo,
            String departamento, Float valorhora, Float horastrabajadas, Scanner terminal) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.terminal = terminal;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Float getValorhora() {
        return valorhora;
    }
    public void setValorhora(Float valorhora) {
        this.valorhora = valorhora;
    }
    public Float getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(Float horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void calcularHonorarios() 
    {

        System.out.println("Precio de hora de trabajo:: ");
        valorhora = terminal.nextFloat();
        System.out.println("------------------");

        System.out.println("Horas trabajadas: ");
        horastrabajadas = terminal.nextFloat();
        System.out.println("-------------------------------------------");

        precio = valorhora * horastrabajadas;
        total = precio - ((precio * 0.966)/100);

        System.out.println("------------------------------------------------------------------");

        System.out.println("Su tipo de documento es :" + getTipoDoc() );
        System.out.println("------------------");

        System.out.println("Su numero de documento es: "+ getDocumento());
        System.out.println("------------------");

        System.out.println("Su nombre es: " + getNombre());
        System.out.println("------------------");

        System.out.println("Su Apellido es : " + getApellido());
        System.out.println("------------------");
        
        System.out.println("Horas de trabajo  : " + getHorastrabajadas());
        System.out.println("------------------");

        System.out.println("se paga por hora:  : " + getValorhora());
        System.out.println("------------------");

        System.out.println("se paga por hora:  : " + total);
        System.out.println("------------------");
    }

    
}
