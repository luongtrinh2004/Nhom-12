package view;

import entity.Product;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ProductView extends JFrame implements ActionListener, ListSelectionListener {
      private static final long serialVersionUID = 1L;
    private JButton addProductBtn;
    private JButton editProductBtn;
    private JButton deleteProductBtn;
    private JButton clearBtn;
    private JButton sortProductPriceBtn,sortProductQualityBtn;
    private JButton sortProductNameBtn;
    private JScrollPane jScrollPaneProductTable;
    private JScrollPane jScrollPaneAddress;
    private JTable productTable;
    
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel priceLable;
    private JLabel imageLabel;
    private JLabel qualityLabel;
    private JLabel searchLabel;
    
    private JLabel logoLabel;
    
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextArea imageTa;
    private JTextField qualityField;
    private JTextField searchField;
    private JButton backButton;
    // định nghĩa các cột của bảng product
    private String [] columnNames = new String [] {
            "ID", "Name", "Price", "image", "Quantity"};
    // định nghĩa dữ liệu mặc định của bẳng product là rỗng
    private Object data = new Object [][] {};
    
    public ProductView() {
        initComponents();
    }

    private void initComponents() {
       
  
}
