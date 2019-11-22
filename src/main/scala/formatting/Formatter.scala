package formatting

trait Formatter[A] {
  def (a: A)fmt: String
}

given Formatter[Float] {
  def (a: Float) fmt: String = s"$a f"
}

given Formatter[Boolean] {
  def (a: Boolean) fmt: String = a.toString.toUpperCase
}

given [T](given Formatter[T]): Formatter[List[T]] {
  def (l: List[T]) fmt: String = 
    l.map(e => summon[Formatter[T]].fmt(e)).mkString(" :: ")
}