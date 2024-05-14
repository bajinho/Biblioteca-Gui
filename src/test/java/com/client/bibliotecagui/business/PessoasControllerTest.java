/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.business;

import com.bajo.biblioteca.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bajinho
 */
public class PessoasControllerTest {
    
    private final PessoasController instance = new PessoasController();
    
    public PessoasControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adicionar method, of class PessoasController.
     */
    @Test
    public void testAdicionar() throws Exception {
        System.out.println("adicionar");
        String nome = "teste";
        instance.adicionar(nome);
    }

    /**
     * Test of atualizar method, of class PessoasController.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Pessoa pessoa = instance.filtrar("teste").getFirst();
        pessoa.setNome("teste");
        instance.atualizar(pessoa);
    }

    /**
     * Test of filtrar method, of class PessoasController.
     */
    @Test
    public void testFiltrar() {
        System.out.println("filtrar");
        String nome = "teste";
        Pessoa p = new Pessoa();
        List<Pessoa> l = new ArrayList();
        p.setNome(nome);
        l.add(p);
        List<Pessoa> expResult = l;
        List<Pessoa> result = instance.filtrar(nome);
        assertEquals(expResult.getFirst().getNome(), result.getFirst().getNome());
    }

    /**
     * Test of deletar method, of class PessoasController.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        Long id = instance.filtrar("teste").getFirst().getId();
        instance.deletar(id);
    }
    
}
