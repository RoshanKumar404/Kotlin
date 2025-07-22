//fun main() {
//    print("Enter the Total number")
//    val TotalNumber: Int = readln().toInt()
//    if (TotalNumber >= 80)
//        print("Good Student")
//    else if (TotalNumber >= 70)
//        print("Can do better")
//    else if (TotalNumber >= 60)
//        print("needs to do hard work")
//}



// we can use range based too

//fun main (){
//    print("enter the number plz")
//    val nu:Int= readln().toInt()
//
//    if(nu in 90..100){
//        println("has bright future")
//    }
//    else if( nu in 80..90){print("good future")
//     }
//    else if(nu in 70..80){
//    print("can do something better but will need very hard work")
//    }
//    else{
//        print("chhod de tu padhai")
//    }
//     }


// doning when  base same as case based

//fun main()
//{
//    print("chal bhai number dalll")
//    val marks =readln().toInt()
////    val grade: String = when (marks) {
////        in 89..99 -> "rw"   // ✅ This is a String
////        else -> "d"         // ✅ This is also a String
////    }
//    val grade :String= when (marks){
//       in 78..89->"hd"
//        else->"fs"
//    }
//}

//class SmartDevice{
//    // its empty
//    val name: String="Rohaniya"
//    val categoryy: String="Genius"
//    val ConectionStatuts: String="Online"
//    fun turnOn(){
//        println("Your device is turned on")
//    }
//    fun TurnOff(){
//        println("your device is turned off")
//    }
//}
//
//fun main(){
//    val ClassTrial= SmartDevice()
//    println("the device name is : ${ClassTrial.name}")
//    ClassTrial.turnOn()
//
//    ClassTrial.TurnOff()
//}

// now we will learn constructor
// the primaty goal of constructoe is to specify hoe the object off the clss aare crearted

// this is constructor wihtout parameters
//class SmartDevice constructor(){
//
//}
 // and this is constrctor with parameter
//class  Smart(val Devicename: String, val categor: String){
//    var deviceStatus= "online"
//
//   constructor( name:String,status: Int, categor: String):this(name,categor){
//       deviceStatus=when(status){
//           0->"offline"
//           1->"online"
//           else -> "unknown"
//       }
//   }
////
//}
open class  SmartDevice(val name: String,val category: String){
}
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    fun turnOn(){
        println("Your device is turned on")
    }
    fun TurnOff(){
        println("your device is turned off")
    }
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber=1
        set(value){
            if (value in 0..200){
                field=value
            }
        }
    fun increaseSpkrvolume(){
        speakerVolume++
        println("Volume increased to $speakerVolume")

    }
    fun nextChannel(){
        channelNumber++
        println("channel number increased to $channelNumber")
    }
}

class  SmartLightDevice(deviceName: String, deviceCategory:String):
        SmartDevice(name=deviceName, category = deviceCategory){
            var brightness=0
                set(value) {
                    if (value in 0..100){
                        field=value
                    }
                }

    fun increaseBrightness(){
        brightness++
        println("Brightness increased to $brightness")
    }
        }


class SmartHome(val smartTvDevice: SmartTvDevice,val smartLightDevice: SmartLightDevice){
    fun turnOnTv(){
        smartTvDevice.turnOn()
    }
    fun turnOffTv(){
        smartTvDevice.TurnOff()
    }
    fun increaseTvvolume(){
        smartTvDevice.increaseSpkrvolume()
    }
    fun changeChannel(){
        smartTvDevice.nextChannel()
    }
    fun turnOnLight(){
        smartTvDevice.turnOn()
    }fun turnOfLight(){
        smartTvDevice.TurnOff()
    }
    fun increaseLightBrightness() {
       smartLightDevice.increaseBrightness()
    }
    fun turnOffAllDevices(){
        turnOffTv()
        turnOfLight()
    }
}