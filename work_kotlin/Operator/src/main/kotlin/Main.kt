//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    println("Hello!")

    val a1 = 10
    var a2 = 20

    //연산자 사용
    println(a1+a2)
    println(a1.plus(a2)) //위와 같은 값

    //최우선 연산자
    //"()": 수학과 같이 가장 먼저 계산할 부분이 있다면 "()"로 묶어
    var a3= 10+ 20 * 2
    var a4 = (10+20)+2

    println("a3: $a3")
    println("a4: $a4")

    //단항 연산자
    //연산자에 참여하는 값이 하나인 연산자
    //!(not) : 참을 거짓으로 거짓을 참으로 변경하는 연산자
    //조건식의 결과를 반대로 부정하고 싶을 때 사용한다.
    var a5 = true
    var a6 = !a5
    var a7 = !a6
    println("a5: $a5")
    println("a6: $a6")
    println("7: $a7")

    //부호 연산자
    var a8 = 100
    var a9 = +a8
    var a10 = -a8
    println("a9: $a9")
    println("a10: $a10")

    //증감 연산자
    //변수가 가지고 있는 값을 1증가하거나 2감소한다.
   //변수 앞에 있을 때와 뒤에 있을 때 수행이 다르다
   var a11 =100
   a11++
    println("a11: $a11")

    ++a11
    println("a11: $a11")

    a11--
    println("a11: $a11")

    --a11
    println("a11: $a11")

    //증감 연산자가 변수 앞에 있을 경우에/뒤에 있을 경우에
    var a12 = 100
    var a15 = ++a12
    var a16 = --a12

    println("a12: $a12, a15: $a15")
    println("a12: $a12, a16: $a16")

    var a17 = a12++
    var a18 = a12--

    println("a13: $a12, a17: $a17")
    println("a14: $a12, a18: $a18")



}