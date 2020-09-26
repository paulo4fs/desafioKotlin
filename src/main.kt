fun main() {
    var manager = DigitalHouseManager()
    var opcao: Int = 1
    while (true) {
        println("######################")
        println("1 - Registrar curso:")
        println("2 - Excluir curso")
        println("3 - Registrar professor adjunto")
        println("4 - Registrar professor titular")
        println("5 - Excluir professor")
        println("6 - Registrar aluno")
        println("7 - Matricular aluno")
        println("8 - Alocar professores")
        println("0 - Para sair")
        opcao = readLine()!!.toInt()
        when (opcao) {
            0 -> break
            1 -> {
                registrarCurso(manager)
            }
            2 -> {
                excluirCurso(manager)
            }
            3 -> {
                registrarProfessorAdjunto(manager)
            }
            4 -> {
                registrarProfessorTitular(manager)
            }
            6 -> {
                registrarAluno(manager)
            }
        }
    }
}

fun registrarCurso(manager: DigitalHouseManager) {
    println("######################")
    println("Digite o nome do curso:")
    var nome = readLine()!!.toString()
    println("Digite a quantidade máxima de alunos:")
    var qtdMaxima = readLine()!!.toInt()
    var codigo = if (manager.cursos.size > 0) manager.cursos.last().codigo + 1 else 0
    manager.registrarCurso(nome, codigo, qtdMaxima)
}

fun excluirCurso(manager: DigitalHouseManager) {
    println("######################")
    println("Digite o código do curso:")
    var codigo = readLine()!!.toInt()

    manager.excluirCurso(codigo)
}

fun registrarProfessorTitular(manager: DigitalHouseManager) {
    println("######################")
    println("Digite o nome do professor:")
    var nome = readLine()!!.toString()
    println("Digite o sobrenome do professor:")
    var sobrenome = readLine()!!.toString()
    println("Digite a especialidade:")
    var especialidade = readLine()!!.toString()
    var codigo = if (manager.professores.size > 0) manager.professores.last().codigo + 1 else 0

    manager.registrarProfessorTitular(nome, sobrenome, codigo, especialidade)
}


fun registrarProfessorAdjunto(manager: DigitalHouseManager) {
    println("######################")
    println("Digite o nome do professor:")
    var nome = readLine()!!.toString()
    println("Digite o sobrenome do professor:")
    var sobrenome = readLine()!!.toString()
    println("Digite a quantidade de horas de monitoria:")
    var horasMonitoria = readLine()!!.toInt()

    var codigo = if (manager.professores.size > 0) manager.professores.last().codigo + 1 else 0

    manager.registrarProfessorAdjunto(nome, sobrenome, codigo, horasMonitoria)
}

fun registrarAluno(manager: DigitalHouseManager) {
    println("######################")
    println("Digite o nome do aluno:")
    var nome = readLine()!!.toString()
    println("Digite o sobrenome do aluno:")
    var sobrenome = readLine()!!.toString()
    var codigo = manager.alunos.size
    manager.registrarAluno(nome, sobrenome, codigo)
}