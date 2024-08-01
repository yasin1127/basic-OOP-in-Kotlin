package class_04

import java.util.Scanner

fun main(args: Array<String>) {
    var x = Scanner(System.`in`)
    var n = x.nextFloat()

    var a=n/100
    println(a.toInt())
    var b=(n%100)/50
    println(b.toInt())
    var c=((n%100)%50)/20
    println(c.toInt())
    var d=(((n%100)%50)%20)/10
    println(d.toInt())
    var e=((((n%100)%50)%20)%10)/5
    println(e.toInt())
    var f=(((((n%100)%50)%20)%10)%5)/2
    println(f.toInt())
    var g=(((((n%100)%50)%20)%10)%5)/2
    println(g.toInt())//
    var h=((((((n%100)%50)%20)%10)%5)%2)/1.00
    println(h.toInt())
    var z=(((((((n%100)%50)%20)%10)%5)%2)%1.00)/0.50
    println(z.toInt())
    var i=((((((((n%100)%50)%20)%10)%5)%2)%1.00)%0.50)/0.25
    println(i.toInt())
    var j=(((((((((n%100)%50)%20)%10)%5)%2)%1.00)%0.50)%0.25)/0.10
    println(j.toInt())
    var k=((((((((((n%100)%50)%20)%10)%5)%2)%1.00)%0.50)%0.25)%0.10)/0.05
    println(k.toInt())
    var l=(((((((((((n%100)%50)%20)%10)%5)%2)%1.00)%0.50)%0.25)%0.10)%0.05)/0.01
    println(l.toInt())

}