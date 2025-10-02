import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosIfVideojuegos {

    public static void main(String[] args) {


        // ==============================

        // EJERCICIO 1 – Vida del personaje (Minecraft)

        // ==============================

        // Declara una variable con la vida de un jugador (entero entre 0 y 100).

        // Usa if/else para imprimir:

        //   Vida > 70 → "Tu personaje está fuerte 💪"

        //   Vida entre 30 y 70 → "Tu personaje está herido 😢"

        //   Vida < 30 → "Tu personaje está en peligro ⚠️"


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese el numero de la vida: ");
        int vida = scanner.nextInt();
        if (vida > 70) {
            System.out.println(" Tu personaje ta fuelte manin ");
        } else if (vida >= 30 && vida <= 70) {
            System.out.println(" Cógete unas venditas broski ");
        } else if (vida > 30) {
            System.out.println(" Tu personaje peligra! ⚠ ");
        }


        // ==============================

        // EJERCICIO 2 – Elección de ataque (Pokémon)

        // ==============================

        // Declara una variable con el tipo de ataque: "fuego", "agua" o "planta".

        // Con if/else if/else imprime:

        //   Si es fuego → "¡Es super eficaz contra planta!"

        //   Si es agua → "¡Es super eficaz contra fuego!"

        //   Si es planta → "¡Es super eficaz contra agua!"

        //   Otro caso → "Tipo de ataque no reconocido"

        String scaner = scanner.nextLine();
        System.out.print(" Qué tipo de ataque usas? (fuego, agua, planta) : ");
        String ataque = scanner.nextLine();
        if (ataque.equals("fuego")) {
            System.out.println(" es super eficaz contra planta! ");
        } else if (ataque.equals("agua")) {
            System.out.println(" es super eficaz contra fuego! ");
        } else if (ataque.equals("planta")) {
            System.out.println(" es super eficaz contra agua ! ");
        }


        // ==============================

        // EJERCICIO 3 – Tienda de objetos (Fortnite)

        // ==============================

        // Declara una variable con el número de V-Bucks.

        // Con if imprime qué puede comprar el jugador:

        //   Si tiene 2000 o más → "Puedes comprar una skin legendaria"

        //   Si tiene 1200 o más → "Puedes comprar una skin épica"

        //   Si tiene 800 o más → "Puedes comprar una skin rara"

        //   Si tiene menos de 800 → "No tienes suficientes V-Bucks"

        int vBucks = 2000;
        if (vBucks >= 2000) {
            System.out.println(" Puedes comprarte una skin legendaria makina! ");
        }
        if (vBucks >= 1200) {
            System.out.println(" Puedes comprar una skin épica brotheeer! ");
        }
        if (vBucks >= 800) {
            System.out.println(" Puedes comprar una skin rarilla eh! ");
        }
        if (vBucks < 800) {
            System.out.println(" Lo siento, no tienes suficientes V-Bucks... ");
        }


        // ==============================

        // EJERCICIO 4 – Clasificación de rango (League of Legends)

        // ==============================

        // Declara una variable con los puntos de ranking.

        // Con if imprime el rango:

        //   0–999   → "Bronce"

        //   1000–1999 → "Plata"

        //   2000–2999 → "Oro"

        //   3000 o más → "Platino"


        // ==============================

        // EJERCICIO 5 – Evento especial (Minecraft)

        // ==============================

        // Declara una variable "hora" (entero de 0 a 23).

        // Con if imprime:

        //   Entre 6 y 11 → "Es de mañana, los aldeanos están activos ☀️"

        //   Entre 12 y 18 → "Es de tarde, hora de explorar 🔍"

        //   Entre 19 y 23 → "Es de noche, cuidado con los mobs 🌙"

        //   Entre 0 y 5 → "Madrugada, mejor dormir 😴"


        // ==============================

        // EJERCICIO 6 – Reto final: Sistema de logros (multijuego)

        // ==============================

        // Declara tres variables:

        //   - kills (número de enemigos derrotados)

        //   - muertes (veces que ha muerto el jugador)

        //   - tiempo (minutos jugados)

        //

        // Crea condiciones con if para asignar logros:

        //   - Si kills >= 10 → "Logro: Cazador experto 🏹"

        //   - Si muertes == 0 → "Logro: Intocable 👑"

        //   - Si tiempo > 60 → "Logro: Maratón gamer ⏱️"

        //   - Si kills < muertes → "Logro: Necesita entrenar 🐣"

        //


        // Extensión opcional:

        //   - Combina condiciones con && y || para logros más complejos.

        //   - Ejemplo: (kills > 20 && muertes < 5) → "Logro: PRO absoluto 🔥"
        int kills = 12;
        int muertes = 0;
    }
}




