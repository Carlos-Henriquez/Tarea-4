/**
 *
 * @author Carlos Henriquez, matricula: 2020-10203
 *  
 */
package Vista;

import Modelo.Usuarios;
import Modelo.UsuariosDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Listado extends javax.swing.JFrame {

    //Se Crean las intancia pertinentes para el codigo.
    //Se crean 'private' ya que solamente seran utilizados por esta clase.
    private UsuariosDAO usuarioDAO = new UsuariosDAO();
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel tmp = new DefaultTableModel();
    private String usuarioActual = "";

    public Listado() {
        initComponents();
        //Este comando sirve para poner el cuadro en el centro de la pantalla.
        this.setLocationRelativeTo(null);
        ListadoUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Codigo de la parte grafica del programa.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableListado = new javax.swing.JTable();
        BotonEliminar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTADO DE USUARIOS");

        TableListado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellido", "Correo electr??nico", "N??mero de tel??fono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableListado);
        if (TableListado.getColumnModel().getColumnCount() > 0) {
            TableListado.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableListado.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableListado.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableListado.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableListado.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        BotonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCerrarSesion.setText("Cerrar sesi??n");
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerrarSesion)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Esta funcion sirve para poder limpiar una fila de la tabla.
    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    //Esta funci??n sirve para tomar el listado que se encuentra en la base de datos
    // y ir escribiendola en la lista del programa.
    private void ListadoUsuarios() {
        LimpiarTable();
        List<Usuarios> lst_usuarios = usuarioDAO.Listado();
        modelo = (DefaultTableModel) TableListado.getModel();
        Object[] ob = new Object[5];
        //Con este bulcle for a??ade la infomacion pertinente en cada celda de la
        //fila de la tabla.
        for (int i = 0; i < lst_usuarios.size(); i++) {
            ob[0] = lst_usuarios.get(i).getUsuario();
            ob[1] = lst_usuarios.get(i).getNombre();
            ob[2] = lst_usuarios.get(i).getApellido();
            ob[3] = lst_usuarios.get(i).getCorreoElectronico();
            ob[4] = lst_usuarios.get(i).getTelefono();
            modelo.addRow(ob);
        }
        TableListado.setModel(modelo);

    }

    //Al precionar el boton de cerrar sesion, vuelve otra vez a mostrar la ventana
    //del "Login" mientras hace un dispose de la ventan de listado.
    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        Login viewLogin = new Login();
        viewLogin.show();
        this.dispose();

    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    //Este boton sirve para hacer la funcion de eliminar de la lista/base de datos
    //desde el programa especificamente desde la ventana del listado.
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
        if (usuarioActual != "") {
            Usuarios usuario_para_elimnar = usuarioDAO.BuscarPorIdentificador(usuarioActual);

            if (usuarioDAO.EliminarUsuario(usuarioActual)) {
                JOptionPane.showMessageDialog(null, "El uusuario se ha eliminado con exito.");
                ListadoUsuarios();

            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar, intentelo de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccionar el usuario o la fila a la que perteneciente para eliminar.");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    //Esta funcion sirve para seleccionar mediante el mouse haciendo clic derecho
    //en una fila de la lista, lo tome para posteriormente esta fila en especifico sea 
    //afectada por una de las de las opciones sea de eleminar o de actualizar.
    private void TableListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableListadoMouseClicked
        int column = 0;
        int row = TableListado.getSelectedRow();
        usuarioActual = TableListado.getModel().getValueAt(row, column).toString();
    }//GEN-LAST:event_TableListadoMouseClicked

    //Este boton sirve para realizar la accion de actualizaci??n de los datos del usuario.
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed

        if (!usuarioActual.isBlank()) {
            Usuarios user = usuarioDAO.BuscarPorIdentificador(usuarioActual);

            Registrarse viewRegistro = new Registrarse(user);

            viewRegistro.show();
            dispose();

            ListadoUsuarios();

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccionar el usuario o la fila a la que pertene para actualizar.");

        }


    }//GEN-LAST:event_BotonActualizarActionPerformed
    //Esto se genera automaticamente por NetBeans
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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //Esto es para hacer el ejecutable del listado
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JTable TableListado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
