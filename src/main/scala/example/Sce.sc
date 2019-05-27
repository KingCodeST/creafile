// 10 + 3 * 5/2

// "your answer "+ res0

// Char \\

//val num13 =1.423
//
//val num12=1.9844
//
//
//num12 + num13
//

//num13"5+4 ="


import scala.math._

//ceil(5.45)
//


//hypot(2,2)

//log10(1000)


//(random * (11+1))


/// conditional



///logical

//var age = 6
//
//
//
//val canVote =if(age>=18) "yes" else "no"
//
//if((age >= 5) && (age <= 6))
//  {
//    println("Go to kindergarten")
//  }else if((age>6)&& (age<=7))
//  {
//    println("Go to grade1")
//  }else{
//  println("Go to grade "+ (age -5))
//}



//
//    var i =0
//
//for(i <- 1 to 10)
//  println(i)
//
//


//var i =0
//
// val randLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//
//for(i <- 0 until randLetters.length)
//  println(randLetters(i))
//

//
//val aList =List(1,2,3,4,5)
//for(i <- aList)
//{
//  println("List Items "+ i)
//}
//
//var evenList =for {i <- 1 to 20
//                   if (1 % 2) == 0
//                    } yield  i
//
//    for(i <- evenList)
//      println(i)


//for(i <- 1 to 5; j <- 6 to 10)
//{
//  println("i :"+ i)
//  println("j :"+ j)
//}
//
//def printPrimes(): Unit ={
//  val primeList =List(1,2,3,5,7,11)
//  for(i<-primeList)
//    {
//      if(i==11)
//        {
//          return
//        }
//      if(i !=1){
//        println(i)
//      }
//
//    }
//
//}
//
//
//printPrimes
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

//
//  var numberGues =0
//
//do{
//    print("Guess a number")
//  numberGues =readLine.toInt
//
//}while(numberGues !=15)
//
//printf("You guessd the Secret number %d \n",15)


var name ="Derek "
val age =39
val weight =175.5

println(s"Hello $name")

println(f"I am ${age +1} and weigh $weight %.2f")

printf("")