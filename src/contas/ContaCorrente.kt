package contas

class ContaCorrente(
    titular: String,
    numero: Int
): ContaTransferivel(titular, numero) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 1.0
        super.saca(valorComTaxa)
    }
}