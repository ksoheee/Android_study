//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val t1 = TestClass1()
    println()
    val t2 = TestClass2()
    println()
    val t3 = TestClass2(10,20)
    println()
    //매개변수가 있는 생성자만 있을 경우에는 매개변수 없는 생성자를 호출 할 수 x
    //val t4 = TestClass3()

    println("------------------------")
    val t5 = TestClass4(1234,2000)
    println("t5.a1: ${t5.a1}")
    println("t5.a2: ${t5.a2}")
    println("------------------------")
    val t6 = TestClass4()
    println("t6.a1: ${t6.a1}")
    println("t6.a2: ${t6.a2}")
    println("------------------------")
    val t7 = TestClass6(1,2,3)
    println("t7.a1: ${t7.a1}")
    println("t7.a2: ${t7.a2}")
    println("t7.a3: ${t7.a3}")

    val t8 = TestClass7(1,2,3)
    println("t8.a1: ${t8.a1}")
    println("t8.a2: ${t8.a2}")
    println("t8.a3: ${t8.a3}")
    println("------------------------")
    val t10 = TestClass8(90,70)
    println("t10.a1: ${t10.a1}")
    println("t10.a2: ${t10.a2}")
    println("t10.a3: ${t10.a3}")

    val t11 = TestClass8(90,70,600)
    println("t11.a1: ${t11.a1}")
    println("t11.a2: ${t11.a2}")
    println("t11.a3: ${t11.a3}")

}

class TestClass1 {
    init{
        println("TestClass1의 init 코드 블럭")
        println("객체가 생성될 때 가장 먼저! 자동으로 동작하는 부분입니다.")
        println("JAVA 코드로 변경될 때 모든 생성자 상단에 삽입되고 실행되는 코드입니다.")
    }
}

class TestClass2 {
    init{
        println("TestClass2의 init 코드 블럭")
    }

    //생성자
    constructor(){
        println("TestClass2의 매개변수가 없는 생성자")
    }
    constructor(a1: Int ,a2: Int){
        println("TestClass2의 매개변수가 있는 생성자")
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass3{
    constructor(a1: Int, a2:Int){
        println("TestClass3의 매개변수가 있는 생성자")
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass4{
    var a1 =0
    var a2 =0

    constructor(a1: Int, a2:Int){
        println("매개변수가 있는 생성자 호출")
        this.a1 = a1
        this.a2 = a2
    }
    //보조 생성자이며, 다른 생성자를 호출해서 초기화하는 형태
    constructor():this(100,200){  //(): this(100, 200) 부분은 자기 클래스의 다른 생성자(즉, constructor(a1: Int, a2: Int)를 호출) 하겠다는 의미
        println("매개 변수가 없는 생성자 호출")
    }
}

//주 생성자
class TestClass5{
    var a1 =0
    var a2 =0
    var a3 =0

    constructor(a1: Int, a2:Int, a3:Int){
        this.a1 = a1
        this.a2 = a2
        this.a3 = a3
    }
}

class TestClass6 constructor(var a1: Int, var a2: Int, var a3:Int)
class TestClass7 (var a1: Int, var a2: Int, var a3:Int)

class TestClass8(var a1:Int, var a2:Int){
    var a3: Int = 0

    //다른 생성자
    constructor(a1:Int, a2:Int,a3:Int):this(a1,a2){ //반드시 주 생성자를 호출해야 함
        this.a3=a3
    }
}