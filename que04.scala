object coppy extends App {

    def coverPrice(n:Int):Double = n * 24.95

    def discount(n:Int):Double = coverPrice(n) * 0.4

    def finalCoverPrice(n:Int):Double = (coverPrice(n) - discount(n))

    def shippingCost(x:Int):Double = x match{
        case x if(x<=50) => x * 3
        case x if(x>50) => shippingCostAdditional(x-50)
    }

    def shippingCostAdditional(y:Int):Double = y match{
        case y => (50 *3) + (y * 0.75)
    }

    def TotalCost(num : Int) : Double = {

    finalCoverPrice(num) + shippingCost(num);
       
    }

    print("Enter number of copies: ")
    val num:Int = scala.io.StdIn.readInt()
    print("Total wholesale cost for " + num + " copies = Rs. " + TotalCost(num))


}