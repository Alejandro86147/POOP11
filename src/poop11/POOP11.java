package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase principal que maneja la lectura y escritura de archivos, así como la 
 * tokenización de cadenas y la gestión de objetos Alumno.
 */
public class POOP11 {

    /**
     * Método principal del programa
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        
        /**
         * Creación de un objeto File que representa un archivo
         */
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());

        try {
            /**
             * Intento de crear un archivo nuevo si no existe
             */
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("########## FileWriter ##########");

        try {
            /**
             * Lectura de entrada del usuario desde la consola
             */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba: ");
            String texto = br.readLine();
            System.out.println(texto);

            /**
             * Creación de FileWriter y BufferedWriter para escribir en el archivo
             */
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.println("Esta es la segunda linea");

            /**
             * Escribir varias líneas en el archivo
             */
            for (int i = 0; i < 10; i++) {
                salida.println("Linea: " + i);
            }

            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
            }

            /**
             * Cierre del escritor para asegurar que los datos se guardan
             */
            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("############ FileReader ##############");

        try {
            /**
             * Lectura del archivo utilizando FileReader y BufferedReader
             */
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto es: ");
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("############ StringTokenizer ##############");

        /**
         * Ejemplo de uso de StringTokenizer para descomponer una cadena en tokens
         */
        String alumnoParseado = "Eric Fernando,Soto,Bolaños,321184593,18,3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }

        /**
         * Creación de objetos Alumno
         */
        Alumno alumno1 = new Alumno("Halley", "Mendoza", "Sanchez", 123465419, 19, 3);
        System.out.println(alumno1);
        Alumno alumno2 = new Alumno("Jose", "Posada", "Martinez", 734649329, 20, 4);
        System.out.println(alumno2);
        Alumno alumno3 = new Alumno("Maria", "Nuñez", "Zacarias", 649362849, 18, 1);
        System.out.println(alumno3);
        Alumno alumno4 = new Alumno("Marco", "Pinzob", "Sanchez", 946284633, 21, 5);
        System.out.println(alumno4);
        Alumno alumno5 = new Alumno("Hanna", "Parker", "Stark", 538472549, 19, 3);
        System.out.println(alumno5);

        /**
         * Añadir objetos Alumno a una lista
         */
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);

        /**
         * Imprimir objetos Alumno desde la lista
         */
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }

        System.out.println("Escribiendo txt");

        try {
            /**
             * Escribir objetos Alumno en un archivo de texto
             */
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (Alumno alumno : lista) {
                salida.println(alumno);
            }
            salida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

/**
 * Clase que representa a un Alumno con atributos como nombre, apellidos, 
 * matrícula, edad y semestre.
 */
class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int matricula;
    private int edad;
    private int semestre;

    /**
     * Constructor de la clase Alumno
     * @param nombre Nombre del alumno
     * @param apellidoPaterno Apellido paterno del alumno
     * @param apellidoMaterno Apellido materno del alumno
     * @param matricula Matrícula del alumno
     * @param edad Edad del alumno
     * @param semestre Semestre en el que se encuentra el alumno
     */
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int matricula, int edad, int semestre) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.matricula = matricula;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Método toString para obtener una representación en cadena del objeto Alumno
     * @return Cadena con los atributos del alumno
     */
    @Override
    public String toString() {
        return nombre + "," + apellidoPaterno + "," + apellidoMaterno + "," + matricula + "," + edad + "," + semestre;
    }
}
