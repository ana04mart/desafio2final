package classes;

import java.util.InputMismatchException;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;

    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf (String cpf) {
        if (cpf != null && cpf.matches ("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("O CPF deve ter 11 dígitos");
        }
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo (char sexo) {
        if ("MmFf".indexOf(sexo) > -1) {
        this.sexo = sexo;
        }else {
            throw new InputMismatchException("Sexo deve ser M ou F");
        }
    }

    public String CpfFormatado() {
        if (cpf!= null) {
            return cpf.substring (0,3) + "." + 
                    cpf.substring(3,6) + "." +
                    cpf.substring(6,9) + "." +
                    cpf.substring(9); 
        } else {
            return null;
        }
    }
    public abstract String cumprimentar();
}
