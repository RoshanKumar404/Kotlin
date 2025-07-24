fun main(){
    val mornigNotifications=53;
    val eveningNotificatioins=1;
    PrintNotifications(mornigNotifications)
    PrintNotifications(eveningNotificatioins)

}
fun PrintNotifications(numberOfmesages:Int){
if(numberOfmesages<=99){
    println("Ypu have $numberOfmesages notifications")
}else{
    println("your phone will blow up  notifications.  You have 99+ notifications")
}
}
