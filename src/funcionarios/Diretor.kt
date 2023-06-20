package funcionarios

import funcionarios.models.FuncionarioAdm

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdm(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override val bonificacao: Double = salario * 0.1 + salario + plr

}