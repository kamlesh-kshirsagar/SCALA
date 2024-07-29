object Scala_String {

  def checkForRotation(str1: String, str2: String): Boolean = {
    return (str1.length == str2.length) && ((str1 + str1).indexOf(str2) != -1);
  }

  def main(args: Array[String]): Unit = {
    val str1 = "ABCD";
    val str2 = "BCDA";
    println("The given strings are: " + str1 + "  and  " + str2);
   
    if (checkForRotation(str1, str2)) {
   
      println("\nStrings are rotations of each other");
    } 
    else {

      printf("\nStrings are not rotations of each other");
    }
  }
}
