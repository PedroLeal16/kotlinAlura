package funcionarios.models

import funcionarios.autenticacao.Autenticavel

abstract class FuncionarioAdm(
     nome: String,
     cpf: String,
     salario: Double,
     protected val senha: Int
): Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {



    override fun autentica(senha: Int): Boolean{
        if (this.senha == senha){
            return true
        }
        return false

    }

}