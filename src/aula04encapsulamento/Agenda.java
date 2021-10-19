package aula04encapsulamento;

public class Agenda {
    private int dia, mes, ano;
    private String anotacao;

    public void anote(int dia, int mes, int ano, String nota) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.anotacao = nota;
        validarData();
    }

    private void validarData() {
        if ((dia < 0) || (dia > 31) || (mes < 0) || (mes > 12)) {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "ANOTAÇÃO NÃO INSERIDA: DATA IVÁLIDA";
        }
    }

    public void mostraAnotacao() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + ": " + this.anotacao);
    }

}

