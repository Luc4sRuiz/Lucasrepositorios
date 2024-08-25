
package TP6Nº1;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        // Crear la red IoT
        RADIOTT redIoT = new RADIOTT();

        // Crear dispositivos
        SENSOR sensor = new SENSOR("Sensor Temperatura");
        CAMARA camara = new CAMARA("Cámara Seguridad");
        ALTAVOZ altavoz1 = new ALTAVOZ("Altavoz Música");

        // Agregar dispositivos a la red
        redIoT.agregarDispositivo(sensor);
        redIoT.agregarDispositivo(camara);
        redIoT.agregarDispositivo(altavoz1);

        // Encender y apagar dispositivos
        redIoT.encenderDispositivo("Sensor Temperatura");
        redIoT.encenderDispositivo("Cámara Seguridad");
        redIoT.apagarDispositivo("Cámara Seguridad");
        redIoT.encenderDispositivo("Altavoz Música");


    }
}
