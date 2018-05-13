package tutorial.webapp
import org.querki.jquery._

object TutorialApp {
  private def addClickedMessage(): JQuery = $("body").append("<p>You clicked me !</p>")

  private def setupUI(): JQuery = {
    $("body").append("<p>Hello World</p>")
    $("#click-me-button").click(() ⇒ addClickedMessage())
  }

  def main(args: Array[String]): Unit = {
    $(() ⇒ setupUI())
    ()
  }
}