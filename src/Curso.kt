class Curso(
    var nome: String,
    val codigo: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var qtdMaxima: Int,
    var listaAlunos: MutableList<Aluno>
) {
}