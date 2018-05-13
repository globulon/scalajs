package tutorial.webapp

import org.querki.jquery.{$, JQuery}

protected[webapp] trait SetupUI {
  private def addClickedMessage(): JQuery = $("body").append("<p>You clicked me!</p>")

  final protected def boot(): JQuery = {
    addButton
    sayHello
  }

  private def sayHello: JQuery = $("body").append("<p>Hello World</p>")

  private def addButton: JQuery = $("""<button id="click-me-button" type="button">Click me!</button>""")
    .click(() ⇒ addClickedMessage())
    .appendTo($("body"))
}