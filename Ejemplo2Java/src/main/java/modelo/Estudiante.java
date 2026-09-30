/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabriela_mor.cardona
 */
public class Estudiante {
 private String nombre;
 private double nota1;
 private double nota2;
    private double resultado;
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularDefinitiva(){
        resultado = (nota1 + nota2)/2.0;
        return resultado;
    }
    
    public String obtenerResultado(){
        if(resultado>= 3.0){
            String estado="APROBADO";
            return estado;
            
        }else {
                    String estado= "NO APROBADO";
                            return estado;
                    }
        }
    }


