object String 
{
	def main(args: Array[String]): Unit = 
	{
		val str = "Hey There its Pratik";
		val lowerStr = str.toLowerCase();
		val uppercase =str.count(_.isUpper)

		// Display the two strings for comparison.
		println("Original String: " + str);
		println("uppercase letters in String: " + uppercase);
		println("String in lowercase: " + lowerStr);
	}
}

