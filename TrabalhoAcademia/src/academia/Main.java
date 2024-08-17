package academia;

public class Main {
    public static void main(String[] args) {

        Instrutor instrutor = new Instrutor("Neto", 12345, 30, 99887766, "Musculação", "08:00 - 17:00", 3000.00);


        Aluno vinicius = new Aluno("Vinicius Silva", 20231001, 25, 99887766, null);
        Aluno yan = new Aluno("Yan Oliveira", 20231002, 22, 99887767,null);

        Treinos treinoViniciusCostas = new Treinos("Costas", "Exercícios para costas", 60, "09:00", "Academia Topfit");
        Treinos treinoViniciusBiceps = new Treinos("Bíceps", "Exercícios para bíceps", 45, "10:00", "Academia Topfit");
        Treinos treinoYanPeito = new Treinos("Peito", "Exercícios para peito", 50, "11:00", "Academia Topfit");
        Treinos treinoYanTriceps = new Treinos("Tríceps", "Exercícios para tríceps", 40, "12:00", "Academia Topfit");


        treinoViniciusCostas.adicionarAluno(vinicius);
        treinoViniciusBiceps.adicionarAluno(vinicius);
        treinoYanPeito.adicionarAluno(yan);
        treinoYanTriceps.adicionarAluno(yan);


        String[] partesDoMusculoVinicius = {"costas", "bíceps"};
        String[] partesDoMusculoYan = {"peito", "tríceps"};


        String[] exerciciosVinicius = instrutor.sugerirExercicios(partesDoMusculoVinicius);
        System.out.println("Instrutor: " + instrutor.getNome());
        System.out.println("Local: " + treinoViniciusCostas.getLocal());
        System.out.println("Horário: " + instrutor.getHorarioDeTrabalho());
        System.out.println("Exercícios sugeridos para Vinicius:");
        for (String exercicio : exerciciosVinicius) {
            System.out.println(exercicio);
        }

        System.out.println();

        String[] exerciciosYan = instrutor.sugerirExercicios(partesDoMusculoYan);
        System.out.println("Instrutor: " + instrutor.getNome());
        System.out.println("Local: " + treinoYanPeito.getLocal());
        System.out.println("Horário: " + instrutor.getHorarioDeTrabalho());
        System.out.println("Exercícios sugeridos para Yan:");
        for (String exercicio : exerciciosYan) {
            System.out.println(exercicio);
        }


    }
}
