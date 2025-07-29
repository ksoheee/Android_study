
//상속
//하나의 클래스가 다른 클래스에 작성한 요소를 물려받아 자기 것처럼 사용하는 개념
//클래스를 통해 객체를 생성하면 클래스에 작성한 부분 뿐만 아니라 물려주는 쪽이 가지고 있는 부분도 있게 된다.
//물려 주는 쪽을 부모 클래스(super) 라고 부르고
//물려 받는 족을 자식 클래스(sub)라고 부른다.

//코틀린에서는 class를 정의하면 final 클래스로 정의되기 때문에 상속이 불가능하다
//부모클래스의 역할을 할 클래스는 open클래스로 정의해줘야 한다
//부모클래스 이름 뒤에 (매개변수..) 형태로 하여 부모 클래스의 생성자를 호출해야 한다.
fun main() {
    //SuperClass1을 상속받은 SubClass의 객체를 생성한다
    val s1= SubClass1()
    println("s1.superA1: ${s1.superA1}")
    println("s1.subA1: ${s1.subA1}")

    println("-------------------------------------")

    s1.superMethod1()
    s1.subMethod1()
    println("-------------------------------------")
    val s2= SubClass2()
    println("s2: $s2")
    val s3 = SubClass3()
    println("s3: $s3")
    println("-------------------------------------")
    val s4 = SubClass4()
    println("s4: $s4")
    val s5 = SubClass5()
    println("s5: $s5")
    println("-------------------------------------")
    val s6 = SubClass6()
    println("s6: $s6")
    val s7 = SubClass6(100)
    println("s7: $s7")

    println("-------------------------------------")
    val s8 = SubClass7()
    println("s8: $s8")

}

open class SuperClass1{
    var superA1 = 100

    fun superMethod1(){
        println("SuperClass1의 superMethod1")
        //부모클래스에서 자식 클래스를 사용하는 것은 불가능하다.
        //println("subA2: $subA2")
        //subMethod1()
    }
}

class SubClass1 : SuperClass1(){
    var subA1 = 200

    fun subMethod1(){
        println("SubClass1의 subMethod1")
        println("superA1: $superA1")
        superMethod1()
    }

}

//상속과 생성자의 관계
open class SuperClass2{
    constructor(){
        println("SuperClass2의 매개변수가 없는 생성자")
    }
    constructor(a1: Int){
        println("SuperClass2의 매개변수가 있는 생성자")
    }
}

//생성자를 정의하지 않은 자식 클래스
class SubClass2 : SuperClass2()
class SubClass3 : SuperClass2(15)

//주 생성자를 가지고 있는 부모 클래스
open class SuperClass4(val a1: Int){
    //매개변수가 없는 생성자<- 주 생성자가 있으면 항상 호출해야 함
    constructor():this(0){
        println("SuperClass4의 매개변수가 없는 생성자 호출")
    }
}

class SubClass4: SuperClass4(100)
class SubClass5: SuperClass4()

//부모 클래스
open class SuperClass6{
    constructor(){
        println("SuperClass6의 매개변수가 없는 생성자")
    }
    constructor(a1:Int){
        println("SuperClass6의 매개변수가 있는 생성자")
    }
}

class SubClass6 :SuperClass6{
    constructor(){
        println("SubClass6의 매개변수가 없는 생성자")
    }
    constructor(a1:Int){
        println("SubClass6의 매개변수가 있는 생성자")
    }

}

//주 생성자를 가지고 있는 부모클래스
open class SuperClass7(var a1:Int){
    constructor():this(0){
        println("SuperClass7의 매개변수가 없는 생성자")
    }
}
//부모클래스에 주 생성자가 정의되어 있다고 하더라도 부모의 생성자를 지정하지 않으면 무조건 매개변수가 없는 생성자를 호출한다.
class SubClass7: SuperClass7{
    constructor(){
        println("SubClass7의 매개변수가 없는 생성자")
    }
}