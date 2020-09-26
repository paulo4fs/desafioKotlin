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
        cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        var deletado = cursos.filter { it.codigo == codigoCurso }

        if (deletado.isNotEmpty()) cursos.remove(deletado) else println("código não encontrado")
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {
        professores.add(
            ProfessorAdjunto(
                nome,
                sobrenome,
                0,
                codigoProfessor,
                quantidadeDeHoras
            )
        )
        println("Professor adjunto registrado")
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        professores.add(
            ProfessorTitular(
                nome,
                sobrenome,
                0,
                codigoProfessor,
                especialidade
            )
        )
        println("Professor titular registrado")
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