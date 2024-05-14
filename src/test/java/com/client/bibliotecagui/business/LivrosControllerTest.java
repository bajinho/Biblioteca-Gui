/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.business;

import com.bajo.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author bajinho
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LivrosControllerTest {

    private final LivrosController instance = new LivrosController();

    public LivrosControllerTest() {
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
     * Test of adicionar method, of class LivrosController.
     */
    @Test
    @Order(1)
    public void testAdicionar() throws Exception {
        System.out.println("adicionar");
        String titulo = "teste";
        String autor = "teste";
        instance.adicionar(titulo, autor);
    }

    /**
     * Test of atualizar method, of class LivrosController.
     */
    @Test
    @Order(2)
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Livro livro = instance.filtrar("teste").getFirst();
        livro.setTitulo("teste");
        livro.setAutor("teste");
        livro.setEmprestado(0);
        instance.atualizar(livro);
    }

    /**
     * Test of filtrar method, of class LivrosController.
     */
    @Test
    @Order(3)
    public void testFiltrar() {
        System.out.println("filtrar");
        String titulo = "teste";
        String autor = "teste";
        int emprestado = 0;
        Livro lv = new Livro();
        List<Livro> l = new ArrayList();
        lv.setTitulo(titulo);
        lv.setAutor(autor);
        lv.setEmprestado(emprestado);
        l.add(lv);
        List<Livro> expResult = instance.filtrar("teste");
        List<Livro> result = instance.filtrar(titulo);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletar method, of class LivrosController.
     */
    @Test
    @Order(4)
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        Long id = instance.filtrar("teste").getFirst().getId();
        instance.deletar(id);
    }

}
