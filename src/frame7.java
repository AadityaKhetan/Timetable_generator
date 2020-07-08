
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jitengupta
 */
public class frame7 extends javax.swing.JFrame {

    public ArrayList<ArrayList<String>> aList=new ArrayList<ArrayList<String>>(2);

 

        
    /**
     * Creates new form frame7
     */
    public frame7() {
        initComponents();
    }
class time{
    
    
    
    public String lectArray[] = {"java","Maths","DCOM","DE","HS","free"};

    public String []labArray={"Java lab","DE lab","DCOM lab","UE"};
    

    public int temp_lab;

    public int temp_lect;

   

    int labCounter[]={-2,0,0,0};

    int lectCounter[]={-2,-2,-2,-2,0,0};

   

 

   

    public int a=1;

    public int b=1;

 

 

   

    void randm(){

              temp_lab = (int) (labArray.length * Math.random());

              temp_lect = (int) (lectArray.length * Math.random());             

        }

        void generate(){

           ArrayList<String> a1 = new ArrayList<String>();

            for(int i =0;i<6;i++)

            {

                //List<String> sch = new ArrayList<>();

                for(int j=0;j<5;j++)

                {

                    if(i==3||i==4){

                        while(true){

                            if(a<=10){

                                randm();}
                           else break;

                            if((labCounter[temp_lab]<2)){

                                switch(temp_lab){

                            case 0 : labCounter[0]++;

                                if(labCounter[0]<=0)
                                a1.add(labArray[temp_lab]+ " - SPP");   
                                else
                                    a1.add(labArray[temp_lab]+ " - PDS");

                                    break;

                            case 1 : labCounter[1]++;

                                a1.add(labArray[temp_lab]+ " - BLK");

                                    break;

                            case 2 : labCounter[2]++;

                                a1.add(labArray[temp_lab]+ " - KKM");

                                    break;

                            case 3 : labCounter[3]++;

                                a1.add(labArray[temp_lab]);

                                    break;   

                                        }

                    a++;

                    }  

                }

            }                 

 

                   

                    

                    else{

                       while(true){

                            if(b<=20){

                                randm();}
                            else break;

                            if((lectCounter[temp_lect]<2)){

                                switch(temp_lect){

                            case 0 : lectCounter[0]++;
                                    
                                if(lectCounter[0]<=0)
                                a1.add(lectArray[temp_lect]+ " - PDS");   
                                else
                                    a1.add(lectArray[temp_lect]+ " - SPP");
                                

                                    break;

                            case 1 : lectCounter[1]++;

                                if(lectCounter[1]<=0)
                                a1.add(lectArray[temp_lect]+ " - YPP");   
                                else
                                    a1.add(lectArray[temp_lect]+ " - NCP");

                                    break;

                            case 2 : lectCounter[2]++;

                               if(lectCounter[2]<=0)
                                a1.add(lectArray[temp_lect]+ " - HPP");   
                                else
                                    a1.add(lectArray[temp_lect]+ " - KKM");

                                    break;

                            case 3 : lectCounter[3]++;

                                if(lectCounter[3]<=0)
                                a1.add(lectArray[temp_lect]+ " - AMP");   
                                else
                                    a1.add(lectArray[temp_lect]+ " - BLK");

                                    break;

                            case 4 : lectCounter[4]++;

                                a1.add(lectArray[temp_lect]+ " - ISP");

                                    break;

                            case 5 : lectCounter[5]++;

                                a1.add(lectArray[temp_lect]);

                                break;

                                        }                                               

                   b++;

                    }

                           }

                    }

                    

            }

        }
            aList.add(a1);
              
        }

        /*int   check(int i){
            int constraints = 0;
            int index=i ;
            for(int j = 0;j<30;j++){
            if(aList.get(index).get(j).equals(aList.get(index+1).get(j)))
                constraints++ ;
            
        }
            //i++;
            System.out.println(constraints);
            return constraints;
        }*/
       

        

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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 10, 70, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dept");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 40, 18);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEM");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 10, 45, 18);

        jTextField1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField1.setOpaque(true);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(70, 10, 60, 18);

        jTextField2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField2.setOpaque(true);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 10, 80, 18);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("GENERATE");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(384, 10, 120, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("SHOW");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 10, 80, 30);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9:10-10:10", null, null, null, null, null},
                {"10:10-11:10", null, null, null, null, null},
                {"12:10-1:10", null, null, null, null, null},
                {"1:10-2:10", null, null, null, null, null},
                {"2:20-3:20", null, null, null, null, null},
                {"3:20-4:20", null, null, null, null, null}
            },
            new String [] {
                "Timings", "MON", "TUE", "WED", "THU", "FRI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 130, 720, 130);

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9:10-10:10", null, null, null, null, null},
                {"10:10-11:10", null, null, null, null, null},
                {"12:10-1:10", null, null, null, null, null},
                {"1:10-2:10", null, null, null, null, null},
                {"2:20-3:20", null, null, null, null, null},
                {"3:20-4:20", null, null, null, null, null}
            },
            new String [] {
                "Timings", "MON", "TUE", "WED", "THU", "FRI"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 750, 130);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3IT1");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 50, 18);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("3IT2");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 330, 50, 18);

        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(390, 50, 110, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/jitengupta/NetBeansProjects/Timetable_generator/Charusat.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        jToggleButton1.setText("jToggleButton1");
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(140, 150, 140, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        this.setVisible(false);
        frame3 f = new frame3();
        f.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        time t1=new time();
        time t2=new time();

        t1.generate();
        
        t2.generate();

       // int n = t2.check(0);
        
        //System.out.println(n);
      /* while(true){
           int i=0;
            if(n>=5){
            t1.generate();
            t2.generate();
            i=i+2;
             n = t2.check(i);
            
        }
            else
                
                break;
        }*/
            
FileOutputStream f;

ObjectOutputStream o;

        try {

            f = new FileOutputStream("file1.docx");

            o=new ObjectOutputStream(f);

            o.writeObject(aList.get(0));

            System.out.println(aList.get(0));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error in Connectivity " + e);

        }
        


FileOutputStream ff;

ObjectOutputStream oo;

        try {

            ff = new FileOutputStream("file2.docx");

            oo=new ObjectOutputStream(ff);

            oo.writeObject(aList.get(1));

            System.out.println(aList.get(1));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error in Connectivity " + e);

        
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel tt1 = (DefaultTableModel)jTable1.getModel();    // TODO add your handling code here:
        DefaultTableModel tt2 = (DefaultTableModel)jTable2.getModel();   // TODO add your handling code here:

        
FileInputStream  f1;

ObjectInputStream o1;

        try {

          

            f1=new FileInputStream("file1.docx");

            o1=new ObjectInputStream(f1);

            ArrayList a1 = (ArrayList) o1.readObject();

            System.out.println(a1);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error in Connectivity " + e);

        } 

    
   
    for (int i = 0; i < (aList.get(0).size() / 5); i++){
        for(int k=1;k<6;k++){
        tt1.setValueAt(String.valueOf(aList.get(0).get(5 * i + k -1)),i,k);}
        
    }
    
    FileInputStream  f2;

ObjectInputStream o2;

        try {

          

            f2=new FileInputStream("file2.docx");

            o2=new ObjectInputStream(f2);

           ArrayList a1=(ArrayList) o2.readObject();

            System.out.println(a1);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Error in Connectivity " + e);

        } 

     for (int i = 0; i < (aList.get(1).size() / 5); i++){
        for(int k=1;k<6;k++){
        tt2.setValueAt(String.valueOf(aList.get(1).get(5 * i + k -1)),i,k);}
        
    }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            

try{
    int rows = jTable1.getRowCount();
    Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aaditya","root","admin000");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("delete from 3IT1;");
        for(int row = 0; row<rows; row++)
{
    String time = (String)jTable1.getValueAt(row, 0);
    String s1 = (String)jTable1.getValueAt(row, 1);
    String s2 = (String)jTable1.getValueAt(row, 2);
    String s3 = (String)jTable1.getValueAt(row, 3);
    String s4 = (String)jTable1.getValueAt(row, 4);
    String s5 = (String)jTable1.getValueAt(row, 5);
        stmt.executeUpdate("insert into 3IT1 values('"+time+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');");
}
        //JOptionPane.showMessageDialog(null,"Record Successfully added");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error in Connectivity " + e); 
        }

try{
    int rows = jTable2.getRowCount();
    Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aaditya","root","admin000");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("delete from 3IT2;");
        for(int row = 0; row<rows; row++)
{
    String time = (String)jTable2.getValueAt(row, 0);
    String s1 = (String)jTable2.getValueAt(row, 1);
    String s2 = (String)jTable2.getValueAt(row, 2);
    String s3 = (String)jTable2.getValueAt(row, 3);
    String s4 = (String)jTable2.getValueAt(row, 4);
    String s5 = (String)jTable2.getValueAt(row, 5);
        stmt.executeUpdate("insert into 3IT2 values('"+time+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');");
}
        JOptionPane.showMessageDialog(null,"Record Successfully added");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error in Connectivity " + e); 
        }


//conn.commit();


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
