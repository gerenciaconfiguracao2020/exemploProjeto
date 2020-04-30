package dao;

import model.Pessoa;

public class PessoaDAO {

    public boolean save(Pessoa pessoa){
        System.out.println("Operação realizada com sucesso! " +pessoa.getNome());
        return  true;
    }
}
