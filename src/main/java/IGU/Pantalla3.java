
package IGU;

public class Pantalla3 extends javax.swing.JFrame {

    private String resultado2;
    private double election1;
    public Pantalla3() {
        initComponents();
    }

      public void setResultado2(String resultado2){
        this.resultado2 = resultado2;
    }
      
      public void SetfirstEleccion(Double election){
        this.election1 = election;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListaMonedas2 = new javax.swing.JComboBox<>();
        btnListo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese la opcion a cambiar");

        ListaMonedas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso", "Dolar", "Euro", "Libras", "Yen" }));
        ListaMonedas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMonedas2ActionPerformed(evt);
            }
        });

        btnListo2.setText("Listo");
        btnListo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListaMonedas2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListo2)
                .addGap(256, 256, 256))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(ListaMonedas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnListo2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListo2ActionPerformed
        // TODO add your handling code here:
       String moneda = ListaMonedas2.getSelectedItem().toString();
     double moneda3;
        switch (moneda) {
            case "Peso":
                moneda3 = 1;
                break;
            case "Dolar":
                moneda3 = 20;
                break;
            case "Euro":
                moneda3 = 23;
                break;
            case "Libras":
                moneda3 =  21;
                break;
            case "Yen":
                moneda3 = 0.12;
            default:
                System.out.println("NO elegiste nada");
                throw new AssertionError();
        }      
      
   this.setVisible(false);
   String moneda2 = ListaMonedas2.getSelectedItem().toString();
   Resultados r = new Resultados();
   r.setResultado3(resultado2);
  Double resultado = Double.parseDouble(resultado2);
  double total = resultado*election1;
  String cadena = String.valueOf(total);
   r.mostrar(cadena);
   r.setVisible(true);
   r.setLocationRelativeTo(null);
   
    }//GEN-LAST:event_btnListo2ActionPerformed

    private void ListaMonedas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMonedas2ActionPerformed
     
    }//GEN-LAST:event_ListaMonedas2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaMonedas2;
    private javax.swing.JButton btnListo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
