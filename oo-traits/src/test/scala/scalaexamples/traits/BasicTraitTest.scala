package scalaexamples.traits

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import util.Sorting

@RunWith(classOf[JUnit4])
class BasicTraitTest {

  val list = List(new Element(10), new Element(2))

  @Test
  def mixInOrderedTraitTest {
    // Make the following compile (and run of course)
    // Hint implement the Ordered interface on the Element class

    // assertTrue((list(0) compare list(1)) > 0)
    // assertTrue(list(0) > list(1))
    // assertTrue(list(0) >= list(1))
    // assertFalse(list(0) < list(1))
    // assertFalse(list(0) <= list(1))
  }

}
