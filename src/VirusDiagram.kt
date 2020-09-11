interface Virus
{
   abstract fun mutate()
   fun spread(){print("Virus interface")}

}

class CoronaVirus:Virus
{
    override fun mutate() {

        println("corona Virus Class")
    }




}
class InfluenzaVirus:Virus
{
    override fun mutate() { println("Influenza Virus Class")}


}
class HIVVirus:Virus
{
    override fun mutate() { println("HIV Virus Class")}



}
enum class VirusType
{
corona_Virus, INFLUENZA_Virus, HIV_Virus

}
class virusFactory
{
  fun makeVirus(Type:VirusType):Virus?{
     return when(Type)
     {
         VirusType.corona_Virus -> CoronaVirus()
         VirusType.INFLUENZA_Virus -> InfluenzaVirus()
         VirusType.HIV_Virus ->HIVVirus()
         else -> null
     }
  }

}




fun main()
{
val factory=virusFactory()
    val v=factory.makeVirus(VirusType.corona_Virus)
    v?.mutate()

}