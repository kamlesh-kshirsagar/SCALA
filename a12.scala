object secondmax {  
    def main(args: Array[String]) {  
        var IntArray = Array(10,40,20,30)
        var count:Int=0
        var large1:Int=0
        var large2:Int=0
        
        large1=IntArray(0)
        while(count<IntArray.size)
        {
            if (large1 < IntArray(count)) 
            {
                large2 = large1
                large1 = IntArray(count)
            }
            else if( large2 < IntArray(count) ) 
            {
                large2 =  IntArray(count);
            }
            count=count+1
        }
        printf("Second largest element is: %d\n",large2)
    }
} 
