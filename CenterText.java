/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_log;


import com.itextpdf.io.font.FontConstants;
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
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.layout.border.Border;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.ColumnDocumentRenderer;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.hyphenation.HyphenationConfig;
import com.itextpdf.test.annotations.type.SampleTest;

import java.io.File;

 
 
/**
 * @author bruno
 */
public class CenterText {
    PreparedStatement pst;
    sqlConnection con=new sqlConnection();
    ResultSet rs;
    secondwindow sc =new secondwindow();
    class MyLine implements ILineDrawer {
        private float lineWidth = 1;
        private float offset = 5;
        private Color color = Color.BLACK;
        @Override
        public void draw(PdfCanvas canvas, Rectangle drawArea) {
            canvas.saveState()
                .setStrokeColor(color)
                .setLineWidth(lineWidth)
                .moveTo(drawArea.getX(), drawArea.getY() + lineWidth / 2 + offset)
                .lineTo(drawArea.getX() + drawArea.getWidth(), drawArea.getY() + lineWidth / 2 + offset)
                .stroke()
                .restoreState();
        }
 
        @Override
        public float getLineWidth() {
            return lineWidth;
        }
        @Override
        public void setLineWidth(float lineWidth) {
            this.lineWidth = lineWidth;
        }
        @Override
        public Color getColor() {
            return color;
        }
        @Override
        public void setColor(Color color) {
            this.color = color;
        }
        public float getOffset() {
            return offset;
        }
        public void setOffset(float poffset) {
            this.offset = offset;
        }
 
    }
 
    //public static final String DEST = "results/text/center_text.pdf";
 
   /* public static void main(String[] args) throws IOException {
        
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new CenterText().createPdf(DEST);
        
    }*/
    
    public void createPdfcashsalesreport(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.LEDGER;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("CASH SALES REPORT").add(new Tab());
        p.setFontSize(30);
        p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setBold();
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p3.setTextAlignment(TextAlignment.CENTER);
        document.add(p3);
         Paragraph p5 = new Paragraph();
        p5.add("SALE TYPE               AMOUNT              DATED");
        p5.setTextAlignment(TextAlignment.CENTER);
        p5.setTextRenderingMode(5);
        p5.setFontSize(20);
        p5.setBold();
        document.add(p5);
         try
         {
           JTextField field1 = new JTextField();
          //JTextField field2 = new JTextField();
          Object[] fields={"ENTER DATE(YYYY-MM-DD)",field1};
          int x=JOptionPane.showConfirmDialog(null, fields,"YYYY-MM-DD",JOptionPane.OK_CANCEL_OPTION);
          if(x==0)
          {
              String date1=field1.getText();
              //String date2=field2.getText();
              String sql="select * from saletype where type_of_sale='cashsale' and dated = ?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_sale");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
              
             JOptionPane.showMessageDialog(null, "Report Saved...");
            }
          
         }
         catch(Exception e)
         {
             
         }
              
              document.close();
    } 
     public void createPdfcreditsalesreport(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.LEDGER;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("CREDIT SALES REPORT").add(new Tab());
        p.setFontSize(30);
         p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());
             
        p3.setTextAlignment(TextAlignment.CENTER);
        document.add(p3);
        Paragraph p5 = new Paragraph();
        p5.add("SALE TYPE               AMOUNT              DATED");
        p5.setTextAlignment(TextAlignment.CENTER);
        p5.setTextRenderingMode(5);
        p5.setFontSize(20);
        p5.setBold();
        document.add(p5);
         try
         {
           JTextField field1 = new JTextField();
          //JTextField field2 = new JTextField();
          Object[] fields={"ENTER DATE(YYYY-MM-DD)",field1};
          int x=JOptionPane.showConfirmDialog(null, fields,"YYYY-MM-DD",JOptionPane.OK_CANCEL_OPTION);
          if(x==0)
          {
              String date1=field1.getText();
              //String date2=field2.getText();
              String sql="select * from saletype where type_of_sale='creditsale' and dated = ?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_sale");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                   
                    document.add(p1);

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
              
             JOptionPane.showMessageDialog(null, "Report Saved...");
            }
          
         }
         catch(Exception e)
         {
             
         }
              
              document.close();
    } 
     public void createPdfcashpurchasereport(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.LEDGER;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("CASH PURHASE REPORT").add(new Tab());
        p.setFontSize(30);
        p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setBold();
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p3.setTextAlignment(TextAlignment.CENTER);
        document.add(p3);
         Paragraph p5 = new Paragraph();
        p5.add("PURCHASE TYPE               AMOUNT              DATED");
        p5.setTextAlignment(TextAlignment.CENTER);
        p5.setTextRenderingMode(5);
        p5.setFontSize(20);
        p5.setBold();
        document.add(p5);
         try
         {
           JTextField field1 = new JTextField();
          //JTextField field2 = new JTextField();
          Object[] fields={"ENTER DATE(YYYY-MM-DD)",field1};
          int x=JOptionPane.showConfirmDialog(null, fields,"YYYY-MM-DD",JOptionPane.OK_CANCEL_OPTION);
          if(x==0)
          {
              String date1=field1.getText();
              //String date2=field2.getText();
              String sql="select * from purchasetype where type_of_purchase='cash purchase' and dated = ?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_purchase");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
              
             JOptionPane.showMessageDialog(null, "Report Saved...");
            }
          
         }
         catch(Exception e)
         {
             
         }
              
              document.close();
    } 
     public void createPdfcreditpurchasereport(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.LEDGER;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("CREDIT PURCHASE REPORT").add(new Tab());
        p.setFontSize(30);
        p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setBold();
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p3.setTextAlignment(TextAlignment.CENTER);
        document.add(p3);
         Paragraph p5 = new Paragraph();
        p5.add("PURCHASE TYPE               AMOUNT              DATED");
        p5.setTextAlignment(TextAlignment.CENTER);
        p5.setTextRenderingMode(5);
        p5.setFontSize(20);
        p5.setBold();
        document.add(p5);
         try
         {
           JTextField field1 = new JTextField();
          //JTextField field2 = new JTextField();
          Object[] fields={"ENTER DATE(YYYY-MM-DD)",field1};
          int x=JOptionPane.showConfirmDialog(null, fields,"YYYY-MM-DD",JOptionPane.OK_CANCEL_OPTION);
          if(x==0)
          {
              String date1=field1.getText();
              //String date2=field2.getText();
              String sql="select * from purchasetype where type_of_purchase='credit purchase' and dated = ?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_purchase");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
              
             JOptionPane.showMessageDialog(null, "Report Saved...");
            }
          
         }
         catch(Exception e)
         {
             
         }
              
              document.close();
    } 
      public void createPdfoverallreviewreport(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.LEDGER;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("CREDIT SALE REPORT").add(new Tab());
        p.setFontSize(30);
        p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setBold();
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p3.setTextAlignment(TextAlignment.CENTER);
        document.add(p3);
         Paragraph p5 = new Paragraph();
        p5.add("PURCHASE TYPE               AMOUNT              DATED");
        p5.setTextAlignment(TextAlignment.CENTER);
        p5.setTextRenderingMode(5);
        p5.setFontSize(20);
        p5.setBold();
        document.add(p5);
         try
         {
           JTextField field1 = new JTextField();
          //JTextField field2 = new JTextField();
          Object[] fields={"ENTER DATE(YYYY-MM-DD)",field1};
          int x=JOptionPane.showConfirmDialog(null, fields,"YYYY-MM-DD",JOptionPane.OK_CANCEL_OPTION);
          if(x==0)
          {
              String date1=field1.getText();
              //String date2=field2.getText();
              String sql="select * from saletype where type_of_sale='creditsale' and dated = ?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_sale");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);
                    
                    
                    

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
            Paragraph p21 = new Paragraph();
                    p21.add("*--------------------------------------------------*");
                    p21.setTextAlignment(TextAlignment.CENTER);
                    document.add(p21);
            Paragraph p6 = new Paragraph();
        p6.add(new Tab()).add("PAK MOTORS");
        p6.setFontSize(30);
        p6.setTextAlignment(TextAlignment.CENTER);
        p6.setBold();
        document.add(p6);
        Paragraph p7 = new Paragraph();
        p7.addTabStops(tabstops);
        p7.add(new Tab()).add("CASH SALE REPORT").add(new Tab());
        p7.setFontSize(30);
        p7.setFontColor(Color.BLUE);
         p7.setTextAlignment(TextAlignment.CENTER);
        document.add(p7);
        Paragraph p8 = new Paragraph();
        p8.add(new Date().toString());
        p8.setBold();
        p8.setFontSize(18);
        document.add(p8);
        Paragraph p9 = new Paragraph();
        p9.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p9.setTextAlignment(TextAlignment.CENTER);
        document.add(p9);
         Paragraph p10 = new Paragraph();
        p10.add("PURCHASE TYPE               AMOUNT              DATED");
        p10.setTextAlignment(TextAlignment.CENTER);
        p10.setTextRenderingMode(5);
        p10.setFontSize(20);
        p10.setBold();
        document.add(p10);
             String sql1="select * from saletype where type_of_sale='cashsale' and dated = ?";
              pst=con.createConnection().prepareStatement(sql1);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_sale");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);
                   

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
            Paragraph p22 = new Paragraph();
                    p22.add("*--------------------------------------------------*");
                    p22.setTextAlignment(TextAlignment.CENTER);
                    document.add(p22);
            Paragraph p11 = new Paragraph();
        p11.add(new Tab()).add("PAK MOTORS");
        p11.setFontSize(30);
        p11.setTextAlignment(TextAlignment.CENTER);
        p11.setBold();
        document.add(p11);
        Paragraph p12 = new Paragraph();
        p2.addTabStops(tabstops);
        p12.add(new Tab()).add("CREDIT PURCHASE REPORT").add(new Tab());
        p12.setFontSize(30);
        p12.setFontColor(Color.BLUE);
         p12.setTextAlignment(TextAlignment.CENTER);
        document.add(p12);
        Paragraph p13 = new Paragraph();
        p13.add(new Date().toString());
        p13.setBold();
        p13.setFontSize(18);
        document.add(p13);
        Paragraph p14 = new Paragraph();
        p14.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p14.setTextAlignment(TextAlignment.CENTER);
        document.add(p14);
         Paragraph p15 = new Paragraph();
        p15.add("PURCHASE TYPE               AMOUNT              DATED");
        p15.setTextAlignment(TextAlignment.CENTER);
        p15.setTextRenderingMode(5);
        p15.setFontSize(20);
        p15.setBold();
        document.add(p15);
             String sql2="select * from purchasetype where type_of_purchase='credit purchase' and dated = ?";
              pst=con.createConnection().prepareStatement(sql2);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_purchase");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);
                    

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
                    Paragraph p23 = new Paragraph();
                    p23.add("*--------------------------------------------------*");
                    p23.setTextAlignment(TextAlignment.CENTER);
                    document.add(p23);
            Paragraph p16 = new Paragraph();
        p16.add(new Tab()).add("PAK MOTORS");
        p16.setFontSize(30);
        p16.setTextAlignment(TextAlignment.CENTER);
        p16.setBold();
        document.add(p16);
        Paragraph p17 = new Paragraph();
        p17.addTabStops(tabstops);
        p17.add(new Tab()).add("CASH PURCHASE REPORT").add(new Tab());
        p17.setFontSize(30);
        p17.setFontColor(Color.BLUE);
         p17.setTextAlignment(TextAlignment.CENTER);
        document.add(p17);
        Paragraph p18 = new Paragraph();
        p18.add(new Date().toString());
        p18.setBold();
        p18.setFontSize(18);
        document.add(p18);
        Paragraph p19 = new Paragraph();
        p19.add(new Tab()).add("******************************************************************************************************************************************************************************************************************************************************").add(new Tab());             
        p19.setTextAlignment(TextAlignment.CENTER);
        document.add(p19);
         Paragraph p20 = new Paragraph();
        p20.add("PURCHASE TYPE               AMOUNT              DATED");
        p20.setTextAlignment(TextAlignment.CENTER);
        p20.setTextRenderingMode(5);
        p20.setFontSize(20);
        p20.setBold();
        document.add(p20);
             String sql3="select * from purchasetype where type_of_purchase='cash purchase' and dated = ?";
              pst=con.createConnection().prepareStatement(sql3);
              pst.setString(1,date1);
              //pst.setString(2,date2);
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("type_of_purchase");
                String v2 = rs.getString("amount");
                String v3 = rs.getString("dated");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                    p1.setTextAlignment(TextAlignment.CENTER);                    
                    p1.add(new Tab()).add(new Tab()).add(v1).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v2).add(new Tab()).add(new Tab());
                    p1.add(new Tab()).add(new Tab()).add(v3).add(new Tab()).add(new Tab());
                    p1.setFontColor(Color.BLACK);                    
                    document.add(p1);
                   

                  
               }
                 
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
            }
             Paragraph p24 = new Paragraph();
                    p24.add("*--------------------------------------------------*");
                    p24.setTextAlignment(TextAlignment.CENTER);
                    document.add(p24);
              
             JOptionPane.showMessageDialog(null, "Report Saved...");
            }
          
         }
         catch(Exception e)
         {
             
         }
              
              document.close();
    } 
      
       public Cell createCell(String content, float borderWidth, int colspan, TextAlignment alignment) {
        Cell cell = new Cell(1, colspan).add(new Paragraph(content));
        cell.setTextAlignment(alignment);
        cell.setBorder(new SolidBorder(borderWidth));
        return cell;
    }
       
       public void createPdfreceipt(String dest) throws IOException
    {
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        PageSize pagesize = PageSize.A5;
        Document document = new Document(pdf, pagesize);
        float w = pagesize.getWidth() - document.getLeftMargin() - document.getRightMargin();
        MyLine line = new MyLine();
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(w / 2, TabAlignment.CENTER, line));
        tabstops.add(new TabStop(w, TabAlignment.LEFT, line));
        Paragraph p2 = new Paragraph();
        p2.add(new Tab()).add("PAK MOTORS");
        p2.setFontSize(30);
        p2.setTextAlignment(TextAlignment.CENTER);
        p2.setBold();
        document.add(p2);
        Paragraph p = new Paragraph();
        p.addTabStops(tabstops);
        p.add(new Tab()).add("RECEIPT").add(new Tab());
        p.setFontSize(30);
        p.setFontColor(Color.BLUE);
         p.setTextAlignment(TextAlignment.CENTER);
        document.add(p);
        Paragraph p4 = new Paragraph();
        p4.add(new Date().toString());
        p4.setBold();
        p4.setFontSize(18);
        document.add(p4);
        Paragraph p3 = new Paragraph();
        p3.add(new Tab()).add("***************************************************************").add(new Tab());             
        p3.setTextAlignment(TextAlignment.LEFT);
        
        document.add(p3);
         /*Paragraph p5 = new Paragraph();
        p5.add("ITEM DESCRIPTION               QUANTITY              PRICE              AMOUNT");
        //p5.setTextAlignment(TextAlignment.CENTER);
        //p5.setTextRenderingMode(5);
        p5.setMarginLeft(450);
        p5.setFontSize(10);
        p5.setBold();
        document.add(p5);
         try
         {
          
                secondwindow sc = new secondwindow();
                int a=Integer.parseInt(sc.getorderid());
                int b=a-1;
                System.out.printf("the value of a is%d\n",a);
         
              
              String sql="	select order_line.product_id,product_name,price,quantity,amount from order_line\n" +
"                     inner join products\n" +
"                     on order_line.product_id = products.product_id\n" +
"                      where order_id=?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setInt(1,b);
             
              rs=pst.executeQuery();

            while(rs.next())
            {
               
                String v1 = rs.getString("product_name");
                String v2 = rs.getString("price");
                String v3 = rs.getString("quantity");
                String v4 = rs.getString("amount");
                 try
               {
                    Paragraph p1 = new Paragraph();
                    //p1.addTabStops(tabstops);
                   
                    p1.add(v1).add(new Tab()).add(new Tab()).add(new Tab());
                    p1.add(v2).add(new Tab()).add(new Tab());
                    p1.add(v3).add(new Tab());
                    p1.add(v4).add(new Tab());
                    p1.setFontColor(Color.BLACK);      
                    //p1.setTextAlignment(TextAlignment.CENTER);
                    p1.setMarginLeft(450);
                    document.add(p1);

                  
               }
              
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
                 
           
              
            
            }
           JOptionPane.showMessageDialog(null, "Report Saved...");
         }
         catch(Exception e)
         {
             
         }*/
         
         
         
         
         
         //this is table code
         
        Table table ;
        table =new Table(5);
        Cell cell;
        /*
        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
        table = new Table(4);
        String a;
        for (int aw = 0; aw < 4; aw++) 
        {
             if(aw==0)
           {
            a="Item Description";
            cell = new Cell().add(new Paragraph(a).setFont(font).setFontColor(Color.BLACK));
            cell.setBackgroundColor(Color.WHITE);
            cell.setBorder(Border.NO_BORDER);
            cell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(cell);
            
            
            }
            
            else if(aw==1)
           {
               a="Quantity";
            cell = new Cell().add(new Paragraph(a).setFont(font).setFontColor(Color.BLACK));
             cell.setBackgroundColor(Color.WHITE);
            cell.setBorder(Border.NO_BORDER);
            cell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(cell);
            
            
            }
           else if(aw==2)
           {
               a="Price";
             cell = new Cell().add(new Paragraph(a).setFont(font).setFontColor(Color.BLACK));
             cell.setBackgroundColor(Color.WHITE);
            cell.setBorder(Border.NO_BORDER);
            cell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(cell);
              
           }
           else 
           {
               a="Amount";
              cell = new Cell().add(new Paragraph(a).setFont(font).setFontColor(Color.BLACK));
           cell.setBackgroundColor(Color.WHITE);
            cell.setBorder(Border.NO_BORDER);
            cell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(cell);
             
           }
        }
            document.add(table);*/
       
       
      
        try
        {
           
                secondwindow sc = new secondwindow();
                int a=Integer.parseInt(sc.getorderid());
                int b=a-1;
                System.out.printf("the value of a is%d\n",a);
         
              
              String sql="	select order_line.product_id,product_name,price,quantity,amount from order_line\n" +
"                     inner join products\n" +
"                     on order_line.product_id = products.product_id\n" +
"                      where order_id=?";
              pst=con.createConnection().prepareStatement(sql);
              pst.setInt(1,b);
             
              rs=pst.executeQuery();
               



table.useAllAvailableWidth();

table.addHeaderCell(new Cell().add("PRODUCT_ID").setFontColor(Color.ORANGE));
table.addHeaderCell(new Cell().add("PRODUCT_NAME").setFontColor(Color.ORANGE));
table.addHeaderCell(new Cell().add("PRICE").setFontColor(Color.ORANGE));
table.addHeaderCell(new Cell().add("QUANTITY").setFontColor(Color.ORANGE));
table.addHeaderCell(new Cell().add("AMOUNT").setFontColor(Color.ORANGE));


while (rs.next()) 
{
    //table.addCell(rs.getString("order_id"));
    table.addCell(rs.getString("product_id"));
    table.addCell(rs.getString("product_name"));
    table.addCell(rs.getString("price"));
    table.addCell(rs.getString("quantity"));
    table.addCell(rs.getString("amount"));
    
    
}

table.setTextAlignment(TextAlignment.CENTER);

document.add(table); 
   JOptionPane.showMessageDialog(null, "report saved");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
                
              document.close();
    } 
         
      
       
       
             
        
    
}


