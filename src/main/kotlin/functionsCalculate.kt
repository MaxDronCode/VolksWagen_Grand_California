    /**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep per paràmetre els km, el preu de la furgo i la seva antiguitat, i calcula la devaluació del preu en funció dels km i la antiguitat.
 * @return Retorna la devaluació soferta en format Double
 */
fun calculateDevaluationPerKm(pKilometer:Int, pPrice:Int, antiguitatFurgo:Int) : Double{
    var localPrice = pPrice.toDouble()
    val devaluationPercentage: Double
    if (antiguitatFurgo > 10) devaluationPercentage = 0.0004
    else if (antiguitatFurgo in 6..10) devaluationPercentage = 0.0002
    else devaluationPercentage = 0.0001
    val precioConDevaluacion = localPrice - localPrice*(pKilometer * devaluationPercentage)/100

    return round(localPrice-precioConDevaluacion)
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep per parametre el kilometratge de les rodes en format Int i calcula la devlació soferta en funció d'això.
 * @return Retorna la devaluació del preu en format Int.
 */
fun calculateWheelsDevaluation(wheelsKm:Int):Int {
    var devaluation = 0
    if (wheelsKm in 5001..10000) devaluation = 200
    else if (wheelsKm > 10000) devaluation = 300
    return devaluation
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep per parametre el preu del vehicle, la devaluació soferta per desgast de pneumàtics, i la soferta per kilometratge. I calcula el preu final
 * @return Retorna el preu final de la furgo amb les devaluacions aplicades
 */
fun calculateFinalPrice(vehiclePrice:Int, kmDevaluation:Double, wheelsDevaluation:Int) : Double {
    return vehiclePrice-kmDevaluation-wheelsDevaluation
}

/**
 * @author Max Dron
 * @since 23/12/19
 * @param Rep per paràmetre el preu de la furgo i el booleà que indica si te portabicis o no, i recalcula el preu de la furgo en funció d'això.
 * @return Retorna el preu recalculat en format Double
 */
fun calculatePricesBasedOnBikeRack(vehiclePrice: Int, tePortabicis:Boolean): Int{
    return if (tePortabicis) vehiclePrice + 250
    else vehiclePrice
}