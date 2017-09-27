import akka.actor.{Actor, ActorRef, Props}

import scala.collection.mutable.ListBuffer

class SlipRouter(endStep: ActorRef) extends Actor with RouteSlip {
  val paintBlack = context.actorOf(Props(new PaintCar("black")), "paintBlack")
  val paintGray = context.actorOf(Props(new PaintCar("gray")), "paintGray")
  val addNavigation = context.actorOf(Props[AddNavigation], "navigation")
  val addParkingSensor = context.actorOf(Props[AddParkingSensors], "parkingSensors")
  def receive = {
    case order: Order => {
      val routeSlip = createRouteSlip(order.options)
      sendMessageToNextTask(routeSlip, new Car)
    }
  }

  private def createRouteSlip(options: Seq[CarOptions.Value]):
  Seq[ActorRef] = {
    val routeSlip = new ListBuffer[ActorRef]
    //car needs a color
    if (!options.contains(CarOptions.CAR_COLOR_GRAY)) {
      routeSlip += paintBlack
    }

    options.foreach {
      case CarOptions.CAR_COLOR_GRAY  => routeSlip += paintGray
      case CarOptions.NAVIGATION      => routeSlip += addNavigation
      case CarOptions.PARKING_SENSORS => routeSlip += addParkingSensor
      case other => // NOP
    }
    routeSlip += endStep
    routeSlip
  }
}