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


//var name ="Derek "
//val age =39
//val weight =175.5
//
//println(s"Hello $name")
//
//println(f"I am ${age +1} and weigh $weight %.2f")
//
//printf("")

//object ScalaTutorial{
//  def main(args: Array[String])
//  {
//    var  randSent  ="I saw a dragon fly by"
//
//    println("3rd index : "+randSent(3))
//
//  }
//
//}
//


// val name ="Siphokuhle"
// // val age =24
// // val weight =175.5

// // println(s"Hello $name")

// // println(f"I am ${age +1} and weigh $weight%.2f")

// // printf(" '%20d' \n", 5)

// // printf(" '%-5d' \n ", 5)


// // object ScalaTutorial{
// //   def main(args: Array[String])
// //   {
// //     var randSent  ="I saw a dragon fly by"

// //     println("3rd index : "+randSent(3))

// //   }

// // }


//     var randSent  ="I saw a dragon fly by"

// //     println("String length : "+randSent.length)

// //print(randSent.concat(" and explosed"))

// // println("Are strings equals "+ "I saw a dragon fly by ".equals(randSent))

// // println("dragon starts at index "+ randSent.indexOf("dragon"))


// val randSentArray =randSent.toArray

// for(v <- randSentArray)
// println(v)

////functions


//def getSum(num1  : Int =1, num2 : Int =1): Int ={
//  num1 + num2
//}
//
//println("5 + 4 = "+getSum(5,6))
//
//def sayHi() : Unit =
//  {
//      println("Hi how are you")
//  }
//
//sayHi()
//

//def getSum(args : Int*) :Int =
//{
//  var sum : Int =0
//  for(num <- args){
//    sum += num
//  }
//
//  sum
//}
//
//
//println("Get Sum "+getSum(1,2,3,4,5,6))
//

//def factorial(num :BigInt) : BigInt ={
//
//  if(num <= 1)
//    1
//    else
//    num*factorial(num-1)
//
//}
//
//println("Factorial of 4=  "+ factorial(4))


/// Array buffer

//val favNums =new Array[Int](20)
//
//val friends =Array("Bob","Tom")
//
//friends(0)  = "Sue"
//
//println("Best friends "+ friends(0))
//
//val friends2 =ArrayBuffer[String]()
//
//friends2.insert(0,"Phil")
//
//friends2 += "Mark"
//
//friends2 ++= Array("Susy","Paul")
//
//friends2.insert(1,"Mike","Sally","Sam","Mary","Sue")
//
//friends2.remove(1,2)
//
//var friend : String =""
//
//for(friend <- friends2)
//  println(friend)
//
//for(j <- 0 to (favNums.length -1))
//{
//  favNums(j) =j
//  println(favNums(j))
//}
//
//
//val  favNumbsTime2 =
//    for(num <- favNums)yield 2 * num
//
//    favNumbsTime2.foreach(println)
//
//
//  var favNumbsDiv4 = for(num <- favNums if num % 4 == 0)yield num
//
//   favNumbsDiv4.foreach(println)
//
//
//    var multTable =Array.ofDim[Int](10,10)
//
//      for(i <- 0 to 9)
//        for(j <- 0 to 9)
//        {
//          multTable(i)(j) =i *j
//        }
//
//
//for(i <- 0 to 9)
//  for(j <- 0 to 9)
//  {
//   printf("%d : %d = %d\n",i, j, multTable(i)(j))
//  }
//
//
//  println("Sum : "+favNums.sum)
//  println("Min : "+favNums.min)
//  println("max : "+favNums.max)
//
//
//  val  sortedNums =favNums.sortWith(_>_)
//
//  println(sortedNums.deep.mkString(","))

///Maps

//val employees =Map("Manager" -> "Bob Smith","Secretary" -> "Sue Brown")
//
//
//if(employees.contains("Manager"))
//  printf("Manager :%s\n",employees("Manager"))
//
//
//val customers =collection.mutable.Map(100 ->"Paul", 101 -> "Sally Smith")
//
//
//printf("Cust 1 : %s\n", customers(100))
//
//
//customers(100) ="Tom Marks"
//
//customers(102) ="Megan Swift"
//
//for((k,v) <- customers)
//  printf("%d : %s\n",k,v)


//tuple
«