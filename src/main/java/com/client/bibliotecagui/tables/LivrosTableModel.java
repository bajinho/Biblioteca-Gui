/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.client.bibliotecagui.tables;

import com.bajo.biblioteca.model.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bajinho
 */
public class LivrosTableModel extends AbstractTableModel {

    private final List<Livro> livrosList;

    private final String[] columnNames = new String[]{
        "ID", "TITULO", "AUTOR", "EMPRESTADO"
    };
    private final Class[] columnClass = new Class[]{
        java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
    };

    public LivrosTableModel(List<Livro> livrosList) {
        this.livrosList = livrosList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return livrosList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro row = livrosList.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> row.getId();
            case 1 -> row.getTitulo();
            case 2 -> row.getAutor();
            case 3 -> row.getEmprestado() == 0 ? "Não" : "Sim:";
            default -> null;
        };
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Livro row = livrosList.get(rowIndex);
        switch (columnIndex) {
            case 0 -> row.setId((Long) aValue);
            case 1 -> row.setTitulo((String) aValue);
            case 2 -> row.setAutor((String) aValue);
            case 3 -> row.setEmprestado((Integer) aValue);
            default -> {
            }
        }
    }

}
