package demo.helloworld {
package snippet {

import _root_.scala.xml.NodeSeq
import _root_.net.liftweb.util.Helpers
import Helpers._
import blah._

class HelloWorld {
  def howdy(in: NodeSeq): NodeSeq = {
     blah.yes.helloScala

    //Helpers.bind("b", in, "time" -> (new _root_.java.util.Date).toString)
    Helpers.bind("b", in, "time" -> blah.yes.helloScala)
  }
}

}
}
