//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    println("Hello, " )
    test1()
    test2(3,11.12)
    test2(a1=4,a2=15.12)
    val k1 = 200
    val k2 = 22.22
    test2(k1,k2)
    test3()
    test3(3000,3.33)
    test3(a2=4.44)
    var r1 =test4(100,200)
    println("r1: $r1")
    println(test4(1,2))
    test5()
    test6()
    test6(50)
    test6(100,200)
    test7()
}

//기본 함수
fun test1() {
    println("test1 호출")
    println("-----------------")
}

//매개변수를 가지고 있는 함수
fun test2(a1: Int, a2:Double) {
    println("test2 호출")
    println("a1: $a1")
    println("a2: $a2")
    println("-----------------")
}
//기본값이 있는 매개변수
fun test3(a1: Int=0, a2:Double=0.0) {
    println("test3 호출")
    println("a1: $a1")
    println("a2: $a2")
    println("-----------------")
}

//반환값이 있을 경우 return문을 사용한다.
fun test4(a1: Int, a2:Int) :Int {
    println("test4 호출")
    println("a1: $a1")
    println("a2: $a2")
    println("-----------------")
    return a1+a2
}
fun test5(): Unit {
    println("test5 호출")
    println("-----------------")
}

//함수이름은 같지만 매개변수 타입과 개수를 다르게 선언할 수 있다
fun test6(){
    println("test6 호출-매개변수 없음")
    println("-----------------")

}
fun test6(a1:Int){
    println("test6 호출-매개변수 한개 (a1:$a1)")
    println("-----------------")
}

fun test6(a1:Int, a2:Int){
    println("test6 호출-매개변수 두개 (a1:$a1,a2:$a2) ")
    println("-----------------")
}

//매개변수 한개인 타입이 다른 test6
fun test6(a1: Double){
    println("test6 호출-매개변수 한개 (a1:$a1)")
    println("-----------------")
}
//지역함수
//함수를 선언 함수 내부에서만 사용 가능하다
fun test7(){
    println("test7 호출")

    fun test8(){
        println("test8 호출")
    }
    test8()
    println("-----------------")
}
