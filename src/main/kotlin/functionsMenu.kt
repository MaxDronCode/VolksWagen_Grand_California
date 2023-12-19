import org.example.GREEN_BOLD_BRIGHT
import org.example.GREEN_BRIGHT
import org.example.GREEN_UNDERLINED
import org.example.RESET

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Funció que mostra un menu amb la benvinguda i les opcions principals del programa a escollir
 */
fun menuWelcome(){
    println("                 .________________._____\n" +
            "               /~~~~~~~//~~~~~~~~//~~~~~|\n" +
            "              /       //        //      |\n" +
            "             /_\\.___ //__ \\.___//_______|\n" +
            "   O       [%%%%%%%%%] O=====] |[_______]\n" +
            "  __\\__ ===========___/_ --------}==========================\n" +
            " |**   |/|(@ ## (@|   **|        |     []|                  |)\n" +
            " |     |/| ###### |     | _____  |       |         ___      |\n" +
            " |_____|/|_######_|____ |/_  _  \\}_______|________/_  _\\    |.\n" +
            "|________________________|     \\ \\_______________//     \\\\ /\n" +
            "  |%{  @  }            |%{  @  }                |%{  @  }\n" +
            "   \\%\\   /              \\%\\   /                  \\%\\   /\n" +
            "     ~~~~                 ~~~~                     ~~~~")
    println(GREEN_BOLD_BRIGHT + "Benvingut a la app que calcula el preu de la seva VW" + RESET)
    println(GREEN_BRIGHT + "Introdueixi el model del que disposa:" + RESET)
    println(GREEN_UNDERLINED + "1 - Volkswagen Grand California" + RESET)
    println(GREEN_UNDERLINED + "2 - Volkswagen Camper Full Equip" + RESET)
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Menu que pregunta al usuari sobre el kilometratge dels pneumàtics i recull la dada cridant la funció readInt()
 * @return Retorna els kilometres que tenen els pneumàtics en format Int
 */
fun menuWheels() : Int{
    println("Introdueixi: Quants km tenen els pneumàtics:")
    return readInt()
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Menu que pregunta al usuari el kilometratge del vehicle, i recull la dada amb la funció readInt()
 * @return Retorna el kilometratge en format Int
 */
fun menuKm(): Int {
    println("Introdueixi el kilometratge del seu vehicle:")
    return readInt()
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Menu final de l'aplicació. Rep per parametre el preu inicial de la furgo, el preu final, la devaluació produida pel kilometratge i per les rodes. S'encarrega de mostrar per pantalla el resultat de totes les operacions al usuari.
 */
fun menuResult(preuInicial:Int, finalPrice:Double, kmDevaluation: Double, wheelsDevaluation: Int){
    println()
    println(GREEN_BOLD_BRIGHT + "Li informem que donades les característiques del seu vehicle el preu es: " + RESET)
    println("Preu inicial: ${preuInicial.toDouble()}")
    println("Preu final: $finalPrice")
    println()
    println(GREEN_BRIGHT + "DESGLOSE:" + RESET)
    println("Preu inicial: ${preuInicial.toDouble()}")
    println("Devaluació per kilometratge: $kmDevaluation")
    println("Devaluació per desgast de pneumàtics : $wheelsDevaluation")
    println("Preu final: $finalPrice")
    println()
    println("Gràcies per sol·licitar els nostres serveis")
    println("Arreveure!")
}