class Curso(
    var nome: String,
    val codigo: Int,
    var qtdMaxima: Int,
) {

    var listaAlunos = mutableListOf<Aluno>()

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (qtdMaxima >= listaAlunos.size + 1) {
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        if (listaAlunos.contains(umAluno)) {
            listaAlunos.remove(umAluno)
        } else {
            println("Aluno não encontrado")
        }
    }
}