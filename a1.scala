object NumberCheck {
  def main(args: Array[String]): Unit = {
      val n: Int = 5  

    if (n > 0) {
      println(s"The number $n is positive.")
    } 
    else if (n < 0)
    {
      println(s"The number $n is negative.")
    } 
    else 
    {
      println("The number is zero.")
    }
  }
}
