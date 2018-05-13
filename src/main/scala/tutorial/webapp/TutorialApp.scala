package tutorial.webapp
import org.scalajs.dom
import dom.document
import org.scalajs.dom.raw.Node

import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  private def appendPar(targetNode: dom.Node, text: String): Node = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Node = {
    appendPar(document.body, "You clicked the button!")
  }

  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World")
    ()
  }
}