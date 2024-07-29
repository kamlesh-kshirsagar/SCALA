object rev{
  def WordsInReverse(str1: String): String = {
    val each_words = str1.split(" ");
    var revString = "";
    for (i <- 0 to each_words.length - 1) {
      val word = each_words(i);
      var reverseWord = "";
      for (j <- word.length - 1 to 0 by -1) {
        reverseWord = reverseWord + word.charAt(j);
      }
      revString = revString + reverseWord + " ";
    }
    revString;
  }

  def main(args: Array[String]): Unit = {
    val str1 = "welocme to coding";
    println("The given string is: " + str1);
    println("The new string after reversed the words: " + WordsInReverse(str1));
  }
}

