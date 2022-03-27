fun main() {
    var car=Car("mitsubishi","nissan","red",7)
    var veh=Bus("Toyota","nganya","blue",30)
    // 1a
    car.carry(10)

      // 1b
     veh.identity("red","nissan","mitsubishi")

     // 1c
  car.calculateParkingFees(2)

    //2a
    println(veh.maxTripFare(80.00))
    //2b
    veh.calculateParkingFees(6)
}
     //1a
open class Car(var make:String,var model:String,var colour:String, var capacity:Int) {

         fun carry(people: Int) {
             var x = people - capacity
             if (people <= 6) {
                 println("carrying $people passengers")
             } else {
                 println("overcapacity by $x people")
             }
         }

         //1b
         open fun identity(colour: String, model: String, make: String){
             println("I am a $colour,$model,$make")
         }

         // 1c
       open  fun calculateParkingFees(hours: Int): Int {
             var fees = hours * 20
             return fees
         }

     }
    // 2a
class Bus(make:String, model:String, colour:String, capacity:Int):Car(make,model,colour,capacity){
  fun maxTripFare(fare:Double): Double{
      var maxfare = fare * capacity
      return maxfare
}
        override fun calculateParkingFees(hours: Int): Int {
    var product = hours * capacity
    println(product)
    return product
}
 }

