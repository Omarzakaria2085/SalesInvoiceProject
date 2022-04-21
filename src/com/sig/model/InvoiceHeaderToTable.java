/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Omar_Zakaria
 */
public class InvoiceHeaderToTable extends AbstractTableModel {

    private List<InvoiceHeader> invoicesList;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public InvoiceHeaderToTable(List<InvoiceHeader> invoicesList) {
        this.invoicesList = invoicesList;
    }

    public List<InvoiceHeader> getInvoicesList() {
        return invoicesList;
    }
    
    
    @Override
    public int getRowCount() {
        return invoicesList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "No.";
            case 1:
                return "Date";
            case 2:
                return "Customer";
            case 3:
                return "Total";
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            default:
                return Object.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader row = invoicesList.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return row.getInvNum();
            case 1:
                return df.format(row.getInvDate());
            case 2:
                return row.getCustomerName();
            case 3:
                return row.getInvTotal();
            default:
                return "";
        }
        
    }
    
}
