package tutorial07

object q02 {
  def main(args: Array[String]) {
    def calculateSquare(l:List[Int]):List[AnyVal] = {
      var newl:List[AnyVal] = l.map( (x:Int) => x*x)
      return newl
    }
    println(calculateSquare(List(1,2,3,4,5)))
  }
}