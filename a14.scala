object average 
        {
                def main(args: Array[String])
		{
			var sum=0
			var avg=0
			var count=0
			
			printf("Enter First Number:-")
			var n1=scala.io.StdIn.readInt()
			
			printf("Enter Sceond Number:-")
			var n2=scala.io.StdIn.readInt()

			for(i <- n1 to n2 )
			{
				sum=sum+i
				count=count+1
			}
			
		
			avg=sum/count
			println(s"average of n1 and n2 is: $avg")
		}
	}
