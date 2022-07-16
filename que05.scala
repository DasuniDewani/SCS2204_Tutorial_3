
object RunningTime extends App{
    def easyPace(n:Float ):Float = n * 8

    def Tempo(m:Float ):Float  = m * 7

    def Total(x:Float,y:Float):Float = easyPace(x) + Tempo(y)

    print("Enter the distance going by easy pace : ")
    val d1:Float = scala.io.StdIn.readFloat()

    print("Enter the distance going by tempo pace : ")
    val d2:Float = scala.io.StdIn.readFloat()

    print("Total running time: " + Total(d1,d2))
    
}