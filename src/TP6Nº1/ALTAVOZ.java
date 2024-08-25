
package TP6Nº1;

/**
 *
 * @author Lucas
 */
public class ALTAVOZ extends DISPOSITIVOS{

    public ALTAVOZ(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionEspecifica() {
        System.out.println("Altavoz " + nombre + " está reproduciendo música.");
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Altavoz " + nombre + " está reproduciendo sonido.");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Altavoz " + nombre + " ha dejado de reproducir sonido.");
    }
}
    
