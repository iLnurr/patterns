import akka.actor.{Actor, ActorRef}

class PaintCar(color: String) extends Actor with RouteSlip {
  def receive = {
    case RouteSlipMessage(routeSlip, car: Car) => {
      sendMessageToNextTask(routeSlip,
        car.copy(color = color))
    }
  }
}
class AddNavigation() extends Actor with RouteSlip {
  def receive = {
    case RouteSlipMessage(routeSlip, car: Car) => {
      sendMessageToNextTask(routeSlip,
        car.copy(hasNavigation = true))
    }
  }
}
class AddParkingSensors() extends Actor with RouteSlip {
  def receive = {
    case RouteSlipMessage(routeSlip, car: Car) => {
      sendMessageToNextTask(routeSlip,
        car.copy(hasParkingSensors = true))
    }
  }
}





case class RouteSlipMessage(routeSlip: Seq[ActorRef],
                            message: AnyRef)
trait RouteSlip {
  def sendMessageToNextTask(routeSlip: Seq[ActorRef],
                            message: AnyRef): Unit = {
    val nextTask = routeSlip.head
    val newSlip = routeSlip.tail
    if (newSlip.isEmpty) {
      nextTask ! message
    } else {
      nextTask ! RouteSlipMessage(
        routeSlip = newSlip,
        message = message)
    } }
}
