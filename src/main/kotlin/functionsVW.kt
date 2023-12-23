import org.example.GREEN_UNDERLINED
import org.example.RED_BACKGROUND_BRIGHT
import org.example.RESET
import org.example.YELLOW_BOLD_BRIGHT
import java.util.Scanner

val scan = Scanner(System.`in`)


/**
 * @author Max Dron
 * @param Aquesta funció al ser cridada, llegeix per teclat un numero enter per teclat i valida que es un enter i positiu.
 * @return El retorn es un número enter i positiu.
 * @version Versió 1.0 - 23/12/19
 */
fun readInt() : Int{
    // declaracio de variables locals
    var valueOk = false // variable semafor
    var value = 0 // variable de retorn
    // validacio de dades
    do {
        if (scan.hasNextInt()){
            value = scan.nextInt()
            scan.nextLine()
            valueOk = true
            if (value < 0){
                println(YELLOW_BOLD_BRIGHT + "Introdueixi un numero enter positiu, moltes gràcies." + RESET)
                valueOk = false
            }

        }else{
            println(RED_BACKGROUND_BRIGHT + "ERROR: La dada introduida ha de ser un numero enter." + RESET)
            scan.nextLine()
        }
    }while (!valueOk)
    return value
}
/**
 * @author Max Dron
 * @param Aquesta funció rep per paràmetre la opció del menú que ha seleccionat l'usuari i valida que hagi seleccionat una opció correcta ( 1 o 2 ).
 * @return Retorna la opció de l'usuari validada.
 * @version Versió 1.0 - 23/12/19
 */
fun validationUserOption(userOption: Int): Int{
    var userOptionValidated:Int = userOption
    do {
        if (userOptionValidated !in 1..2){
            println("Les opcions son: ")
            println(GREEN_UNDERLINED + "1 - Volkswagen Grand California" + RESET)
            println(GREEN_UNDERLINED + "2 - Volkswagen Camper Full Equip" + RESET)
            println("Introdueixi el model del que disposa:")
            userOptionValidated = readInt()
        }

    }while (userOptionValidated !in 1..2)
    return userOptionValidated
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep per parametre la opció del menú escollida per l'usuari i assigna preu al seu vehicle en funció d'aquesta.
 * @return Retorna el preu del vehicle
 */
fun assignPriceToVehicle(userOption:Int): Int{
    var returnPrice = 73490
    if (userOption == 2)
        returnPrice += 20000
    return returnPrice
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep un double i el redondeja a 2 decimals
 * @return Retorna el double redondejat
 */
fun round(numero: Double): Double {
    return (Math.round(numero * 100) / 100).toDouble()
}






