package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");


        /* Encender la TV
        Subir un canal
        Bajar un canal*/

        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channel=0;
        redRemote.channelDown();

        /*Subir el volumen
        Bajar el volumen*/

        redRemote.volumeUp();
        redRemote.volumeDown();

        //  Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume=0;
        redRemote.volumeDown();

        // Obtener el color del mando a distancia y mostrarlo por pantalla

        System.out.println("Color: "+redRemote.getColor());

        //     Apagar la TV

        redRemote.turnOff();




    }

}