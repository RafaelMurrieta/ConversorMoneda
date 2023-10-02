
package IGU;

public class Pantalla2 extends javax.swing.JFrame  {

    private String resultado;
    public Pantalla2() {
        initComponents();
        System.out.println("Entra a pantalla 2");
    }

     public void setResultado(String resultado){
        this.resultado = resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListaMonedas = new javax.swing.JComboBox<>();
        listo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Eliga la moneda que quiera cambiar");

        ListaMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso", "Dolar", "Euro", "Libras", "Yen" }));
        ListaMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMonedasActionPerformed(evt);
            }
        });

        listo1.setText("Listo");
        listo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listo1MouseClicked(evt);
            }
        });
        listo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(listo1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ListaMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(listo1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMonedasActionPerformed
      
    }//GEN-LAST:event_ListaMonedasActionPerformed

    private void listo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listo1ActionPerformed
    this.setVisible(false);//Va a cerrar el Jframe al darle al boton
    Pantalla3 p3 = new Pantalla3();
    p3.setResultado2(resultado);
    String moneda = ListaMonedas.getSelectedItem().toString();
     double moneda1;
        switch (moneda) {
            case "Peso":
                moneda1 = 1;
                break;
            case "Dolar":
                moneda1 = 20;
                break;
            case "Euro":
                moneda1 = 23;
                break;
            case "Libras":
                moneda1 =  21;
                break;
            case "Yen":
                moneda1 = 0.12;
                break;
            default:
                System.out.println("NO elegiste nada");
                throw new AssertionError();
                
        }
     
    p3.SetfirstEleccion(moneda1);
    p3.setLocationRelativeTo(null);
    p3.setVisible(true); // Hacer visible el nuevo JFrame Pantalla3
       
    
    
    }//GEN-LAST:event_listo1ActionPerformed

    private void listo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listo1MouseClicked

    }//GEN-LAST:event_listo1MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaMonedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listo1;
    // End of variables declaration//GEN-END:variables
}
