class DigitalHouseManager(
) {
    var alunos = mutableListOf<Aluno>()
    var professores = mutableListOf<Professor>()
    var cursos = mutableListOf<Curso>()
    var matriculas = mutableListOf<Matricula>()

    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        quantidadeMaximaDeAlunos: Int
    ) {
    }

    fun excluirCurso(codigoCurso: Int) {}

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {
//        var codigo: Int
//
//        if (professores.size > 0) {
//            codigo = professores.last().codigo + 1
//        } else {
//            codigo = 0
//        }
//
//        professores.add(
//            ProfessorAdjunto(
//                nome,
//                sobrenome,
//                codigoProfessor,
//                codigo,
//                quantidadeDeHoras
//            )
//        )
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
    }

    fun excluirProfessor(codigoProfessor: Int) {}

    fun registrarAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {
        alunos.add(Aluno(nome, sobrenome, codigoAluno))
        println("Aluno registrado")
    }

    fun matricularAluno(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
    }
}