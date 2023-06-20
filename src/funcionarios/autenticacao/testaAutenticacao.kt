import cliente.Cliente
import funcionarios.Diretor
import funcionarios.Gerente

fun testaAutenticacao() {

    val gerente = Gerente("Pedro", "46864816869", 2033.00, 1606)

    val diretor = Diretor("Joao", "46864816972", 3000.00, 2305, plr = 200.0)

    val cliente = Cliente(nome = "Ricardo", cpf = "3333333333", senha = 211)


    val sistemaInterno = SistemaInterno()

    sistemaInterno.autentica(gerente, 1606)
    sistemaInterno.autentica(diretor, 2305)
    sistemaInterno.autentica(cliente, 211)

}