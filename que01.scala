object Area extends App{

    def AreaOfDisk(r:Double):Double = r * r * math.Pi

    print("Enter the value of r: ")
    var r:Double = scala.io.StdIn.readDouble()

    print("Area of the disk: " + AreaOfDisk(r))
}