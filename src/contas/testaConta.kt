package contas

fun testaConta()
{

    val contaCorrente = ContaCorrente("Pedro", 1000)
    val contaPoupanca = ContaPoupanca("Joao", 1001)
    val contaSalario = ContaSalario("Davi", 1002)

    contaCorrente.deposita(1000.0)
//    contaCorrente.deposita(-1000.0)
    contaPoupanca.deposita(1000.0)
//    contaPoupanca.deposita(-1000.0)
    contaSalario.deposita(1000.0)

    println("Conta corrente apos deposito: R$${contaCorrente.saldo}0")
    println("Conta poupança apos deposito: R$${contaPoupanca.saldo}0")
    println("Conta salario apos deposito: R$${contaSalario.saldo}0")
    println()

    contaCorrente.saca(100.0)
//    contaCorrente.saca(20000.0)
    contaPoupanca.saca(100.0)
//    contaPoupanca.saca(10000.0)
    contaSalario.saca(100.0)

    println("Conta corrente apos saque: R$${contaCorrente.saldo}0")
    println("Conta poupança apos saque: R$${contaPoupanca.saldo}0")
    println()

    contaCorrente.transfere(100.0, contaPoupanca)
//    contaPoupanca.transfere(10000.0, contaCorrente)
//    contaSalario.transfere(50.0, contaPoupanca)

    println("Conta corrente apos transferir para poupanca: R$${contaCorrente.saldo}")
    println("Conta poupança apos receber transferencia: R$${contaPoupanca.saldo}")
    println("Conta salario apos receber transferencia: R$${contaSalario.saldo}")
    println()

    contaPoupanca.transfere(100.0, contaCorrente)
//    contaPoupanca.transfere(50.0, contaSalario)

    println("Conta corrente apos receber transferencia: R$${contaCorrente.saldo}")
    println("Conta poupança apos transferir para corrente: R$${contaPoupanca.saldo}")
    println("Conta salario apos receber transferencia: R$${contaSalario.saldo}")
    println()


}