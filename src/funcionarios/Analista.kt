package funcionarios

import funcionarios.models.Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double get() = salario * 0.2

}