
package login_log;


import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TabAlignment;
import com.sun.glass.events.KeyEvent;
import java.awt.List;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Tab;
import javax.swing.text.TabStop;
import java.lang.String;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.ILineDrawer;
import static com.itextpdf.kernel.xmp.PdfConst.Date;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;


import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class secondwindow extends javax.swing.JFrame {
    sqlConnection con=new sqlConnection();
    PreparedStatement pst;
    ResultSet rs;
    float am = 0;
    
    
    
    public secondwindow() 
    {
        initComponents();
        sqlConnection con=new sqlConnection();
        currentDate();
        purchaseDate();
        showdata();
          showdata1();
            showdata3();
              showdata4();
             
              Date();
              orderId();
              jtxtsubtotal.setEditable(false);
              jtxtpurchasedate.setEditable(false);
              jtxtorderdate.setEditable(false);
              jtxtbalanceremaining.setEditable(false);
              jtxtdategeneralledger.setEditable(false);
              jtxttotalamountpurchase.setEditable(false);
              jtxtorderid.setEditable(false);
              jtxtquantityleft.setEditable(false);
              jtxtnettotal.setEditable(false);
               setColour();
              
            
             
       
       
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jbtngroup = new javax.swing.ButtonGroup();
        jbtngrouppurchase = new javax.swing.ButtonGroup();
        jbtngroupsales = new javax.swing.ButtonGroup();
        jbtngroupprice = new javax.swing.ButtonGroup();
        jbtngroupcustomertype = new javax.swing.ButtonGroup();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jtxtemployeeid = new javax.swing.JTextField();
        jtxtemployeesalary = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtxtemployeeaddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jtxtemployeecn = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtxtemployeename = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jtxtemployeedesignation = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel57 = new javax.swing.JLabel();
        jbtnattach = new javax.swing.JButton();
        jtxtpath = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jtxtsearchempid = new javax.swing.JTextField();
        jbtnsearchemployees = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jtxtsearchempname = new javax.swing.JTextField();
        jtxtsearchempcn = new javax.swing.JTextField();
        jtxtsearchempadd = new javax.swing.JTextField();
        jtxtsearchempsal = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jtxtsearchempdesig = new javax.swing.JTextField();
        jbtnclearemployees = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtableemployee = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jbtnadd = new javax.swing.JButton();
        jbtnupdateemployee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtxtvendorid = new javax.swing.JTextField();
        jtxtvendorname = new javax.swing.JTextField();
        jtxtvendoraddress = new javax.swing.JTextField();
        jtxtvendorcn = new javax.swing.JTextField();
        jbtnattachvendor = new javax.swing.JButton();
        jtxtpathvendor = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel58 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jtxtsearchvndid = new javax.swing.JTextField();
        jbtnsearchvendor = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jtxtsearchvndcn = new javax.swing.JTextField();
        jtxtsearchvndname = new javax.swing.JTextField();
        jtxtsearchvndproduct = new javax.swing.JTextField();
        jtxtsearchvndaddress = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtablevendors = new javax.swing.JTable();
        jbtnclearvendors = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jbtnaddvendor = new javax.swing.JButton();
        jbtnupdatevendor = new javax.swing.JButton();
        jbtndeletevendor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jtxtcustomeridledger = new javax.swing.JTextField();
        jtxtvendoridledger = new javax.swing.JTextField();
        jtxtemployeeidledger = new javax.swing.JTextField();
        jtxtdebit = new javax.swing.JTextField();
        jtxtcredit = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jtxtdategeneralledger = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtdescription = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablegeneralledger = new javax.swing.JTable();
        jPanel41 = new javax.swing.JPanel();
        jrbtnemployee = new javax.swing.JRadioButton();
        jrbtnvendor = new javax.swing.JRadioButton();
        jrbtncustomer = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jtxtsearcgledger = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtproductid = new javax.swing.JTextField();
        jtxtproductname = new javax.swing.JTextField();
        jtxtpurchaseprice = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jtxtdiscount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtxtquantityleft = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel59 = new javax.swing.JLabel();
        jtxtpathproducts = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jtxtsellingprice = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jtxtsearchpid = new javax.swing.JTextField();
        jbtnsearchproducts = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jtxtsearchpname = new javax.swing.JTextField();
        jtxtsearchpprice = new javax.swing.JTextField();
        jtxtsearchpquantity = new javax.swing.JTextField();
        jtxtsearchpdiscount = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtableproducts = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jbtnupdateproduct = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbtnaddproducts = new javax.swing.JButton();
        jbtndeleteproducts = new javax.swing.JButton();
        jbtnclearproducts = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jtxtsearchcusid = new javax.swing.JTextField();
        jbtnsearchcustomers = new javax.swing.JButton();
        jtxtsearchcusname = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jtxtsearchcusaddress = new javax.swing.JTextField();
        jtxtsearchcuscn = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jtxtsearchcusshopname = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtablecustomers = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jbtnaddcustomer = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jbtnupdatecustomer = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jtxtshopname = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jtxtcustomeraddress = new javax.swing.JTextField();
        jtxtcustomercn = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jLabel60 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jtxtcustomerid = new javax.swing.JTextField();
        jtxtcustomername = new javax.swing.JTextField();
        jtxtpathcustomers = new javax.swing.JTextField();
        jbtnclearcustomers = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtxtorderdate = new javax.swing.JTextField();
        jtxtcustomeridinorders = new javax.swing.JTextField();
        jtxtcustomernameinorders = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtorderid = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jtxtsubtotal = new javax.swing.JTextField();
        jtxtamountpaid = new javax.swing.JTextField();
        jtxtbalanceremaining = new javax.swing.JTextField();
        jbtnprint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxttax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtfreight = new javax.swing.JTextField();
        jtxtdiscountsales = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jtxtnettotal = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jtxtsearchcusnamesales = new javax.swing.JTextField();
        jbtnsearchorders = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jtxtsearchcusidsales = new javax.swing.JTextField();
        jtxtsearchorderidsales = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jtxtsearchorderdatesales = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jtxtquantitysales = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jbtnneworders = new javax.swing.JButton();
        jtxtproductidsales = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jbtndeletesales = new javax.swing.JButton();
        jtxtpricesales = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jtxtproductnameinorders = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtablesales = new javax.swing.JTable();
        jPanel44 = new javax.swing.JPanel();
        jrbtncashsales = new javax.swing.JRadioButton();
        jrbtncreditsales = new javax.swing.JRadioButton();
        jPanel47 = new javax.swing.JPanel();
        jrbtnfixedprice = new javax.swing.JRadioButton();
        jrbtnvariableprice = new javax.swing.JRadioButton();
        jrbtncountercustomer = new javax.swing.JRadioButton();
        jrbtnpermanentcustomer = new javax.swing.JRadioButton();
        jPanel42 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jtxtproductidpv = new javax.swing.JTextField();
        jtxtvendoridpv = new javax.swing.JTextField();
        jtxtquantitypv = new javax.swing.JTextField();
        jtxtpurchasedate = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jtxtpricepurchase = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jtxttotalamountpurchase = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jbtnclearpv = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jbtnaddpurchase = new javax.swing.JButton();
        jbtndeletepurchase = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jrbcashpurchase = new javax.swing.JRadioButton();
        jbrcreditpurchase = new javax.swing.JRadioButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableproduct_vendor = new javax.swing.JTable();
        jPanel45 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jtxtsearchpurchasedate = new javax.swing.JTextField();
        jtxtsearchpurchaseproduct = new javax.swing.JTextField();
        jtxtsearchvendorpurchase = new javax.swing.JTextField();
        jbtnsearchpurchase = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jmenuedailycashsale = new javax.swing.JMenuItem();
        jmenuedailycreditsaless = new javax.swing.JMenuItem();
        jmenuedailycashpurchase = new javax.swing.JMenuItem();
        jmenuedailycreditpurchase = new javax.swing.JMenuItem();
        jmenuedailyoverallreview = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane6.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane1KeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("EMPLOYEE");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("EMPLOYEE ID");

        jtxtemployeeid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtemployeeidActionPerformed(evt);
            }
        });
        jtxtemployeeid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeeidKeyPressed(evt);
            }
        });

        jtxtemployeesalary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeesalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtemployeesalaryActionPerformed(evt);
            }
        });
        jtxtemployeesalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeesalaryKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("EMPLOYEE NAME");

        jtxtemployeeaddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeeaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeeaddressKeyPressed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("EMPLOYEE CONTACT#");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("EMPLOYEE ADDRESS");

        jtxtemployeecn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtemployeecnActionPerformed(evt);
            }
        });
        jtxtemployeecn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeecnKeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("EMPLOYEE SALARY");

        jtxtemployeename.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeenameKeyPressed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("EMPLOYEE DESIGNATION");

        jtxtemployeedesignation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeedesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtemployeedesignationActionPerformed(evt);
            }
        });
        jtxtemployeedesignation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtemployeedesignationKeyPressed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setText("EMPLOYEE_IMAGE");

        jDesktopPane1.setBackground(new java.awt.Color(255, 51, 51));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jDesktopPane1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel57.setBackground(new java.awt.Color(255, 0, 0));
        jLabel57.setForeground(new java.awt.Color(255, 0, 0));

        jDesktopPane1.setLayer(jLabel57, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jbtnattach.setText("ADD IMAGE");
        jbtnattach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnattachActionPerformed(evt);
            }
        });
        jbtnattach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnattachKeyPressed(evt);
            }
        });

        jtxtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtpath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnattach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addComponent(jtxtemployeeid, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jtxtemployeename)
                    .addComponent(jtxtemployeecn)
                    .addComponent(jtxtemployeeaddress)
                    .addComponent(jtxtemployeesalary)
                    .addComponent(jtxtemployeedesignation))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jtxtemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jtxtemployeename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtemployeecn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtemployeeaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtemployeesalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtemployeedesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addContainerGap())
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnattach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE))))
        );

        jPanel19.setBackground(new java.awt.Color(255, 51, 51));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel31.setText("emp_id");

        jtxtsearchempid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempidKeyPressed(evt);
            }
        });

        jbtnsearchemployees.setBackground(new java.awt.Color(255, 0, 0));
        jbtnsearchemployees.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jbtnsearchemployees.setForeground(new java.awt.Color(255, 255, 255));
        jbtnsearchemployees.setText("SEARCH");
        jbtnsearchemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchemployeesActionPerformed(evt);
            }
        });
        jbtnsearchemployees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnsearchemployeesKeyPressed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel66.setText("emp_name");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel67.setText("contact#");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel70.setText("address");

        jtxtsearchempname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempnameKeyPressed(evt);
            }
        });

        jtxtsearchempcn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempcn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempcnKeyPressed(evt);
            }
        });

        jtxtsearchempadd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempaddKeyPressed(evt);
            }
        });

        jtxtsearchempsal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempsal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempsalKeyPressed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel71.setText("salary");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel72.setText("designation");

        jtxtsearchempdesig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchempdesig.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchempdesigKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtsearchempid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxtsearchempadd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnsearchemployees)
                            .addGap(7, 7, 7)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtsearchempname, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jtxtsearchempsal)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchempcn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtxtsearchempdesig, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchempname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchempcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel70))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchempadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchempsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchempdesig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnsearchemployees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnclearemployees.setText("CLEAR");
        jbtnclearemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearemployeesActionPerformed(evt);
            }
        });
        jbtnclearemployees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnclearemployeesKeyPressed(evt);
            }
        });

        jtableemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtableemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableemployeeMouseClicked(evt);
            }
        });
        jtableemployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtableemployeeKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(jtableemployee);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jButton15.setText("NEW");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jButton15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton15KeyPressed(evt);
            }
        });

        jbtndelete.setText("DELETE EMPLOYEE");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });
        jbtndelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtndeleteKeyPressed(evt);
            }
        });

        jbtnadd.setText("ADD EMPLOYEE");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });
        jbtnadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnaddKeyPressed(evt);
            }
        });

        jbtnupdateemployee.setText("UPDATE EMPLOYEE");
        jbtnupdateemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateemployeeActionPerformed(evt);
            }
        });
        jbtnupdateemployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnupdateemployeeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnupdateemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnupdateemployee)
                    .addComponent(jbtnadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtndelete)
                    .addComponent(jButton15))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(918, 918, 918)
                        .addComponent(jbtnclearemployees, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(4898, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jbtnclearemployees)
                .addContainerGap(2543, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMPLOYEES", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jPanel12.setBackground(new java.awt.Color(102, 102, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("VENDORS");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(631, 631, 631)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("VENDOR ID");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("VENDOR NAME");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("VENDOR ADDRESS");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("VENDOR CONTACT#");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("VENDOR IMAGE");

        jtxtvendorid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtvendoridActionPerformed(evt);
            }
        });
        jtxtvendorid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtvendoridKeyPressed(evt);
            }
        });

        jtxtvendorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendorname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtvendornameKeyPressed(evt);
            }
        });

        jtxtvendoraddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendoraddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtvendoraddressKeyPressed(evt);
            }
        });

        jtxtvendorcn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendorcn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtvendorcnKeyPressed(evt);
            }
        });

        jbtnattachvendor.setForeground(new java.awt.Color(153, 153, 255));
        jbtnattachvendor.setText("ADD IMAGE");
        jbtnattachvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnattachvendorActionPerformed(evt);
            }
        });
        jbtnattachvendor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnattachvendorKeyPressed(evt);
            }
        });

        jtxtpathvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpathvendorActionPerformed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(0, 153, 255));
        jDesktopPane2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel58.setBackground(new java.awt.Color(51, 153, 255));
        jLabel58.setForeground(new java.awt.Color(0, 153, 255));

        jDesktopPane2.setLayer(jLabel58, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtvendorid)
                            .addComponent(jtxtvendorname, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnattachvendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtpathvendor))
                                .addGap(42, 42, 42))
                            .addComponent(jtxtvendoraddress)
                            .addComponent(jtxtvendorcn))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtvendorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxtvendorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxtvendoraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jtxtvendorcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbtnattachvendor)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtpathvendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(51, 153, 255));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel23.setText("vendor id");

        jtxtsearchvndid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchvndid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchvndidActionPerformed(evt);
            }
        });

        jbtnsearchvendor.setBackground(new java.awt.Color(102, 102, 255));
        jbtnsearchvendor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jbtnsearchvendor.setForeground(new java.awt.Color(255, 255, 255));
        jbtnsearchvendor.setText("SEARCH");
        jbtnsearchvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchvendorActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel34.setText("product");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel73.setText("vendor name");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel74.setText("contact#");

        jtxtsearchvndcn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchvndcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchvndcnActionPerformed(evt);
            }
        });

        jtxtsearchvndname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchvndname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchvndnameActionPerformed(evt);
            }
        });

        jtxtsearchvndproduct.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsearchvndproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchvndproductActionPerformed(evt);
            }
        });

        jtxtsearchvndaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchvndaddressActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel75.setText("address");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearchvndcn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsearchvndid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel74)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtsearchvndname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnsearchvendor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(162, 162, 162)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtsearchvndaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtsearchvndproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addGap(49, 49, 49))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearchvndname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsearchvndaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtsearchvndproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel73)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtsearchvndid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtsearchvndcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsearchvendor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        jScrollPane9.setBackground(new java.awt.Color(204, 204, 255));

        jtablevendors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VENDOR ID", "VENDOR NAME", "VENDOR ADDRESS", "VENDOR CONTACT#"
            }
        ));
        jtablevendors.setMaximumSize(new java.awt.Dimension(64, 64));
        jtablevendors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablevendorsMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jtablevendors);

        jScrollPane14.setViewportView(jScrollPane9);

        jbtnclearvendors.setForeground(new java.awt.Color(153, 153, 255));
        jbtnclearvendors.setText("CLEAR");
        jbtnclearvendors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearvendorsActionPerformed(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(204, 204, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jButton10.setForeground(new java.awt.Color(153, 153, 255));
        jButton10.setText("NEW");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton10KeyPressed(evt);
            }
        });

        jbtnaddvendor.setForeground(new java.awt.Color(153, 153, 255));
        jbtnaddvendor.setText("ADD VENDOR");
        jbtnaddvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddvendorActionPerformed(evt);
            }
        });
        jbtnaddvendor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnaddvendorKeyPressed(evt);
            }
        });

        jbtnupdatevendor.setForeground(new java.awt.Color(153, 153, 255));
        jbtnupdatevendor.setText("UPDATE VENDOR");
        jbtnupdatevendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdatevendorActionPerformed(evt);
            }
        });
        jbtnupdatevendor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnupdatevendorKeyPressed(evt);
            }
        });

        jbtndeletevendor.setForeground(new java.awt.Color(153, 153, 255));
        jbtndeletevendor.setText("DELETE VENDOR");
        jbtndeletevendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeletevendorActionPerformed(evt);
            }
        });
        jbtndeletevendor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtndeletevendorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtndeletevendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnaddvendor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnupdatevendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnaddvendor)
                    .addComponent(jbtnupdatevendor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtndeletevendor)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane14)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(973, 973, 973)
                        .addComponent(jbtnclearvendors)))
                .addContainerGap(4912, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnclearvendors)
                .addContainerGap(2569, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENDORS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel61.setText("customer_id");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel62.setText("vendor_id");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel63.setText("employee_id");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel64.setText("debit");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel65.setText("credit");

        jtxtcustomeridledger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtvendoridledger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendoridledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtvendoridledgerActionPerformed(evt);
            }
        });

        jtxtemployeeidledger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtemployeeidledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtemployeeidledgerActionPerformed(evt);
            }
        });

        jtxtdebit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtcredit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel68.setText("date");

        jtxtdategeneralledger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtdategeneralledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdategeneralledgerActionPerformed(evt);
            }
        });

        jtxtdescription.setColumns(20);
        jtxtdescription.setRows(5);
        jScrollPane1.setViewportView(jtxtdescription);

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel89.setText("Description");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtcustomeridledger, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtemployeeidledger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtvendoridledger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jtxtdategeneralledger, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtdebit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtcustomeridledger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62)
                    .addComponent(jtxtvendoridledger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel65)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtemployeeidledger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGap(18, 18, 18)
                        .addComponent(jtxtdebit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtdategeneralledger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jtablegeneralledger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtablegeneralledger);

        jPanel41.setBackground(new java.awt.Color(153, 153, 153));

        Jbtngroup.add(jrbtnemployee);
        jrbtnemployee.setText("employee");
        jrbtnemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnemployeeActionPerformed(evt);
            }
        });

        Jbtngroup.add(jrbtnvendor);
        jrbtnvendor.setText("vendor");
        jrbtnvendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnvendorActionPerformed(evt);
            }
        });

        Jbtngroup.add(jrbtncustomer);
        jrbtncustomer.setText("customer");
        jrbtncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtncustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbtncustomer)
                    .addComponent(jrbtnemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbtnvendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbtncustomer)
                .addGap(38, 38, 38)
                .addComponent(jrbtnemployee)
                .addGap(38, 38, 38)
                .addComponent(jrbtnvendor)
                .addContainerGap())
        );

        jButton9.setText("insert ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setText("delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel43.setBackground(new java.awt.Color(102, 102, 102));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel32.setText("GENERAL LEDGER");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(623, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(618, 618, 618))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtxtsearcgledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearcgledgerActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11)
                                    .addComponent(jButton9))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(jtxtsearcgledger, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4288, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jtxtsearcgledger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2))
                                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(2604, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GENERAL LEDGER", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("PRODUCTS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(633, 633, 633)
                .addComponent(jLabel5)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 204, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("PRODUCT ID");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("PRODUCT NAME");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("PURCHASE PRICE");

        jtxtproductid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtproductid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtproductidKeyPressed(evt);
            }
        });

        jtxtproductname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtproductname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtproductnameKeyPressed(evt);
            }
        });

        jtxtpurchaseprice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtpurchaseprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpurchasepriceKeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setText("DISCOUNT%");

        jtxtdiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtdiscountKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("PRODUCT IMAGE");

        jButton1.setText("ADD IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Quantity Left");

        jtxtquantityleft.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtquantityleft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtquantityleftKeyPressed(evt);
            }
        });

        jDesktopPane3.setBackground(new java.awt.Color(255, 102, 0));
        jDesktopPane3.setForeground(new java.awt.Color(255, 153, 0));

        jLabel59.setBackground(new java.awt.Color(255, 102, 0));
        jLabel59.setForeground(new java.awt.Color(255, 102, 0));

        jDesktopPane3.setLayer(jLabel59, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel91.setText("SELLING PRICE");

        jtxtsellingprice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsellingprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsellingpriceKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(96, 96, 96)
                        .addComponent(jtxtproductid))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel48)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel91))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtpathproducts)))
                            .addComponent(jtxtpurchaseprice)
                            .addComponent(jtxtproductname)
                            .addComponent(jtxtdiscount)
                            .addComponent(jtxtquantityleft)
                            .addComponent(jtxtsellingprice))))
                .addGap(10, 10, 10))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtproductid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtpurchaseprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtquantityleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtpathproducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel13))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel16.setBackground(new java.awt.Color(255, 102, 0));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel22.setText("product id");

        jtxtsearchpid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jbtnsearchproducts.setBackground(new java.awt.Color(255, 102, 0));
        jbtnsearchproducts.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jbtnsearchproducts.setForeground(new java.awt.Color(255, 255, 255));
        jbtnsearchproducts.setText("SEARCH");
        jbtnsearchproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchproductsActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel33.setText("product name");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel76.setText("price");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel77.setText("quantity");

        jtxtsearchpname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtsearchpprice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtsearchpquantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtsearchpdiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel79.setText("discount");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel22)
                                .addGap(222, 222, 222)
                                .addComponent(jLabel33))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel77)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearchpid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsearchpquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearchpname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsearchproducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtsearchpprice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchpdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel76))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel79)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel33)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchpprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchpquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchpdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnsearchproducts))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane11.setBackground(new java.awt.Color(255, 204, 153));

        jtableproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "product id", "product name", "purchase price", "quantity left", "discount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableproductsMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jtableproducts);

        jScrollPane16.setViewportView(jScrollPane11);

        jPanel31.setBackground(new java.awt.Color(255, 204, 153));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jbtnupdateproduct.setText("UPDATE PRODUCT");
        jbtnupdateproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateproductActionPerformed(evt);
            }
        });
        jbtnupdateproduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnupdateproductKeyPressed(evt);
            }
        });

        jButton5.setText("NEW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jbtnaddproducts.setText("ADD PRODUCT");
        jbtnaddproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddproductsActionPerformed(evt);
            }
        });
        jbtnaddproducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnaddproductsKeyPressed(evt);
            }
        });

        jbtndeleteproducts.setText("DELETE PRODUCT");
        jbtndeleteproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteproductsActionPerformed(evt);
            }
        });
        jbtndeleteproducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtndeleteproductsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtndeleteproducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnaddproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnupdateproduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnaddproducts)
                    .addComponent(jbtnupdateproduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtndeleteproducts)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jbtnclearproducts.setText("CLEAR");
        jbtnclearproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearproductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(jbtnclearproducts)))))
                .addContainerGap(4838, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnclearproducts))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2563, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCTS", jPanel2);

        jPanel21.setBackground(new java.awt.Color(0, 255, 204));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(633, 633, 633)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(204, 255, 204));

        jPanel24.setBackground(new java.awt.Color(0, 255, 204));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel42.setText("customer id");

        jtxtsearchcusid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jbtnsearchcustomers.setBackground(new java.awt.Color(0, 255, 204));
        jbtnsearchcustomers.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jbtnsearchcustomers.setText("SEARCH");
        jbtnsearchcustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchcustomersActionPerformed(evt);
            }
        });

        jtxtsearchcusname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel78.setText("customer name");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel80.setText("address");

        jtxtsearchcusaddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtsearchcuscn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel81.setText("contact#");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel83.setText("shop name");

        jtxtsearchcusshopname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel42)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel78))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel81))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearchcuscn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsearchcusid, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtsearchcusname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsearchcustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                            .addComponent(jtxtsearchcusaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addGap(71, 71, 71))
                        .addGroup(jPanel24Layout.createSequentialGroup()
                            .addComponent(jtxtsearchcusshopname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(73, 73, 73))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel42)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchcusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchcusid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchcusaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchcuscn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchcusshopname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnsearchcustomers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setBackground(new java.awt.Color(204, 255, 204));

        jtablecustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "customer_name", "customer_id", "contact#", "shop name", "customer address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtablecustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablecustomersMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtablecustomers);

        jScrollPane15.setViewportView(jScrollPane5);

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jbtnaddcustomer.setText("ADD CUSTOMER");
        jbtnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddcustomerActionPerformed(evt);
            }
        });
        jbtnaddcustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnaddcustomerKeyPressed(evt);
            }
        });

        jButton18.setText("DELETE CUSTOMER");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jButton18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton18KeyPressed(evt);
            }
        });

        jButton20.setText("NEW");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jButton20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton20KeyPressed(evt);
            }
        });

        jbtnupdatecustomer.setText("UPDATE CUSTOMER");
        jbtnupdatecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdatecustomerActionPerformed(evt);
            }
        });
        jbtnupdatecustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnupdatecustomerKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnupdatecustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnaddcustomer)
                    .addComponent(jbtnupdatecustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton20))
                .addContainerGap())
        );

        jPanel36.setBackground(new java.awt.Color(204, 255, 204));
        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jtxtshopname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtshopname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtshopnameKeyPressed(evt);
            }
        });

        jButton16.setText("ATTACH IMAGE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jButton16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton16KeyPressed(evt);
            }
        });

        jtxtcustomeraddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtcustomeraddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomeraddressKeyPressed(evt);
            }
        });

        jtxtcustomercn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtcustomercn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcustomercnActionPerformed(evt);
            }
        });
        jtxtcustomercn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomercnKeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("CUSTOMER ID");

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane4.setBackground(new java.awt.Color(153, 255, 204));
        jDesktopPane4.setForeground(new java.awt.Color(153, 255, 204));

        jLabel60.setBackground(new java.awt.Color(153, 255, 204));
        jLabel60.setForeground(new java.awt.Color(153, 255, 204));

        jDesktopPane4.setLayer(jLabel60, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4)
        );

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setText("CUSTOMER CONTACT#");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setText("CUSTOMER ADDRESS");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("CUSTOMER IMAGE");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("SHOP NAME");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("CUSTOMER NAME");

        jtxtcustomerid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtcustomerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcustomeridActionPerformed(evt);
            }
        });
        jtxtcustomerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomeridKeyPressed(evt);
            }
        });

        jtxtcustomername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtcustomername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcustomernameActionPerformed(evt);
            }
        });
        jtxtcustomername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel36))
                .addGap(76, 76, 76)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtcustomername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtcustomerid)
                                .addComponent(jtxtcustomercn)
                                .addComponent(jtxtshopname)
                                .addComponent(jtxtcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtpathcustomers))
                        .addGap(22, 22, 22))))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jtxtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jtxtcustomercn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jtxtshopname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jtxtcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel41)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtpathcustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jbtnclearcustomers.setText("CLEAR");
        jbtnclearcustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearcustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane15))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnclearcustomers)
                        .addGap(356, 356, 356))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnclearcustomers)
                .addGap(160, 160, 160))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4882, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2405, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CUSTOMERS", jPanel20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ORDERS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(618, 618, 618)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jPanel37.setBackground(new java.awt.Color(204, 204, 204));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("CUSTOMER NAME");

        jtxtorderdate.setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        jtxtorderdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtorderdateActionPerformed(evt);
            }
        });
        jtxtorderdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtorderdateKeyPressed(evt);
            }
        });

        jtxtcustomeridinorders.setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        jtxtcustomeridinorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomeridinordersKeyPressed(evt);
            }
        });

        jtxtcustomernameinorders.setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        jtxtcustomernameinorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcustomernameinordersKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ORDER ID");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel49.setText("CUSTOMER ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ORDER DATE");

        jtxtorderid.setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        jtxtorderid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtorderidKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel49)
                            .addComponent(jLabel3))
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jtxtorderdate))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtorderid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtcustomeridinorders)))))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtcustomernameinorders, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtorderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtcustomeridinorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtcustomernameinorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel44.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        jLabel44.setText("NET TOTAL");

        jLabel46.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        jLabel46.setText("AMOUNT PAID");

        jLabel47.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        jLabel47.setText("REMAINING BALANCE");

        jtxtsubtotal.setBackground(new java.awt.Color(102, 102, 102));
        jtxtsubtotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsubtotalActionPerformed(evt);
            }
        });

        jtxtamountpaid.setBackground(new java.awt.Color(204, 204, 204));
        jtxtamountpaid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtamountpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtamountpaidActionPerformed(evt);
            }
        });
        jtxtamountpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtamountpaidKeyPressed(evt);
            }
        });

        jtxtbalanceremaining.setBackground(new java.awt.Color(102, 102, 102));
        jtxtbalanceremaining.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jbtnprint.setText("PRINT");
        jbtnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprintActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("TAX %");

        jtxttax.setBackground(new java.awt.Color(204, 204, 204));
        jtxttax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxttax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttaxActionPerformed(evt);
            }
        });
        jtxttax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxttaxKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("FREIGHT");

        jtxtfreight.setBackground(new java.awt.Color(204, 204, 204));
        jtxtfreight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtfreight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfreightActionPerformed(evt);
            }
        });
        jtxtfreight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtfreightKeyPressed(evt);
            }
        });

        jtxtdiscountsales.setBackground(new java.awt.Color(204, 204, 204));
        jtxtdiscountsales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtdiscountsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdiscountsalesActionPerformed(evt);
            }
        });
        jtxtdiscountsales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtdiscountsalesKeyPressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel43.setText("Discount");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel90.setText("NET TOTAl");

        jtxtnettotal.setBackground(new java.awt.Color(102, 102, 102));
        jtxtnettotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jbtnprint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel47)
                    .addComponent(jLabel90))
                .addGap(43, 43, 43)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jtxtbalanceremaining, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(166, 166, 166))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtdiscountsales, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxtnettotal)
                                .addComponent(jtxtsubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jtxttax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jtxtfreight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jtxtamountpaid, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jtxtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxttax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtfreight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdiscountsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jtxtnettotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jtxtamountpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtxtbalanceremaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jbtnprint)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel50.setText("Order id");

        jtxtsearchcusnamesales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jbtnsearchorders.setBackground(new java.awt.Color(153, 153, 153));
        jbtnsearchorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnsearchorders.setText("search");
        jbtnsearchorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchordersActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel84.setText("Customer id");

        jtxtsearchcusidsales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jtxtsearchorderidsales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel85.setText("Customer name");

        jtxtsearchorderdatesales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel86.setText("Order date");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtsearchcusnamesales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtsearchorderdatesales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtsearchcusidsales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtsearchorderidsales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbtnsearchorders)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel84)
                    .addComponent(jtxtsearchcusidsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchorderidsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jtxtsearchcusnamesales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(jtxtsearchorderdatesales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnsearchorders)
                .addGap(29, 29, 29))
        );

        jPanel38.setBackground(new java.awt.Color(204, 204, 204));
        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jtxtquantitysales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtquantitysalesActionPerformed(evt);
            }
        });
        jtxtquantitysales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtquantitysalesKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Product_id");

        jbtnneworders.setText("NEW");
        jbtnneworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnewordersActionPerformed(evt);
            }
        });

        jtxtproductidsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproductidsalesActionPerformed(evt);
            }
        });
        jtxtproductidsales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtproductidsalesKeyPressed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Quantity");

        jbtndeletesales.setText("delete item");
        jbtndeletesales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeletesalesActionPerformed(evt);
            }
        });

        jtxtpricesales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpricesalesActionPerformed(evt);
            }
        });
        jtxtpricesales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpricesalesKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Price");

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel92.setText("Product_name");

        jtxtproductnameinorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtproductnameinordersKeyPressed(evt);
            }
        });

        jtablesales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtablesales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "product id", "product_name", "price", "quantity", "amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtablesales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablesalesMouseClicked(evt);
            }
        });
        jtablesales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtablesalesKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(jtablesales);

        jScrollPane12.setViewportView(jScrollPane7);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtndeletesales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jbtnneworders)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtproductidsales, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtproductnameinorders)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtquantitysales)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jtxtpricesales))
                .addGap(25, 25, 25))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel56)
                            .addComponent(jLabel15)
                            .addComponent(jLabel92)))
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtndeletesales)
                        .addComponent(jbtnneworders)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtproductidsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtpricesales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jtxtproductnameinorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtquantitysales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel44.setBackground(new java.awt.Color(204, 204, 204));

        jrbtncashsales.setBackground(new java.awt.Color(204, 204, 204));
        jbtngroupsales.add(jrbtncashsales);
        jrbtncashsales.setText("cash sales");

        jrbtncreditsales.setBackground(new java.awt.Color(204, 204, 204));
        jbtngroupsales.add(jrbtncreditsales);
        jrbtncreditsales.setText("credit sales");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtncashsales)
                    .addComponent(jrbtncreditsales))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jrbtncashsales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbtncreditsales)
                .addContainerGap())
        );

        jbtngroupprice.add(jrbtnfixedprice);
        jrbtnfixedprice.setText("fixed price");

        jbtngroupprice.add(jrbtnvariableprice);
        jrbtnvariableprice.setText("vari price");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtnfixedprice)
                    .addComponent(jrbtnvariableprice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jrbtnfixedprice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbtnvariableprice)
                .addContainerGap())
        );

        jbtngroupcustomertype.add(jrbtncountercustomer);
        jrbtncountercustomer.setText("counter cust");
        jrbtncountercustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtncountercustomerActionPerformed(evt);
            }
        });

        jbtngroupcustomertype.add(jrbtnpermanentcustomer);
        jrbtnpermanentcustomer.setText("permanent cust");
        jrbtnpermanentcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnpermanentcustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbtncountercustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbtnpermanentcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(4944, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrbtncountercustomer)
                                    .addComponent(jrbtnpermanentcustomer))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(2527, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALES", jPanel1);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6209, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3157, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("EXPENSE", jPanel42);

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setText("Product_id");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("vendor_id");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Quantity");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setText("Purchase Date");

        jtxtproductidpv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtproductidpv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtproductidpvKeyPressed(evt);
            }
        });

        jtxtvendoridpv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtvendoridpv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtvendoridpvKeyPressed(evt);
            }
        });

        jtxtquantitypv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtquantitypv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtquantitypvKeyPressed(evt);
            }
        });

        jtxtpurchasedate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtpurchasedate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpurchasedateKeyPressed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel69.setText("Price");

        jtxtpricepurchase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxtpricepurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtpricepurchaseKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel82.setText("Total Amount");

        jtxttotalamountpurchase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtxttotalamountpurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxttotalamountpurchaseKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel82))
                .addGap(67, 67, 67)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxttotalamountpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtpricepurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtproductidpv)
                        .addComponent(jtxtvendoridpv)
                        .addComponent(jtxtquantitypv)
                        .addComponent(jtxtpurchasedate, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jtxtproductidpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jtxtvendoridpv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jtxtquantitypv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtpricepurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addGap(29, 29, 29)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtpurchasedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(28, 28, 28)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxttotalamountpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jbtnclearpv.setText("CLEAR");
        jbtnclearpv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearpvActionPerformed(evt);
            }
        });

        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));

        jbtnaddpurchase.setText("ADD PURCHASE");
        jbtnaddpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddpurchaseActionPerformed(evt);
            }
        });
        jbtnaddpurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnaddpurchaseKeyPressed(evt);
            }
        });

        jbtndeletepurchase.setText("DELETE PURCHASE");
        jbtndeletepurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeletepurchaseActionPerformed(evt);
            }
        });
        jbtndeletepurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtndeletepurchaseKeyPressed(evt);
            }
        });

        jButton6.setText("NEW");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnaddpurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtndeletepurchase, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnaddpurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtndeletepurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtngrouppurchase.add(jrbcashpurchase);
        jrbcashpurchase.setText("CASH PURCHASE");

        jbtngrouppurchase.add(jbrcreditpurchase);
        jbrcreditpurchase.setText("CREDIT PURCHASE");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbcashpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbrcreditpurchase))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbcashpurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbrcreditpurchase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtableproduct_vendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableproduct_vendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableproduct_vendorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtableproduct_vendor);

        jScrollPane8.setViewportView(jScrollPane3);

        jPanel45.setBackground(new java.awt.Color(153, 0, 153));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setText("PURCHASE");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(616, 616, 616)
                .addComponent(jLabel45)
                .addContainerGap(620, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel46.setBackground(new java.awt.Color(153, 0, 153));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel51.setText("     DATE");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel87.setText("  PRODUCT");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel88.setText("   VENDOR");

        jtxtsearchpurchasedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtsearchpurchasedateActionPerformed(evt);
            }
        });

        jbtnsearchpurchase.setText("SEARCH");
        jbtnsearchpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchpurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel51)
                .addGap(152, 152, 152)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtsearchpurchasedate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnsearchpurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtsearchpurchaseproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addComponent(jtxtsearchvendorpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsearchpurchaseproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchpurchasedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtsearchvendorpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnsearchpurchase)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8)
                            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4155, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(892, 892, 892)
                .addComponent(jbtnclearpv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(25, 25, 25)
                .addComponent(jbtnclearpv)
                .addContainerGap(2599, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PURCHASE", jPanel25);

        jScrollPane4.setViewportView(jTabbedPane1);

        jScrollPane6.setViewportView(jScrollPane4);

        jMenu2.setText("File");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jMenuItem1.setText("LOGIN");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("LOGOUT");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("REPORTS");

        jMenu6.setText("DAILY REPORT");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jmenuedailycashsale.setText("CASH SALES");
        jmenuedailycashsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuedailycashsaleActionPerformed(evt);
            }
        });
        jMenu6.add(jmenuedailycashsale);

        jmenuedailycreditsaless.setText("CREDIT SALES");
        jmenuedailycreditsaless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuedailycreditsalessActionPerformed(evt);
            }
        });
        jMenu6.add(jmenuedailycreditsaless);

        jmenuedailycashpurchase.setText("CASH PURCHASE");
        jmenuedailycashpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuedailycashpurchaseActionPerformed(evt);
            }
        });
        jMenu6.add(jmenuedailycashpurchase);

        jmenuedailycreditpurchase.setText("CREDIT PURCHASE");
        jmenuedailycreditpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuedailycreditpurchaseActionPerformed(evt);
            }
        });
        jMenu6.add(jmenuedailycreditpurchase);

        jmenuedailyoverallreview.setText("OVERALL REVIEW");
        jmenuedailyoverallreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuedailyoverallreviewActionPerformed(evt);
            }
        });
        jMenu6.add(jmenuedailyoverallreview);

        jMenu3.add(jMenu6);

        jMenu7.setText("WEEKLY REPORT");

        jMenu1.setText("Cash Sales");
        jMenu7.add(jMenu1);

        jMenu4.setText("Credit Sales");
        jMenu7.add(jMenu4);

        jMenu5.setText("Cash Purchase");
        jMenu7.add(jMenu5);

        jMenu10.setText("Credit Purchase");
        jMenu7.add(jMenu10);

        jMenu11.setText("Overall Review");
        jMenu7.add(jMenu11);

        jMenu3.add(jMenu7);

        jMenu8.setText("MONTHLY REPORT");
        jMenu3.add(jMenu8);

        jMenu9.setText("YEARLY REPORT");
        jMenu3.add(jMenu9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       login log = new login();
         log.setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu2KeyPressed
      
    }//GEN-LAST:event_jMenu2KeyPressed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
         login log = new login();
         log.setVisible(true);
         setVisible(false);

    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
               
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jTabbedPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeeid.requestFocus();
            jtxtvendorid.requestFocus();
            jtxtcustomeridinorders.requestFocus();
            jtxtproductid.requestFocus();
            jtxtcustomername.requestFocus();
            jtxtproductidpv.requestFocus();
           

            
            
            
            
        }
    }//GEN-LAST:event_jTabbedPane1KeyPressed

    private void jtxtpricesalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpricesalesKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jtxtquantitysales.requestFocus();
        }

        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtquantitysales.requestFocus();
        }

        if(evt.getKeyCode()==KeyEvent.VK_ENTER && jrbtnpermanentcustomer.isSelected())
        {
           
            int productid=Integer.parseInt(jtxtproductidsales.getText());
            Float price=Float.parseFloat(jtxtpricesales.getText());

            int orderid=Integer.parseInt(jtxtorderid.getText());

            try{
                if(jtxtquantitysales.getText().isEmpty())
                {
                    int qty =1;
                    float amount= price*qty;
                    String sql="insert into order_line values(?,?,?,?,?)";
                    pst=con.createConnection().prepareStatement(sql);
                    pst.setInt(1, orderid);
                    pst.setInt(2,productid);
                    pst.setFloat(3,price);
                    pst.setInt(4,qty );
                    pst.setInt(5, (int) amount);
                    pst.executeUpdate();
                    String sql1="update products set quantity_left = quantity_left - '"+qty+"' where product_id='"+productid+"'";
                    pst=con.createConnection().prepareStatement(sql1);
                    pst.executeUpdate();
                    totalAmount();
                    nettotal();
                    showdata2();
                    showdata3();
                   
                    jtxtproductidsales.setText(null);
                    jtxtpricesales.setText(null);
                    jtxtquantitysales.setText(null);
                    jtxtproductidsales.requestFocus();
                    
                    
                    
                
                
            
                 }
                else 
                {
                    int quantity=Integer.parseInt(jtxtquantitysales.getText());
                    float amount= price*quantity;
                    String sql="insert into order_line values(?,?,?,?,?)";
                    pst=con.createConnection().prepareStatement(sql);
                    pst.setInt(1, orderid);
                    pst.setInt(2,productid);
                    pst.setFloat(3,price);
                    pst.setInt(4,quantity);
                    pst.setInt(5, (int) amount);
                    pst.executeUpdate();
                    String sql1="update products set quantity_left = quantity_left - '"+quantity+"' where product_id='"+productid+"'";
                    pst=con.createConnection().prepareStatement(sql1);
                    pst.executeUpdate();
                    totalAmount();
                    nettotal();
                    showdata2();
                    showdata3();
                    jtxtproductidsales.setText(null);
                    jtxtpricesales.setText(null);
                    jtxtquantitysales.setText(null);

                    jtxtproductidsales.requestFocus();


                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                jtxtproductidsales.setText(null);
                jtxtpricesales.setText(null);
                jtxtquantitysales.setText(null);
                
                jtxtproductidsales.requestFocus();
            }
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ENTER && jrbtncountercustomer.isSelected())
        {
            int productid=Integer.parseInt(jtxtproductidsales.getText());
            Float price=Float.parseFloat(jtxtpricesales.getText());

            int orderid=Integer.parseInt(jtxtorderid.getText());

            try{
                if(jtxtquantitysales.getText().isEmpty())
                {
                    int qty =1;
                    float amount= price*qty;
                    String sql="insert into order_line2 values(?,?,?,?,?)";
                    pst=con.createConnection().prepareStatement(sql);
                    pst.setInt(1, orderid);
                    pst.setInt(2,productid);
                    pst.setFloat(3,price);
                    pst.setInt(4,qty );
                    pst.setInt(5, (int) amount);
                    pst.executeUpdate();
                    String sql1="update products set quantity_left = quantity_left - '"+qty+"' where product_id='"+productid+"'";
                    pst=con.createConnection().prepareStatement(sql1);
                    pst.executeUpdate();
                    totalAmountCounter();
                    netTotalCounter();
                    showdataCounterCustomer();
                    showdata3();
                   
                    jtxtproductidsales.setText(null);
                    jtxtpricesales.setText(null);
                    jtxtquantitysales.setText(null);
                    jtxtproductidsales.requestFocus();
                    
                    
                    
                
                
            
                 }
                else 
                {
                    int quantity=Integer.parseInt(jtxtquantitysales.getText());
                    float amount= price*quantity;
                    String sql="insert into order_line2 values(?,?,?,?,?)";
                    pst=con.createConnection().prepareStatement(sql);
                    pst.setInt(1, orderid);
                    pst.setInt(2,productid);
                    pst.setFloat(3,price);
                    pst.setInt(4,quantity);
                    pst.setInt(5, (int) amount);
                    pst.executeUpdate();
                    String sql1="update products set quantity_left = quantity_left - '"+quantity+"' where product_id='"+productid+"'";
                    pst=con.createConnection().prepareStatement(sql1);
                    pst.executeUpdate();
                    totalAmountCounter();
                    netTotalCounter();
                    showdataCounterCustomer();
                    showdata3();
                    jtxtproductidsales.setText(null);
                    jtxtpricesales.setText(null);
                    jtxtquantitysales.setText(null);

                    jtxtproductidsales.requestFocus();


                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                jtxtproductidsales.setText(null);
                jtxtpricesales.setText(null);
                jtxtquantitysales.setText(null);

                jtxtproductidsales.requestFocus();
            }
        }
    }//GEN-LAST:event_jtxtpricesalesKeyPressed

    private void jtxtpricesalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpricesalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpricesalesActionPerformed

    private void jbtndeletesalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeletesalesActionPerformed
        int pid = Integer.parseInt(jtxtproductidsales.getText());
        int oid = Integer.parseInt(jtxtorderid.getText());
        int qty = Integer.parseInt(jtxtquantitysales.getText());
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to DELETE","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0){
            if(jrbtnpermanentcustomer.isSelected())
            {
        try
        {
            String sql="delete from order_line where order_id='"+oid+"' and product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.executeUpdate();
            showdata2();
            JOptionPane.showMessageDialog(null, "item deleted");
            String sql1="update products set quantity_left=quantity_left +'"+qty+"'where product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql1);
            pst.executeUpdate();
            totalAmount();
            showdata3();
            jtxtproductidsales.setText(null);
            jtxtpricesales.setText(null);
            jtxtquantitysales.setText(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidsales.setText(null);
            jtxtpricesales.setText(null);
            jtxtquantitysales.setText(null);
        }
        }
            else if(jrbtncountercustomer.isSelected())
            {
                try
        {
            String sql="delete from order_line2 where counterorder_id='"+oid+"' and product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.executeUpdate();
            showdataCounterCustomer();
            JOptionPane.showMessageDialog(null, "item deleted");
            String sql1="update products set quantity_left=quantity_left +'"+qty+"'where product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql1);
            pst.executeUpdate();
            totalAmountCounter();
            showdata3();
            jtxtproductidsales.setText(null);
            jtxtpricesales.setText(null);
            jtxtquantitysales.setText(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidsales.setText(null);
            jtxtpricesales.setText(null);
            jtxtquantitysales.setText(null);
        }
            }
        }
        else
        {
           jtxtproductidsales.setText(null);
            jtxtpricesales.setText(null);
            jtxtquantitysales.setText(null); 
        }
    }//GEN-LAST:event_jbtndeletesalesActionPerformed

    private void jtxtproductidsalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtproductidsalesKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jtxtquantitysales.requestFocus();
            jtxtpricesales.setEditable(true);
        }

        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtquantitysales.requestFocus();
            jtxtpricesales.setEditable(true);
        }
        if( evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtpricesales.setEditable(true);
            if(jrbtnfixedprice.isSelected() && jrbtnpermanentcustomer.isSelected())
            {
                int oid = Integer.parseInt(jtxtorderid.getText());
                int pid = Integer.parseInt(jtxtproductidsales.getText());
                float a = 0;
                 float b = 0;
                 float c = 0;
                 float sum = 0;
                 
                try
                {
                    
                   String sql="insert into order_line(order_id,product_id,price,quantity) values(?,?,(select sellprice from products where product_id=?),1)"; 
                   pst=con.createConnection().prepareStatement(sql);
                   pst.setInt(1, oid);
                   pst.setInt(2, pid);
                   pst.setInt(3, pid);
                   pst.executeUpdate();
                   String sql1="update order_line set amount = (select price*quantity from order_line where (order_id=? and product_id=?)) where (order_id=? and product_id=?)";
                   pst=con.createConnection().prepareStatement(sql1);
                   pst.setInt(1, oid);
                   pst.setInt(2, pid);
                   pst.setInt(3, oid);
                   pst.setInt(4, pid);
                   pst.executeUpdate();
                   String sql2="update products set quantity_left = quantity_left - 1 where product_id=?";
                   pst=con.createConnection().prepareStatement(sql2);
                   pst.setInt(1, pid);
                   pst.executeUpdate();
                   showdatafixedprice();
                   showdata3();
                
            int rowcount = jtablesales.getRowCount();
            for(int i=0;i<rowcount;i++)
            {
                a = Float.parseFloat( jtablesales.getValueAt(i, 3).toString());
                b = Float.parseFloat( jtablesales.getValueAt(i, 4).toString());
                c=a*b;
                jtablesales.setValueAt(c, i, 5);
            }
            for(int i=0;i<rowcount;i++)
            {
                sum=sum+Float.parseFloat(jtablesales.getValueAt(i, 5).toString());
            }
            
            jtxtsubtotal.setText(Float.toString(sum));
            jtxtnettotal.setText(Float.toString(sum));
                   jtxtproductidsales.setText(null);
                   jtxtproductidsales.requestFocus();
                }
                catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            }
            else if(jrbtnfixedprice.isSelected() && jrbtncountercustomer.isSelected())
            {
                int oid = Integer.parseInt(jtxtorderid.getText());
                int pid = Integer.parseInt(jtxtproductidsales.getText());
                float a = 0;
                 float b = 0;
                 float c = 0;
                 float sum = 0;
                try
                {
                    
                   String sql="insert into order_line2(counterorder_id,product_id,price,quantity) values(?,?,(select sellprice from products where product_id=?),1)"; 
                   pst=con.createConnection().prepareStatement(sql);
                   pst.setInt(1, oid);
                   pst.setInt(2, pid);
                   pst.setInt(3, pid);
                   pst.executeUpdate();
                   String sql1="update order_line2 set amount = (select price*quantity from order_line2 where (counterorder_id=? and product_id=?)) where (counterorder_id=? and product_id=?)";
                   pst=con.createConnection().prepareStatement(sql1);
                   pst.setInt(1, oid);
                   pst.setInt(2, pid);
                   pst.setInt(3, oid);
                   pst.setInt(4, pid);
                   pst.executeUpdate();
                   String sql2="update products set quantity_left = quantity_left - 1 where product_id=?";
                   pst=con.createConnection().prepareStatement(sql2);
                   pst.setInt(1, pid);
                   pst.executeUpdate();
                   showdatafixedpricecounter();
                   showdata3();
                
            int rowcount = jtablesales.getRowCount();
            for(int i=0;i<rowcount;i++)
            {
                a = Float.parseFloat( jtablesales.getValueAt(i, 3).toString());
                b = Float.parseFloat( jtablesales.getValueAt(i, 4).toString());
                c=a*b;
                jtablesales.setValueAt(c, i, 5);
            }
            for(int i=0;i<rowcount;i++)
            {
                sum=sum+Float.parseFloat(jtablesales.getValueAt(i, 5).toString());
            }
            
            jtxtsubtotal.setText(Float.toString(sum));
            jtxtnettotal.setText(Float.toString(sum));
                   jtxtproductidsales.setText(null);
                   jtxtproductidsales.requestFocus();
                }
                catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            }
            else 
            {
                jtxtquantitysales.requestFocus();
                jtxtpricesales.setEditable(true);
            }
        }
        
    }//GEN-LAST:event_jtxtproductidsalesKeyPressed

    private void jtxtproductidsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproductidsalesActionPerformed

    }//GEN-LAST:event_jtxtproductidsalesActionPerformed

    private void jbtnnewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnewordersActionPerformed
         int p = JOptionPane.showConfirmDialog(null,"are you sure you want to take new ORDER","NEW ORDER",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        cleardata2();
        orderId();
        jtxtsubtotal.setText(null);
        jtxtamountpaid.setText(null);
        jtxtbalanceremaining.setText(null);
        jtxtproductidsales.setText(null);
        jtxtquantitysales.setText(null);
        jtxtpricesales.setText(null);
        jtxttax.setText(null);
        jtxtfreight.setText(null);
        jtxtcustomeridinorders.setText(null);
        jtxtdiscountsales.setText(null);
        jtxtamountpaid.setEditable(true);
        jtxtcustomeridinorders.setEditable(true);
        jtxtproductidsales.setEditable(true);
        jtxtquantitysales.setEditable(true);
        jtxtpricesales.setEditable(true);
        jbtndeletesales.setEnabled(true);
        jtxtcustomeridinorders.requestFocus();
         jtxtfreight.setEnabled(true);
            jtxttax.setEnabled(true);
            jtxtdiscountsales.setEditable(true);
            jtxtcustomernameinorders.setEnabled(true);
        }   
    }//GEN-LAST:event_jbtnnewordersActionPerformed

    private void jtxtquantitysalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtquantitysalesKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jtxtpricesales.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jtxtproductidsales.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtpricesales.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtproductidsales.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtpricesales.requestFocus();
        }
    }//GEN-LAST:event_jtxtquantitysalesKeyPressed

    private void jtxtquantitysalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtquantitysalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtquantitysalesActionPerformed

    private void jbtnsearchordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchordersActionPerformed
        String a=  jtxtsearchcusidsales.getText();
        String b= jtxtsearchcusnamesales.getText();
        String c=  jtxtsearchorderidsales.getText();
        String d=  jtxtsearchorderdatesales.getText();
        
         if( !a.isEmpty())

        {
           
        }
        
       else  if( !b.isEmpty())

        {
             
          
        }
       else if (!c.isEmpty())
        {
            if(jrbtnpermanentcustomer.isSelected())
            {
            searchorderorderid();
            float sum = 0;
            int rowcount = jtablesales.getRowCount();
            for(int i=0;i<rowcount;i++)
            {
                sum = sum+Float.parseFloat( jtablesales.getValueAt(i, 5).toString());
            }
            jtxtsubtotal.setText(Float.toString(sum));
            jtxtproductidsales.setEditable(false);
            jtxtquantitysales.setEditable(false);
            jtxtpricesales.setEditable(false);
            jtxtamountpaid.setEditable(false);
            jbtndeletesales.setEnabled(false);
            jtxtfreight.setEnabled(false);
            jtxttax.setEnabled(false);
            jtxtdiscountsales.setEditable(false);
            }
            else if(jrbtncountercustomer.isSelected())
            {
             searchorderorderidcounter();
            float sum = 0;
            int rowcount = jtablesales.getRowCount();
            for(int i=0;i<rowcount;i++)
            {
                sum = sum+Float.parseFloat( jtablesales.getValueAt(i, 5).toString());
            }
            jtxtsubtotal.setText(Float.toString(sum));
            jtxtproductidsales.setEditable(false);
            jtxtquantitysales.setEditable(false);
            jtxtpricesales.setEditable(false);
            jtxtamountpaid.setEditable(false);
            jbtndeletesales.setEnabled(false);
            jtxtfreight.setEnabled(false);
            jtxttax.setEnabled(false);
            jtxtdiscountsales.setEditable(false);
            }
            else {JOptionPane.showMessageDialog(null, "select the CUSTOMER_TYPE");}
            
        }
       else if ( !d.isEmpty())
        {
            String od=jtxtsearchorderdatesales.getText();
            if(jrbtnpermanentcustomer.isSelected())
            {
            try
            {
            String sql="select * from order_line where order_id in(select order_id from orders where order_date=?)";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,od);
            rs=pst.executeQuery();
            jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
            jtxtsearchorderdatesales.setText(null);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            }
            else if(jrbtncountercustomer.isSelected())
            {
                try
            {
            String sql="select * from order_line2 where counterorder_id in(select counterorder_id from counterorder where order_date=?) orderby couterorder_id asc";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,od);
            rs=pst.executeQuery();
            jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
            jtxtsearchorderdatesales.setText(null);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            } 
            }
            else{JOptionPane.showMessageDialog(null, "select the CUSTOMER_TYPE");}
        }
       
         
    }//GEN-LAST:event_jbtnsearchordersActionPerformed

    private void jtablesalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtablesalesKeyPressed

    }//GEN-LAST:event_jtablesalesKeyPressed

    private void jtablesalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablesalesMouseClicked
        int row = jtablesales.getSelectedRow();
        int id = (int) (jtablesales.getModel().getValueAt(row, 0));
        int pid = (int) (jtablesales.getModel().getValueAt(row, 1));
if(jrbtnpermanentcustomer.isSelected())
{
        try{
            String sql="select product_id,price,quantity from order_line where order_id ='"+id+"' and product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql);
            ResultSet rs1 =pst.executeQuery();
            if(rs1.next())
            {
                jtxtproductidsales.setText(rs1.getString(1));
                jtxtpricesales.setText(rs1.getString(2));
                jtxtquantitysales.setText(rs1.getString(3));

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
}
else if(jrbtncountercustomer.isSelected())
{
    try{
            String sql="select product_id,price,quantity from order_line2 where counterorder_id ='"+id+"' and product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql);
            ResultSet rs1 =pst.executeQuery();
            if(rs1.next())
            {
                jtxtproductidsales.setText(rs1.getString(1));
                jtxtpricesales.setText(rs1.getString(2));
                jtxtquantitysales.setText(rs1.getString(3));

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
}
    }//GEN-LAST:event_jtablesalesMouseClicked

    private void jbtnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprintActionPerformed
    Float br=Float.parseFloat(jtxtbalanceremaining.getText());
    Float nt=Float.parseFloat(jtxtnettotal.getText());
    
    
        if(jrbtncreditsales.isSelected() && jrbtnpermanentcustomer.isSelected())
        {
          int id=Integer.parseInt(jtxtcustomeridinorders.getText());  
    
try
{
    String sql="insert into saletype values('creditsale',?,?)";
    pst=con.createConnection().prepareStatement(sql);
    pst.setFloat(1,nt);
    pst.setString(2,jtxtorderdate.getText());
    pst.executeUpdate();
    
    
    
   
    pst.executeUpdate();
    String sql1="update customer set remaining_amount = remaining_amount + '"+br+"' where customer_id=?";
     pst=con.createConnection().prepareStatement(sql1);
    pst.setInt(1, id);
    pst.executeUpdate();
    showdata1();
    
    
     String sql2="insert into general_ledger_customer (customer_id,debit,dated,description) values(?,?,?,?)";
    pst=con.createConnection().prepareStatement(sql2);
    pst.setInt(1, id);
    pst.setFloat(2, br);
    pst.setString(3, jtxtorderdate.getText());
    pst.setString(4,jtxtorderid.getText());
    pst.executeUpdate();
    
    
              File file = new File(DEST5);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
              
            
            ct. createPdfreceipt(DEST5);
            
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
catch(Exception e)
        
{
    JOptionPane.showMessageDialog(null, e);
}
                                
           
            
            try{
                
                
            cleardata2();
            jtxtorderid.setText(null);
            jtxtcustomeridinorders.setText(null);
            jtxtcustomernameinorders.setText(null);
            jtxtsubtotal.setText(null);
            jtxtamountpaid.setText(null);
            jtxttax.setText(null);
            jtxtfreight.setText(null);
            jtxtbalanceremaining.setText(null);
            jtxtnettotal.setText(null);
            orderId();
            jtxtcustomeridinorders.setEditable(true);
            jtxtcustomeridinorders.requestFocus();
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }

        }
else if(jrbtncashsales.isSelected() && jrbtnpermanentcustomer.isSelected())
{
   
    int id=Integer.parseInt(jtxtcustomeridinorders.getText());
try
{
    String sql="insert into saletype values('cashsale',?,?)";
    pst=con.createConnection().prepareStatement(sql);
    pst.setFloat(1,nt);
    pst.setString(2,jtxtorderdate.getText());
    pst.executeUpdate();
}
catch(Exception e)
        
{
    JOptionPane.showMessageDialog(null, e);
}
           
            try{
               
                
            cleardata2();
            jtxtorderid.setText(null);
            jtxtcustomeridinorders.setText(null);
            jtxtcustomernameinorders.setText(null);
            jtxtsubtotal.setText(null);
            jtxtamountpaid.setText(null);
            jtxttax.setText(null);
            jtxtfreight.setText(null);
            jtxtbalanceremaining.setText(null);
            jtxtnettotal.setText(null);
            orderId();
            jtxtcustomeridinorders.setEditable(true);
            jtxtcustomeridinorders.requestFocus();
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
    
}
else if( jrbtncountercustomer.isSelected())
{
    
    
try
{
    String sql="insert into saletype values('cashsale',?,?)";
    pst=con.createConnection().prepareStatement(sql);
    pst.setFloat(1,nt);
    pst.setString(2,jtxtorderdate.getText());
    pst.executeUpdate();
}
catch(Exception e)
        
{
    JOptionPane.showMessageDialog(null, e);
}
           
            try{
                
                
            cleardata2();
            jtxtorderid.setText(null);
            jtxtcustomeridinorders.setText(null);
            jtxtcustomernameinorders.setText(null);
            jtxtsubtotal.setText(null);
            jtxtamountpaid.setText(null);
            jtxttax.setText(null);
            jtxtfreight.setText(null);
            jtxtbalanceremaining.setText(null);
            jtxtnettotal.setText(null);
            counterOrderId();
            jtxtcustomeridinorders.setEditable(false);
            jtxtproductidsales.requestFocus();
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
    
}
else
{
    JOptionPane.showMessageDialog(null, "SELECT THE  BOTH (SALE TYPE AND CUSTOMER TYPE)");
}
       
    }//GEN-LAST:event_jbtnprintActionPerformed

    private void jtxtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsubtotalActionPerformed

    private void jtxtorderidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtorderidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtcustomeridinorders.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();
        }
       
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtcustomeridinorders.requestFocus();
        }
    }//GEN-LAST:event_jtxtorderidKeyPressed

    private void jtxtcustomernameinordersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomernameinordersKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtorderdate.requestFocus();
        }

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int orderid=Integer.parseInt(jtxtorderid.getText()) ;
            int cusid=Integer.parseInt(jtxtcustomeridinorders.getText());
            String cusname = jtxtcustomernameinorders.getText();
            jtxtcustomeridinorders.setEditable(false);
            try
            {
                String sql="insert into orders values (?,?,?,?)";
                pst =con.createConnection().prepareStatement(sql);
                pst.setInt(1, orderid);
                pst.setInt(2, cusid);
                pst.setString(3, jtxtorderdate.getText());
                pst.setString(4, cusname);
                pst.executeUpdate();
                jtxtproductidsales.requestFocus();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jtxtcustomernameinordersKeyPressed

    private void jtxtcustomeridinordersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomeridinordersKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtorderid.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtorderdate.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtorderdate.requestFocus();
        }
    }//GEN-LAST:event_jtxtcustomeridinordersKeyPressed

    private void jtxtorderdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtorderdateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtcustomeridinorders.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtcustomernameinorders.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtcustomernameinorders.requestFocus();
        }
    }//GEN-LAST:event_jtxtorderdateKeyPressed

    private void jtxtorderdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtorderdateActionPerformed

    }//GEN-LAST:event_jtxtorderdateActionPerformed

    private void jtableproduct_vendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableproduct_vendorMouseClicked

        int row = jtableproduct_vendor.getSelectedRow();
        int id = (int) (jtableproduct_vendor.getModel().getValueAt(row, 0));

        try{
            String sql="select product_id,vendor_id,quantity,price,purchasedate,amount from product_vendor where id ='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                jtxtproductidpv.setText(rs.getString(1));
                jtxtvendoridpv.setText(rs.getString(2));
                
                jtxtquantitypv.setText(rs.getString(3));
                jtxtpricepurchase.setText(rs.getString(4));
                jtxtpurchasedate.setText(rs.getString(5));
                jtxttotalamountpurchase.setText(rs.getString(6));

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtableproduct_vendorMouseClicked

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtndeletepurchase.requestFocus();
        }
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jtxtproductidpv.setText(null);
        jtxtvendoridpv.setText(null);
        jtxtquantitypv.setText(null);
        jtxtpurchasedate.setText(null);
        jtxtpricepurchase.setText(null);
        jtxttotalamountpurchase.setText(null);
        jtxtproductidpv.requestFocus();
        purchaseDate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtndeletepurchaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtndeletepurchaseKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnaddpurchase.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton6.requestFocus();
        }

    }//GEN-LAST:event_jbtndeletepurchaseKeyPressed

    private void jbtndeletepurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeletepurchaseActionPerformed
        int row = jtableproduct_vendor.getSelectedRow();
        int id = (int) (jtableproduct_vendor.getModel().getValueAt(row, 0));
        int pid = Integer.parseInt(jtxtproductidpv.getText());
        int vid = Integer.parseInt(jtxtvendoridpv.getText());
        int qty = Integer.parseInt(jtxtquantitypv.getText());
        float tm = Float.parseFloat(jtxttotalamountpurchase.getText());
         int p = JOptionPane.showConfirmDialog(null,"are you sure you want to DELETE","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        if(jbrcreditpurchase.isSelected()){
        try
        {
            String sql="delete from product_vendor where id='"+id+"' and product_id='"+pid+"' and vendor_id='"+vid+"'";
            pst=con.createConnection().prepareStatement(sql);

            pst.executeUpdate();
            showdata5();
            JOptionPane.showMessageDialog(null, "purchase deleted");
            String sql1="update products set quantity_left=quantity_left -'"+qty+"'where product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql1);
            pst.executeUpdate();
            showdata3();
            String sql2="update vendor set remaining_amount=remaining_amount -'"+tm+"'where vendor_id='"+vid+"'";
            pst=con.createConnection().prepareStatement(sql2);
            pst.executeUpdate();
            showdata4();
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();
        }
        }
        else if(jrbcashpurchase.isSelected())
        {
            try
        {
            String sql="delete from product_vendor where id='"+id+"' and product_id='"+pid+"' and vendor_id='"+vid+"'";
            pst=con.createConnection().prepareStatement(sql);

            pst.executeUpdate();
            showdata5();
            JOptionPane.showMessageDialog(null, "purchase deleted");
            String sql1="update products set quantity_left=quantity_left -'"+qty+"'where product_id='"+pid+"'";
            pst=con.createConnection().prepareStatement(sql1);
            pst.executeUpdate();
            showdata3();
           
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Kindly select the CREDIT_PURCHASE or CASH_PURCHASE button");
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();
        }
        }
        else
        {
          jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpurchasedate.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            purchaseDate();  
        }
    }//GEN-LAST:event_jbtndeletepurchaseActionPerformed

    private void jbtnaddpurchaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnaddpurchaseKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtpurchasedate.requestFocus();
        }

        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddpurchase.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddpurchaseKeyPressed

    private void jbtnaddpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddpurchaseActionPerformed
        sqlConnection con=new sqlConnection();
        PreparedStatement pst;
        Float price=Float.parseFloat(jtxtpricepurchase.getText());
        int quantity=Integer.parseInt(jtxtquantitypv.getText());
        
        
           
        
        
        
        if(jbrcreditpurchase.isSelected())
        {
        try
        {
            
            float amount = price * quantity;
            String sql="insert into product_vendor values(?,?,?,?,?,?)";

            pst=con.createConnection().prepareStatement(sql);
           
            pst.setString(1,jtxtproductidpv.getText());
            pst.setString(2,jtxtvendoridpv.getText());
            pst.setString(3,jtxtquantitypv.getText());
            pst.setString(4,jtxtpurchasedate.getText());
            pst.setFloat(5,price);
            pst.setInt(6,(int) amount);
            pst.executeUpdate();
           
            showdata5();
            
            totalAmount1();
            float tm=Float.parseFloat(jtxttotalamountpurchase.getText());
           
            
            String sql1="update products set quantity_left = quantity_left + '"+quantity+"'  where product_id=?";
            pst=con.createConnection().prepareStatement(sql1);

            pst.setString(1,jtxtproductidpv.getText());
            pst.executeUpdate();
             
          
            
            String sql2="update vendor set remaining_amount = remaining_amount + '"+tm+"'  where vendor_id=?";
            pst=con.createConnection().prepareStatement(sql2);

            pst.setString(1,jtxtvendoridpv.getText());
            pst.executeUpdate();
            
            
            String sql3="insert into purchasetype values('credit purchase',?,?)";
            pst=con.createConnection().prepareStatement(sql3);
            pst.setFloat(1, tm);
            pst.setString(2,jtxtpurchasedate.getText());
            
            pst.executeUpdate();
            
            
            showdata3();
            showdata4();
            JOptionPane.showMessageDialog(null,"PURCHASE ADDED");

            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            jtxtproductidpv.requestFocus();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpricepurchase.setText(null);
             jtxttotalamountpurchase.setText(null);
            jtxtproductidpv.requestFocus();

        }
        }
        else
        {
            try
        {
             
            
            float amount = price * quantity;
            String sql="insert into product_vendor values(?,?,?,?,?,?)";

            pst=con.createConnection().prepareStatement(sql);
           
            pst.setString(1,jtxtproductidpv.getText());
            pst.setString(2,jtxtvendoridpv.getText());
            pst.setString(3,jtxtquantitypv.getText());
            pst.setString(4,jtxtpurchasedate.getText());
            pst.setFloat(5,price);
            pst.setInt(6,(int) amount);
            pst.executeUpdate();
            showdata5();
            
             totalAmount1();
            
            String sql1="update products set quantity_left = quantity_left + '"+quantity+"'  where product_id=?";
            pst=con.createConnection().prepareStatement(sql1);

            pst.setString(1,jtxtproductidpv.getText());
            pst.executeUpdate();
            
            
            String sql3="insert into purchasetype values('cash purchase',?,?)";
            pst=con.createConnection().prepareStatement(sql3);
            pst.setFloat(1, amount);
            pst.setString(2,jtxtpurchasedate.getText());
            
            pst.executeUpdate();
             
           

            showdata3();
            JOptionPane.showMessageDialog(null,"PURCHASE ADDED");

            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            jtxtproductidpv.requestFocus();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductidpv.setText(null);
            jtxtvendoridpv.setText(null);
            jtxtquantitypv.setText(null);
            jtxtpricepurchase.setText(null);
            jtxttotalamountpurchase.setText(null);
            jtxtproductidpv.requestFocus();

        }
        }
    }//GEN-LAST:event_jbtnaddpurchaseActionPerformed

    private void jbtnclearpvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearpvActionPerformed
        cleardatapv();
    }//GEN-LAST:event_jbtnclearpvActionPerformed

    private void jtxtpurchasedateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpurchasedateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtquantitypv.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddpurchase.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jbtnaddpurchase.requestFocus();
        }
    }//GEN-LAST:event_jtxtpurchasedateKeyPressed

    private void jtxtquantitypvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtquantitypvKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtvendoridpv.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtpricepurchase.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtpricepurchase.requestFocus();
        }
    }//GEN-LAST:event_jtxtquantitypvKeyPressed

    private void jtxtvendoridpvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtvendoridpvKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtproductidpv.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtquantitypv.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtquantitypv.requestFocus();
        }
    }//GEN-LAST:event_jtxtvendoridpvKeyPressed

    private void jtxtproductidpvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtproductidpvKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtvendoridpv.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtvendoridpv.requestFocus();
        }
    }//GEN-LAST:event_jtxtproductidpvKeyPressed

    private void jbtnclearcustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearcustomersActionPerformed
        cleardata4();
        jLabel60.setIcon(null);
    }//GEN-LAST:event_jbtnclearcustomersActionPerformed

    private void jtxtcustomernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtcustomerid.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtcustomerid.requestFocus();
        }
    }//GEN-LAST:event_jtxtcustomernameKeyPressed

    private void jtxtcustomernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcustomernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcustomernameActionPerformed

    private void jtxtcustomeridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomeridKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtcustomername.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtcustomercn.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtcustomercn.requestFocus();
        }
    }//GEN-LAST:event_jtxtcustomeridKeyPressed

    private void jtxtcustomeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcustomeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcustomeridActionPerformed

    private void jtxtcustomercnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomercnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtcustomerid.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtshopname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtshopname.requestFocus();
        }
    }//GEN-LAST:event_jtxtcustomercnKeyPressed

    private void jtxtcustomercnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcustomercnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcustomercnActionPerformed

    private void jtxtcustomeraddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcustomeraddressKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtshopname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton16.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jButton16.requestFocus();
        }
    }//GEN-LAST:event_jtxtcustomeraddressKeyPressed

    private void jButton16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton16KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtcustomeraddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddcustomer.requestFocus();
        }
    }//GEN-LAST:event_jButton16KeyPressed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //String filename1=f.get();
        jtxtpathcustomers.setText(filename);
        try
        {
            File image =new File(filename);
            FileInputStream fis = new  FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!= -1;)
            {
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jtxtshopnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtshopnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtcustomercn.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtcustomeraddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtcustomeraddress.requestFocus();
        }
    }//GEN-LAST:event_jtxtshopnameKeyPressed

    private void jbtnupdatecustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnupdatecustomerKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jButton16.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton20.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtnaddcustomer.requestFocus();
        }
    }//GEN-LAST:event_jbtnupdatecustomerKeyPressed

    private void jbtnupdatecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdatecustomerActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to UPDATE","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {

            int id=Integer.parseInt(jtxtcustomerid.getText());
            String name=jtxtcustomername.getText();
            String contact=jtxtcustomercn.getText();
            String shopname=jtxtshopname.getText();
            String address=jtxtcustomeraddress.getText();
            String sql="update customer set customer_name=?, customer_contact#=?, customer_shop_name=?, customer_address=? where customer_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, shopname);
            pst.setString(4, address);

            pst.executeUpdate();
            showdata1();
            JOptionPane.showMessageDialog(null, "record updated");
            jtxtcustomerid.setText(null);
            jtxtcustomername.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jtxtpathcustomers.setText(null);
            jLabel60.setIcon(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,  e);
            jtxtcustomerid.setText(null);
            jtxtcustomername.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jtxtpathcustomers.setText(null);
            jLabel60.setIcon(null);
        }
        }
        else
        {
          jtxtcustomerid.setText(null);
            jtxtcustomername.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jtxtpathcustomers.setText(null);
            jLabel60.setIcon(null);  
        }
    }//GEN-LAST:event_jbtnupdatecustomerActionPerformed

    private void jButton20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton20KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnupdatecustomer.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jButton18.requestFocus();
        }
    }//GEN-LAST:event_jButton20KeyPressed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jtxtcustomerid.setText(null);
        jtxtcustomername.setText(null);
        jtxtshopname.setText(null);
        jtxtcustomercn.setText(null);
        jtxtcustomeraddress.setText(null);
        jLabel59.setIcon(null);
        jtxtpathcustomers.setText(null);
        jtxtcustomername.requestFocus();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton18KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnaddcustomer.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jButton20.requestFocus();
        }
    }//GEN-LAST:event_jButton18KeyPressed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int id = Integer.parseInt(jtxtcustomerid.getText());
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to DELETE","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {
            String sql="delete from customer where customer_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.executeUpdate();
            showdata4();
            JOptionPane.showMessageDialog(null, "record deleted");
            jtxtcustomername.setText(null);
            jtxtcustomerid.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jLabel60.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jLabel60.setIcon(null);
        }
        }
        else
        {
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jLabel60.setIcon(null);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jbtnaddcustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnaddcustomerKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jButton16.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton18.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jbtnupdatecustomer.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddcustomerKeyPressed

    private void jbtnaddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddcustomerActionPerformed
        sqlConnection con=new sqlConnection();
        PreparedStatement pst;
        String sql="insert into customer values(?,?,?,?,?,?,0)";
        try{
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(2,jtxtcustomerid.getText());
            pst.setString(1,jtxtcustomername.getText());
            pst.setString(3,jtxtcustomercn.getText());
            pst.setString(4,jtxtshopname.getText());
            pst.setString(5,jtxtcustomeraddress.getText());
            pst.setBytes(6, person_image);
            pst.executeUpdate();
            showdata1();
            JOptionPane.showMessageDialog(null, "CUSTOMER ADDED");
             String sql1="insert into general_ledger_customer (customer_id,debit,credit,dated) values(?,0,0,?)";
            pst=con.createConnection().prepareStatement(sql1);
            pst.setString(1,jtxtcustomerid.getText());
            pst.setString(2,jtxtdategeneralledger.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "customer ledger created");
            jtxtcustomerid.setText(null);
            jtxtcustomername.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jLabel60.setText(null);
            jtxtpathcustomers.setText(null);
            person_image=null;
            jtxtcustomername.requestFocus();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtcustomerid.setText(null);
            jtxtcustomername.setText(null);
            jtxtcustomercn.setText(null);
            jtxtshopname.setText(null);
            jtxtcustomeraddress.setText(null);
            jLabel60.setText(null);
            jtxtpathcustomers.setText(null);
            jtxtcustomername.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddcustomerActionPerformed

    private void jtablecustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablecustomersMouseClicked
        int row = jtablecustomers.getSelectedRow();
        int id=(int) (jtablecustomers.getModel().getValueAt(row, 0));
        try
        {
            String sql1="select customer_image from customer where customer_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql1);
            rs=pst.executeQuery();
            if(rs.next())
            {
                byte []imagedata=rs.getBytes("customer_image");
                format= new ImageIcon(imagedata);
                jLabel60.setIcon(format);

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
            jLabel60.setIcon(null);
        }
        try
        {

            String sql="select customer_name,customer_id,customer_contact#,customer_shop_name,customer_address from customer where customer_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
                 jtxtcustomername.setText(rs.getString(1));
                jtxtcustomerid.setText(rs.getString(2));
               
                jtxtcustomercn.setText(rs.getString(3));
                jtxtshopname.setText(rs.getString(4));
                jtxtcustomeraddress.setText(rs.getString(5));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtablecustomersMouseClicked
//showdata1();,showdataname3();,showid3();,showcontact3();,showaddress3();,showshopname3();
    private void jbtnsearchcustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchcustomersActionPerformed
        String a=  jtxtsearchcusid.getText();
      String b= jtxtsearchcusname.getText();
      String c=  jtxtsearchcuscn.getText();
      String d=  jtxtsearchcusaddress.getText();
      String e=  jtxtsearchcusshopname.getText();
      
        
       
        if( !a.isEmpty())

        {
            showid3();
        }
        
       else  if( !b.isEmpty())

        {
             
            showdataname3();
        }
       else if (!c.isEmpty())
        {
            showcontact3();
        }
       else if ( !d.isEmpty())
        {
             showaddress3();
        }
       else if(!e.isEmpty())
        {
             showshopname3();
        }
       
         else if(a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty()  )
        {
            showdata1();
        }
    }//GEN-LAST:event_jbtnsearchcustomersActionPerformed

    private void jbtndeleteproductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtndeleteproductsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnaddproducts.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jButton5.requestFocus();
        }
    }//GEN-LAST:event_jbtndeleteproductsKeyPressed

    private void jbtndeleteproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteproductsActionPerformed
        int id = Integer.parseInt(jtxtproductid.getText());
         int p = JOptionPane.showConfirmDialog(null,"are you sure you want to DELETE","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {
            String sql="delete from products where product_id=?";
            pst=con.createConnection().prepareStatement(sql);
            pst.setInt(1,id);
            pst.executeUpdate();
            showdata3();
            JOptionPane.showMessageDialog(null, "Product deleted");
            jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtquantityleft.setText(null);
            jtxtdiscount.setText(null);
            jtxtsellingprice.setText(null);
            jLabel59.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtquantityleft.setText(null);
            jtxtdiscount.setText(null);
            jtxtsellingprice.setText(null);
            jLabel59.setIcon(null);
        }
        }
        else
        {
           jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtquantityleft.setText(null);
            jtxtdiscount.setText(null);
            jLabel59.setIcon(null); 
        }
    }//GEN-LAST:event_jbtndeleteproductsActionPerformed

    private void jbtnaddproductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnaddproductsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtndeleteproducts.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jButton1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jbtnupdateproduct.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddproductsKeyPressed

    private void jbtnaddproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddproductsActionPerformed
        sqlConnection con=new sqlConnection();
        PreparedStatement pst;
        float discount=Float.valueOf(jtxtdiscount.getText());
        try{

            String sql="insert into products   values(?,?,?,?,?,?)";

            pst=con.createConnection().prepareStatement(sql);

            pst.setString(1,jtxtproductname.getText());
            pst.setString(2,jtxtpurchaseprice.getText());

            pst.setFloat(3,discount);
            pst.setString(4,jtxtquantityleft.getText());
            pst.setBytes(5, person_image);
            pst.setString(6,jtxtsellingprice.getText());
            pst.executeUpdate();
            showdata3();
            JOptionPane.showMessageDialog(null, "PRODUCT ADDED");
            jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtquantityleft.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtdiscount.setText(null);
            jtxtsellingprice.setText(null);
            jLabel59.setText(null);
            jtxtpathproducts.setText(null);
            person_image=null;
            jtxtproductid.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtquantityleft.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtdiscount.setText(null);
            jtxtsellingprice.setText(null);
            jLabel59.setText(null);
            jtxtpathproducts.setText(null);
            jtxtproductid.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddproductsActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnupdateproduct.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtndeleteproducts.requestFocus();
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jtxtproductid.setText(null);
        jtxtproductname.setText(null);
        jtxtpurchaseprice.setText(null);
        jtxtquantityleft.setText(null);
        jtxtdiscount.setText(null);
        jtxtsellingprice.setText(null);
        jLabel59.setIcon(null);
        jtxtpathproducts.setText(null);
        jtxtproductid.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbtnupdateproductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnupdateproductKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton5.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jButton1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtnaddproducts.requestFocus();
        }
    }//GEN-LAST:event_jbtnupdateproductKeyPressed

    private void jbtnupdateproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateproductActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to UPDATE","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try{
            int id=Integer.parseInt(jtxtproductid.getText());
            String name=jtxtproductname.getText();
            int price=Integer.parseInt(jtxtpurchaseprice.getText());
            int quantityleft=Integer.parseInt(jtxtquantityleft.getText());
            float discount=Float.parseFloat(jtxtdiscount.getText());
            float sp=Float.parseFloat(jtxtsellingprice.getText());
            String sql="update products set  product_name=?, product_price=?,quantity_left=?, discount=?,sellprice=? where product_id=?";
            pst=con.createConnection().prepareStatement(sql);

            pst.setString(1, name);
            pst.setInt(2, price);
            pst.setInt(3,quantityleft);
            pst.setFloat(4, discount);
            pst.setFloat(5, sp);
            pst.setInt(6, id);
            pst.executeUpdate();
            showdata3();
            JOptionPane.showMessageDialog(null, "record updated");
            jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtquantityleft.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtdiscount.setText(null);
            jtxtpathproducts.setText(null);
            jtxtsellingprice.setText(null);
            jLabel59.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);jtxtproductid.setText(null);
            jtxtproductname.setText(null);
            jtxtquantityleft.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtdiscount.setText(null);
            jtxtsellingprice.setText(null);
            jtxtpathproducts.setText(null);
            jLabel59.setIcon(null);
        }
        }
        else
        {
          jtxtproductname.setText(null);
            jtxtquantityleft.setText(null);
            jtxtpurchaseprice.setText(null);
            jtxtdiscount.setText(null);
            jtxtpathproducts.setText(null);
            jLabel59.setIcon(null);  
        }
    }//GEN-LAST:event_jbtnupdateproductActionPerformed

    private void jtableproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableproductsMouseClicked
        int row = jtableproducts.getSelectedRow();
        int id = (int) (jtableproducts.getModel().getValueAt(row,0 ));
        try
        {
            String sql1="select product_image from products where product_id=?";
            pst=con.createConnection().prepareStatement(sql1);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            if(rs.next())
            {
                byte []imagedata=rs.getBytes("product_image");
                format= new ImageIcon(imagedata);
                jLabel59.setIcon(format);

            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
            jLabel59.setIcon(null);

        }
        try
        {
            String sql="select * from products where product_id = ?";
            pst=con.createConnection().prepareStatement(sql);
            pst.setInt(1,id);
            rs=pst.executeQuery();
            while(rs.next()){
                jtxtproductid.setText(rs.getString(1));
                jtxtproductname.setText(rs.getString(2));
                jtxtpurchaseprice.setText(rs.getString(3));

                jtxtdiscount.setText(rs.getString(4));
                jtxtquantityleft.setText(rs.getString(5));
                jtxtsellingprice.setText(rs.getString(7));

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jtableproductsMouseClicked
    private void jbtnsearchproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchproductsActionPerformed
        String a=  jtxtsearchpid.getText();
      String b= jtxtsearchpname.getText();
      String c=  jtxtsearchpprice.getText();
      String d=  jtxtsearchpquantity.getText();
      String e=  jtxtsearchpdiscount.getText();
      
        
       
        if( !a.isEmpty())

        {
            showdataid2();
        }
        
       else  if( !b.isEmpty())

        {
             
            showdataname2();
        }
       else if (!c.isEmpty())
        {
            showproductprice2();
        }
       else if ( !d.isEmpty())
        {
            showquantityleft2();
        }
       else if(!e.isEmpty())
        {
            showdiscount2();
        }
       
         else if(a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty()  )
        {
            showdata3();
        }
    }//GEN-LAST:event_jbtnsearchproductsActionPerformed

    private void jtxtquantityleftKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtquantityleftKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtdiscount.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtdiscount.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtpurchaseprice.requestFocus();
        }
    }//GEN-LAST:event_jtxtquantityleftKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddproducts.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtdiscount.requestFocus();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //String filename1=f.get();
        jtxtpathproducts.setText(filename);
        try
        {
            File image =new File(filename);
            FileInputStream fis = new  FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!= -1;)
            {
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtdiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdiscountKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jButton1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtquantityleft.requestFocus();
        }
    }//GEN-LAST:event_jtxtdiscountKeyPressed

    private void jtxtpurchasepriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpurchasepriceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtquantityleft.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtquantityleft.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtproductname.requestFocus();
        }
    }//GEN-LAST:event_jtxtpurchasepriceKeyPressed

    private void jtxtproductnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtproductnameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtpurchaseprice.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtpurchaseprice.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtproductid.requestFocus();
        }
    }//GEN-LAST:event_jtxtproductnameKeyPressed

    private void jtxtproductidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtproductidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtproductname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtproductname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();
        }
    }//GEN-LAST:event_jtxtproductidKeyPressed

    private void jbtndeletevendorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtndeletevendorKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnaddvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jButton10.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int id = Integer.parseInt(jtxtvendorid.getText());
            try
            {
                String sql="delete from vendor where vendor_id='"+id+"'";
                pst=con.createConnection().prepareStatement(sql);
                pst.executeUpdate();
                showdata4();
                JOptionPane.showMessageDialog(null, "record deleted");
                jtxtvendorid.setText(null);
                jtxtvendorname.setText(null);
                jtxtvendoraddress.setText(null);
                jtxtvendorcn.setText(null);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                jtxtvendorid.setText(null);
                jtxtvendorname.setText(null);
                jtxtvendoraddress.setText(null);
                jtxtvendorcn.setText(null);
            }
        }
    }//GEN-LAST:event_jbtndeletevendorKeyPressed

    private void jbtndeletevendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeletevendorActionPerformed
        int id = Integer.parseInt(jtxtvendorid.getText());
         int p = JOptionPane.showConfirmDialog(null,"are you sure you want to DELETE","DELETE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {
            String sql="delete from vendor where vendor_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.executeUpdate();
            showdata4();
            JOptionPane.showMessageDialog(null, "record deleted");
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jLabel58.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jLabel58.setIcon(null);
        }
        }
        else
        {
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jLabel58.setIcon(null);
        }
    }//GEN-LAST:event_jbtndeletevendorActionPerformed

    private void jbtnupdatevendorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnupdatevendorKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnattachvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtnaddvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton10.requestFocus();
        }
    }//GEN-LAST:event_jbtnupdatevendorKeyPressed

    private void jbtnupdatevendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdatevendorActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to UPDATE","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {
            int id=Integer.parseInt(jtxtvendorid.getText());
            String name=jtxtvendorname.getText();
            String contact=jtxtvendorcn.getText();
            String address=jtxtvendoraddress.getText();

            String sql="update vendor set vendor_name=?,vendor_address=?,vendor_contact#=? where vendor_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);

            pst.setString(1,name);
            pst.setString(2,address);
            pst.setString(3,contact);

            pst.executeUpdate();
            showdata4();
            JOptionPane.showMessageDialog(null, "record updated");
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jtxtpathvendor.setText(null);
            jLabel58.setIcon(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jtxtpathvendor.setText(null);
            jLabel58.setIcon(null);
        }
        }
        else
        {
             jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jtxtpathvendor.setText(null);
            jLabel58.setIcon(null);
        }
    }//GEN-LAST:event_jbtnupdatevendorActionPerformed

    private void jbtnaddvendorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnaddvendorKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnattachvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jbtnupdatevendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtndeletevendor.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddvendorKeyPressed

    private void jbtnaddvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddvendorActionPerformed
        sqlConnection con=new sqlConnection();
        PreparedStatement pst;
        
        try
        {
            String sql="insert into vendor values(?,?,?,?,?,0)";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,jtxtvendorid.getText());
            pst.setString(2,jtxtvendorname.getText());
            pst.setString(3,jtxtvendoraddress.getText());
            pst.setString(4,jtxtvendorcn.getText());
            pst.setBytes(5, person_image);
             
            pst.executeUpdate();
            showdata4();
            JOptionPane.showMessageDialog(null,"VENDOR ADDED");
             String sql1="insert into general_ledger_vendor (vendor_id,debit,credit,dated) values(?,0,0,?)";
            pst=con.createConnection().prepareStatement(sql1);
            pst.setString(1,jtxtvendorid.getText());
                    pst.setString(2,jtxtdategeneralledger.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "vendor ledger created");
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jtxtpathvendor.setText(null);
            jLabel58.setIcon(null);
            person_image=null;
            jtxtvendorid.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtvendorid.setText(null);
            jtxtvendorname.setText(null);
            jtxtvendoraddress.setText(null);
            jtxtvendorcn.setText(null);
            jtxtpathvendor.setText(null);
            jLabel58.setIcon(null);
            jtxtvendorid.requestFocus();
        }
    }//GEN-LAST:event_jbtnaddvendorActionPerformed

    private void jButton10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton10KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnupdatevendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtndeletevendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try{

                jtxtsearchvndid.setText(null);
                jtxtvendorid.setText(null);
                jtxtvendorname.setText(null);
                jtxtvendoraddress.setText(null);
                jtxtvendorcn.setText(null);

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton10KeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jtxtvendorid.setText(null);
        jtxtvendorname.setText(null);
        jtxtvendoraddress.setText(null);
        jtxtvendorcn.setText(null);
        jtxtpathvendor.setText(null);
        jLabel58.setIcon(null);
        jtxtpathvendor.setText(null);
        jtxtvendorid.requestFocus();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbtnclearvendorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearvendorsActionPerformed
        try{

            cleardata1();
            jLabel58.setIcon(null);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbtnclearvendorsActionPerformed

    private void jtablevendorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablevendorsMouseClicked
        int row = jtablevendors.getSelectedRow();
        int id = (int) (jtablevendors.getModel().getValueAt(row, 0));
        try
        {
            String sql1="select vendor_image from vendor where vendor_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql1);
            rs=pst.executeQuery();
            if(rs.next())
            {
                byte []imagedata=rs.getBytes("vendor_image");
                format= new ImageIcon(imagedata);
                jLabel58.setIcon(format);

            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
            jLabel58.setIcon(null);

        }

        try{
            String sql="select * from vendor where vendor_id ='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                jtxtvendorid.setText(rs.getString(1));
                jtxtvendorname.setText(rs.getString(2));

                jtxtvendoraddress.setText(rs.getString(3));
                jtxtvendorcn.setText(rs.getString(4));

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jLabel58.setIcon(null);
        }
    }//GEN-LAST:event_jtablevendorsMouseClicked

    private void jbtnsearchvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchvendorActionPerformed
      String a=  jtxtsearchvndid.getText();
      String b= jtxtsearchvndname.getText();
      String c=  jtxtsearchvndcn.getText();
      String d=  jtxtsearchvndaddress.getText();
      String e=  jtxtsearchvndproduct.getText();
      
        
       
        if( !a.isEmpty())

        {
            showdataid1();
        }
        
       else  if( !b.isEmpty())

        {
             
            showdataname1();
        }
       else if (!c.isEmpty())
        {
            showdatacontact1();
        }
       else if ( !d.isEmpty())
        {
             showdataaddress1();
        }
       else if(!e.isEmpty())
        {
             showproduct1();
        }
       
         else if(a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty()  )
        {
            showdata4();
        }
    }//GEN-LAST:event_jbtnsearchvendorActionPerformed

    private void jtxtsearchvndidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchvndidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchvndidActionPerformed

    private void jtxtpathvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpathvendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpathvendorActionPerformed

    private void jbtnattachvendorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnattachvendorKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtvendorcn.requestFocus();
        }
    }//GEN-LAST:event_jbtnattachvendorKeyPressed

    private void jbtnattachvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnattachvendorActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //String filename1=f.get();
        jtxtpathvendor.setText(filename);
        try
        {
            File image =new File(filename);
            FileInputStream fis = new  FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!= -1;)
            {
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnattachvendorActionPerformed

    private void jtxtvendorcnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtvendorcnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtvendoraddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnattachvendor.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jbtnattachvendor.requestFocus();
        }
    }//GEN-LAST:event_jtxtvendorcnKeyPressed

    private void jtxtvendoraddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtvendoraddressKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtvendorname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtvendorcn.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtvendorcn.requestFocus();
        }
    }//GEN-LAST:event_jtxtvendoraddressKeyPressed

    private void jtxtvendornameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtvendornameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtvendorid.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtvendoraddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtvendoraddress.requestFocus();
        }
    }//GEN-LAST:event_jtxtvendornameKeyPressed

    private void jtxtvendoridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtvendoridKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtvendorname.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtvendorname.requestFocus();
        }
    }//GEN-LAST:event_jtxtvendoridKeyPressed

    private void jtxtvendoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtvendoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtvendoridActionPerformed

    private void jbtnupdateemployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnupdateemployeeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtnadd.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jButton15.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnattach.requestFocus();
        }
    }//GEN-LAST:event_jbtnupdateemployeeKeyPressed

    private void jbtnupdateemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateemployeeActionPerformed
         int p = JOptionPane.showConfirmDialog(null,"are you sure you want to UPDATE","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try
        {
            int id=Integer.parseInt(jtxtemployeeid.getText());
            String name=jtxtemployeename.getText();
            String contact=jtxtemployeecn.getText();
            String address=jtxtemployeeaddress.getText();
            int salary=Integer.parseInt(jtxtemployeesalary.getText());
            String designation=jtxtemployeedesignation.getText();
            String sql="update employee set employee_name=?,employee_contact#=?,employee_address=?,employee_salary=?,employee_designation=? where employee_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);

            pst.setString(1,name);
            pst.setString(2,contact);
            pst.setString(3,address);
            pst.setInt(4,salary);
            pst.setString(5,designation);

            pst.executeUpdate();
            showdata();
            JOptionPane.showMessageDialog(null, "record updated");
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jtxtpath.setText(null);
            jLabel57.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jtxtpath.setText(null);
            jLabel57.setIcon(null);
        }
        }
        else
        {
             jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jtxtpath.setText(null);
            jLabel57.setIcon(null);
        }
    }//GEN-LAST:event_jbtnupdateemployeeActionPerformed

    private void jbtnaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnaddKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jbtnupdateemployee.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnattach.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtndelete.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            sqlConnection con=new sqlConnection();
            PreparedStatement pst;

            try
            {
                String sql;
                sql = "insert into employee(employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation,employee_image)"
                + "values(?,?,?,?,?,?,?)";
                pst=con.createConnection().prepareStatement(sql);
                pst.setString(1,jtxtemployeeid.getText());
                pst.setString(2,jtxtemployeename.getText());
                pst.setString(3,jtxtemployeecn.getText());
                pst.setString(4,jtxtemployeeaddress.getText());
                pst.setString(5,jtxtemployeesalary.getText());
                pst.setString(6,jtxtemployeedesignation.getText());
                pst.setBytes(7, person_image);

                pst.executeUpdate();
                showdata();

                JOptionPane.showMessageDialog(null, "EMPLOYEE ADDED");
                jtxtemployeeid.requestFocus();
                 String sql1="insert into general_ledger_employee (employee_id) values(?)";
                pst=con.createConnection().prepareStatement(sql1);
                pst.setString(1,jtxtemployeeid.getText());
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "employee ledger created");
                jtxtemployeeid.setText(null);
                jtxtemployeename.setText(null);
                jtxtemployeecn.setText(null);
                jtxtemployeeaddress.setText(null);
                jtxtemployeesalary.setText(null);
                jtxtemployeedesignation.setText(null);
                person_image=null;
                jtxtpath.setText(null);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                jtxtemployeeid.setText(null);
                jtxtemployeename.setText(null);
                jtxtemployeecn.setText(null);
                jtxtemployeeaddress.setText(null);
                jtxtemployeesalary.setText(null);
                jtxtemployeedesignation.setText(null);
            }
        }
    }//GEN-LAST:event_jbtnaddKeyPressed

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddActionPerformed
        sqlConnection con=new sqlConnection();
        PreparedStatement pst;

        try
        {
            String sql;
            sql = "insert into employee(employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation,employee_image,remaining_amount)"
            + "values(?,?,?,?,?,?,?,0)";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,jtxtemployeeid.getText());
            pst.setString(2,jtxtemployeename.getText());
            pst.setString(3,jtxtemployeecn.getText());
            pst.setString(4,jtxtemployeeaddress.getText());
            pst.setString(5,jtxtemployeesalary.getText());
            pst.setString(6,jtxtemployeedesignation.getText());
            pst.setBytes(7, person_image);

            pst.executeUpdate();
            showdata();

            JOptionPane.showMessageDialog(null, "EMPLOYEE ADDED");
            jtxtemployeeid.requestFocus();

            String sql1="insert into general_ledger_employee (employee_id,debit,credit,dated,description) values(?,0,0,?,?)";
            pst=con.createConnection().prepareStatement(sql1);
            pst.setString(1,jtxtemployeeid.getText());
            pst.setString(2,jtxtdategeneralledger.getText());
            pst.setString(3,jtxtdescription.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "employee ledger created");
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jtxtpath.setText(null);
            person_image=null;

            jLabel57.setIcon(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jtxtpath.setText(null);
            
            jLabel57.setIcon(null);
        }
    }//GEN-LAST:event_jbtnaddActionPerformed

    private void jbtndeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtndeleteKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnadd.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            jButton15.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
                int id=Integer.parseInt(jtxtemployeeid.getText());
                String sql="delete from employee where employee_id='"+id+"'";
                pst=con.createConnection().prepareStatement(sql);
                pst.executeUpdate();
                showdata();
                JOptionPane.showMessageDialog(null, "record deleted");
                jtxtemployeeid.setText(null);
                jtxtemployeename.setText(null);
                jtxtemployeecn.setText(null);
                jtxtemployeeaddress.setText(null);
                jtxtemployeesalary.setText(null);
                jtxtemployeedesignation.setText(null);
                jLabel57.setIcon(null);

            }
            catch (SQLException ex)
            {

                Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtndeleteKeyPressed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"are you sure you want to delete","delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try {
            int id=Integer.parseInt(jtxtemployeeid.getText());
            String sql="delete from employee where employee_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            pst.executeUpdate();
            showdata();
            JOptionPane.showMessageDialog(null, "record deleted");
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jLabel57.setIcon(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This employee has ledger so can't be deleted");
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jLabel57.setIcon(null);
        }
        }
        else{
         jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jLabel57.setIcon(null);
        }
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jButton15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton15KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jbtnupdateemployee.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            jbtndelete.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try{

                jtxtsearchempid.setText(null);
                jtxtemployeeid.setText(null);
                jtxtemployeename.setText(null);
                jtxtemployeecn.setText(null);
                jtxtemployeeaddress.setText(null);
                jtxtemployeesalary.setText(null);
                jtxtemployeedesignation.setText(null);
                jLabel57.setIcon(null);
                jtxtpath.setText(null);
                jtxtemployeeid.requestFocus();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton15KeyPressed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try{

            jtxtsearchempid.setText(null);
            jtxtemployeeid.setText(null);
            jtxtemployeename.setText(null);
            jtxtemployeecn.setText(null);
            jtxtemployeeaddress.setText(null);
            jtxtemployeesalary.setText(null);
            jtxtemployeedesignation.setText(null);
            jLabel57.setIcon(null);
            jtxtpath.setText(null);
            jtxtemployeeid.requestFocus();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jtableemployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtableemployeeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP)
        {
            int row = jtableemployee.getSelectedRow();
            String id = (jtableemployee.getModel().getValueAt(row, 0)).toString();

            try{
                String sql="select * from employee where employee_id ='"+id+"'";
                pst=con.createConnection().prepareStatement(sql);
                ResultSet rs1 =pst.executeQuery();
                while(rs1.next())
                {
                    jtxtemployeeid.setText(rs1.getString(1));
                    jtxtemployeename.setText(rs1.getString(2));
                    jtxtemployeecn.setText(rs1.getString(3));
                    jtxtemployeeaddress.setText(rs1.getString(4));
                    jtxtemployeesalary.setText(rs1.getString(5));
                    jtxtemployeedesignation.setText(rs1.getString(6));
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jtableemployeeKeyPressed

    private void jtableemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableemployeeMouseClicked
        int row = jtableemployee.getSelectedRow();
        String id = (jtableemployee.getModel().getValueAt(row, 0)).toString();
        try
        {
            String sql1="select employee_image from employee where employee_id='"+id+"'";
            pst=con.createConnection().prepareStatement(sql1);
            rs=pst.executeQuery();
            if(rs.next())
            {
                byte []imagedata=rs.getBytes("employee_image");
                format= new ImageIcon(imagedata);
                jLabel57.setIcon(format);

            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
            jLabel57.setIcon(null);

        }

        try{
            String sql="select * from employee where employee_id ='"+id+"'";
            pst=con.createConnection().prepareStatement(sql);
            ResultSet rs1 =pst.executeQuery();
            if(rs1.next())
            {
                jtxtemployeeid.setText(rs1.getString(1));
                jtxtemployeename.setText(rs1.getString(2));
                jtxtemployeecn.setText(rs1.getString(3));
                jtxtemployeeaddress.setText(rs1.getString(4));
                jtxtemployeesalary.setText(rs1.getString(5));
                jtxtemployeedesignation.setText(rs1.getString(6));

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            jLabel57.setIcon(null);
        }
    }//GEN-LAST:event_jtableemployeeMouseClicked

    private void jbtnclearemployeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnclearemployeesKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            cleardata();
        }
    }//GEN-LAST:event_jbtnclearemployeesKeyPressed

    private void jbtnclearemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearemployeesActionPerformed
        cleardata();
    }//GEN-LAST:event_jbtnclearemployeesActionPerformed

    private void jbtnsearchemployeesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnsearchemployeesKeyPressed
        String a=  jtxtsearchempid.getText();
       String b= jtxtsearchempname.getText();
      String c=  jtxtsearchempcn.getText();
      String d=  jtxtsearchempadd.getText();
      String e=  jtxtsearchempsal.getText();
       String f= jtxtsearchempdesig.getText();
        
       
        if( !a.isEmpty())

        {
            showdataid();
        }
        
        else  if( !b.isEmpty())

        {
             
            showdataname();
        }
       else if (!c.isEmpty())
        {
            showdatacontact();
        }
       else if ( !d.isEmpty())
        {
             showdataaddress();
        }
       else if(!e.isEmpty())
        {
            showdatasalary();
        }
        else if( !f.isEmpty())
        {
            showdatadesignation();
        }
         else if(a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty() )
        {
            showdata();
        }
    }//GEN-LAST:event_jbtnsearchemployeesKeyPressed

//method for searching if all is selected in a combobox
    private void jbtnsearchemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchemployeesActionPerformed
       String a=  jtxtsearchempid.getText();
       String b= jtxtsearchempname.getText();
      String c=  jtxtsearchempcn.getText();
      String d=  jtxtsearchempadd.getText();
      String e=  jtxtsearchempsal.getText();
       String f= jtxtsearchempdesig.getText();
        
       
        if( !a.isEmpty())

        {
            showdataid();
        }
        
        else  if( !b.isEmpty())

        {
             
            showdataname();
        }
       else if (!c.isEmpty())
        {
            showdatacontact();
        }
       else if ( !d.isEmpty())
        {
             showdataaddress();
        }
       else if(!e.isEmpty())
        {
            showdatasalary();
        }
        else if( !f.isEmpty())
        {
            showdatadesignation();
        }
         else if(a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty() )
        {
            showdata();
        }
    }//GEN-LAST:event_jbtnsearchemployeesActionPerformed

    private void jtxtsearchempidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jbtnsearchemployees.requestFocus();
        }
    }//GEN-LAST:event_jtxtsearchempidKeyPressed

    private void jtxtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpathActionPerformed

    private void jbtnattachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnattachKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeedesignation.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnadd.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jbtnadd.requestFocus();
        }
    }//GEN-LAST:event_jbtnattachKeyPressed

    private void jbtnattachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnattachActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        //String filename1=f.get();
        jtxtpath.setText(filename);
        try
        {
            File image =new File(filename);
            FileInputStream fis = new  FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!= -1;)
            {
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnattachActionPerformed

    private void jtxtemployeedesignationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeedesignationKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jbtnattach.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnattach.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeesalary.requestFocus();
        }
    }//GEN-LAST:event_jtxtemployeedesignationKeyPressed

    private void jtxtemployeedesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtemployeedesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtemployeedesignationActionPerformed

    private void jtxtemployeenameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeenameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtemployeecn.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeecn.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeeid.requestFocus();
        }
    }//GEN-LAST:event_jtxtemployeenameKeyPressed

    private void jtxtemployeecnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeecnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtemployeeaddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeeaddress.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeename.requestFocus();
        }
    }//GEN-LAST:event_jtxtemployeecnKeyPressed

    private void jtxtemployeecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtemployeecnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtemployeecnActionPerformed

    private void jtxtemployeeaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeeaddressKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtemployeesalary.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeesalary.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeecn.requestFocus();
        }
    }//GEN-LAST:event_jtxtemployeeaddressKeyPressed

    private void jtxtemployeesalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeesalaryKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtemployeedesignation.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeedesignation.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtemployeeaddress.requestFocus();
        }
    }//GEN-LAST:event_jtxtemployeesalaryKeyPressed

    private void jtxtemployeesalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtemployeesalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtemployeesalaryActionPerformed

    private void jtxtemployeeidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtemployeeidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jtxtemployeename.requestFocus();

        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jtxtemployeename.requestFocus();

        }
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jTabbedPane1.requestFocus();

        }
    }//GEN-LAST:event_jtxtemployeeidKeyPressed

    private void jtxtemployeeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtemployeeidActionPerformed

    }//GEN-LAST:event_jtxtemployeeidActionPerformed

    private void jtxtvendoridledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtvendoridledgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtvendoridledgerActionPerformed

    private void jtxtemployeeidledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtemployeeidledgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtemployeeidledgerActionPerformed

    private void jtxtdategeneralledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdategeneralledgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdategeneralledgerActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          float ct=Float.parseFloat(jtxtcredit.getText());
          float db=Float.parseFloat(jtxtdebit.getText());
          
        if(jrbtncustomer.isSelected())
       {
          int cid=Integer.parseInt(jtxtcustomeridledger.getText());
           int p = JOptionPane.showConfirmDialog(null,"are you sure you want to make entry in ledger","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
           try{
           String sql="insert into general_ledger_customer(customer_id,credit,debit,dated,description) values(?,?,?,?,?)";
           pst=con.createConnection().prepareStatement(sql);
           
            pst.setString(1,jtxtcustomeridledger.getText());
             pst.setFloat(2,ct);
              pst.setFloat(3,db);
               pst.setString(4,jtxtdategeneralledger.getText());
                pst.setString(5,jtxtdescription.getText());
            pst.executeUpdate();
           String sql1="update customer set remaining_amount=remaining_amount -'"+ct+"' where customer_id='"+cid+"'   ";
            pst=con.createConnection().prepareStatement(sql1);
          
           pst.executeUpdate();
           String sql2="update customer set remaining_amount=remaining_amount + '"+db+"' where customer_id='"+cid+"'  ";
            pst=con.createConnection().prepareStatement(sql2);
           
            pst.executeUpdate();
            showdata1();
            JOptionPane.showMessageDialog(null, "TRANSACTION RECORDED");
            jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);

           
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null, e);
               jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);
           }
        }
        else
        {
            jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);
        }
       }
       else if(jrbtnvendor.isSelected())
       {
          int vid=Integer.parseInt(jtxtvendoridledger.getText());
          int p = JOptionPane.showConfirmDialog(null,"are you sure you want to make entry in ledger","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
           try{
           String sql="insert into general_ledger_vendor(vendor_id,credit,debit,dated,description) values(?,?,?,?,?) ";
           pst=con.createConnection().prepareStatement(sql);
           
            pst.setString(1,jtxtvendoridledger.getText());
             pst.setFloat(2,ct);
              pst.setFloat(3,db);
               pst.setString(4,jtxtdategeneralledger.getText());
               pst.setString(5,jtxtdescription.getText());
            pst.executeUpdate();
           String sql1="update vendor set remaining_amount=remaining_amount - '"+ct+"' where vendor_id='"+vid+"'";
            pst=con.createConnection().prepareStatement(sql1);
          
           pst.executeUpdate();
           String sql2="update vendor set remaining_amount=remaining_amount + '"+db+"' where vendor_id='"+vid+"'";
            pst=con.createConnection().prepareStatement(sql2);
           
            pst.executeUpdate();
            showdata4();
            JOptionPane.showMessageDialog(null, " TRANSACTION RECORDED");
            jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);

           
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null, e);
               jtxtcustomeridledger.setText(null);
               jtxtvendoridledger.setText(null);
               jtxtemployeeidledger.setText(null);
               jtxtcredit.setText(null);
               jtxtdebit.setText(null);
               jtxtdescription.setText(null);
           }
        }
        else
        {
             jtxtcustomeridledger.setText(null);
               jtxtvendoridledger.setText(null);
               jtxtemployeeidledger.setText(null);
               jtxtcredit.setText(null);
               jtxtdebit.setText(null);
               jtxtdescription.setText(null);
        }
       }
       else if(jrbtnemployee.isSelected())
       {
          
         int eid=Integer.parseInt(jtxtemployeeidledger.getText());
          int p = JOptionPane.showConfirmDialog(null,"are you sure you want to make entry in ledger","UPDATE",JOptionPane.YES_NO_OPTION);
        if(p==0){
           try{
           String sql="insert into general_ledger_employee(employee_id,credit,debit,dated,description) values(?,?,?,?,?) ";
           pst=con.createConnection().prepareStatement(sql);
           
            pst.setString(1,jtxtemployeeidledger.getText());
             pst.setFloat(2,ct);
              pst.setFloat(3,db);
               pst.setString(4,jtxtdategeneralledger.getText());
               pst.setString(5,jtxtdescription.getText());
            pst.executeUpdate();
           String sql1="update employee set remaining_amount=remaining_amount - '"+ct+"' where employee_id='"+eid+"'   ";
            pst=con.createConnection().prepareStatement(sql1);
          
           pst.executeUpdate();
           String sql2="update employee set remaining_amount=remaining_amount + '"+db+"' where employee_id='"+eid+"'  ";
            pst=con.createConnection().prepareStatement(sql2);
           
            pst.executeUpdate();
            showdata();
            JOptionPane.showMessageDialog(null, " TRANSACTION RECORDED");
            jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);

           
           }
           catch(Exception e)
           {
              JOptionPane.showMessageDialog(null, e);
               jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);
           }
       }
        else
        {
             jtxtcustomeridledger.setText(null);
            jtxtvendoridledger.setText(null);
            jtxtemployeeidledger.setText(null);
            jtxtcredit.setText(null);
            jtxtdebit.setText(null);
            jtxtdescription.setText(null);
        }
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jtxtsearchempnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempnameKeyPressed
       
        
        
               
    }//GEN-LAST:event_jtxtsearchempnameKeyPressed

    private void jtxtsearchempcnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempcnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchempcnKeyPressed

    private void jtxtsearchempaddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempaddKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchempaddKeyPressed

    private void jtxtsearchempsalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempsalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchempsalKeyPressed

    private void jtxtsearchempdesigKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchempdesigKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchempdesigKeyPressed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jtxtsearchvndcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchvndcnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchvndcnActionPerformed

    private void jtxtsearchvndnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchvndnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchvndnameActionPerformed

    private void jtxtsearchvndproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchvndproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchvndproductActionPerformed

    private void jtxtsearchvndaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchvndaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchvndaddressActionPerformed

    private void jbtnclearproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearproductsActionPerformed
        cleardata3();
        jLabel59.setIcon(null);
    }//GEN-LAST:event_jbtnclearproductsActionPerformed

    private void jrbtncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtncustomerActionPerformed
       jtxtemployeeidledger.setEnabled(false);
       jtxtvendoridledger.setEnabled(false);
       jtxtcustomeridledger.setEnabled(true);
    }//GEN-LAST:event_jrbtncustomerActionPerformed

    private void jrbtnemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnemployeeActionPerformed
        jtxtvendoridledger.setEnabled(false);
        jtxtcustomeridledger.setEnabled(false);
        jtxtemployeeidledger.setEnabled(true);
    }//GEN-LAST:event_jrbtnemployeeActionPerformed

    private void jrbtnvendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnvendorActionPerformed
      jtxtemployeeidledger.setEnabled(false);
       jtxtvendoridledger.setEnabled(true);
       jtxtcustomeridledger.setEnabled(false);
    }//GEN-LAST:event_jrbtnvendorActionPerformed

    private void jtxtpricepurchaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtpricepurchaseKeyPressed
      
       if(evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jbtnaddpurchase.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            //totalAmount1();
            jbtnaddpurchase.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jtxtquantitypv.requestFocus();
        }
    }//GEN-LAST:event_jtxtpricepurchaseKeyPressed

    private void jtxttotalamountpurchaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttotalamountpurchaseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttotalamountpurchaseKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jtxtamountpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtamountpaidActionPerformed
         
        
        
    }//GEN-LAST:event_jtxtamountpaidActionPerformed

    private void jtxtamountpaidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtamountpaidKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          
       {
            Float ap=Float.parseFloat(jtxtamountpaid.getText());
            float tm=Float.parseFloat(jtxtnettotal.getText());
            
          if(ap>tm)
          {
          am=ap-tm;
          jtxtbalanceremaining.setText(String.valueOf(am));
          jtxtbalanceremaining.requestFocus();
          }
          else
          {
              am=tm-ap;
          jtxtbalanceremaining.setText(String.valueOf(am));
          jtxtbalanceremaining.requestFocus();
          }
           
        } 
    }//GEN-LAST:event_jtxtamountpaidKeyPressed

    private void jtxttaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttaxActionPerformed

    private void jtxtfreightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfreightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfreightActionPerformed

    private void jtxttaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttaxKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
            float tm=Float.parseFloat(jtxtnettotal.getText());
            Float tax=Float.parseFloat(jtxttax.getText());
             am=tm+(tm*tax)/100;
          jtxtnettotal.setText(String.valueOf(am));
            jtxtfreight.requestFocus();
       }
    }//GEN-LAST:event_jtxttaxKeyPressed

    private void jtxtfreightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtfreightKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
            float tm=Float.parseFloat(jtxtnettotal.getText());
            Float freight=Float.parseFloat(jtxtfreight.getText());
             am=tm+freight;
          jtxtnettotal.setText(String.valueOf(am));
          jtxtdiscountsales.requestFocus();
            
       }
       
    }//GEN-LAST:event_jtxtfreightKeyPressed

    private void jtxtdiscountsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdiscountsalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdiscountsalesActionPerformed

    private void jtxtdiscountsalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdiscountsalesKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
            float tm=Float.parseFloat(jtxtsubtotal.getText());
            Float discount=Float.parseFloat(jtxtdiscountsales.getText());
             am=tm-discount;
          jtxtnettotal.setText(String.valueOf(am));
          jtxtamountpaid.requestFocus();
            
       }
    }//GEN-LAST:event_jtxtdiscountsalesKeyPressed

    private void jtxtsearchpurchasedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearchpurchasedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearchpurchasedateActionPerformed

    private void jbtnsearchpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchpurchaseActionPerformed
        String a=  jtxtsearchpurchasedate.getText();
      String b= jtxtsearchpurchaseproduct.getText();
      String c=  jtxtsearchvendorpurchase.getText();
     
      
        
         if( !a.isEmpty() && !c.isEmpty())

        {
           showpurchasedateandproduct();
            jtxtsearchpurchasedate.setText(null);
            jtxtsearchvendorpurchase.setText(null);
        }
        else if( !a.isEmpty())

        {
            showpurchasedate();
            jtxtsearchpurchasedate.setText(null);
        }
        
       else  if( !b.isEmpty())

        {
             
            showpurchaseproduct();
            jtxtsearchpurchaseproduct.setText(null);
        }
       else if (!c.isEmpty())
        {
            productpurchasevendor();
            jtxtsearchvendorpurchase.setText(null);
        }
      
       
    }//GEN-LAST:event_jbtnsearchpurchaseActionPerformed

    private void jtxtsearcgledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtsearcgledgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsearcgledgerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(jrbtncustomer.isSelected()){showcustomerledger();}
       else if(jrbtnvendor.isSelected()){showvendorledger();}
       else if(jrbtnemployee.isSelected()){showemployeeledger();}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jtxtsellingpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsellingpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtsellingpriceKeyPressed

    private void jrbtncountercustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtncountercustomerActionPerformed
        jtxtcustomeridinorders.setEditable(false);
        jtxtcustomernameinorders.setEditable(false);
         if( jrbtncountercustomer.isSelected())
        { 
            counterOrderId();
            int oid = Integer.parseInt(jtxtorderid.getText());
            String od = jtxtorderdate.getText();
            try
            {
                String sql="insert into counterorder values(?,?)";
                pst=con.createConnection().prepareStatement(sql);
                pst.setInt(1, oid);
                pst.setString(2,od);
                pst.executeUpdate();
                jtxtproductidsales.requestFocusInWindow();
                        
                jrbtncreditsales.setEnabled(false);
            }
            catch(Exception e)
            {JOptionPane.showMessageDialog(null, e);}
        }
        
        
    }//GEN-LAST:event_jrbtncountercustomerActionPerformed

    private void jrbtnpermanentcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnpermanentcustomerActionPerformed
        jtxtcustomeridinorders.setEditable(true);
        jtxtcustomernameinorders.setEditable(true);
        orderId();
        jrbtncreditsales.setEnabled(true);
        jtxtcustomeridinorders.requestFocusInWindow();
    }//GEN-LAST:event_jrbtnpermanentcustomerActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             int oid = Integer.parseInt(jtxtorderid.getText());
            int pid = Integer.parseInt(jtxtproductidsales.getText());
            int qty = Integer.parseInt(jtxtquantitysales.getText());
            float price = Float.parseFloat(jtxtpricesales.getText());
            int newqty = qty-1;
            float amount = qty*price;
            jtxtpricesales.setEditable(false);
        if(jrbtnfixedprice.isSelected() && jrbtnpermanentcustomer.isSelected())
        {
            try
            {
               String sql="update order_line set quantity =? where order_id=?"; 
               pst=con.createConnection().prepareStatement(sql);
               pst.setInt(1,qty );
               pst.setFloat(2, oid);
               pst.executeUpdate();
               String sql1="update products set quantity_left = quantity_left -'"+newqty+"' where product_id=? ";
               pst=con.createConnection().prepareStatement(sql1);
               pst.setFloat(1, pid);
               pst.executeUpdate();
               String sql2="update order_line set amount =? where (order_id=? and product_id=?)";
               pst=con.createConnection().prepareStatement(sql2);
               pst.setFloat(1,amount );
               pst.setInt(2, oid);
               pst.setInt(3,pid);
               pst.executeUpdate();
               showdata2();
               showdata3();
               totalAmount();
               nettotal();
               jtxtproductidsales.setText(null);
               jtxtquantitysales.setText(null);
               jtxtpricesales.setText(null);
               jtxtproductidsales.requestFocus();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(jrbtnfixedprice.isSelected() && jrbtncountercustomer.isSelected())
        {
            try
            {
               String sql="update order_line2 set quantity =? where counterorder_id=?"; 
               pst=con.createConnection().prepareStatement(sql);
               pst.setInt(1,qty );
               pst.setFloat(2, oid);
               pst.executeUpdate();
               String sql1="update products set quantity_left = quantity_left -'"+newqty+"' where product_id=? ";
               pst=con.createConnection().prepareStatement(sql1);
               pst.setFloat(1, pid);
               pst.executeUpdate();
               String sql2="update order_line2 set amount =? where (counterorder_id=? and product_id=?)";
               pst=con.createConnection().prepareStatement(sql2);
               pst.setFloat(1,amount );
               pst.setInt(2, oid);
               pst.setInt(3,pid);
               pst.executeUpdate();
               showdataCounterCustomer();
               showdata3();
               totalAmountCounter();
               netTotalCounter();
               jtxtproductidsales.setText(null);
               jtxtquantitysales.setText(null);
               jtxtpricesales.setText(null);
               jtxtproductidsales.requestFocus();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Quantity updation in order is not allowed in VARIABLE_PRICE_MODE");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jmenuedailycashsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuedailycashsaleActionPerformed
      
         
           
              
             
              File file = new File(DEST);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
            ct.createPdfcashsalesreport(DEST);
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
          
       
       
    }//GEN-LAST:event_jmenuedailycashsaleActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jmenuedailycreditsalessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuedailycreditsalessActionPerformed
        File file = new File(DEST1);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
            ct.createPdfcreditsalesreport(DEST1);
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmenuedailycreditsalessActionPerformed

    private void jmenuedailycashpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuedailycashpurchaseActionPerformed
               File file = new File(DEST2);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
            ct.createPdfcashpurchasereport(DEST2);
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmenuedailycashpurchaseActionPerformed

    private void jmenuedailycreditpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuedailycreditpurchaseActionPerformed
        File file = new File(DEST3);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
            ct.createPdfcreditpurchasereport(DEST3);
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmenuedailycreditpurchaseActionPerformed

    private void jmenuedailyoverallreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuedailyoverallreviewActionPerformed
         File file = new File(DEST4);
              file.getParentFile().mkdirs();
              CenterText ct= new CenterText();
        try {
            
            ct. createPdfoverallreviewreport(DEST4);
            
        } catch (IOException ex) {
            Logger.getLogger(secondwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmenuedailyoverallreviewActionPerformed

    private void jtxtproductnameinordersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtproductnameinordersKeyPressed
        
    }//GEN-LAST:event_jtxtproductnameinordersKeyPressed

    
   public static final String DEST = "results/text/cash_sales.pdf";
   public static final String DEST1 ="results/text/credit_sales.pdf";
   public static final String DEST2 ="results/text/cash_purchase.pdf";
   public static final String DEST3 ="results/text/credit_purchase.pdf";
   public static final String DEST4 ="results/text/overall_review.pdf";
   public static final String DEST5 ="results/text/receipt.pdf";
    public static void main(String args[])throws IOException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondwindow().setVisible(true);
            }
        });
    }
    public void setvisible()
    {
        jMenu3.setVisible(false);
    }
     public void setvisible1()
    {
       jTabbedPane1.setEnabledAt(0, false);
       jTabbedPane1.setEnabledAt(1, false);
       jTabbedPane1.setEnabledAt(2, false);
       jTabbedPane1.setEnabledAt(3, false);
       jTabbedPane1.setEnabledAt(4, false);
       jTabbedPane1.setEnabledAt(6, false);
       jTabbedPane1.setEnabledAt(7, false);
      
    }
     public void setvisible2()
    {
       jTabbedPane1.setEnabledAt(5, false);
      
    }
      public void setenable()
    {
       jScrollPane6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       jScrollPane6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
      
    }
       public String getorderid()
    {
       return jtxtorderid.getText();
      
    }
      
       
   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Jbtngroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbrcreditpurchase;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JButton jbtnaddcustomer;
    private javax.swing.JButton jbtnaddproducts;
    private javax.swing.JButton jbtnaddpurchase;
    private javax.swing.JButton jbtnaddvendor;
    private javax.swing.JButton jbtnattach;
    private javax.swing.JButton jbtnattachvendor;
    private javax.swing.JButton jbtnclearcustomers;
    private javax.swing.JButton jbtnclearemployees;
    private javax.swing.JButton jbtnclearproducts;
    private javax.swing.JButton jbtnclearpv;
    private javax.swing.JButton jbtnclearvendors;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtndeleteproducts;
    private javax.swing.JButton jbtndeletepurchase;
    private javax.swing.JButton jbtndeletesales;
    private javax.swing.JButton jbtndeletevendor;
    private javax.swing.ButtonGroup jbtngroupcustomertype;
    private javax.swing.ButtonGroup jbtngroupprice;
    private javax.swing.ButtonGroup jbtngrouppurchase;
    private javax.swing.ButtonGroup jbtngroupsales;
    private javax.swing.JButton jbtnneworders;
    private javax.swing.JButton jbtnprint;
    private javax.swing.JButton jbtnsearchcustomers;
    private javax.swing.JButton jbtnsearchemployees;
    private javax.swing.JButton jbtnsearchorders;
    private javax.swing.JButton jbtnsearchproducts;
    private javax.swing.JButton jbtnsearchpurchase;
    private javax.swing.JButton jbtnsearchvendor;
    private javax.swing.JButton jbtnupdatecustomer;
    private javax.swing.JButton jbtnupdateemployee;
    private javax.swing.JButton jbtnupdateproduct;
    private javax.swing.JButton jbtnupdatevendor;
    private javax.swing.JMenuItem jmenuedailycashpurchase;
    private javax.swing.JMenuItem jmenuedailycashsale;
    private javax.swing.JMenuItem jmenuedailycreditpurchase;
    private javax.swing.JMenuItem jmenuedailycreditsaless;
    private javax.swing.JMenuItem jmenuedailyoverallreview;
    private javax.swing.JRadioButton jrbcashpurchase;
    private javax.swing.JRadioButton jrbtncashsales;
    private javax.swing.JRadioButton jrbtncountercustomer;
    private javax.swing.JRadioButton jrbtncreditsales;
    private javax.swing.JRadioButton jrbtncustomer;
    private javax.swing.JRadioButton jrbtnemployee;
    private javax.swing.JRadioButton jrbtnfixedprice;
    private javax.swing.JRadioButton jrbtnpermanentcustomer;
    private javax.swing.JRadioButton jrbtnvariableprice;
    private javax.swing.JRadioButton jrbtnvendor;
    private javax.swing.JTable jtablecustomers;
    private javax.swing.JTable jtableemployee;
    private javax.swing.JTable jtablegeneralledger;
    private javax.swing.JTable jtableproduct_vendor;
    private javax.swing.JTable jtableproducts;
    private javax.swing.JTable jtablesales;
    private javax.swing.JTable jtablevendors;
    private javax.swing.JTextField jtxtamountpaid;
    private javax.swing.JTextField jtxtbalanceremaining;
    private javax.swing.JTextField jtxtcredit;
    private javax.swing.JTextField jtxtcustomeraddress;
    private javax.swing.JTextField jtxtcustomercn;
    private javax.swing.JTextField jtxtcustomerid;
    private javax.swing.JTextField jtxtcustomeridinorders;
    private javax.swing.JTextField jtxtcustomeridledger;
    private javax.swing.JTextField jtxtcustomername;
    private javax.swing.JTextField jtxtcustomernameinorders;
    private javax.swing.JTextField jtxtdategeneralledger;
    private javax.swing.JTextField jtxtdebit;
    private javax.swing.JTextArea jtxtdescription;
    private javax.swing.JTextField jtxtdiscount;
    private javax.swing.JTextField jtxtdiscountsales;
    private javax.swing.JTextField jtxtemployeeaddress;
    private javax.swing.JTextField jtxtemployeecn;
    private javax.swing.JTextField jtxtemployeedesignation;
    private javax.swing.JTextField jtxtemployeeid;
    private javax.swing.JTextField jtxtemployeeidledger;
    private javax.swing.JTextField jtxtemployeename;
    private javax.swing.JTextField jtxtemployeesalary;
    private javax.swing.JTextField jtxtfreight;
    private javax.swing.JTextField jtxtnettotal;
    private javax.swing.JTextField jtxtorderdate;
    private javax.swing.JTextField jtxtorderid;
    private javax.swing.JTextField jtxtpath;
    private javax.swing.JTextField jtxtpathcustomers;
    private javax.swing.JTextField jtxtpathproducts;
    private javax.swing.JTextField jtxtpathvendor;
    private javax.swing.JTextField jtxtpricepurchase;
    private javax.swing.JTextField jtxtpricesales;
    private javax.swing.JTextField jtxtproductid;
    private javax.swing.JTextField jtxtproductidpv;
    private javax.swing.JTextField jtxtproductidsales;
    private javax.swing.JTextField jtxtproductname;
    private javax.swing.JTextField jtxtproductnameinorders;
    private javax.swing.JTextField jtxtpurchasedate;
    private javax.swing.JTextField jtxtpurchaseprice;
    private javax.swing.JTextField jtxtquantityleft;
    private javax.swing.JTextField jtxtquantitypv;
    private javax.swing.JTextField jtxtquantitysales;
    private javax.swing.JTextField jtxtsearcgledger;
    private javax.swing.JTextField jtxtsearchcusaddress;
    private javax.swing.JTextField jtxtsearchcuscn;
    private javax.swing.JTextField jtxtsearchcusid;
    private javax.swing.JTextField jtxtsearchcusidsales;
    private javax.swing.JTextField jtxtsearchcusname;
    private javax.swing.JTextField jtxtsearchcusnamesales;
    private javax.swing.JTextField jtxtsearchcusshopname;
    private javax.swing.JTextField jtxtsearchempadd;
    private javax.swing.JTextField jtxtsearchempcn;
    private javax.swing.JTextField jtxtsearchempdesig;
    private javax.swing.JTextField jtxtsearchempid;
    private javax.swing.JTextField jtxtsearchempname;
    private javax.swing.JTextField jtxtsearchempsal;
    private javax.swing.JTextField jtxtsearchorderdatesales;
    private javax.swing.JTextField jtxtsearchorderidsales;
    private javax.swing.JTextField jtxtsearchpdiscount;
    private javax.swing.JTextField jtxtsearchpid;
    private javax.swing.JTextField jtxtsearchpname;
    private javax.swing.JTextField jtxtsearchpprice;
    private javax.swing.JTextField jtxtsearchpquantity;
    private javax.swing.JTextField jtxtsearchpurchasedate;
    private javax.swing.JTextField jtxtsearchpurchaseproduct;
    private javax.swing.JTextField jtxtsearchvendorpurchase;
    private javax.swing.JTextField jtxtsearchvndaddress;
    private javax.swing.JTextField jtxtsearchvndcn;
    private javax.swing.JTextField jtxtsearchvndid;
    private javax.swing.JTextField jtxtsearchvndname;
    private javax.swing.JTextField jtxtsearchvndproduct;
    private javax.swing.JTextField jtxtsellingprice;
    private javax.swing.JTextField jtxtshopname;
    private javax.swing.JTextField jtxtsubtotal;
    private javax.swing.JTextField jtxttax;
    private javax.swing.JTextField jtxttotalamountpurchase;
    private javax.swing.JTextField jtxtvendoraddress;
    private javax.swing.JTextField jtxtvendorcn;
    private javax.swing.JTextField jtxtvendorid;
    private javax.swing.JTextField jtxtvendoridledger;
    private javax.swing.JTextField jtxtvendoridpv;
    private javax.swing.JTextField jtxtvendorname;
    // End of variables declaration//GEN-END:variables

    public void currentDate()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        jtxtorderdate.setText(year+"-"+(month+1)+"-"+day);
        
        
        
    }
     public void Date()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        jtxtdategeneralledger.setText(year+"-"+(month+1)+"-"+day);
        
        
        
    }
     public void purchaseDate()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        jtxtpurchasedate.setText(year+"-"+(month+1)+"-"+day);
        
        
        
    }
    
     
   
    public void showdata()
    {
       
        try{
             String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation,remaining_amount from employee";
        pst=con.createConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void showdata1()
    {
       
        try{
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name,remaining_amount from customer";
        pst=con.createConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void showdata2()
    {
       int orderid = Integer.parseInt(jtxtorderid.getText());
       int pid=Integer.parseInt(jtxtproductidsales.getText());
       
        try{
             String sql="	select order_id,order_line.product_id,product_name,price,quantity,amount from order_line\n" +
"                     inner join products\n" +
"                     on order_line.product_id = products.product_id\n" +
"                      where order_id=?";
        pst=con.createConnection().prepareStatement(sql);
        pst.setInt(1,orderid);
        rs=pst.executeQuery();
        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void showdataCounterCustomer()
    {
       int orderid = Integer.parseInt(jtxtorderid.getText());
       int pid=Integer.parseInt(jtxtproductidsales.getText());
       
        try{
             String sql="	select counterorder_id,order_line2.product_id,product_name,price,quantity,amount from order_line2\n" +
"                     inner join products\n" +
"                     on order_line2.product_id = products.product_id\n" +
"                      where counterorder_id=?";
        pst=con.createConnection().prepareStatement(sql);
        pst.setInt(1,orderid);
        rs=pst.executeQuery();
        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void showdatafixedprice()
    {
       int orderid = Integer.parseInt(jtxtorderid.getText());
       int pid=Integer.parseInt(jtxtproductidsales.getText());
       
        try{
              String sql="	select order_id,order_line.product_id,product_name,sellprice,quantity,amount from order_line\n" +
"                     inner join products\n" +
"                     on order_line.product_id = products.product_id\n" +
"                      where order_id=?";

        pst=con.createConnection().prepareStatement(sql);
        pst.setInt(1,orderid);
        rs=pst.executeQuery();
        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void showdatafixedpricecounter()
    {
       int orderid = Integer.parseInt(jtxtorderid.getText());
       int pid=Integer.parseInt(jtxtproductidsales.getText());
       
        try{
              String sql="	select counterorder_id,order_line2.product_id,product_name,sellprice,quantity,amount from order_line2\n" +
"                     inner join products\n" +
"                     on order_line2.product_id = products.product_id\n" +
"                      where counterorder_id=?";

        pst=con.createConnection().prepareStatement(sql);
        pst.setInt(1,orderid);
        rs=pst.executeQuery();
        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   public void showdata3()
    {
       
        try{
             String sql="select product_id,product_name,product_price,sellprice,discount,quantity_left from products";
        pst=con.createConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void showdata4()
    {
       
        try{
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact#,remaining_amount from vendor";
        pst=con.createConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void showdata5()
    {
       
        try{
             String sql="	select id,product_vendor.product_id,product_name,vendor_id,price,quantity,amount,purchasedate from product_vendor\n" +
"                     inner join products\n" +
"                     on product_vendor.product_id = products.product_id\n"; 

                     

                     
        pst=con.createConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void showdataname()
    {
       
        try{ 
            
           
           
             String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_name like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchempname.getText()+'%');
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempname.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void showdataname1()
    {
       
        try{ 
            
           
           
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact# from vendor where  vendor_name like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchvndname.getText()+'%');
             
          rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchvndname.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void showdataname2()
    {
       
        try{ 
            
           
           
             String sql="select product_id,product_name,product_price,discount,quantity_left from products where  product_name like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchpname.getText()+'%');
             
          rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchpname.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       public void showdataname3()
    {
       
        try{ 
            
           
           
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name from customer where  customer_name like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchcusname.getText()+'%');
             
          rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchcusname.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void showdataid()
    {
       
        try{ 
            
           
           
            String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_id = ?";
              
             
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchempid.getText());
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempid.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       public void showdataid1()
    {
       
        try{ 
            
           
           
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact# from vendor where  vendor_id = ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchvndid.getText());
             
          rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchvndid.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       public void showdataid2()
    {
       
        try{ 
            
           
           
             String sql="select product_id,product_name,product_price,discount,quantity_left from products where  product_id = ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchpid.getText());
             
          rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchpid.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         public void showid3()
    {
       
        try{ 
            
           
           
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name from customer where  customer_id = ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchcusid.getText());
             
          rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchcusid.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       public void showdatasalary()
    {
       
        try{ 
            
           
           
             String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_salary like  ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchempsal.getText()+'%');
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempsal.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
        public void showdataaddress()
    {
       
        try{ 
            
           
           
            String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_address like  ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchempadd.getText()+'%');
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempadd.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         public void showdataaddress1()
    {
       
        try{ 
            
           
           
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact# from vendor where  vendor_address like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchvndaddress.getText()+'%');
             
          rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchvndaddress.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
           public void showaddress3()
    {
       
        try{ 
            
           
           
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name from customer where  customer_address like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchcusaddress.getText()+'%');
             
          rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchcusaddress.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         public void showdatacontact()
    {
       
        try{ 
            
           
           
             String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_contact# like  ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchempcn.getText()+'%');
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempcn.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
          public void showdatacontact1()
    {
       
        try{ 
            
           
           
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact# from vendor where  vendor_contact# like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchvndcn.getText()+'%');
             
          rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchvndcn.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
           public void showcontact3()
    {
       
        try{ 
            
           
           
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name from customer where  customer_contact# like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchcuscn.getText()+'%');
             
          rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchcuscn.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
          public void showdatadesignation()
    {
       
        try{ 
            
           
           
              String sql="select employee_id,employee_name,employee_contact#,employee_address,employee_salary,employee_designation from employee where  employee_designation like  ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchempdesig.getText()+'%');
             
          rs=pst.executeQuery();
        jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchempdesig.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
                public void showproduct1()
    {
       
        try{ 
            
           // join to be made here
           
             String sql="select vendor_id,vendor_name,vendor_address,vendor_contact# from vendor where vendor_id in(select product_id from product_vendor where product_id=vendor.vendor_id)";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,'%'+jtxtsearchvndid.getText()+'%');
             
          rs=pst.executeQuery();
        jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchvndid.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
             public void showproductprice2()
    {
       
        try{ 
            
           
           
             String sql="select product_id,product_name,product_price,discount,quantity_left from products where  product_price >=? order by product_price";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchpprice.getText());
             
          rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchpprice.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
              public void showquantityleft2()
    {
       
        try{ 
            
           
           
             String sql="select product_id,product_name,product_price,discount,quantity_left from products where  quantity_left >=?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchpquantity.getText());
             
          rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchpquantity.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
                 public void showdiscount2()
    {
       
        try{ 
            
           
           
             String sql="select product_id,product_name,product_price,discount,quantity_left from products where  discount >=?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchpdiscount.getText());
             
          rs=pst.executeQuery();
        jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
        jtxtsearchpdiscount.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
                   public void showshopname3()
    {
       
        try{ 
            
           
           
             String sql="select customer_id,customer_name,customer_address,customer_contact#,customer_shop_name from customer where  customer_shop_name like ?";
             
             
             
             pst=con.createConnection().prepareStatement(sql);
             pst.setString(1,jtxtsearchcusshopname.getText()+'%');
             
          rs=pst.executeQuery();
        jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
       jtxtsearchcusshopname.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
                   public void searchorderorderid()
                   {
                       int oid = Integer.parseInt(jtxtsearchorderidsales.getText());
                       try
                       {
                       String sql="	select order_id,order_line.product_id,product_name,price,quantity,amount from order_line\n" +
"                     inner join products\n" +
"                     on order_line.product_id = products.product_id\n" +
"                      where order_id=?";
                        pst=con.createConnection().prepareStatement(sql);
                        pst.setInt(1,oid);
                        rs=pst.executeQuery();
                        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
                        jtxtsearchorderidsales.setText(null);
                        
                        }
                       catch(Exception e)
                       {
                          JOptionPane.showMessageDialog(null, e); 
                       }
                    }
                   public void searchorderorderidcounter()
                   {
                       int oid = Integer.parseInt(jtxtsearchorderidsales.getText());
                       try
                       {
                       String sql="	select counterorder_id,order_line2.product_id,product_name,price,quantity,amount from order_line2\n" +
"                     inner join products\n" +
"                     on order_line2.product_id = products.product_id\n" +
"                      where counterorder_id=?";
                        pst=con.createConnection().prepareStatement(sql);
                        pst.setInt(1,oid);
                        rs=pst.executeQuery();
                        jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
                        jtxtsearchorderidsales.setText(null);
                        
                        }
                       catch(Exception e)
                       {
                          JOptionPane.showMessageDialog(null, e); 
                       }
                    }
                   public void showpurchasedate()
                   {
        try {
            String sql="select * from product_vendor where purchasedate=? ";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,jtxtsearchpurchasedate.getText());
            rs=pst.executeQuery();
           jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
                   }
                   public void showpurchaseproduct()
                   {
                       int a = Integer.parseInt(jtxtsearchpurchaseproduct.getText());
                        try {
            String sql="select product_vendor.product_id,product_name,vendor_id,price,quantity,amount,purchasedate from product_vendor\n" +
"                     inner join products\n" +
"                     on product_vendor.product_id = products.product_id where products.product_id=?"; 

            pst=con.createConnection().prepareStatement(sql);
            pst.setInt(1,a);
            rs=pst.executeQuery();
           jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
                   }
                   public void productpurchasevendor()
                   {
                       int a = Integer.parseInt(jtxtsearchvendorpurchase.getText());
        try {
            
            String sql="select product_vendor.product_id,product_name,vendor_id,price,quantity,amount,purchasedate from product_vendor\n" +
                    "                     inner join products\n" +
                    "                     on product_vendor.product_id = products.product_id where vendor_id=?";
            pst=con.createConnection().prepareStatement(sql);
            pst.setInt(1,a);
            rs=pst.executeQuery();
            jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }

                   }
                    public void showpurchasedateandproduct()
                   {
                    int a=Integer.parseInt(jtxtsearchvendorpurchase.getText());
        try {
            String sql="select * from product_vendor where (purchasedate=? and vendor_id=?) ";
            pst=con.createConnection().prepareStatement(sql);
            pst.setString(1,jtxtsearchpurchasedate.getText());
            pst.setInt(2,a);
            rs=pst.executeQuery();
           jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
                   }
                    public void showcustomerledger()
                    {
                        try
                        {
                             String sql="select general_ledger_customer.customer_id,customer_name,debit,credit,description,dated from general_ledger_customer\n" +
                    "                     inner join customer\n" +
                    "                     on general_ledger_customer.customer_id = customer.customer_id where customer.customer_id=?";
           
                             pst=con.createConnection().prepareStatement(sql);
                             pst.setString(1,jtxtsearcgledger.getText());
                             rs=pst.executeQuery();
                             jtablegeneralledger.setModel(DbUtils.resultSetToTableModel(rs));
                             
                            
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                     public void showemployeeledger()
                    {
                        try
                        {
                             String sql="select general_ledger_employee.employee_id,employee_name,debit,credit,description,dated from general_ledger_employee\n" +
                    "                     inner join employee\n" +
                    "                     on general_ledger_employee.employee_id = employee.employee_id where employee.employee_id=?";
           
                             pst=con.createConnection().prepareStatement(sql);
                             pst.setString(1,jtxtsearcgledger.getText());
                             rs=pst.executeQuery();
                             jtablegeneralledger.setModel(DbUtils.resultSetToTableModel(rs));
                             
                            
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                      public void showvendorledger()
                    {
                        try
                        {
                             String sql="select general_ledger_vendor.vendor_id,vendor_name,debit,credit,description,dated from general_ledger_vendor\n" +
                    "                     inner join vendor\n" +
                    "                     on general_ledger_vendor.vendor_id = vendor.vendor_id where vendor.vendor_id=?";
           
                             pst=con.createConnection().prepareStatement(sql);
                             pst.setString(1,jtxtsearcgledger.getText());
                             rs=pst.executeQuery();
                             jtablegeneralledger.setModel(DbUtils.resultSetToTableModel(rs));
                             
                            
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                   
     
      public void cleardata()
    {
       
        try{
            
             jtableemployee.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtsearchempid.setText(null);
             jtxtemployeeid.setText(null);
             jtxtemployeename.setText(null);
             jtxtemployeecn.setText(null);
             jtxtemployeeaddress.setText(null);
             jtxtemployeesalary.setText(null);
             jtxtemployeedesignation.setText(null);
             jLabel57.setIcon(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        public void cleardata1()
    {
       
        try{
            
             jtablevendors.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtsearchvndid.setText(null);
             jtxtvendorid.setText(null);
             jtxtvendorname.setText(null);
             jtxtvendoraddress.setText(null);
             jtxtvendorcn.setText(null);
             
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
          public void cleardata2()
    {
       
        try{
            
             jtablesales.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtproductidsales.setText(null);
             jtxtpricesales.setText(null);
             jtxtquantitysales.setText(null);
             jtxtsearchcusnamesales.setText(null);
             
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
            public void cleardata3()
    {
       
        try{
            
             jtableproducts.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtsearchpid.setText(null);
             jtxtproductid.setText(null);
             jtxtproductname.setText(null);
             jtxtpurchaseprice.setText(null);
             jtxtquantityleft.setText(null);
             jtxtdiscount.setText(null);
             
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
              public void cleardata4()
    {
       
        try{
            
             jtablecustomers.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtsearchcusid.setText(null);
             jtxtcustomername.setText(null);
             jtxtcustomerid.setText(null);
             jtxtcustomercn.setText(null);
             jtxtshopname.setText(null);
             jtxtcustomeraddress.setText(null);
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
                public void cleardatapv()
    {
       
        try{
            
             jtableproduct_vendor.setModel(DbUtils.resultSetToTableModel(rs));
             jtxtproductidpv.setText(null);
             jtxtvendoridpv.setText(null);
             jtxtquantitypv.setText(null);
             jtxtpurchasedate.setText(null);
            
        purchaseDate();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
         private ImageIcon format=null;    
              
             String filename=null;
             int s=0;
             byte [] person_image=null;
             String path=null;
             
              
             
             
             
             
             
          public void totalAmount()
          {
              try
              {
                  int oid=Integer.parseInt(jtxtorderid.getText());
                  
                  String sql="select sum(amount) as NETAMOUNT from order_line where order_id=?";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  pst.setInt(1,oid);
                  rs=pst.executeQuery();
                  while(rs.next()){
                          
                    jtxtsubtotal.setText(rs.getString("NETAMOUNT"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while calculating net amount, "+e.getMessage());
              }
              
          }
           public void totalAmountCounter()
          {
              try
              {
                  int oid=Integer.parseInt(jtxtorderid.getText());
                  
                  String sql="select sum(amount) as NETAMOUNT from order_line2 where counterorder_id=?";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  pst.setInt(1,oid);
                  rs=pst.executeQuery();
                  while(rs.next()){
                          
                    jtxtsubtotal.setText(rs.getString("NETAMOUNT"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while calculating net amount, "+e.getMessage());
              }
              
          }
          public void nettotal()
          {
              try
              {
                  int oid=Integer.parseInt(jtxtorderid.getText());
                  
                  String sql="select sum(amount) as NETAMOUNT from order_line where order_id=?";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  pst.setInt(1,oid);
                  rs=pst.executeQuery();
                  while(rs.next()){
                          
                    jtxtnettotal.setText(rs.getString("NETAMOUNT"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while calculating net amount, "+e.getMessage());
              }
              
          }
          public void netTotalCounter()
          {
              try
              {
                  int oid=Integer.parseInt(jtxtorderid.getText());
                  
                  String sql="select sum(amount) as NETAMOUNT from order_line2 where counterorder_id=?";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  pst.setInt(1,oid);
                  rs=pst.executeQuery();
                  while(rs.next()){
                          
                    jtxtnettotal.setText(rs.getString("NETAMOUNT"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while calculating net amount, "+e.getMessage());
              }
              
          }
          
          public void totalAmount1()
          {
              
             
              try
              {
                
                  String sql1="select amount as NETAMOUNT from product_vendor where id= (select max(id) from product_vendor)";
                  pst=con.createConnection().prepareStatement(sql1);
               
                  rs=pst.executeQuery();
                  while(rs.next()){
                          
                    jtxttotalamountpurchase.setText(rs.getString("NETAMOUNT"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while calculating net amount, "+e.getMessage());
              }
          }
           public void orderId()
          {
              try
              {
                  
                  
                  String sql="select max(order_id)+1 as orderid from orders";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  
                  rs=pst.executeQuery();
                  while(rs.next())
                  {
                          
                    jtxtorderid.setText(rs.getString("orderid"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while displaying order_id, "+e.getMessage());
              }
          }
          public void counterOrderId()
          {
              try
              {
                  
                  
                  String sql="select max(counterorder_id)+1 as countersorder_id from counterorder";
                  
                 
                  
                  pst=con.createConnection().prepareStatement(sql);
                  
                  rs=pst.executeQuery();
                  while(rs.next())
                  {
                          
                    jtxtorderid.setText(rs.getString("countersorder_id"));
                  
                  }
                  
                  
                 
                  }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(null,"Exception while displaying order_id, "+e.getMessage());
              }
          }
          public void setColour()
          {
              for(int i=0;i<jtableproducts.getRowCount();i++) 
              {
            if((Integer)jtableproducts.getValueAt(i, 5) < 10)  
            {  
                      
                jtableproducts.setSelectionForeground(java.awt.Color.lightGray);
            }      
           
             
            
        }
          }
          
//          public void createPdf(String dest) throws IOException {
//        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
//        PageSize pagesize = PageSize.A4;
//        Document document = new Document(pdf, pagesize);
//        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
//        MyLine line = new MyLine();
//        java.util.List<com.itextpdf.layout.element.TabStop> tabstops = new ArrayList();
//        tabstops.add(new com.itextpdf.layout.element.TabStop(w / 2, TabAlignment.CENTER, line));
//        tabstops.add(new com.itextpdf.layout.element.TabStop(w, TabAlignment.LEFT, line));
//        Paragraph p = new Paragraph();
//        p.addTabStops(tabstops);
//        p.add(new com.itextpdf.layout.element.Tab()).add("Text in the middle").add(new com.itextpdf.layout.element.Tab());
//        document.add(p);
//        document.close();
//    }     
              
}
