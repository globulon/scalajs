package tutorial.webapp

import utest._

import org.querki.jquery._

object ApplicationTest extends TestSuite with Application {

  // Initialize App
  boot()

  def tests = Tests {
    'HelloWorld - {
      assert($("p:contains('Hello World')").length == 1)
    }

    'ButtonClick - {
      withClickMe { button ⇒
        assert(messageCount == 0)
        Range(1,  5) foreach { c ⇒
          button.click()
          assert(messageCount == c)
        }
      }
    }
  }

  private def withClickMe[A](f: JQuery ⇒ A): A = {
    val button = $("button:contains('Click me!')")
    assert(button.length == 1)
    f(button)
  }

  private def messageCount: Int = $("p:contains('You clicked me!')").length
}