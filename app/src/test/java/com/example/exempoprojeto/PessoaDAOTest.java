package com.example.exempoprojeto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import dao.PessoaDAO;
import model.Pessoa;

@RunWith(JUnit4.class)
public class PessoaDAOTest {

    @Test
    public void testeSalvarPessoaNoBancoDeDados(){
        Pessoa p = new Pessoa("Luciano", "luciano@gmail.com");
        PessoaDAO dao = new PessoaDAO();
        assertTrue(dao.save(p));

    }

    @Test
    public void deveriaSalvarPessoaMock(){
        Pessoa p = new Pessoa("Luciano", "luciano@gmail.com");
        PessoaDAO daoFalso = Mockito.mock(PessoaDAO.class);
        Mockito.when(daoFalso.save(p)).thenReturn(true);
    }
}
