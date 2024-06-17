object Area{
def main(args:Array[String]):Unit={
var r = 5.0
val area = Cal(r)
println(area)
}
def Cal(r:Double)={
val pi = 22/7
pi*r*r
}
}