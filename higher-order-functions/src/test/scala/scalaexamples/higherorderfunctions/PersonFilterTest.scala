package scalaexamples.higherorderfunctions

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

// Comment in the tests below and make them run and pass

@RunWith(classOf[JUnit4])
class PersonFilterTest {

  val personFilter = new PersonFilter

  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)

  val persons = alf :: fredrik :: johannes :: Nil

  @Test
  def testAll {
    // Pass in a function that returns all persons (always true)
    // assertEquals(persons, personFilter.filterPersons(persons, error("")))
  }

  @Test
  def testNone {
    // Pass in a function that returns no persons (always false)
    // assertEquals(Nil, personFilter.filterPersons(persons, error("")))
  }

  @Test
  def testEmptyList {
    // Use the two functions from above to test personFilter on empty lists (Nil)
    // assertEquals(Nil, personFilter.filterPersons(Nil, error("")))
    // assertEquals(Nil, personFilter.filterPersons(Nil, error("")))
  }

  @Test
  def testOld {
    // Pass in a function that returns the persons over 18
    // assertEquals(List(alf, fredrik), personFilter.filterPersons(persons, error("")))
  }

  @Test
  def testYoung {
    // Pass in a function that returns the persons under 18
    // assertEquals(List(johannes), personFilter.filterPersons(persons, error("")))
  }

}
