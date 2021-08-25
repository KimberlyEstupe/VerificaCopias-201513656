package Analizadores;
import Archivos.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jflex.exceptions.SilentExit;

/**
 *
 * @author Kimbe
 */
public class FVentanaP extends javax.swing.JFrame {
    String rutaFichero = "";
    boolean abierto = false;

    /**
     * Creates new form FVentanaP
     */
    public FVentanaP() {
        initComponents();
        this.setTitle("FIUSAC Copy Analyzer");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEntrada = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSalida = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMIGuardar = new javax.swing.JMenu();
        JMIAbrir = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
        jmEjecutar = new javax.swing.JMenu();
        jmiEjecutar = new javax.swing.JMenuItem();
        jmEliminarP = new javax.swing.JMenu();
        JMICrearP = new javax.swing.JMenuItem();
        EmininarPestaña = new javax.swing.JMenuItem();
        jmReporyes = new javax.swing.JMenu();
        ReporteErrores = new javax.swing.JMenuItem();
        ReporteTokens = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Editor");

        jtEntrada.setColumns(20);
        jtEntrada.setRows(5);
        jScrollPane1.setViewportView(jtEntrada);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Consola");

        jtSalida.setColumns(20);
        jtSalida.setRows(5);
        jScrollPane2.setViewportView(jtSalida);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        JMIGuardar.setText("Archivo");

        JMIAbrir.setText("Abrir");
        JMIAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAbrirActionPerformed(evt);
            }
        });
        JMIGuardar.add(JMIAbrir);

        guardarComo.setText("Guardar Como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        JMIGuardar.add(guardarComo);

        jMenuBar1.add(JMIGuardar);

        jmEjecutar.setText("Ejecutar");
        jmEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEjecutarActionPerformed(evt);
            }
        });

        jmiEjecutar.setText("Analizar");
        jmiEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEjecutarActionPerformed(evt);
            }
        });
        jmEjecutar.add(jmiEjecutar);

        jMenuBar1.add(jmEjecutar);

        jmEliminarP.setText("Petañas");

        JMICrearP.setText("Agrear ");
        jmEliminarP.add(JMICrearP);

        EmininarPestaña.setText("Eliminar");
        jmEliminarP.add(EmininarPestaña);

        jMenuBar1.add(jmEliminarP);

        jmReporyes.setText("Resportes");

        ReporteErrores.setText("Reporte Errores");
        jmReporyes.add(ReporteErrores);

        ReporteTokens.setText("Reporte de Tokens");
        jmReporyes.add(ReporteTokens);

        jMenuBar1.add(jmReporyes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEjecutarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmEjecutarActionPerformed

    private void jmiEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEjecutarActionPerformed
         try {
            // TODO add your handling code here:
            File archivo = new File ("archivo.txt");// Crea el archivo donde se guadara ka entrada
            PrintWriter escribe; // Escribe en el archivo 
            escribe = new PrintWriter(archivo);
            escribe.print(jtEntrada.getText());
            escribe.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FVentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            LexiJS lexjs = new LexiJS (lector);
            String resultado="Inicio Analisis Lexico \n";
            
            while (true) {
                Tokenjs tokens = lexjs.yylex();
                if(tokens == null){
                    resultado += "Fin Analisis Lexico";
                    jtSalida.setText(resultado);
                    return;
                }
                switch(tokens) {
                    case ERROR:
                        resultado += "El simpocolo no definido \n";
                        break;
                    default:
                        resultado +=lexjs.Lexejs+" \t Es un "+ tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FVentanaP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FVentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiEjecutarActionPerformed

    private void JMIAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAbrirActionPerformed
        JFileChooser Narchivo = new JFileChooser(); //crea JFileChooser (visualizacion de fichero)      
        int x = Narchivo.showOpenDialog(this);//escoje el fichero
        if (x == JFileChooser.APPROVE_OPTION) {
            File fichero = Narchivo.getSelectedFile();            
            rutaFichero = fichero.getAbsolutePath();
            if (fichero.getName().endsWith("fca")) {// verifica extension                
                abierto = true;
                try(FileReader FR = new FileReader(fichero)){
                    String textoF ="";
                    int val = FR.read();               
                    while(val!=-1){
                        textoF+=(char)val;
                        val=FR.read();
                    }
                    jtEntrada.setText(textoF);
                }catch(IOException e){   
                    e.printStackTrace();
                }                
            }else{
                JOptionPane.showMessageDialog(null, "ERROR \nEl archivo no es de extención 'fca' vuelve a intentar","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            }
            
        }

    }//GEN-LAST:event_JMIAbrirActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        JFileChooser Narchivo = new JFileChooser(); //crea JFileChooser (visualizacion de fichero)      
        int x = Narchivo.showOpenDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            File fichero = Narchivo.getSelectedFile();
            try(FileWriter FW = new FileWriter(fichero)){
                FW.write(rutaFichero);
            }catch(IOException e){   
                e.printStackTrace();
            }  
        }
    }//GEN-LAST:event_guardarComoActionPerformed

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FVentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVentanaP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EmininarPestaña;
    private javax.swing.JMenuItem JMIAbrir;
    private javax.swing.JMenuItem JMICrearP;
    private javax.swing.JMenu JMIGuardar;
    private javax.swing.JMenuItem ReporteErrores;
    private javax.swing.JMenuItem ReporteTokens;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmEjecutar;
    private javax.swing.JMenu jmEliminarP;
    private javax.swing.JMenu jmReporyes;
    private javax.swing.JMenuItem jmiEjecutar;
    private javax.swing.JTextArea jtEntrada;
    private javax.swing.JTextArea jtSalida;
    // End of variables declaration//GEN-END:variables
}
