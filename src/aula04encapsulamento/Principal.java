package aula04encapsulamento;

public class Principal {
    public static void main(String[] args) {
        // Anotação Válida
        Agenda agenda1 = new Agenda();
        agenda1.anote(19, 10, 2021, "Minha anotação");
        agenda1.mostraAnotacao();

        // Anotação Inválida
        Agenda agenda2 = new Agenda();
        agenda2.anote(19, 14, 2021, "Minha anotação");

        /*
            O código a baixo não vai mais funcionar,
            porque a visibilidade dos atributos na classe
            agenda está "private"
         */

//        agenda2.dia = 19;
//        agenda2.mes = 14;
//        agenda2.ano = 2021;
//        agenda2.anotacao = "Minha anotação";
        agenda2.mostraAnotacao();
    }
}
