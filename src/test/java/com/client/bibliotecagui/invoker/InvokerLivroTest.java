/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.invoker;

import com.bajo.biblioteca.bean.impl.LivroRemote;
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
public class InvokerLivroTest {
    
    public InvokerLivroTest() {
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
     * Test of invokeLivroStatelessBean method, of class InvokerLivro.
     */
    @Test
    public void testInvokeLivroStatelessBean() {
        System.out.println("invokeLivroStatelessBean");
        LivroRemote expResult = null;
        LivroRemote result = InvokerLivro.invokeLivroStatelessBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
