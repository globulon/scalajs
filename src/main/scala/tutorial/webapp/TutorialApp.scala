package tutorial.webapp
import org.querki.jquery._

object TutorialApp extends Application {

  def main(args: Array[String]): Unit = {
    $(() ⇒ boot())
    ()
  }
}