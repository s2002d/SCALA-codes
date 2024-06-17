object Time{
def main(args:Array[String]):Unit={
val time=easy(2.0)+tempo(3.0)+easy(2.0)
println(time)
}
def easy(d:Double)={
8*d
}
def tempo(d:Double)={
7*d
}
}