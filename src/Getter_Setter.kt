fun main() {
    val voter=Voter()
    voter.ageToVote=16
    println(voter.ageToVote)
    println(voter.nameToVote)
}
class Voter(){
     var ageToVote:Int=18
         get()=field
         set(value) {
             if (value<18){
                 println("Age can not be less 18")
             }
             else{
                 field=value
             }

         }
    var nameToVote: String="Anupam"
        get() {
            return "$field Eligible to vote"
        }
}
