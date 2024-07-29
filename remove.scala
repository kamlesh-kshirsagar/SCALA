object remchar
{
	def main (args:Array[String])
	{
        	val string="demon slayer"
	        val position=8

        	if (position >= 0 && position < string.length)
		{
                	val modified=remove(string,position)
                	println(s"modified string :$modified")
        	}
        	else
		{
                	println("invalid position")
                }
	}

	def remove(input:String,position:Int):String=
	{
        	input.substring(0,position)+input.substring(position+1)
	}
}

