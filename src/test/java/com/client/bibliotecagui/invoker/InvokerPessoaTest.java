/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.invoker;

import com.bajo.biblioteca.bean.impl.PessoaRemote;
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
public class InvokerPessoaTest {
    
    public InvokerPessoaTest() {
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
     * Test of invokePessoaStatelessBean method, of class InvokerPessoa.
     */
    @Test
    public void testInvokePessoaStatelessBean() {
        System.out.println("invokePessoaStatelessBean");
        PessoaRemote expResult = null;
        PessoaRemote result = InvokerPessoa.invokePessoaStatelessBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}