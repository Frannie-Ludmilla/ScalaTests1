/**
  * Created by francesca on 2/13/17.
  */
package test

object MainClass{

  case class Artist(firstName: String, surname:String)

  case class Album(name: String, year: Int, artist: Artist)

  def main(args: Array[String]){
    val album= new Album("Thriller",1981, new Artist("Michael","Jackson"))
    print(album)
  }

}
