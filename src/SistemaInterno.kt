import funcionarios.autenticacao.Autenticavel

class SistemaInterno {

    fun autentica(adm: Autenticavel, senha: Int) {

        if (adm.autentica(senha)) {

            println("Seja bem-vindo ao Bytebank")
        } else {

            println("Nao foi possivel autenticar")
        }

    }

}