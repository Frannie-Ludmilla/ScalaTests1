/**
  * Created by francesca on 2/13/17.
  */

package test

import org.scalatest._
import org.scalatest.GivenWhenThen
import test.MainClass._

class TestScalaFeatureSpec extends FeatureSpec with Matchers with GivenWhenThen{
  feature("An album should create an instance"){
    scenario("with a default constructor"){
      Given("An artist")
      val artist = new Artist("Michael","Jackson")

      When("album instantiated")
      val album = new Album("Thriller",1981, artist)

      Then("artist name should be Michael")
      album.artist.firstName should be ("Michael")

    }

  }
}
