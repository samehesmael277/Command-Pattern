class Receiver(private val id: Int) {
    private var money: Double = 0.0

    fun sendMoney(amount: Double) {
        this.money += amount
        println("Receiver $id, Total money = $money")
    }
}