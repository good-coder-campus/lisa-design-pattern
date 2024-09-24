package designpattern.proxy.dynamicProxy

interface Person {
    fun getName(): String
    fun setName(name: String)
    fun getGender(): String
    fun setGender(gender: String)
    fun getInterests(): String
    fun setInterests(interests: String)
    fun getGeekRating(): Int
    fun setGeekRating(rating: Int)
}