class DigitalHouseManager(
    var alunos: MutableList<Aluno>,
    var professores: MutableList<Professor>,
    var cursos: MutableList<Curso>,
    var matriculas: MutableList<Matricula>
) {
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