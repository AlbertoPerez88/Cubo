/*
PROYECTO --> Cubo
CLASE --> Cubo
    PROPIEDADES --> alto * ancho * profundo -> TIPO ENTERO
    2 CONSTRUCTORES () 3arg
    calcularVolumen(a,b,c) -> volumen
CLASE PRINCIPAL --> Paquete principal
    --> main
        -->Cubo1(7,4,10)
           calcularVol(cubo1) --> POR PANTALLA

*/
package Principal;

import Figuras.Cubito;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    public static void main(String[] args) {
        Cubito cubo1 = new Cubito(12,12,12);
        
        //Llamo al metodo calcularVolumen
        int res = cubo1.calcularVolumen(cubo1.getAlto(), cubo1.getAncho(), cubo1.getProfundo());
        
        //Muestro por pantalla
        System.out.println("El resultado del volumen del cubo es: " + res);
    }
           
}
