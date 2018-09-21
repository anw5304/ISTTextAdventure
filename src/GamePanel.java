/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author az060_001
 */
public class GamePanel extends javax.swing.JPanel {

    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        TextDisplay = new javax.swing.JScrollPane();
        GameText = new javax.swing.JTextArea();
        UserSelection = new javax.swing.JComboBox();

        TextDisplay.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        GameText.setEditable(false);
        GameText.setColumns(20);
        GameText.setLineWrap(true);
        GameText.setRows(5);
        GameText.setWrapStyleWord(true);
        GameText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextDisplay.setViewportView(GameText);

        UserSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(UserSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TextDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TextDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea GameText;
    private javax.swing.JScrollPane TextDisplay;
    private javax.swing.JComboBox UserSelection;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
public void PrintToGameText(String stringToPrint){
    GameText.append(stringToPrint);
    
}
public int getUserSelectionNumber(){
    int userSelection = Integer.parseInt((String) UserSelection.getSelectedItem());
    return userSelection;
}
public void setUserSelectionModelMain(){
       UserSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2"}));
    }
 public void setUserSelectionModelLobby(){
        UserSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3","4","5","6","7" }));
 }
 public void setUserSelectionModelClassroom(){
        UserSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1"}));
 }

}