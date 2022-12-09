package Salud;

import java.util.Scanner;

public class Persona 
{
    private String tipoDoc, nombre, apellido, sexo;
    private int documento, edad;
    public float  peso, estatura, pesoActual;
   

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
    { System.out.println("REVISE SI SUS DATOS SON CORRECTOS");
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

    public String calcularImc(Float peso, Float estatura) 
    {
        pesoActual=peso/(estatura*2);
        String solucion = "";

        if(pesoActual < 20)
        {
            solucion = "PESOBAJO";
        }
        else if(pesoActual >= 20 && pesoActual <=25)
        {
            solucion = "PESOIDEAL";
        }
        else if(pesoActual > 25)
        {
            solucion = "SOBREPESO";
        }
        System.out.println(solucion);       
        return solucion;   
    }

    


    


}
