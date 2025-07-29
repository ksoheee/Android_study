//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val k1 = 1 .. 10 //배열,List 아님
    println(k1)
    println(k1.toList())

    val k2 = 1 until 10
    println(k2)
    println(k2.toList())

    val k3= 1 ..< 10
    println(k3)
    println(k3.toList())

    val k4= 1 ..< 10 step 2
    println(k4)
    println(k4.toList())

    val k5= 10 downTo  1 step 2
    println(k5)
    println(k5.toList())

    println("--------------------")

    //for문
    val a1 = 1 .. 10
    for(i in a1){
        println("i: $i")
    }
    for(i in 1 .. 10 step 2){
        println("i: $i")
    }

    //while
    var a5 = 0
    while(a5< 10){
        println("a5: $a5")
        a5++
    }
    //do while
    var a6 = 100
    do {
        println("a6: $a6")
        a6++
    }while(a6< 10)

    //return
    val r1= testFun1(50)
    println("r1: $r1")
    val r2= testFun2(70)
    println("r2: $r2")
    var r3 = testFun3(0)
    println("r3: $r3")
    var r4 = testFun3(10)
    println("r4: $r4")



    println("--------------------")
    //break
    for(item in 1 .. 10){
        if(item>5){
            break;
        }
        println("item: $item")

    }
    //continue
    for(item in 1 .. 10){
        if(item%2 ==0){
            continue;
        }
        println("item: $item")

    }

}

fun testFun1(a1: Int): Int{
    println("testFun1")
    //함수를 호출하는 쪽으로 돌아갈 때 return 뒤에 작성한 값을 가져간다.
    return a1+100

}

fun testFun2(a1: Int)= a1+100

fun testFun3(a1: Int) :Int {
    println("restFun3")
    if(a1 == 0){
        return -1
    }
    println("이 부분이 실행 될까요?")

    return 100/a1
}

fun testFun4(a1: Int) {
    println("restFun4")
    if(a1 == 0){
        return
    }
    return
}