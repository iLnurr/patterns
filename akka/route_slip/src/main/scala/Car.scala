object CarOptions extends Enumeration {
  val CAR_COLOR_GRAY, NAVIGATION, PARKING_SENSORS = Value
}
case class Order(options: Seq[CarOptions.Value])
case class Car(color: String = "",
               hasNavigation: Boolean = false,
               hasParkingSensors: Boolean = false)