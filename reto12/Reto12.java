/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto12;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Random;

public class Reto12 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int numeroKm;
        int nivelVidaCaballo = 0;
        int nivelVidaUsuario = 0;
        int opcion = 0;
        int kmrecorrido = 0;
        System.out.println("Ingrese cantidad de kilometros a recorrer: ");
        numeroKm = Integer.parseInt(entrada.readLine());

        Random aleatorio = new Random(System.currentTimeMillis());
        for (int kmActual = 1; kmActual <= numeroKm; kmActual++){
        System.out.println("El caballo esta en el km" + kmActual);

        if (kmrecorrido == 5) {
            opcion = aleatorio.nextInt(4) + 1;
            switch(opcion){
                case 1:
                    nivelVidaUsuario += 10;
                    System.out.println("---Encontramos un paquete de vida =)---");
                    break;
                case 2:
                    nivelVidaUsuario -= 5;
                    nivelVidaCaballo -= 5;
                    System.out.println("--- -5 puntos al usuario");
                    System.out.println("--- -5 puntos al caballo");
                    break;
                case 3:
                    nivelVidaCaballo +=10;
                    System.out.println("---Encontramos pasto =)---");
                    System.out.println("--- +10 puntos al cabllo---");
                    break;
                case 4:
                    nivelVidaCaballo  -= 5;
                    System.out.println("Encontramos una trampa =(---");
                    System.out.println("--- -5 puntos l caballo---");
                    break;
            }

            kmrecorrido = 0;
        } else {
            int opcion1 = aleatorio.nextInt(3) + 1;
            if(opcion1 ==1){
                nivelVidaUsuario += 10;
                System.out.println("---Encontramos un paquete de vida =)---");
                System.out.println("--- + 10 puntos el usuario---");
            }else if(opcion1 == 2){
                nivelVidaUsuario -= 5;
                nivelVidaCaballo -= 5;
                System.out.println("---Encontramos una bomba =(---");
                System.out.println("--- -5 puntos al usuario");
                System.out.println("--- -5 puntos al caballo");
            }
            
        }
        
        kmrecorrido++;
        
            if(nivelVidaUsuario == 0 || nivelVidaCaballo ==  0){
                System.out.println("---Se acabo el juego---");
                break;
                
        }

        }

    }
    }
