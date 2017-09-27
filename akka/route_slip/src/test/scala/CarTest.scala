import akka.actor.{ActorSystem, Props}
import akka.testkit.{TestKit, TestProbe}
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

import scala.concurrent.duration._

class CarTest extends TestKit(ActorSystem("CarTest"))
  with WordSpecLike with BeforeAndAfterAll {
  val timeout = 2 seconds

  protected override def afterAll(): Unit = {
    system.terminate()
  }

  "Car" should {
    "create default options" in {
      val probe = TestProbe()
      val router = system.actorOf(Props(new SlipRouter(probe.ref)), "SlipRouter1")
      val minimalOrder = new Order(Seq())
      router ! minimalOrder
      val defaultCar = new Car(
        color = "black",
        hasNavigation = false,
        hasParkingSensors = false)
      probe.expectMsg(defaultCar)
    }
  }

  "Car" should {
    "create with all options" in {
      val probe = TestProbe()
      val router = system.actorOf(Props(new SlipRouter(probe.ref)), "SlipRouter2")
      val fullOrder = new Order(Seq(
        CarOptions.CAR_COLOR_GRAY,
        CarOptions.NAVIGATION,
        CarOptions.PARKING_SENSORS))
      router ! fullOrder
      val carWithAllOptions = new Car(
        color = "gray",
        hasNavigation = true,
        hasParkingSensors = true)
      probe.expectMsg(carWithAllOptions)
    }
  }

}
