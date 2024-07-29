object arrstr
{
def main(args:Array[String])
{
var arrayData = Array("hey","itachi","danzo","fighting")
println("Enter a String to search: ")
var searchString =scala.io.StdIn.readLine()
for(data <- arrayData)
{
if(data.contains(searchString))
println(data)
}
}
}
