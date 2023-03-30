fun main() {
    colors(listOf("red","blue","brown","pink","black","white","yellow","grey","green","purple"))

    tall(listOf(167,150,170,200))

    arrange()

    vehicles()
}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc
fun colors(items:List<String>):MutableList<String>{

    var new= mutableListOf<String>()

    items.forEachIndexed {
     item, items ->
        if (item % 2 ==0) {
      new.add(items)
        }
    }
    return new
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Height(var avg:Double,var total:Int)

fun tall(name:List<Int>):Height{

var average= name.average()
var total=name.sum()
    return Height(average,total)
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
open class Person(var name:String, var age:Int,var height:Int,var weight:Double)
    fun arrange(): List<Person>{
    var order1=Person("Abel",21,170,70.3)
    var order2=Person("Anna",90,150,65.0)
    var order3=Person("Alice",15,160,40.5)

        var order= listOf<Person>(order1,order2,order3)
        var person=order.sortedByDescending{p -> p.age}

    return person
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
class newPerson(name:String, age:Int,height:Int,weight:Double,gender:String,tribe:String):Person(name,age,height,weight)

fun attributes(attribute:listOf){

}

// Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Int)
fun vehicles():Double{
    var machine1=Car("KDD 300",2)
    var machine2=Car("KDA 4550",6)
    var machine3=Car("KAA 3100",3)
    var machine4=Car("KBA 4550",1)

    var machine= listOf<Car>(machine1,machine2,machine3,machine4)

    var add=0.0
    for (m in machine){
        add+=m.mileage
    }
    var avg=add/machine.size

    return avg
}






