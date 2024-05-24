/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.business;

import com.bajo.biblioteca.model.Emprestimo;
import com.bajo.biblioteca.model.view.EmprestimoView;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author bajinho
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmprestimosControllerTest {
    
    public EmprestimosControllerTest() {
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
     * Test of adicionar method, of class EmprestimosController.
     */
    @Test
    @Order(1)
    public void testAdicionar() throws Exception {
        System.out.println("adicionar");
        String nome = "";
        EmprestimosController instance = new EmprestimosController();
        instance.adicionar(nome);
    }

    /**
     * Test of atualizar method, of class EmprestimosController.
     */
    @Test
    @Order(2)
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Emprestimo emprestimo = null;
        EmprestimosController instance = new EmprestimosController();
        instance.atualizar(emprestimo);
    }

    /**
     * Test of filtrar method, of class EmprestimosController.
     */
    @Test
    @Order(3)
    public void testFiltrar() {
        System.out.println("filtrar");
        String nome = "";
        EmprestimosController instance = new EmprestimosController();
        List<EmprestimoView> expResult = null;
        List<EmprestimoView> result = instance.filtrar(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletar method, of class EmprestimosController.
     */
    @Test
    @Order(4)
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        Long id = null;
        EmprestimosController instance = new EmprestimosController();
        instance.deletar(id);
    }
    
}
