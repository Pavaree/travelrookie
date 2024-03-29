/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Final;

import com.sun.java.accessibility.util.SwingEventMonitor;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.json.JSONObject;

/**
 *
 * @author Pavaree
 */
public class Money extends javax.swing.JInternalFrame {

    public DocumentListener check1, check2;

    /**
     * Creates new form money
     */
    public Money() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page_money = new javax.swing.JPanel();
        Exchang_txt = new javax.swing.JLabel();
        money_got = new javax.swing.JTextField();
        contry_need = new javax.swing.JComboBox<>();
        money_us = new javax.swing.JTextField();
        contry_us = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 119, 119));

        page_money.setBackground(new java.awt.Color(221, 119, 119));
        page_money.setPreferredSize(new java.awt.Dimension(930, 630));

        Exchang_txt.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        Exchang_txt.setForeground(new java.awt.Color(255, 255, 255));
        Exchang_txt.setText(" Exchange money");

        money_got.setText("Money");
        money_got.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                money_gotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                money_gotFocusLost(evt);
            }
        });

        contry_need.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Australia (AUD)", "Canada (CAD)", "China (CNY)", "Croatia (HRK)", "Denmark (DKK)", "Hungary (HUF)", "Iceland (ISK)", "Indonesia (IDR)", "Japan (JPY)", "Korea (KRW)", "Mexico (MXN)", "Norway (NOK)", "Singapore (SGD)", "South Africa (ZAR)", "Sweden (SEK)", "Switzerland (CHF)", "Thailand (THB)", "Turkey (TRY)", "United Kingdom (GBP)", "United States (USD)" }));
        contry_need.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contry_needActionPerformed(evt);
            }
        });

        money_us.setText("field your money");
        money_us.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                money_usFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                money_usFocusLost(evt);
            }
        });
        money_us.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                money_usInputMethodTextChanged(evt);
            }
        });
        money_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                money_usActionPerformed(evt);
            }
        });

        contry_us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Australia (AUD)", "Canada (CAD)", "China (CNY)", "Croatia (HRK)", "Denmark (DKK)", "Hungary (HUF)", "Iceland (ISK)", "Indonesia (IDR)", "Japan (JPY)", "Korea (KRW)", "Mexico (MXN)", "Norway (NOK)", "Singapore (SGD)", "South Africa (ZAR)", "Sweden (SEK)", "Switzerland (CHF)", "Thailand (THB)", "Turkey (TRY)", "United Kingdom (GBP)", "United States (USD)" }));
        contry_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contry_usActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("เงินของคุณที่จะเปลี่ยน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ค่าสกุลเงินที่เปลี่ยนแล้ว");

        javax.swing.GroupLayout page_moneyLayout = new javax.swing.GroupLayout(page_money);
        page_money.setLayout(page_moneyLayout);
        page_moneyLayout.setHorizontalGroup(
            page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page_moneyLayout.createSequentialGroup()
                .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page_moneyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(page_moneyLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contry_need, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(page_moneyLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(contry_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(money_us, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(money_got)))
                    .addGroup(page_moneyLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(Exchang_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        page_moneyLayout.setVerticalGroup(
            page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page_moneyLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Exchang_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page_moneyLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contry_us, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page_moneyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(money_us, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(page_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(money_got, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contry_need, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page_money, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page_money, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exchange() {
        money_us.getDocument().addDocumentListener(check1 = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                money_got.getDocument().removeDocumentListener(check2);
                changeRealTime();

            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                money_got.getDocument().removeDocumentListener(check2);
                changeRealTime();

            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                money_got.getDocument().removeDocumentListener(check2);
                changeRealTime();

            }

        });

    }

    public void exchangeBack() {
        money_got.getDocument().addDocumentListener(check2 = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                money_us.getDocument().removeDocumentListener(check1);
                changeRealTimeBack();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                money_us.getDocument().removeDocumentListener(check1);
                changeRealTimeBack();

            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                money_us.getDocument().removeDocumentListener(check1);
                changeRealTimeBack();

            }

        });

    }
    private void contry_needActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contry_needActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contry_needActionPerformed

    private void money_usFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_money_usFocusGained
        // TODO add your handling code here:
        if (money_us.getText().trim().equals("field your money")) {
            money_us.setText("");
            money_us.setForeground(Color.BLACK);
        }
        money_us.setText("");
        exchange();

    }//GEN-LAST:event_money_usFocusGained

    private void money_usFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_money_usFocusLost
        // TODO add your handling code here:
        if (money_us.getText().trim().equals("")) {
            money_us.setText("field your money");
            money_us.setForeground(new Color(51, 51, 51));
        }

    }//GEN-LAST:event_money_usFocusLost

    private void money_gotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_money_gotFocusGained
        // TODO add your handling code here:
        if (money_got.getText().trim().equals("Money")) {
            money_got.setText("");
            money_got.setForeground(Color.BLACK);
        }
        money_got.setText("");
        exchangeBack();
    }//GEN-LAST:event_money_gotFocusGained

    private void money_gotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_money_gotFocusLost
        // TODO add your handling code here:
        if (money_got.getText().trim().equals("")) {
            money_got.setText("Money");
            money_got.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_money_gotFocusLost

    private void contry_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contry_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contry_usActionPerformed

    private void money_usInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_money_usInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_money_usInputMethodTextChanged

    private void money_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_money_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_money_usActionPerformed

    public Money(JLabel Exchang_txt, JButton btn_exc, JComboBox<String> contry_need, JComboBox<String> contry_us, JTextField money_got, JTextField money_us, JPanel page_money) {
        this.Exchang_txt = Exchang_txt;
        this.contry_need = contry_need;
        this.contry_us = contry_us;
        this.money_got = money_got;
        this.money_us = money_us;
        this.page_money = page_money;
    }

    public void changeRealTime() {
        try {
            String first = contry_us.getSelectedItem().toString();
            String second = contry_need.getSelectedItem().toString();
            String url = "";
            if (first.equals("Australia (AUD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=AUD";
            } else if (first.equals("Canada (CAD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CAD";
            } else if (first.equals("China (CNY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CNY";
            } else if (first.equals("Croatia (HRK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=HRK";
            } else if (first.equals("Denmark (DKK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=DKK";
            } else if (first.equals("Thailand (THB)")) {
                url = "https://api.exchangeratesapi.io/latest?base=THB";
            } else if (first.equals("Hungary (HUF)")) {
                url = "https://api.exchangeratesapi.io/latest?base=HUF";
            } else if (first.equals("Iceland (ISK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=ISK";
            } else if (first.equals("Indonesia (IDR)")) {
                url = "https://api.exchangeratesapi.io/latest?base=IDR";
            } else if (first.equals("Japan (JPY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=JPY";
            } else if (first.equals("Korea (Won)")) {
                url = "https://api.exchangeratesapi.io/latest?base=KRW";
            } else if (first.equals("Mexico (MXN)")) {
                url = "https://api.exchangeratesapi.io/latest?base=MXN";
            } else if (first.equals("Norway (NOK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=NOK";
            } else if (first.equals("Singapore (SGD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=SGD";
            } else if (first.equals("South Africa (ZAR)")) {
                url = "https://api.exchangeratesapi.io/latest?base=ZAR";
            } else if (first.equals("Sweden (SEK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=SEK";
            } else if (first.equals("Switzerland (CHF)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CHF";
            } else if (first.equals("Turkey (TRY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=TRY";
            } else if (first.equals("United Kingdom (GBP)")) {
                url = "https://api.exchangeratesapi.io/latest?base=GBP";
            } else if (first.equals("United States (USD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=USD";
            }
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = con.getResponseCode();
            //System.out.println("\nSending 'GET' request to URL : " + url);
            //System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //print in String
            //System.out.println(response);
            //Read JSON response and print
            JSONObject myResponse = new JSONObject(response.toString());
            //System.out.println("result after Reading JSON Response");
            System.out.println(myResponse);
            JSONObject rates = new JSONObject(myResponse.getJSONObject("rates").toString());
            System.out.println(rates);

            if (second.equals("Australia (AUD)")) {
                int aud = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("AUD"));
                money_got.setText(aud + "");
            } else if (second.equals("Canada (CAD)")) {
                int cad = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("CAD"));
                money_got.setText(cad + "");
            } else if (second.equals("China (CNY)")) {
                int cny = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("CNY"));
                money_got.setText(cny + "");
            } else if (second.equals("Croatia (HRK)")) {
                int hrk = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("HRK"));
                money_got.setText(hrk + "");
            } else if (second.equals("Denmark (DKK)")) {
                int dkk = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("DKK"));
                money_got.setText(dkk + "");
            } else if (second.equals("Thailand (THB)")) {
                int thb = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("THB"));
                money_got.setText(thb + "");
            } else if (second.equals("Hungary (HUF)")) {
                int huf = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("HUF"));
                money_got.setText(huf + "");
            } else if (second.equals("Iceland (ISK)")) {
                int isk = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("ISK"));
                money_got.setText(isk + "");
            } else if (second.equals("Indonesia (IDR)")) {
                int idr = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("IDR"));
                money_got.setText(idr + "");
            } else if (second.equals("Japan (JPY)")) {
                int jpy = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("JPY"));
                money_got.setText(jpy + "");
            } else if (second.equals("Korea (Won)")) {
                int krw = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("KRW"));
                money_got.setText(krw + "");
            } else if (second.equals("Mexico (MXN)")) {
                int mxn = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("MXN"));
                money_got.setText(mxn + "");
            }else if (second.equals("Norway (NOK)")) {
                int nok = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("NOK"));
                money_got.setText(nok + "");
            } else if (second.equals("Singapore (SGD)")) {
                int sgd = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("SGD"));
                money_got.setText(sgd + "");
            } else if (second.equals("South Africa (ZAR)")) {
                int zar = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("ZAR"));
                money_got.setText(zar + "");
            } else if (second.equals("Sweden (SEK)")) {
                int sek = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("SEK"));
                money_got.setText(sek + "");
            } else if (second.equals("Switzerland (CHF)")) {
                int chf = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("CHF"));
                money_got.setText(chf + "");
            } else if (second.equals("Turkey (TRY)")) {
                int t_ry = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("TRY"));
                money_got.setText(t_ry + "");
            }else if (second.equals("United Kingdom (GBP)")) {
                int gbp = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("GBP"));
                money_got.setText(gbp + "");
            } else if (second.equals("United States (USD)")) {
                int usd = (int) (Double.parseDouble(money_us.getText()) * rates.getDouble("USD"));
                money_got.setText(usd + "");
            }

        } catch (IOException ex) {
            Logger.getLogger(Money.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void changeRealTimeBack() {
        try {
            String first = contry_us.getSelectedItem().toString();
            String second = contry_need.getSelectedItem().toString();
            String url = "";
           if (second.equals("Australia (AUD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=AUD";
            } else if (second.equals("Canada (CAD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CAD";
            } else if (second.equals("China (CNY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CNY";
            } else if (second.equals("Croatia (HRK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=HRK";
            } else if (second.equals("Denmark (DKK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=DKK";
            } else if (second.equals("Thailand (THB)")) {
                url = "https://api.exchangeratesapi.io/latest?base=THB";
            } else if (second.equals("Hungary (HUF)")) {
                url = "https://api.exchangeratesapi.io/latest?base=HUF";
            } else if (second.equals("Iceland (ISK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=ISK";
            } else if (second.equals("Indonesia (IDR)")) {
                url = "https://api.exchangeratesapi.io/latest?base=IDR";
            } else if (second.equals("Japan (JPY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=JPY";
            } else if (second.equals("Korea (Won)")) {
                url = "https://api.exchangeratesapi.io/latest?base=KRW";
            } else if (second.equals("Mexico (MXN)")) {
                url = "https://api.exchangeratesapi.io/latest?base=MXN";
            } else if (second.equals("Norway (NOK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=NOK";
            } else if (second.equals("Singapore (SGD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=SGD";
            } else if (second.equals("South Africa (ZAR)")) {
                url = "https://api.exchangeratesapi.io/latest?base=ZAR";
            } else if (second.equals("Sweden (SEK)")) {
                url = "https://api.exchangeratesapi.io/latest?base=SEK";
            } else if (second.equals("Switzerland (CHF)")) {
                url = "https://api.exchangeratesapi.io/latest?base=CHF";
            } else if (second.equals("Turkey (TRY)")) {
                url = "https://api.exchangeratesapi.io/latest?base=TRY";
            } else if (second.equals("United Kingdom (GBP)")) {
                url = "https://api.exchangeratesapi.io/latest?base=GBP";
            } else if (second.equals("United States (USD)")) {
                url = "https://api.exchangeratesapi.io/latest?base=USD";
            }
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            //System.out.println("\nSending 'GET' request to URL : " + url);
            //System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //print in String
            //System.out.println(response);
            //Read JSON response and print
            JSONObject myResponse = new JSONObject(response.toString());
            //System.out.println("result after Reading JSON Response");
            System.out.println(myResponse);
            JSONObject rates = new JSONObject(myResponse.getJSONObject("rates").toString());
            System.out.println(rates);

            if (first.equals("Australia (AUD)")) {
                int aud = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("AUD"));
                money_us.setText(aud + "");
            } else if (first.equals("Canada (CAD)")) {
                int cad = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("CAD"));
                money_us.setText(cad + "");
            } else if (first.equals("China (CNY)")) {
                int cny = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("CNY"));
                money_us.setText(cny + "");
            } else if (first.equals("Croatia (HRK)")) {
                int hrk = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("HRK"));
                money_us.setText(hrk + "");
            } else if (first.equals("Denmark (DKK)")) {
                int dkk = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("DKK"));
                money_us.setText(dkk + "");
            } else if (first.equals("Thailand (THB)")) {
                int thb = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("THB"));
                money_us.setText(thb + "");
            } else if (first.equals("Hungary (HUF)")) {
                int huf = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("HUF"));
                money_us.setText(huf + "");
            } else if (first.equals("Iceland (ISK)")) {
                int isk = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("ISK"));
                money_us.setText(isk + "");
            } else if (first.equals("Indonesia (IDR)")) {
                int idr = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("IDR"));
                money_us.setText(idr + "");
            } else if (first.equals("Japan (JPY)")) {
                int jpy = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("JPY"));
                money_us.setText(jpy + "");
            } else if (first.equals("Korea (Won)")) {
                int krw = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("KRW"));
                money_us.setText(krw + "");
            } else if (first.equals("Mexico (MXN)")) {
                int mxn = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("MXN"));
                money_us.setText(mxn + "");
            }else if (first.equals("Norway (NOK)")) {
                int nok = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("NOK"));
                money_us.setText(nok + "");
            } else if (first.equals("Singapore (SGD)")) {
                int sgd = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("SGD"));
                money_us.setText(sgd + "");
            } else if (first.equals("South Africa (ZAR)")) {
                int zar = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("ZAR"));
                money_us.setText(zar + "");
            } else if (first.equals("Sweden (SEK)")) {
                int sek = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("SEK"));
                money_us.setText(sek + "");
            } else if (first.equals("Switzerland (CHF)")) {
                int chf = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("CHF"));
                money_us.setText(chf + "");
            } else if (first.equals("Turkey (TRY)")) {
                int t_ry = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("TRY"));
                money_us.setText(t_ry + "");
            }else if (first.equals("United Kingdom (GBP)")) {
                int gbp = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("GBP"));
                money_us.setText(gbp + "");
            } else if (first.equals("United States (USD)")) {
                int usd = (int) (Double.parseDouble(money_got.getText()) * rates.getDouble("USD"));
                money_us.setText(usd + "");
            }
            

        } catch (IOException ex) {
            Logger.getLogger(Money.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exchang_txt;
    private javax.swing.JComboBox<String> contry_need;
    private javax.swing.JComboBox<String> contry_us;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField money_got;
    private javax.swing.JTextField money_us;
    private javax.swing.JPanel page_money;
    // End of variables declaration//GEN-END:variables
}
