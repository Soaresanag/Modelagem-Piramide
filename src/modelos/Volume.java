/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class Volume {
    //atributos

private float base = 0;
private float altura = 0;

    public float getBase() {
        return base;
    }

    public void setBase(float base) throws Exception {
        if(base <= 0) throw new Exception ("A base não pode ser <= 0");
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0) throw new Exception ("A altura não pode ser <= 0");
        this.altura = altura;
    }

//metodos
public float calcularVolume(){
    return ((base*altura)/3);
}
    
}
