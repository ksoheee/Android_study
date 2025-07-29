//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val dog = Dog("웅이",14, "푸들")
    val cat = Cat("루",13,"검정")

    dog.showDogInfo()
    cat.showCatInfo()

    //println(dog.name)
    //println(cat.color)
    println(dog.breed)
}

open class Animal(protected var name: String,internal var age: Int){

    fun info(name: String,age: Int){
        println("name: $name, age: $age")
    }
}

class Dog(name:String,age:Int,public val breed: String): Animal(name,age){

    fun showDogInfo(){
        println("dog: name: $name, age: $age, breed: $breed")
    }
}
class Cat(name:String,age:Int,private val color: String): Animal(name,age){
    fun showCatInfo(){
        println("cat: name: $name, age: $age, color: $color")
    }
}