package com.mycompany.juego;
//IMPORTAMOS
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class torre_hanoi extends javax.swing.JFrame {

    
    //Declaramos variables necesarias
    int ContNumMov = 0;
    int CantDisc = 0;
    
    double MinNumMov = 0;
    
    boolean stop = false;
    torre_pila PilaTorreA;
    torre_pila PilaTorreB;
    torre_pila PilaTorreC;
    
    DefaultTableModel ModeloTablaTorreA, ModeloTablaTorreB, ModeloTablaTorreC; 
    
    public torre_hanoi() {
        initComponents();
        
        //Actualizar las tablas
        ModeloTablaTorreA = (DefaultTableModel) TorreA.getModel();
        ModeloTablaTorreA.setRowCount(10);
        
        ModeloTablaTorreB = (DefaultTableModel) TorreB.getModel();
        ModeloTablaTorreB.setRowCount(10);
        
        ModeloTablaTorreC = (DefaultTableModel) TorreC.getModel();
        ModeloTablaTorreC.setRowCount(10);
        
        //CENTRAR LAS TORRES
        DefaultTableCellRenderer renderA = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreA.getColumnModel().getColumn(0).setCellRenderer(renderA);
        
        DefaultTableCellRenderer renderB = new DefaultTableCellRenderer();
        renderB.setHorizontalAlignment(SwingConstants.CENTER);
        TorreB.getColumnModel().getColumn(0).setCellRenderer(renderB);
        
        DefaultTableCellRenderer renderC = new DefaultTableCellRenderer();
        renderC.setHorizontalAlignment(SwingConstants.CENTER);
        TorreC.getColumnModel().getColumn(0).setCellRenderer(renderC);
        
    }
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/torrereal.jpg"));
        return retValue;
    }
    
    private void LimpiarTorre(){
        ContNumMov = 0;
        MinNumMov = 0;
        cb_NumDisco.setSelectedItem(String.valueOf(CantDisc));

    }

    private void ImprimirCantMov(){
        ContNumMov ++;
        Lbl_Mov.setText(String.valueOf(ContNumMov));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TorreA = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TorreB = new javax.swing.JTable();
        btn_A_C = new javax.swing.JButton();
        btn_A_B = new javax.swing.JButton();
        btn_B_A = new javax.swing.JButton();
        btn_B_C = new javax.swing.JButton();
        btn_C_A = new javax.swing.JButton();
        btn_C_B = new javax.swing.JButton();
        cb_NumDisco = new javax.swing.JComboBox<>();
        Lbl_MinMov = new javax.swing.JLabel();
        Lbl_Mov = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();
        btn_resolver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TorreC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(471, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(452, 466));

        TorreA.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TorreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre A"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreA.setAutoscrolls(false);
        TorreA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TorreA.setFocusable(false);
        TorreA.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(TorreA);
        if (TorreA.getColumnModel().getColumnCount() > 0) {
            TorreA.getColumnModel().getColumn(0).setResizable(false);
        }

        TorreB.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TorreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre B"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreB.setAutoscrolls(false);
        TorreB.setFocusable(false);
        TorreB.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(TorreB);
        if (TorreB.getColumnModel().getColumnCount() > 0) {
            TorreB.getColumnModel().getColumn(0).setResizable(false);
        }

        btn_A_C.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_A_C.setText("C");
        btn_A_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A_CActionPerformed(evt);
            }
        });

        btn_A_B.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_A_B.setText("B");
        btn_A_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A_BActionPerformed(evt);
            }
        });

        btn_B_A.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_B_A.setText("A");
        btn_B_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B_AActionPerformed(evt);
            }
        });

        btn_B_C.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_B_C.setText("C");
        btn_B_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B_CActionPerformed(evt);
            }
        });

        btn_C_A.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_C_A.setText("A");
        btn_C_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_AActionPerformed(evt);
            }
        });

        btn_C_B.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_C_B.setText("B");
        btn_C_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_BActionPerformed(evt);
            }
        });

        cb_NumDisco.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cb_NumDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));

        Lbl_MinMov.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Lbl_MinMov.setBorder(new javax.swing.border.MatteBorder(null));

        Lbl_Mov.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Lbl_Mov.setForeground(new java.awt.Color(204, 36, 2));
        Lbl_Mov.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("<html><center>Número mín. de movimientos:");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setText("<html><center>Número de discos:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setText("<html><center>Número de movimientos:");

        btn_iniciar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_reiniciar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });

        btn_resolver.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn_resolver.setText("Resolver");
        btn_resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resolverActionPerformed(evt);
            }
        });

        TorreC.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        TorreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TorreC.setAutoscrolls(false);
        TorreC.setFocusable(false);
        TorreC.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(TorreC);
        if (TorreC.getColumnModel().getColumnCount() > 0) {
            TorreC.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn_A_B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_A_C, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_B_A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_C_A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_C_B, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_resolver, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Mov, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_MinMov, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_NumDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_C_A)
                    .addComponent(btn_C_B)
                    .addComponent(btn_B_C)
                    .addComponent(btn_B_A)
                    .addComponent(btn_A_C)
                    .addComponent(btn_A_B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_NumDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_MinMov, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Mov, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_reiniciar)
                    .addComponent(btn_resolver))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //FUNCIÓN DE LOS BOTONES DE MOVIMIENTO
    private void MoverA_B(){
        try{
            
            if(PilaTorreA.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreA.Peek());
                
                if(PilaTorreB.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreB.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreA.Pop();
                PilaTorreB.Push(Plataforma);
                
                PresentarTorreA();
                PresentarTorreB();
                ImprimirCantMov();
                
            }
            
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    private void MoverA_C(){
        try{
            
            if(PilaTorreA.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreA.Peek());
                
                if(PilaTorreC.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreC.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreA.Pop();
                PilaTorreC.Push(Plataforma);
                
                PresentarTorreA();
                PresentarTorreC();
                ImprimirCantMov();
                if(PilaTorreC.getSLContNodo() == CantDisc && ContNumMov == MinNumMov){
                    JOptionPane.showMessageDialog(null, "¡Muy bien has cumplido con los mínimos de movimientos!\n\nAhora prueba algo más difícil.", "Felicitaciones",JOptionPane.INFORMATION_MESSAGE);
                }else if (PilaTorreC.getSLContNodo() == CantDisc && ContNumMov != MinNumMov){
                    JOptionPane.showMessageDialog(null, "¡Muy bien lo has resuelto!\n\nAhora prueba resolverlo con los mínimos movimientos.", "Felicitaciones",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    private void MoverB_A(){
        try{
            
            if(PilaTorreB.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreB.Peek());
                
                if(PilaTorreA.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreA.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreB.Pop();
                PilaTorreA.Push(Plataforma);
                
                PresentarTorreB();
                PresentarTorreA();
                ImprimirCantMov();
            }
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    private void MoverB_C(){
        try{
            
            if(PilaTorreB.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreB.Peek());
                
                if(PilaTorreC.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreC.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreB.Pop();
                PilaTorreC.Push(Plataforma);
                
                PresentarTorreB();
                PresentarTorreC();
                ImprimirCantMov();
                if(PilaTorreC.getSLContNodo() == CantDisc && ContNumMov == MinNumMov){
                    JOptionPane.showMessageDialog(null, "¡Muy bien has cumplido con los mínimos de movimientos!\n\nAhora prueba algo más difícil.", "Felicitaciones",JOptionPane.INFORMATION_MESSAGE);
                }else if (PilaTorreC.getSLContNodo() == CantDisc && ContNumMov != MinNumMov){
                    JOptionPane.showMessageDialog(null, "¡Muy bien lo has resuelto!\n\nAhora prueba resolverlo con los mínimos movimientos.", "Felicitaciones",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    private void MoverC_A(){
        try{
            
            if(PilaTorreC.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreC.Peek());
                
                if(PilaTorreA.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreA.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreC.Pop();
                PilaTorreA.Push(Plataforma);
                
                PresentarTorreC();
                PresentarTorreA();
                ImprimirCantMov();
            }
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    private void MoverC_B(){
        try{
            
            if(PilaTorreC.getSLContNodo() > 0){
                torre_nodo Plataforma = new torre_nodo();
                
                Plataforma.setDato(PilaTorreC.Peek());
                
                if(PilaTorreB.getSLContNodo() > 0){
                    if (Plataforma.getDato().compareTo(PilaTorreB.Peek()) > 0){
                        return;
                    }
                }
                
                PilaTorreC.Pop();
                PilaTorreB.Push(Plataforma);
                
                PresentarTorreC();
                PresentarTorreB();
                ImprimirCantMov();
            }
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    //BOTÓN DE MOVER A HACÍA B
    private void btn_A_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A_BActionPerformed
        MoverA_B();
    }//GEN-LAST:event_btn_A_BActionPerformed

    //Botón de reiniciar
    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        Reiniciar();
    }//GEN-LAST:event_btn_reiniciarActionPerformed
   
    //INICIAR JUEGO
    private void Iniciar(){
        try{
        PilaTorreA = new torre_pila();
        PilaTorreB = new torre_pila();
        PilaTorreC = new torre_pila();
        
        CantDisc = Integer.parseInt(cb_NumDisco.getSelectedItem().toString());
        
        //Calcular el número mínimo de movimientos
        MinNumMov = Math.pow(2,CantDisc)-1; 
        
        //Mostrar la cantidad de movimientos = 0
        Lbl_Mov.setText(String.valueOf(ContNumMov));
        
        //"%.0f" es para quitar los 1,00 y solo mostrar el 1
        Lbl_MinMov.setText(String.valueOf(String.format("%.0f", MinNumMov)));
        
        //Graficar la torre
        for(int k = CantDisc; k >= 1; k--){
            torre_nodo Plataforma = new torre_nodo();
            
            String Disco = "";
            
            for(int x = k; x > 0; x--){
                Disco+="#";
            }
            
            Plataforma.setDato(Disco);
            PilaTorreA.Push(Plataforma);
        }
        
        PresentarTorreA();
        PresentarTorreB();
        PresentarTorreC();
        
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        ContNumMov=0;
        Iniciar();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    //BOTÓN DE Mover de A hacía C
    private void btn_A_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A_CActionPerformed
        MoverA_C();
    }//GEN-LAST:event_btn_A_CActionPerformed

    //BOTÓN DE Mover de B hacía A
    private void btn_B_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B_AActionPerformed
        MoverB_A();
    }//GEN-LAST:event_btn_B_AActionPerformed

    //BOTÓN DE Mover de B hacía C
    private void btn_B_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B_CActionPerformed
        MoverB_C();
    }//GEN-LAST:event_btn_B_CActionPerformed

    //BOTÓN DE Mover de C hacía A
    private void btn_C_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_AActionPerformed
        MoverC_A();
    }//GEN-LAST:event_btn_C_AActionPerformed

    //BOTÓN DE Mover de C hacía B
    private void btn_C_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_BActionPerformed
        MoverC_B();
    }//GEN-LAST:event_btn_C_BActionPerformed

    private void MoverPlataforma(torre_pila Origen, torre_pila Destino){
        if (stop == false){
            torre_nodo Plataforma = new torre_nodo();
            Plataforma.setDato(Origen.Peek());
            Origen.Pop();   
            Destino.Push(Plataforma);
            
            PresentarTorreA();
            PresentarTorreB();
            PresentarTorreC();
            ImprimirCantMov();
            
            //Imprimir
            torre_hanoi mtorre = new torre_hanoi();
            JOptionPane panel = new JOptionPane("Paso # " + Lbl_Mov.getText() + "\n\n¿Continuar?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
            JDialog dialogo = panel.createDialog("Número de pasos");
            dialogo.setLocationRelativeTo(mtorre);
            dialogo.setVisible(true);
            
            int opt = (int) panel.getValue();
            
            if (opt ==JOptionPane.NO_OPTION){
                stop = true;
            }
        }
    }
    
    private void ResolverHanoi(int k, torre_pila Ori, torre_pila Aux, torre_pila Des){
        if (k == 1){
            MoverPlataforma(Ori, Des);
        }else {
            ResolverHanoi(k - 1, Ori, Des, Aux);
            
            MoverPlataforma(Ori, Des);
            
            ResolverHanoi(k - 1, Aux, Ori, Des);
        }
    }
    private void btn_resolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resolverActionPerformed
        if (!Lbl_MinMov.getText().equals("") && PilaTorreC.getSLContNodo() != CantDisc){
            Reiniciar();
            stop = false;
            ResolverHanoi(CantDisc, PilaTorreA, PilaTorreB, PilaTorreC);
        }
    }//GEN-LAST:event_btn_resolverActionPerformed

    //REINICIAR JUEGO
    private void Reiniciar(){
        try{
            if(!Lbl_MinMov.getText().equals("")){
                LimpiarTorre();
                Iniciar();
            }
            
        }catch(Exception E) {
            System.out.println("Error: " + E.getMessage());
        }
    }
    
    //PRESENTAR TORRES
    private void PresentarTorreA(){
        ((DefaultTableModel)TorreA.getModel()).setRowCount(0);
        ModeloTablaTorreA.setRowCount(10);
        torre_nodo k;
        
        int RowDisco = (10 - PilaTorreA.getSLContNodo());
        
        if(PilaTorreA.getSLContNodo() > 0){
             
            for (k = PilaTorreA.getCabeza(); k.getAbajo() != null; k=k.getAbajo()){
                String[] VectorNormal = {k.getDato()};
                
                ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            
            if(k.getAbajo() == null){
                String[] VectorNormal = {k.getDato()};
                ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
            }
            TorreA.setModel(ModeloTablaTorreA);
            ModeloTablaTorreA.setRowCount(10);
        }
    }
    
    private void PresentarTorreB(){
        ((DefaultTableModel)TorreB.getModel()).setRowCount(0);
        ModeloTablaTorreB.setRowCount(10);
        torre_nodo k;
        
        int RowDisco = (10 - PilaTorreB.getSLContNodo());
        
        if(PilaTorreB.getSLContNodo() > 0){
             
            for (k = PilaTorreB.getCabeza(); k.getAbajo() != null; k=k.getAbajo()){
                String[] VectorNormal = {k.getDato()};
                
                ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            
            if(k.getAbajo() == null){
                String[] VectorNormal = {k.getDato()};
                ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
            }
            TorreB.setModel(ModeloTablaTorreB);
            ModeloTablaTorreB.setRowCount(10);
        }
    }
    
    private void PresentarTorreC(){
        ((DefaultTableModel)TorreC.getModel()).setRowCount(0);
        ModeloTablaTorreC.setRowCount(10);
        torre_nodo k;
        
        int RowDisco = (10 - PilaTorreC.getSLContNodo());
        
        if(PilaTorreC.getSLContNodo() > 0){
             
            for (k = PilaTorreC.getCabeza(); k.getAbajo() != null; k=k.getAbajo()){
                String[] VectorNormal = {k.getDato()};
                
                ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            
            if(k.getAbajo() == null){
                String[] VectorNormal = {k.getDato()};
                ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
            }
            TorreC.setModel(ModeloTablaTorreC);
            ModeloTablaTorreC.setRowCount(10);
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
            java.util.logging.Logger.getLogger(torre_hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(torre_hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(torre_hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(torre_hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new torre_hanoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_MinMov;
    private javax.swing.JLabel Lbl_Mov;
    private javax.swing.JTable TorreA;
    private javax.swing.JTable TorreB;
    private javax.swing.JTable TorreC;
    private javax.swing.JButton btn_A_B;
    private javax.swing.JButton btn_A_C;
    private javax.swing.JButton btn_B_A;
    private javax.swing.JButton btn_B_C;
    private javax.swing.JButton btn_C_A;
    private javax.swing.JButton btn_C_B;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton btn_resolver;
    private javax.swing.JComboBox<String> cb_NumDisco;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
