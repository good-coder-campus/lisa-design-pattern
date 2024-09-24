package designpattern.proxy.dynamicProxy

class PersonImpl(
    var name: String,
    var gender: String,
    var interests: String,
    var rating: Int,
    var ratingCount: Int = 0
): Person {
    override fun getName(): String {
        return name
    }

    override fun setName(name: String) {
       this.name = name
    }

    override fun getGender(): String {
        return gender
    }

    override fun setGender(gender: String) {
        this.gender = gender
    }

    override fun getInterests(): String {
        return interests
    }

    override fun setInterests(interests: String) {
        this.interests = interests
    }

    override fun getGeekRating(): Int {
        if(ratingCount == 0) return 0
        return rating / ratingCount
    }

    override fun setGeekRating(rating: Int) {
        this.rating += rating
        ratingCount++
    }
}