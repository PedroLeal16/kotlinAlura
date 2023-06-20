import funcionarios.Analista
import funcionarios.bonificacao.CalculadoraBonificacao
import funcionarios.Diretor
import funcionarios.Gerente

fun testeFuncionario() {
    val pedro = Analista(
        nome = "Pedro",
        cpf = "46864816869",
        salario = 1000.0
    )

    println("Nome do funcionario: ${pedro.nome}")
    println("CPF do funcionario: ${pedro.cpf}")
    println("Salario do funcionario: R$ ${pedro.salario}0")
    println("Bonificação de ${pedro.nome} é R$ ${pedro.bonificacao}0")
    println()

    val joao = Gerente(
        "Joao",
        "46816816060",
        2000.0,
        2305
    )

    println("Nome do funcionario: ${joao.nome}")
    println("CPF do funcionario: ${joao.cpf}")
    println("Salario do funcionario: R$ ${joao.salario}0")
    println("Bonificação de ${joao.nome} é R$ ${joao.bonificacao}0")
    if (joao.senha == 2305) println("Auteticou com sucesso!")
    else println("Falha na autenticação!")
    println()

    val ricardo = Diretor(
        nome = "Ricardo",
        cpf = "31581530838",
        salario = 4000.0,
        senha = 511,
        plr = 200.0
    )

    println("Nome do funcionario: ${ricardo.nome}")
    println("CPF do funcionario: ${ricardo.cpf}")
    println("Salario do funcionario: R$ ${ricardo.salario}0")
    println("Bonificação de ${ricardo.nome} é R$ ${ricardo.bonificacao}0")
    println("PLR de ${ricardo.nome} é R$ ${ricardo.plr}0")
    if (ricardo.senha == 511) println("Auteticou com sucesso!")
    else println("Falha na autenticação!")
    println()

    val calculadoraBonicacao = CalculadoraBonificacao()
    calculadoraBonicacao.calculaBonificacao(pedro)
    calculadoraBonicacao.calculaBonificacao(joao)
    calculadoraBonicacao.calculaBonificacao(ricardo)

    println(
        "Valor total de bonificação" +
                "de funcionarios R$${calculadoraBonicacao.total}0"
    )
    println()
}