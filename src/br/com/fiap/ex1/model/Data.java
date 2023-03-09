package br.com.fiap.ex1.model;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean bissexto;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public boolean ehBissexto(int ano) {
        if (ano % 4 == 0 && ano % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.bissexto = ehBissexto(ano);
    }

    public String mostraData() {
        if (validaDia(dia, mes) && validaMes(mes) && validaAno(ano)) {
            if (bissexto) {
                return "Hoje e dia " + this.dia + "/" + this.mes + "/" + this.ano + ", este ano e bissexto";
            }
            else {
                return "Hoje e dia " + this.dia + "/" + this.mes + "/" + this.ano + ", este ano nao e bissexto";
            }
        }
        else {
            return "Data invalida";
        }

    }
    public boolean validaMes(int mes) {
        if (mes > 12) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean validaAno(int ano) {
        if (ano < 0) {
            return false;
        }
        else return true;
    }

    public boolean validaDia(int dia, int mes) {
        if (mes == 2 && ehBissexto(getAno()) && dia >29) {
            return false;
        } else if (mes == 2 && !ehBissexto(getAno()) && dia >28) {
            return false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            return false;
        }
        else return true;

    }


}


