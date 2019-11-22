import formatting.{given, _}
import formatting.Formatter

object Main {

  def main(args: Array[String]): Unit =  {
   println(List[Float](1f, 2f).fmt) 
   println(2f.fmt) 

   println(List[Boolean](true, false).fmt) 
   println(true.fmt) 
  }
}
