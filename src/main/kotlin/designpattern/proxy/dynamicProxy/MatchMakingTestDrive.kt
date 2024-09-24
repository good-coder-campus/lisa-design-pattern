package designpattern.proxy.dynamicProxy

import java.lang.reflect.Proxy

class MatchMakingTestDrive {
    val datingDb: HashMap<String, Person> = hashMapOf()

    companion object {
        fun main() {
            val test = MatchMakingTestDrive()
            test.drive()
        }
    }

    fun drive() {
        val joe = getPersonFromDatabase("Joe Javabean")
        val ownerProxy = getOwnerProxy(joe)
        println("Name is ${ownerProxy.getName()}")
        ownerProxy.setInterests("bowling, Go")
        println("Interests set from owner proxy")

        try {
            ownerProxy.setGeekRating(10)
        } catch (e: Exception) {
            println("Can't set rating from owner proxy")
        }

        println("Rating is ${ownerProxy.getGeekRating()}")

        val nonOwnerProxy = getNonOwnerProxy(joe)
        println("Name is ${nonOwnerProxy.getName()}")
        try {
            nonOwnerProxy.setInterests("bowling, Go")
        } catch (e: Exception) {
            println("Can't set interests from non owner proxy")
        }

        nonOwnerProxy.setGeekRating(3)
        println("Rating set from non owner proxy")
        println("Rating is ${nonOwnerProxy.getGeekRating()}")
    }

    fun getOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            NonOwnerInvocationHandler(person)
        ) as Person
    }

    fun getNonOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            OwnerInvocationHandler(person)
        ) as Person
    }

    fun getPersonFromDatabase(name: String): Person {
        return datingDb[name]!!
    }

    fun initializeDatabase() {
        val joe = PersonImpl(
            "Joe Javabean",
            "MALE",
            "cars, computers, music",
            7
        )
        datingDb[joe.getName()] = joe

        val kelly = PersonImpl(
            "Kelly Klosure",
            "FEMALE",
            "ebay, movies",
            6
        )

        datingDb[kelly.getName()] = kelly
    }
}