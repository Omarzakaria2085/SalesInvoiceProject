/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Omar_Zakaria
 */
public class InvoiceLineDialog extends JDialog{
    private JTextField itemName;
    private JTextField itemCount;
    private JTextField itemPrice;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton ok;
    private JButton cancel;
    
    public InvoiceLineDialog(Frame frame) {
        itemName = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCount = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPrice = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        
        ok.setActionCommand("createLineOK");
        cancel.setActionCommand("createLineCancel");
        
        ok.addActionListener(frame.getListener());
        cancel.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemName);
        add(itemCountLbl);
        add(itemCount);
        add(itemPriceLbl);
        add(itemPrice);
        add(ok);
        add(cancel);
        
        pack();
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getItemCount() {
        return itemCount;
    }

    public JTextField getItemPrice() {
        return itemPrice;
    }
}
