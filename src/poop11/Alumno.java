/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase que representa a un Alumno con atributos como nombre, apellidos, 
 * número de cuenta, edad y semestre.
 * 
 * @author USER
 */
public class Alumno {
    
    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int semestre;

    /**
     * Constructor por defecto de la clase Alumno
     */
    public Alumno() {
    }

    /**
     * Constructor de la clase Alumno con parámetros
     * 
     * @param nombre Nombre del alumno
     * @param apPat Apellido paterno del alumno
     * @param apMat Apellido materno del alumno
     * @param numCuenta Número de cuenta del alumno
     * @param edad Edad del alumno
     * @param semestre Semestre en el que se encuentra el alumno
     */
    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int semestre) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.semestre = semestre;
    }

    /**
     * Método para obtener la edad del alumno
     * 
     * @return Edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del alumno
     * 
     * @param edad Edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Método para obtener el nombre del alumno
     * 
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del alumno
     * 
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el apellido paterno del alumno
     * 
     * @return Apellido paterno del alumno
     */
    public String getApPat() {
        return apPat;
    }

    /**
     * Método para establecer el apellido paterno del alumno
     * 
     * @param apPat Apellido paterno del alumno
     */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    /**
     * Método para obtener el apellido materno del alumno
     * 
     * @return Apellido materno del alumno
     */
    public String getApMat() {
        return apMat;
    }

    /**
     * Método para establecer el apellido materno del alumno
     * 
     * @param apMat Apellido materno del alumno
     */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    /**
     * Método para obtener el número de cuenta del alumno
     * 
     * @return Número de cuenta del alumno
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Método para establecer el número de cuenta del alumno
     * 
     * @param numCuenta Número de cuenta del alumno
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Método para obtener el semestre en el que se encuentra el alumno
     * 
     * @return Semestre del alumno
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Método para establecer el semestre en el que se encuentra el alumno
     * 
     * @param semestre Semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Método que imprime un mensaje indicando que el alumno está estudiando
     */
    public void estudiar() {
        System.out.println("Estoy estudiando ");
    }

    /**
     * Método toString para obtener una representación en cadena del objeto Alumno
     * 
     * @return Cadena con los atributos del alumno
     */
    @Override
    public String toString() {
        return (nombre + "," + apPat + "," + apMat + "," + numCuenta + "," + edad + "," + semestre);
    }
}
