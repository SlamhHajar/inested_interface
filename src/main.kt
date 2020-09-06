fun main() {
    var son=Partty("Noha")
   son.partySon()


}

interface Mother {
    fun makeCake();


}
interface Father:Mother{

    fun gift();
    fun notParty();

fun partySon();
}
class Partty(son:String):Father{
    var name=""
    init {
       name= son

    }

    override fun gift() {
        makeCake()
        println("This WooW Gift  from my father")
    }

    override fun notParty() {
        println("My Son Ali  that's day is not Your birthday  ")
    }

    override fun partySon() {
        when(name){
            "Noha"->gift()
            "Ali"->notParty()
        }

    }

    override fun makeCake() {
        println("A beautiful cake my mother made it *_* ")
    }


}