fun main() {
    var manager = DigitalHouseManager()
    var opcao: Int = 1
    while (true) {
        println("######################")
        println("1 - Registrar curso:");
        println("2 - Excluir curso");
        println("3 - Registrar professor adjunto");
        println("4 - Registrar professor titular");
        println("5 - Excluir professor");
        println("6 - Registrar aluno");
        println("7 - Matricular aluno");
        println("8 - Alocar professores");
        println("0 - Para sair");
//        println("10 - imprimir todos os alunos")
        opcao = readLine()!!.toInt()
        when (opcao) {
            0 -> break
            3 -> {
                registrarProfessorAdjunto(manager)
            }
            4 -> {

            }
            6 -> {
                registrarAluno(manager)
            }
            else -> {
                println("Opção não encontrada, por favor digite novamente")
            }
        }
    }
}

fun registrarProfessorAdjunto(manager: DigitalHouseManager) {
//    println("######################")
//    println("Digite o nome do professor:")
//    var nome = readLine()!!.toString()
//    println("Digite o sobrenome do professor:")
//    var sobrenome = readLine()!!.toString()
//    println("Digite as horas de monitoria:")
//    var monitoria = readLine()!!.toInt()
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