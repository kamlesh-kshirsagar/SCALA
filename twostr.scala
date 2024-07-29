object Strr {

  def test(str1: String, str2: String): String = {
    if (str1.length == str2.length)
      return str1 + str2;
    if (str1.length > str2.length) {
      var diff = str1.length - str2.length;
      str1.substring(diff, str1.length) + str2;
    } else {
      var diff = str2.length - str1.length;
      str1 + str2.substring(diff, str2.length);
    }
  }
  def main(args: Array[String]): Unit = {
    var str1 = "hello";
    var str2 = "guys";
    println("The given strings is: " + str1 + " and " + str2);
    println("The new string is: " + test(str1, str2));
    
  }    
}
