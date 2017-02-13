/**
  * Created by francesca on 2/13/17.
  */
package test

import org.scalatest._
import test.MainClass._

class TestScalaFunSpec extends FunSpec with Matchers with GivenWhenThen{
  describe("An album"){
    it("can add an artist", Tag("construction")){
      info("Testing creation of Album")
      val album= new Album("Thriller",1981, new Artist("Michael","Jackson"))
      album.artist.firstName should be ("Michael")
    }

    it("should have lenght") {
      (1 to 9) should have length (9)
    }

    it("should not accept sth"){pending}

    ignore("strange test"){
      (1 to 9) should have length (8)
    }
  }
}
