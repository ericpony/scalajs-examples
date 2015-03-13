package tutorial.webapp

import scala.scalajs.js.JSApp

import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main = jQuery(setupUI _)

  def setupUI = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}
