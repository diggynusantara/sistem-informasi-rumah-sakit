/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author Diggy Nusantara
 */
public class menuUtama extends javax.swing.JFrame {

    /**
     * Creates new form menuUtama
     */
    public menuUtama() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        inputPasien = new javax.swing.JMenuItem();
        inputDokter = new javax.swing.JMenuItem();
        inputPerawat = new javax.swing.JMenuItem();
        inputKlinik = new javax.swing.JMenuItem();
        inputObat = new javax.swing.JMenuItem();
        inputPenyakit = new javax.swing.JMenuItem();
        inputTarif = new javax.swing.JMenuItem();
        inputResep = new javax.swing.JMenuItem();
        inputServis = new javax.swing.JMenuItem();
        inputKunjung = new javax.swing.JMenuItem();
        EXIT = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        dataPasien = new javax.swing.JMenuItem();
        dataDokter = new javax.swing.JMenuItem();
        dataPerawat = new javax.swing.JMenuItem();
        dataKlinik = new javax.swing.JMenuItem();
        dataObat = new javax.swing.JMenuItem();
        dataPenyakit = new javax.swing.JMenuItem();
        dataTarif = new javax.swing.JMenuItem();
        dataResep = new javax.swing.JMenuItem();
        dataServis = new javax.swing.JMenuItem();
        dataKunjung = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        dataBayar = new javax.swing.JMenuItem();
        dataLayan = new javax.swing.JMenuItem();
        dataDerita = new javax.swing.JMenuItem();
        dataDatang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Rumah Sakit");
        setForeground(new java.awt.Color(0, 0, 102));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hospital.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 710));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar2.setBackground(new java.awt.Color(0, 0, 102));

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("MENU INPUT");

        inputPasien.setText("INPUT PASIEN");
        inputPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasienActionPerformed(evt);
            }
        });
        jMenu3.add(inputPasien);

        inputDokter.setText("INPUT DOKTER");
        inputDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDokterActionPerformed(evt);
            }
        });
        jMenu3.add(inputDokter);

        inputPerawat.setText("INPUT PERAWAT");
        inputPerawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPerawatActionPerformed(evt);
            }
        });
        jMenu3.add(inputPerawat);

        inputKlinik.setText("INPUT KLINIK");
        inputKlinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKlinikActionPerformed(evt);
            }
        });
        jMenu3.add(inputKlinik);

        inputObat.setText("INPUT OBAT");
        inputObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputObatActionPerformed(evt);
            }
        });
        jMenu3.add(inputObat);

        inputPenyakit.setText("INPUT PENYAKIT");
        inputPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPenyakitActionPerformed(evt);
            }
        });
        jMenu3.add(inputPenyakit);

        inputTarif.setText("INPUT TARIF DOKTER");
        inputTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTarifActionPerformed(evt);
            }
        });
        jMenu3.add(inputTarif);

        inputResep.setText("INPUT RESEP");
        inputResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputResepActionPerformed(evt);
            }
        });
        jMenu3.add(inputResep);

        inputServis.setText("INPUT SERVIS");
        inputServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputServisActionPerformed(evt);
            }
        });
        jMenu3.add(inputServis);

        inputKunjung.setText("INPUT KUNJUNG");
        inputKunjung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKunjungActionPerformed(evt);
            }
        });
        jMenu3.add(inputKunjung);

        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jMenu3.add(EXIT);

        jMenuBar2.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("MENU DATA");

        dataPasien.setText("DATA PASIEN");
        dataPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPasienActionPerformed(evt);
            }
        });
        jMenu4.add(dataPasien);

        dataDokter.setText("DATA DOKTER");
        dataDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDokterActionPerformed(evt);
            }
        });
        jMenu4.add(dataDokter);

        dataPerawat.setText("DATA PERAWAT");
        dataPerawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPerawatActionPerformed(evt);
            }
        });
        jMenu4.add(dataPerawat);

        dataKlinik.setText("DATA KLINIK");
        dataKlinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKlinikActionPerformed(evt);
            }
        });
        jMenu4.add(dataKlinik);

        dataObat.setText("DATA OBAT");
        dataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataObatActionPerformed(evt);
            }
        });
        jMenu4.add(dataObat);

        dataPenyakit.setText("DATA PENYAKIT");
        dataPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPenyakitActionPerformed(evt);
            }
        });
        jMenu4.add(dataPenyakit);

        dataTarif.setText("DATA TARIF DOKTER");
        dataTarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTarifActionPerformed(evt);
            }
        });
        jMenu4.add(dataTarif);

        dataResep.setText("DATA RESEP");
        dataResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataResepActionPerformed(evt);
            }
        });
        jMenu4.add(dataResep);

        dataServis.setText("DATA SERVIS");
        dataServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataServisActionPerformed(evt);
            }
        });
        jMenu4.add(dataServis);

        dataKunjung.setText("DATA KUNJUNG");
        dataKunjung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKunjungActionPerformed(evt);
            }
        });
        jMenu4.add(dataKunjung);

        jMenuBar2.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("MENU INFO");

        dataBayar.setText("DATA BAYAR");
        dataBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBayarActionPerformed(evt);
            }
        });
        jMenu5.add(dataBayar);

        dataLayan.setText("DATA LAYAN");
        dataLayan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLayanActionPerformed(evt);
            }
        });
        jMenu5.add(dataLayan);

        dataDerita.setText("DATA DERITA");
        dataDerita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDeritaActionPerformed(evt);
            }
        });
        jMenu5.add(dataDerita);

        dataDatang.setText("DATA DATANG");
        dataDatang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDatangActionPerformed(evt);
            }
        });
        jMenu5.add(dataDatang);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasienActionPerformed
        inputPasien ip = new inputPasien();
        ip.setVisible(true);
    }//GEN-LAST:event_inputPasienActionPerformed

    private void inputDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDokterActionPerformed
        inputDokter iDok = new inputDokter();
        iDok.setVisible(true);
    }//GEN-LAST:event_inputDokterActionPerformed

    private void inputPerawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPerawatActionPerformed
        inputPerawat iPer = new inputPerawat();
        iPer.setVisible(true);
    }//GEN-LAST:event_inputPerawatActionPerformed

    private void inputKlinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKlinikActionPerformed
        inputKlinik iKli = new inputKlinik();
        iKli.setVisible(true);
    }//GEN-LAST:event_inputKlinikActionPerformed

    private void inputObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputObatActionPerformed
        inputObat iOba = new inputObat();
        iOba.setVisible(true);
    }//GEN-LAST:event_inputObatActionPerformed

    private void inputPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPenyakitActionPerformed
        inputPenyakit iPen = new inputPenyakit();
        iPen.setVisible(true);
    }//GEN-LAST:event_inputPenyakitActionPerformed

    private void inputTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTarifActionPerformed
        inputTarif iTar = new inputTarif();
        iTar.setVisible(true);
    }//GEN-LAST:event_inputTarifActionPerformed

    private void inputResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputResepActionPerformed
        inputResep iRes = new inputResep();
        iRes.setVisible(true);
    }//GEN-LAST:event_inputResepActionPerformed

    private void inputServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputServisActionPerformed
        inputServis iSer = new inputServis();
        iSer.setVisible(true);
    }//GEN-LAST:event_inputServisActionPerformed

    private void inputKunjungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKunjungActionPerformed
        inputKunjung iKun = new inputKunjung();
        iKun.setVisible(true);
    }//GEN-LAST:event_inputKunjungActionPerformed

    private void dataPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPasienActionPerformed
        dataPasien dPas = new dataPasien();
        dPas.setVisible(true);
    }//GEN-LAST:event_dataPasienActionPerformed

    private void dataDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDokterActionPerformed
        dataDokter dDok = new dataDokter();
        dDok.setVisible(true);
    }//GEN-LAST:event_dataDokterActionPerformed

    private void dataPerawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPerawatActionPerformed
        dataPerawat dPer = new dataPerawat();
        dPer.setVisible(true);
    }//GEN-LAST:event_dataPerawatActionPerformed

    private void dataKlinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKlinikActionPerformed
        dataKlinik dKli = new dataKlinik();
        dKli.setVisible(true);
    }//GEN-LAST:event_dataKlinikActionPerformed

    private void dataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataObatActionPerformed
        dataObat dOba = new dataObat();
        dOba.setVisible(true);
    }//GEN-LAST:event_dataObatActionPerformed

    private void dataPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPenyakitActionPerformed
        dataPenyakit dPen = new dataPenyakit();
        dPen.setVisible(true);
    }//GEN-LAST:event_dataPenyakitActionPerformed

    private void dataTarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTarifActionPerformed
        dataTarifDok dTar = new dataTarifDok();
        dTar.setVisible(true);
    }//GEN-LAST:event_dataTarifActionPerformed

    private void dataResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataResepActionPerformed
        dataResep dRes = new dataResep();
        dRes.setVisible(true);
    }//GEN-LAST:event_dataResepActionPerformed

    private void dataServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataServisActionPerformed
        dataServis dSer = new dataServis();
        dSer.setVisible(true);
    }//GEN-LAST:event_dataServisActionPerformed

    private void dataKunjungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKunjungActionPerformed
        dataKunjung dKun = new dataKunjung();
        dKun.setVisible(true);
    }//GEN-LAST:event_dataKunjungActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void dataBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBayarActionPerformed
        dataPembayaran dPem = new dataPembayaran();
        dPem.setVisible(true);
    }//GEN-LAST:event_dataBayarActionPerformed

    private void dataLayanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLayanActionPerformed
        dataLayan dLan = new dataLayan();
        dLan.setVisible(true);
    }//GEN-LAST:event_dataLayanActionPerformed

    private void dataDeritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDeritaActionPerformed
        dataDerita dDer = new dataDerita();
        dDer.setVisible(true);
    }//GEN-LAST:event_dataDeritaActionPerformed

    private void dataDatangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDatangActionPerformed
        dataDatang dDat = new dataDatang();
        dDat.setVisible(true);
    }//GEN-LAST:event_dataDatangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EXIT;
    private javax.swing.JMenuItem dataBayar;
    private javax.swing.JMenuItem dataDatang;
    private javax.swing.JMenuItem dataDerita;
    private javax.swing.JMenuItem dataDokter;
    private javax.swing.JMenuItem dataKlinik;
    private javax.swing.JMenuItem dataKunjung;
    private javax.swing.JMenuItem dataLayan;
    private javax.swing.JMenuItem dataObat;
    private javax.swing.JMenuItem dataPasien;
    private javax.swing.JMenuItem dataPenyakit;
    private javax.swing.JMenuItem dataPerawat;
    private javax.swing.JMenuItem dataResep;
    private javax.swing.JMenuItem dataServis;
    private javax.swing.JMenuItem dataTarif;
    private javax.swing.JMenuItem inputDokter;
    private javax.swing.JMenuItem inputKlinik;
    private javax.swing.JMenuItem inputKunjung;
    private javax.swing.JMenuItem inputObat;
    private javax.swing.JMenuItem inputPasien;
    private javax.swing.JMenuItem inputPenyakit;
    private javax.swing.JMenuItem inputPerawat;
    private javax.swing.JMenuItem inputResep;
    private javax.swing.JMenuItem inputServis;
    private javax.swing.JMenuItem inputTarif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
