package funcionarios.bonificacao

import funcionarios.models.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun calculaBonificacao(funcionario: Funcionario) {

        total += funcionario.bonificacao

    }

}