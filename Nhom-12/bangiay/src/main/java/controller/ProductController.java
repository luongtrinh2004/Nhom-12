package controller;

import dao.ProductDao;
import entity.Product;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import view.MenuView;
import view.ProductView;


public class ProductController {
    

    public ProductController(ProductView view) {
        
        
    }

    public void showProductView() {
        
    }


    class AddProductListener implements ActionListener {
        
    }


    class EditProductListener implements ActionListener {
    
    }

    /**
     * Lớp DeleteProductListener 
     * chứa cài đặt cho sự kiện click button "Delete"
     * 
     * @author viettuts.vn
     */
    class DeleteProductListener implements ActionListener {
 
    }

    /**
     * Lớp ClearProductListener 
     * chứa cài đặt cho sự kiện click button "Clear"
     * 
     * @author viettuts.vn
     */
    class ClearProductListener implements ActionListener {
     
    }


    class SortProductQualityListener implements ActionListener {
        
    }
    
    
     class SortProductPriceListener implements ActionListener {
       
    }


    class SortProductNameListener implements ActionListener {
       
    }

   
    class ListProductSelectionListener implements ListSelectionListener {
      
    }
    
    
    class backButtonListener implements ActionListener{
     
    }
}
