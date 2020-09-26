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

        if (deletado.isNotEmpty()) cursos.remove(deletado) else println("Código não encontrado")
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

    fun excluirProfessor(codigoProfessor: Int) {
        var deletado = cursos.filter { it.codigo == codigoProfessor }

        if (deletado.isNotEmpty()) cursos.remove(deletado) else println("Código não encontrado")
    }

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
        var aluno = alunos.filter { it.codigo == codigoAluno }
        var curso = cursos.filter { it.codigo == codigoCurso }
        if (aluno.isNotEmpty() && curso.isNotEmpty()) {
            if (curso[0].adicionarUmAluno(aluno[0])) {
                matriculas.add(Matricula(aluno[0], curso[0]))
                curso[0].listaAlunos.add(aluno[0])
                println("Matrícula realizada")
            } else {
                println("O curso está lotado")
            }
        } else {
            println("Aluno ou curso não encontrado")
        }
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
        var curso = cursos.filter { it.codigo == codigoCurso }
        var professorTitular = professores.filter { it.codigo == codigoProfessorTitular }
        var professorAdjunto = professores.filter { it.codigo == codigoProfessorAdjunto }
    }
}