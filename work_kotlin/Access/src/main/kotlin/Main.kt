//접근 제한자

fun main() {
    val superObj = SuperClass()
    println(superObj.publicMember)
    //println(superObj.protectedMember) 오류 발생
    println(superObj.internalMember)

    val subObj = SubClass()
    subObj.showMember()
}

open class SuperClass{
    private val privateMember = 100
    public val publicMember = 100
    protected val protectedMember = 100
    internal val internalMember = 100
}

class SubClass : SuperClass(){
    fun showMember(){
        //privateMember는 상속 받아도 접근 불가
        //println(privateMember)

        println("publicMember: $publicMember")
        println("protectedMember: $protectedMember")
        println("internalMember: $internalMember")
    }
}