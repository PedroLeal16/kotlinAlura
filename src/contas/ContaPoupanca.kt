package contas

open class ContaPoupanca(
    titular: String,
    numero: Int
): ContaTransferivel(titular = titular, numero = numero)