object Price{
def main(args:Array[String]):Unit={
var x = 60
val pr = total(x)
println(pr)
}
def cover(n:Double)={
24.95*n*0.4
}
def ship(n:Double)={
if(n>50)
{
(3*50)+0.75*(n-50)
}
else{
3*n}
}
def total(n:Double)={
cover(n)+ship(n)
}
}
