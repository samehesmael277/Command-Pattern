class SendMoneyCommand(private val receiver: Receiver, private val amount: Double) : Command {
    override fun execute() {
        receiver.sendMoney(amount = amount)
    }
}

class SendMoneyToAllCommand(private val receivers: ArrayList<Receiver>, private val amount: Double) : Command {
    override fun execute() {
        receivers.forEach { receiver ->
            receiver.sendMoney(amount)
        }
    }
}