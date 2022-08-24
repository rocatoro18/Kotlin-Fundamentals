package rocatoro.kotlin_fundamentals

data class user(val id: Long, var name: String)

fun main(){
    val user1 = user(1,"Roberto")
    //val name = user1.name
    //println(name)
    user1.name = "Carlos"
    val user2 = user(1,"Carlos")

    println(user1.equals(user2))
    println(user1 == user2)
    println("user1 details: $user1")
    println("user2 details: $user2")
    val updateUser = user1.copy(name="Roberto Carlos")
    println(user1)
    println(updateUser)

    // component
    println(updateUser.component1()) // print 1
    println(updateUser.component2()) // print Roberto Carlos

    // deconstruction
    val (id,name) = updateUser
    println("id = $id name = $name")


}

