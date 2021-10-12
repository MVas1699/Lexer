package p1_lfa;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Hashtable tabla = new Hashtable();
    public static ArrayList <String> tok = new ArrayList <String>();
    public static ArrayList <String> lex = new ArrayList <String>();
    public static ArrayList <Integer> nro = new ArrayList <Integer>();
    public static ArrayList <Integer> nroT = new ArrayList <Integer>();
    int nTk = 0;
   
    TablaHash hash = new TablaHash(15);
    
    
    
    public Principal() {
        initComponents();
        btnVerTabla.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaCadena = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSimbolos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaAnalizador = new javax.swing.JTextArea();
        btnVerTabla = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("ANALIZADOR LÉXICO, TABLA DE SÍMBOLOS Y ANALIZADOR DE ERRORES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Seleccione el archivo a abrir");

        btnAbrir.setText("abrir archivo");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnQuitar.setText("quitar archivo");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        txtaCadena.setColumns(20);
        txtaCadena.setRows(5);
        jScrollPane1.setViewportView(txtaCadena);

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("TABLA DE TOKENS");

        tablaSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pos_Token", "Token", "Lexema", "Linea"
            }
        ));
        jScrollPane3.setViewportView(tablaSimbolos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("ANALIZADOR DE ERROR");

        txtaAnalizador.setColumns(20);
        txtaAnalizador.setForeground(new java.awt.Color(255, 51, 51));
        txtaAnalizador.setRows(5);
        jScrollPane2.setViewportView(txtaAnalizador);

        btnVerTabla.setText("Ver HashTable");
        btnVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver al menú principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerTabla)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnAbrir)
                    .addComponent(btnQuitar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAnalizar)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerTabla)
                            .addComponent(btnVolver))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        ArrayList<String> cadenas = new ArrayList<String>();

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();

        int nroLinea = 1;

        try{
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";

            while(((linea=br.readLine()) !=null)){
                texto += linea+"\n";
                cadenas.add(linea);
                nroLinea++;
            }
            
            txtaCadena.setText(texto);
            JOptionPane.showMessageDialog(null, "Archivo leido correctamente");
            int i;
            
            

            for(i = 0; i < cadenas.size(); i++){
                System.out.println(cadenas.get(i));
            }
            
        }
        
        catch(Exception e){

        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed

        if (txtaCadena.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Debe cargar un archivo (clique el botón abrir archivo)", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
       btnVerTabla.setEnabled(true);
        String msgError = "";
        int pos;
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtaCadena.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while(true){
                Tokens tokens = lexer.yylex();
                if(tokens == null){
                    resultado+="Análisis Terminado";
                    JOptionPane.showMessageDialog(null, resultado);
                    return;
                }
                
                switch(tokens){
                    case ERROR:
                        System.out.println("Error en la línea: " +lexer.GetLine());
                        resultado += lexer.lexeme + ": Símbolo No Definido\n";
                        msgError += "Error en la línea: " +lexer.GetLine() + " Símbolo No Reconocido\n";
                        break;
                    
                    case Reservadas:
                        resultado+= lexer.lexeme + " Es un " + tokens + "\n";
                                        tok.add(tokens.toString());
                                        lex.add(lexer.lexeme);
                        break;
                    
                    case Positivo:
                        resultado+= lexer.lexeme + " Es un " + tokens + "\n";
                        break;
                        
                    case Negativo:
                       resultado+= lexer.lexeme + " Es un " + tokens + "\n";
                        break;
                        
                    case Decimal: 
                        resultado+= lexer.lexeme + " Es un " + tokens + "\n";
                                        tok.add(tokens.toString());
                                        lex.add(lexer.lexeme);
                                        nro.add(lexer.GetLine());
                                        tabla.put(lex, tok);
                                        
                                        pos = (int) Math.floor(Math.random() * 13 +1);
            
                                       while(nroT.contains(pos)){
                                       pos = (int) Math.floor(Math.random() * 13 +1);
                                       }
                                        nroT.add(pos);
                                        
                                        break;
                    case Entero:
                    resultado+= lexer.lexeme + " Es un " + tokens + "\n";
                                        tok.add(tokens.toString());
                                        lex.add(lexer.lexeme);
                                        nro.add(lexer.GetLine());
                                        tabla.put(lex, tok);
                                        
                                        pos = (int) Math.floor(Math.random() * 13 +1);
                                        while(nroT.contains(pos)){
                                       pos = (int) Math.floor(Math.random() * 13 +1);
                                       }
                                        nroT.add(pos);
                                        break;
                                        
                    case CadenaNoValida:
                        System.out.println("Error en la línea: " +lexer.GetLine());
                        resultado += lexer.lexeme + ": Símbolo No Reconocido\n";
                        msgError += "Error en la línea: " +lexer.GetLine() + " Símbolo No Reconocido\n";
                        break;
                        
                    case NoValido:
                        System.out.println("Error en la línea: " +lexer.GetLine());
                        resultado += lexer.lexeme + ": Símbolo No Reconocido\n";
                        msgError += "Error en la línea: " +lexer.GetLine() + " Símbolo No Reconocido\n";
                        break; 
                        
                    case ErrorMatematico:
                        System.out.println("Error en la línea: " +lexer.GetLine());
                        resultado += lexer.lexeme + ": Símbolo No Reconocido\n";
                        msgError += "Error en la línea: " +lexer.GetLine() + " Símbolo No Reconocido\n";
                        break;
                        
                    default:
                        resultado+= "Token: " + tokens + "\n";
                }
                txtaAnalizador.setText(msgError);
                mostrar();
                
                Enumeration llaves = tabla.keys();
                while (llaves.hasMoreElements()) {
                System.out.println(""+"hashtable llaves: " + llaves.nextElement());
                System.out.println("Claves: " +tabla.keys());
                
                
}
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        
        txtaAnalizador.setText("");
        txtaCadena.setText("");
        tablaSimbolos.setModel(new DefaultTableModel());
        tok.clear();
        lex.clear();
        nro.clear();
        nroT.clear();
        nTk = 0;
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaActionPerformed

        Hash ven = new Hash();
        ven.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVerTablaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Presentación ven = new Presentación();
        this.setVisible(false);
        nroT.clear();
        lex.clear();
        tok.clear();
        nro.clear();
        ven.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    public void mostrar(){
        Object m [][] = new Object[lex.size()][4];
        
        for(int f = 0; f<lex.size();f++){
            m[f][0] = nroT.get(f);
            m[f][1] = lex.get(f);
            m[f][2] = tok.get(f);
            m[f][3] = nro.get(f);
        }
        
                        tablaSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            m,
            new String [] {
                "Pos_Token", "Token", "Lexema", "Linea"
            }
        ));
    }
    
    public void GenerarHash(){
        int pos;
        int n = lex.size();
        
        for(int i = 0; i<n; i++){
            pos = (int) Math.floor(Math.random() * n);
            
            while(nroT.contains(pos)){
                pos = (int) Math.floor(Math.random() * n);
            }
            
            nroT.add(pos);
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVerTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaSimbolos;
    private javax.swing.JTextArea txtaAnalizador;
    public javax.swing.JTextArea txtaCadena;
    // End of variables declaration//GEN-END:variables
}