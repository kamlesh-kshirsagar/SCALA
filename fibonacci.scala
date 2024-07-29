object FibonacciSeries 
{
	def main(args: Array[String]): Unit = 
	{

		 fibonacci();
	}

	def fibonacci()
	{

		print("enter a limit:")
		var limit = scala.io.StdIn.readInt()
		var num1: Int = 0
		var num2: Int = 1

		print(s"Fibonacci Series upto $limit:\n")
 		print(s"$num1 $num2")

		var sum: Int = num1 + num2
		while (sum <= limit) 
		{
			print(" " + sum)
			num1 = num2
		        num2 = sum
		        sum = num1 + num2
		}
	}
}
