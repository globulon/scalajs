package tutorial.webapp

import org.querki.jquery.{$, JQuery}

protected[webapp] trait Setup {
  private def addClickedMessage(): JQuery = $("body").append("<p>You clicked me !</p>")

  final protected def setupUI(): JQuery = {
    $("body").append("<p>Hello World</p>")
    $("#click-me-button").click(() ⇒ addClickedMessage())
  }

}
