
object char
{
	def main(args: Array[String])
	{
	        print("Enter a String: ")
	        var str = scala.io.StdIn.readLine()
	        print("Enter a character to count its occurrences: ")
	        var char = scala.io.StdIn.readChar()

	        var count = 0
	        for(i <- 0 until str.length)
	         {
	            if(char == str(i))
	            count += 1
	          }

		println("Number of times character occurred in given string: " + count)

	}
}

