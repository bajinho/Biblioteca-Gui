/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.client.bibliotecagui.invoker;

import com.bajo.biblioteca.bean.impl.EmprestimoRemote;
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
public class InvokerEmprestimoTest {
    
    public InvokerEmprestimoTest() {
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
     * Test of invokeEmprestimoStatelessBean method, of class InvokerEmprestimo.
     */
    @Test
    public void testInvokeEmprestimoStatelessBean() {
        System.out.println("invokeEmprestimoStatelessBean");
        EmprestimoRemote expResult = null;
        EmprestimoRemote result = InvokerEmprestimo.invokeEmprestimoStatelessBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
