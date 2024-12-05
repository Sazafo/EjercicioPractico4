/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico4;

/**
 *
 * @author sazaf
 */

//aca primero defino cada cosa 
public class Participante {
    private String nombreCompleto;
    private int edad;
    private int numeroCorredor;
    private int tiempoEstimado;
    private String categoria;
    
    
    public Participante(String nombreCompleto, int edad, int numeroCorredor, int tiempoEstimado){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
        calcularCategoria();
    }
    
    //esta funcion es para que cuando el usuario digite la edad de una vez lo coloque en una categoria
    private void calcularCategoria(){
        if (edad < 18 ){
            this.categoria = "Juvenil";
        } else if(edad <= 40){
            this.categoria = "Adulto";
        } else {
            this.categoria = "Master";
        }
        
    }

    //aca utilice constructores mas que todo los get
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }     

    public String getCategoria(){
        return categoria;
    }
    
}
