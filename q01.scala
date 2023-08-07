package tutorial07

object q01 {
  def main(args: Array[String]) {
    def filterEvenNumbers(l:List[Int]):List[AnyVal] = {
      var newl:List[AnyVal] = l.filter( (x:Int) => x%2==0)
      return newl
    }
    println(filterEvenNumbers(List(1,2,3,4,5,6,7,8,9,10)))
  }
}