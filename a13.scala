object fact 
	{
		def main(args: Array[String])
		{
			var a=4
			var fact=1
			var i=1

			while(i <=a )
			//for(i <- 1 to  a)
			{
				fact= fact*i;
				i =i+1
			}
			printf("factorial of no.%d is: %d",a,fact)
		}
	}
