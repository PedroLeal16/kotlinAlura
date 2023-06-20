package funcionarios

import funcionarios.models.FuncionarioAdm

//Eu poderia colocar a interface ", Auteticavel" logo apos a referencia a "FuncionarioAdm" //
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdm(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override val bonificacao: Double get() = salario * 1.1

}