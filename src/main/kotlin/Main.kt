import org.example.readBoolean

fun main() {
    menuWelcome()

    val userOption = readInt()

    val userOptionValidated = validationUserOption(userOption)

    var vehiclePrice = assignPriceToVehicle(userOptionValidated)

    when (userOptionValidated){
        1 -> {
            println("Ha seleccionat la opció: Volkswagen Grand California")
            println("Preu inicial: $vehiclePrice")
        }
        2 -> {
            println("Ha seleccionat la opció: Volkswagen Camper Full Equip")
            println("Preu incial: $vehiclePrice")
        }
    }

    val carKm =  menuKm()

    val wheelsKm = menuWheels()

    val tePortabicis = readBoolean("La teva furgo te Portabicis? (true / false)", "Dada errònia introduida.")

    vehiclePrice = calculatePricesBasedOnBikeRack(vehiclePrice, tePortabicis)

    val antiguitatFurgo = org.example.readInt("Introdueixi la edat de la furgo:", "Resposta invàlida.", "Dada fora del llindar / Furgoneta massa antiga",0,30)

    val kmDevaluation = calculateDevaluationPerKm(carKm, vehiclePrice, antiguitatFurgo)

    val wheelsDevaluation = calculateWheelsDevaluation(wheelsKm)

    val finalPrice = calculateFinalPrice(vehiclePrice, kmDevaluation, wheelsDevaluation)

    menuResult(vehiclePrice, finalPrice, kmDevaluation, wheelsDevaluation)

}