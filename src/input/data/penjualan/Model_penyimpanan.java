
package input.data.penjualan;

import javax.swing.table.DefaultTableModel;

public class Model_penyimpanan {
    
     private DefaultTableModel tabel = new DefaultTableModel();
     public Model_penyimpanan(){
         
         getTabel().addColumn("no");
         getTabel().addColumn("Nama");
         getTabel().addColumn("Jumlah");
         getTabel().addColumn("Harga");
         getTabel().addColumn("total");
                  
     }
     
     public DefaultTableModel getTabel(){
         return tabel;
     }
     
    
}
