//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {

    //11강 if문
    val a= 15

    //if문
    if( a== 10)println("10입니다")
    else println("10이 아닙니다")

    //if - else if
    if(a == 5) println("5입니다.")
    else if (a == 10 ) println("10입니다.")
    else println("다른 값입니다.")

    //조건 조합
    val b = 20
    if(a == 10 && b == 20) println("a는 10 b는 20")
    if(a == 10 || b == 20) println("a또는 b가 10")

    //값 저장 with if
    val msg = if( a == 10) "10 입니다." else "10이 아님"
    println(msg)

    //12강 when문
    val a1= 10
    //when
    val c = 2
    when (c) {
        1 -> println("1입니다.")
        2 -> println("2입니다.")
        else -> println("none")
    }

    //여러 조건 묶기
    val d=3
    when(d) {
        1,2 -> println(" 1 or 2")
        in 4 .. 6 -> println("4 ~ 6")
        else -> println("기타")
    }

    //when 결과를 변수에 저장
    val result = when (a1){
        5 -> "5입니다."
        10 -> "10입니다."
        else -> {
            //잘못된 반환
            //result = result + "asdk"
            "5도 10도 아님"
        }
    }
    val result2 = "결과"+result
    println(result2)


    //13강 반복문
    //for
    for(i in 1..5) print("$i ")
    println()
    for(i in 1  .. 5 step 2) print("$i ")
    println()
    for(i in 5 downTo 1 step 1) print("$i ")
    println()

    //while / do-while
    var x = 0
    while(x<3){
        println("while: $x")
        x++
    }

    var y = 0
    do {
        println("do-while: $y")
        y++
    }while(y<3)
}