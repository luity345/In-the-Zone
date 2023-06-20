/**
 * 'In the Zone'
 * In this file, we will be exploring how to write code in Kotlin.
 * 
 * We will be looking at a few different aspects, such as variables, 
 * conditionals, functions, classes, loops and more.
 */
 
// Variables
var count = 0
var name = "John"
var isHappy = true


// Conditionals
if(isHappy) {
    println("Hello, $name! It's great to see you happy!")
} else {
    println("Don't worry, $name! We will make you happy again!")
}


// Functions
fun increment(num: Int): Int {
    return num + 1
} 

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}


// Classes
class Person(val name: String, val age: Int) {
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old!")
    }
}

val john = Person("John", 20)
john.sayHello()


// Loops
while (count < 10) {
    println("Count is currently $count")
    count = increment(count)
}

for (i in 0 until 10) {
    println("The current number is $i")
}

// Strings
val fullName = "${name.capitalize()} Smith"
println("Hello, my name is $fullName")

// Collections
val list = listOf("Apple", "Banana", "Mango")
for (item in list) {
    println("I love $item!")
}

// Null Safety
val str: String? = null
val length = str?.length ?: 0
println("The length of the null string is $length")

// Extensions
fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

println("racecar".isPalindrome())


// Lambdas
val myLambda: (Int, Int) -> Int = { num1, num2 ->
    add(num1, num2)
}

println(myLambda(3, 4))

// Annotations
@Ann(name = "Ann")
class TestAnn

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class Ann(val name: String)