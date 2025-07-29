//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    println("Hello, " )
    val a1 =10;
    //기본 when
    when(a1){
        1 -> println("a1은 1입니다.")
    2->{
        println("a1은 1입니다.")
        println("수행될 코드")
    }
    3->println("a1은 3입니다.")
        else -> println("a1은 1,2,3이 아닙니다..")
    }

    val a2 =3;
    when(a2){
        1,2-> println("a1은 1이기ㅣㅓ나 2입니다.")
        3,4-> println("a1은 3이거나 4입니다.")
        5,6-> println("a1은 5이거나 6입니다.")
        7,8-> println("a1은 1,2,3,4,5,6이 아닙니다.")

    }

    val a5=4
    when(a5){
        in 1 .. 3 -> println("a5는 1~3사이에 숫자입니다.")
        in 4 .. 6 -> println("a5는 4~6사이에 숫자입니다.")
        else -> println("a5는 1~6사이의 숫자가 아닙니다.")
    }

    val a6 = 10
    val a7 = when(a6){
        5-> "a6은 5입니다."
        10->{
            println("10 부분이 수행되었습니다.")
            "a6은 10 입니다."
        }20-> "a6은 20입니다."
        else -> "a6은 5,10,20이 아닙니다."

    }
    println("rs : ${setValue3(3)}")

}

fun setValue(a1:Int) :String{
    if(a1 ==1){
        return "문자열"
    }
    else if(a1==2){
        return "문자열2"
    }
    else{
        return "그 외의 문자열 "
    }
}

fun setValue3(a1:Int) = when(a1){
    1-> "문자열 1"
    2-> "문자열 2"
    else-> "그 외 문자열 "

}