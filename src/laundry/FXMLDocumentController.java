/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton paket1;
    @FXML
    private ToggleGroup paketpilihan;
    @FXML
    private RadioButton paket2;
    @FXML
    private RadioButton paket3;
    @FXML
    private Button idok;
    @FXML
    private Button idhapus;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea idharga;
    @FXML
    private TextField idnama;
    @FXML
    private TextField idalamat;
    @FXML
    private TextField idkg;
    @FXML
    private TextField idtlp;
    @FXML
    private TextField idtgl;

      /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    void proses(ActionEvent event) {
  
        String Nama = idnama.getText();
        String Alamat = idalamat.getText();
        String Berat = idkg.getText();
        String Telp = idtlp.getText();
        String pilihan = "";        
        if (paket1.isSelected())
            pilihan = "Cuci Kering";
        else if (paket2.isSelected())
            pilihan = "Cuci Kering Setrika";
        else if (paket3.isSelected())
          pilihan = "Setrika";
        else
            pilihan = "";
        String Tanggal = idtgl.getText();
        
        
        hasil.setText("Nama Pelanggan : "+Nama+"\nAlamat Pelanggan : "+Alamat+"\nBerat Cucian : "+Berat+"\nNomor Telepon : "+Telp+
                "\nPilihan Paket Laundry : "+pilihan+"\nTanggal Pengembalian : "+Tanggal);
        
        int harga = 0;
        int hitung = Integer.parseInt(idkg.getText());
        if(paket1.isSelected());
            harga = hitung*5000;
        if(paket2.isSelected());
            harga = hitung*8000;
        if(paket3.isSelected());
            harga = hitung*4000;
        idharga.setText(""+harga);  
      }       
     
    
    
  @FXML
   
         private void hapus(ActionEvent event) {
        hasil.setText("");   
        idnama.setText("");
        idalamat.setText("");
        idkg.setText("");
        idtlp.setText("");
        paket1.setSelected(false);
        paket2.setSelected(false);
        paket3.setSelected(false); 
        idtgl.setText("");
        hasil.setText("");

}
}