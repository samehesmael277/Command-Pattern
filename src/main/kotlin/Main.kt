fun main(args: Array<String>) {
    val invoker = Invoker()

    val receiver1 = Receiver(1)
    val receiver2 = Receiver(2)
    val receiver3 = Receiver(3)

    println("*** First Scenario ***")
    val sendMoneyToReceiver1Command = SendMoneyCommand(receiver1, 500.0)
    invoker.execute(sendMoneyToReceiver1Command)

    Thread.sleep(3000)

    println("*** Second Scenario ***")
    val sendMoneyToReceiver3Command = SendMoneyCommand(receiver3, 800.0)
    invoker.execute(sendMoneyToReceiver3Command)

    Thread.sleep(3000)

    println("*** Third Scenario ***")
    val sendMoneyToAllReceiversCommand = SendMoneyToAllCommand(arrayListOf(receiver1, receiver2, receiver3), 200.0)
    invoker.execute(sendMoneyToAllReceiversCommand)
}