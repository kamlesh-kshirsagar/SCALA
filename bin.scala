object NoConv
{
	def binaryCon(n : Int)
	{

	var i=0
	var num=n
	var A=new Array[Int](10)

	while(num>0)
	{
		A(i)=num%2
		i=i+1
		num=num/2
	}
	printf("\n binary equivalent= " )
	for(j<-i-1 to 0 by -1)
		print(A(j))
	}

	def octalCon(n:Int)
	{
	var i=0
	var num=n
	var A=new Array[Int](10)
	while(num>0)
		{
			A(i)=num%8
			i=i+1
			num=num/8

		}
	printf(" Octal equivalent=" )

	for(j<-i-1 to 0 by -1)
		print(A(j))

	}

	def main(args: Array[String])=
	{
	print("enter number:")
	var n=scala.io.StdIn.readInt()

	//println("%d".format(n))

	octalCon(n)

	binaryCon(n)
	}

}
