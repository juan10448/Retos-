package Salud;

import java.util.Scanner;

public class Persona 
{
    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    private Float  peso, estatura, pesoActual;
   
    public Persona()
    {

    }
    public Persona(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, Float peso,
            Float estatura, Float pesoActual) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public Float getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Float pesoActual) {
        this.pesoActual = pesoActual;
    }

    Scanner terminal = new Scanner(System.in);

    public void pedirDatos() 
    {
        System.out.println("Cual de estos es su tipo de documento: \n1: CC \n2: TI");
        setTipoDoc(terminal.next());
        System.out.println("------------------");

        System.out.println("Ingrese el numero de su documendo de identidad: ");
        setDocumento(terminal.nextInt());
        System.out.println("------------------");

        System.out.println("Ingrese su nombre: ");
        setNombre(terminal.next());
        System.out.println("------------------");

        System.out.println("Ingrese su Apellido: ");
        setApellido(terminal.next());
        System.out.println("------------------");

        System.out.println("Ingrese su peso en kg: ");
        setPeso(terminal.nextFloat());
        System.out.println("------------------");

        System.out.println("Ingrese su estatura en m: ");
        setEstatura(terminal.nextFloat());
        System.out.println("------------------");

        System.out.println("Ingrese su edad: ");
        setEdad(terminal.nextInt());
        System.out.println("------------------");

        System.out.println("Cual es su sexo: \n1: Femenino \n2: Masculino \n3: Otro");
        setSexo(terminal.next());
        System.out.println("-------------------------------------------");
    }

    public void mostrarPersona () 
    {
        System.out.println("REVISE SI SUS DATOS SON CORRECTOS");
        System.out.println("-------------------------------------------");

        System.out.println("Su tipo de documento es :" + getTipoDoc() );
        System.out.println("------------------");

        System.out.println("Su numero de documento es: " + getDocumento());
        System.out.println("------------------");

        System.out.println("Su nombre es: " + getNombre());
        System.out.println("------------------");

        System.out.println("Su Apellido es : " + getApellido());
        System.out.println("------------------");

        System.out.println("Su peso en kg es: " + getPeso());
        System.out.println("------------------");

        System.out.println("Su estatura en m es : " + getEstatura());
        System.out.println("------------------");

        System.out.println("Su edad es : " + getEdad());
        System.out.println("------------------");

        System.out.println("Su sexo es: "  + getSexo());
        System.out.println("-------------------------------------------");
    }

    public void  calcularImc() 
    {
        pesoActual=peso/(estatura*2);
        System.out.println("SU IMC ES:");
        System.out.println("-------------------------------------------");
        
        if(pesoActual < 20)
        {
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if(pesoActual >= 20 && pesoActual <=25)
        {
            System.out.println("El peso es ideal");
        }
        else if(pesoActual > 25)
        {
            System.out.println("Tiene sobrepeso");
        }
    }

    public void mayorEdad()
    {

        if (edad >= 18)
        {
            System.out.println("Usted es mayor de edad");
        }
        else if(edad < 18)
        {
            System.out.println("Usted es menor de edad");
        }
        System.out.println("-------------------------------------------");
    }
}
