/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import cipher.Vigenere;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import steganography.MP3;
import steganography.Message;

/**
 *
 * @author triasfahrudin
 */
public class stegaFrame extends javax.swing.JFrame {

    private final int lsb = 8;

    /**
     * Creates new form stegaFrame
     */
    public stegaFrame() {
        initComponents();
        this.setTitle("MP3Stegano");
        this.setLocationRelativeTo(null);
        logs("init...");
    }

    public boolean isWin32() {
        return System.getProperty("os.name").startsWith("Windows");
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
        txtFileName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEncode = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlainText = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        btnExtract = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMp3Size = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPlaintTextSize = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblsizeRatio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMaxAllowedSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("File Name");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        btnEncode.setText("Embeding");
        btnEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncodeActionPerformed(evt);
            }
        });

        txtPlainText.setText("ini adalah test");
        jScrollPane1.setViewportView(txtPlainText);

        jTabbedPane1.addTab("Plain Text", jScrollPane1);

        txtLogs.setColumns(20);
        txtLogs.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtLogs.setRows(5);
        jScrollPane4.setViewportView(txtLogs);

        jTabbedPane1.addTab("Logs", jScrollPane4);

        btnExtract.setText("Extracting");
        btnExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtractActionPerformed(evt);
            }
        });

        jLabel3.setText("MP3 File Size");
        jLabel3.setRequestFocusEnabled(false);

        lblMp3Size.setText("#");

        jLabel5.setText("Plain Text Size");

        lblPlaintTextSize.setText("#");

        jButton2.setText("Refresh Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Size Ratio");

        lblsizeRatio.setText("#");

        jLabel4.setText("Max Allowed Plaintext Size: ");

        lblMaxAllowedSize.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMaxAllowedSize.setText("####");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblMaxAllowedSize))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsizeRatio)
                            .addComponent(lblPlaintTextSize)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblMp3Size))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblMp3Size))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblPlaintTextSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblsizeRatio))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaxAllowedSize)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnEncode)
                        .addGap(18, 18, 18)
                        .addComponent(btnExtract))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtract)
                            .addComponent(btnEncode)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();
        String filePath;

        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 File Name", "mp3");
        jf.setFileFilter(filter);

        int returnVal = jf.showDialog(this, "Select File");
        if (returnVal != JFileChooser.APPROVE_OPTION) {
            return;
        }

        if (!jf.getSelectedFile().getPath().isEmpty()) {
            filePath = jf.getSelectedFile().getPath();
            if (this.isWin32()) {
                filePath = filePath.replace("/", "\\");
            }

            txtFileName.setText(filePath);
            txtFileName.setEditable(false);

            lblMp3Size.setText(String.valueOf(get_size(txtFileName.getText())) + "bytes");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public final void logs(String strLog) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        txtLogs.append(dateFormat.format(date) + ": " + strLog + "\n");

    }

    /**
     * ***************************************************************************
     * @param s
     * @return
     */


    private void substitutionEncode(String MP3_InputFile, String strMsg, String password) throws IOException, Exception {
        String MP3_Ext = "mp3";
        Vigenere vig = new Vigenere();

        String encryptedMsg = vig.Enc(strMsg, password);

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter pFilter = new FileNameExtensionFilter("MP3 FileName", MP3_Ext);
        fileChooser.setFileFilter(pFilter);
        int status = fileChooser.showSaveDialog(this);

        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                String fileName = selectedFile.getCanonicalPath();
                if (!fileName.endsWith(MP3_Ext)) {
                    selectedFile = new File(fileName + "." + MP3_Ext);
                }

                MP3 mp3 = new MP3(MP3_InputFile);
                Message msg = new Message(encryptedMsg);
                mp3.stega(msg, lsb);
                mp3.toMP3(selectedFile.getCanonicalPath());
                //INSERT start_pos sign to file..
                

                logs("END substitutionEncode(...)");

            } catch (IOException e) {
            }
        }
    }

    private void substitutionDecode(String MP3_FileName, String password) throws IOException, Exception {

        String TXT_Ext = "txt";
        Vigenere vig = new Vigenere();

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter pFilter = new FileNameExtensionFilter("Text FileName", TXT_Ext);
        fileChooser.setFileFilter(pFilter);
        int status = fileChooser.showSaveDialog(this);

        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                String fileName = selectedFile.getPath();
                if (!fileName.endsWith(TXT_Ext)) {
                    selectedFile = new File(fileName + "." + TXT_Ext);
                }

                MP3 mp3 = new MP3(MP3_FileName);
               
                try (FileWriter msg = new FileWriter(new File(selectedFile.getPath()))) {
                    String strMsg = mp3.decoder(lsb);
                    msg.write(vig.Dec(strMsg, password));
                    msg.flush();
                }

                logs("END substitutionDecode(...)");

            } catch (IOException e) {

            }
        }
    }


    private void btnEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncodeActionPerformed
        try {
            // TODO add your handling code here:

            if (plaintext_biggerthan_maxsize()) {
                JOptionPane.showMessageDialog(null, "Ukuran Pesan Terlalu Besar!");
            } else {
                substitutionEncode(txtFileName.getText(), txtPlainText.getText(), txtPassword.getText());
            }

        } catch (Exception ex) {
            Logger.getLogger(stegaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEncodeActionPerformed

    private void btnExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtractActionPerformed
        try {
            substitutionDecode(txtFileName.getText(), txtPassword.getText());
        } catch (Exception ex) {
            Logger.getLogger(stegaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnExtractActionPerformed

    private double get_size(String filePath) {
        double size_in_bytes = 0;

        File file = new File(filePath);
        if (file.exists()) {
            size_in_bytes = file.length();
        }

        return size_in_bytes;
    }

    private byte[] StreamtoByteArray(FileInputStream stream) throws IOException {
        int offset = 0;
        int remaining = (int) stream.available();
        byte[] data = new byte[remaining];
        while (remaining > 0) {
            int read = stream.read(data, offset, remaining);
            if (read <= 0) {
                throw new IOException();
            }
            remaining -= read;
            offset += read;
        }
        return data;
    }

    private byte[] FileToByteArray(String path) throws IOException {
        byte[] binary;
        try (FileInputStream fs = new FileInputStream(path)) {
            binary = StreamtoByteArray(fs);
        }
        return binary;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DecimalFormat formatData = new DecimalFormat("#.#####");

        double mp3size = get_size(txtFileName.getText());
        double plaintextSize = txtPlainText.getText().length();
        lblMp3Size.setText(String.valueOf(mp3size) + " bytes");
        lblPlaintTextSize.setText(String.valueOf(plaintextSize) + " bytes");

        //double ratio = ((double) plaintextSize / (double)  mp3size  ) * 0.01;
        double ratio = ((double) plaintextSize / (double) mp3size) / 0.01;
        lblsizeRatio.setText(formatData.format(ratio) + " %");

        try {
            byte[] contentBytes = FileToByteArray(txtFileName.getText());
            double ContentSize = contentBytes.length;

            double ratio_max_allowed = ((double) (ContentSize / lsb) / (double) mp3size) / 0.01;

            lblMaxAllowedSize.setText(Double.toString(Math.ceil(ContentSize / lsb)) + " bytes (" + formatData.format(ratio_max_allowed) + "%)");

        } catch (IOException ex) {
            Logger.getLogger(stegaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean plaintext_biggerthan_maxsize() throws IOException {
        double plaintextSize = txtPlainText.getText().length();

        byte[] contentBytes = FileToByteArray(txtFileName.getText());
        double ContentSize = contentBytes.length;
        double max_size = ContentSize / lsb;

        return plaintextSize > max_size;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stegaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new stegaFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncode;
    private javax.swing.JButton btnExtract;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMaxAllowedSize;
    private javax.swing.JLabel lblMp3Size;
    private javax.swing.JLabel lblPlaintTextSize;
    private javax.swing.JLabel lblsizeRatio;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextArea txtLogs;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JEditorPane txtPlainText;
    // End of variables declaration//GEN-END:variables
}
