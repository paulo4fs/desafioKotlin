class Curso(
    var nome: String,
    val codigo: Int,
    var qtdMaxima: Int,
) {

    var listaAlunos = mutableListOf<Aluno>()

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

//    constructor(professorTitular: ProfessorTitular) {
//        this.professorTitular = professorTitular
//    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return true
    }

    fun excluirAluno(umAluno: Aluno) {}
}