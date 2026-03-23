package view;



import controler.productController;
import model.product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class viewproduct extends JFrame {

    JTextField txtId, txtName, txtOrder;
    JCheckBox chkActive;

    JButton btnAdd, btnUpdate, btnDelete, btnLoad;

    JTable table;
    DefaultTableModel model;

    productController controller = new productController();

    public viewproduct(){

        setTitle("Product CRUD");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // PANEL FORM
        JPanel panel = new JPanel(new GridLayout(4,2));

        panel.add(new JLabel("ID"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Name"));
        txtName = new JTextField();
        panel.add(txtName);

        panel.add(new JLabel("Order"));
        txtOrder = new JTextField();
        panel.add(txtOrder);

        panel.add(new JLabel("Active"));
        chkActive = new JCheckBox();
        panel.add(chkActive);

        add(panel,BorderLayout.NORTH);

        // TABLE
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Order");
        model.addColumn("Active");

        table = new JTable(model);

        add(new JScrollPane(table),BorderLayout.CENTER);

        // BUTTON PANEL
        JPanel btnPanel = new JPanel();

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnLoad = new JButton("Load");

        btnPanel.add(btnAdd);
        btnPanel.add(btnUpdate);
        btnPanel.add(btnDelete);
        btnPanel.add(btnLoad);

        add(btnPanel,BorderLayout.SOUTH);

        // EVENTS
        btnAdd.addActionListener(e -> addProduct());
        btnUpdate.addActionListener(e -> updateProduct());
        btnDelete.addActionListener(e -> deleteProduct());
        btnLoad.addActionListener(e -> loadData());

        table.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tableClick();
            }
        });

    }

    // ADD
    private void addProduct(){

        String name = txtName.getText();
        int order = Integer.parseInt(txtOrder.getText());
        boolean active = chkActive.isSelected();

        product p = new product(0,name,order,active);

        controller.insertProduct(p);

        loadData();
    }

    // UPDATE
    private void updateProduct(){

        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        int order = Integer.parseInt(txtOrder.getText());
        boolean active = chkActive.isSelected();

        product p = new product(id,name,order,active);

        controller.updateProduct(p);

        loadData();
    }

    // DELETE
    private void deleteProduct(){

        int id = Integer.parseInt(txtId.getText());

        controller.deleteProduct(id);

        loadData();
    }

    // LOAD DATA
    private void loadData(){

        model.setRowCount(0);

        List<product> list = controller.getAllProducts();

        for(product p : list){

            model.addRow(new Object[]{
                    p.getProductId(),
                    p.getProName(),
                    p.getOder(),
                    p.getActive()
            });

        }
    }

    // CLICK TABLE
    private void tableClick(){

        int row = table.getSelectedRow();

        txtId.setText(model.getValueAt(row,0).toString());
        txtName.setText(model.getValueAt(row,1).toString());
        txtOrder.setText(model.getValueAt(row,2).toString());

        chkActive.setSelected(Boolean.parseBoolean(model.getValueAt(row,3).toString()));

    }

}