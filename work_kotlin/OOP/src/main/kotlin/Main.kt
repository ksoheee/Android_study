//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    //객체를 생성한다.
    //객체 생성시 new 키워드는 사용하지 않는다.
    val obj1 = TestClass1()
    println("obj1 $obj1")

    val obj2 = TestClass2()
    obj2.a2 = 200
    println("obj2.a1 ${obj2.a1}")
    println("obj2.a2 ${obj2.a2}")

    obj2.testMethod1()
    obj2.testMethod2()
}

//클래스를 정의한다.
//class 클래스 이름

class TestClass1

//객체가 가지는 변수를 멤버변수라고 한다.
//객체가 가지는 함수를 멤버메서드라고 한다.
class TestClass2{
    //멤버 변수
    val a1 = 0 //변경 불가
    var a2 = 0

    //멤버 메서드
    fun testMethod1(){
        println("testMethod1")
    }
    fun testMethod2(){
        println("testMethod2")
    }
}

