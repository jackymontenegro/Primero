/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagina;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacky Montenegro
 */
public class generaPHP {
    
    public void paginaP() {
        try {
            String ruta = "C:\\xampp\\htdocs\\compi\\pag.php";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

           
                bw.write("<html> <head> <title> compi </title></head><body><h2> proyecto</h2></body></html> ");
            

            bw.close();
            JOptionPane.showMessageDialog(null, "PHP");

        } catch (IOException e) {
        }

    }
    
}
