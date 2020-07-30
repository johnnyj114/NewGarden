
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnnyjiang
 */
public class NewGarden extends javax.swing.JFrame {

    /**
     * Creates new form NewGarden
     */
    private static Timer time;
    private boolean irreg;          // Indicates if sizes should displayed irregularly
    private boolean pastLunch;      // Indicates if lunch time has passed
    private String backVar;         // Keeps track previous page
    private String backVar2;        // Keeps track previous previous page
    private String size;            // Keeps track the size of item ordered
    private double sizePrice;       // Keeps track of the price of the size
    private int orderNumber;        // Keeps track the order number for customers
    private int rowEdit = 0;        // Keeps track which set of rows to edit
    private final double taxes = 1.06;
    private final double lunch_1 = 6.25;
    private final double lunch_2 = 6.50;
    private final double combo_1 = 8.30;
    private final double combo_2 = 8.50;
    private final double smfr_1 = 5.10;
    private final double smfr_2 = 5.50;
    private final double smfr_3 = 5.95;
    private final double lgfr_1 = 7.50;
    private final double lgfr_2 = 7.95;
    private final double lgfr_3 = 8.95;
    private final double eggfoo_1 = 8.50;
    private final double eggfoo_2 = 9.50;
    private final double smcp = 6.35;
    private final double lgcp = 9.25;
    private final double smbs = 6.99;
    private final double lgbs = 9.95;
    private final double vegs = 8.25;
    private final double sahc_1 = 10.35;
    private final double sahc_2 = 10.65;
    private final double sahc_3 = 10.99;
    private final double sahc_4 = 11.70;
    private final double sahc_5 = 12.99;

    private final double wonton = 4.50;
    private final double dumpling = 5.25;
    private final double scalnug = 3.99;
    private final double onionapple = 2.75;
    private final double teri_c = 4.69;
    private final double teri_b = 4.99;
    private final double smsoup = 2.50;
    private final double lgsoup = 3.50;
    private final double side_1 = 0.50;
    private final double side_2 = 1.00;

    private final double lgwr = 3.00;
    private final double smwr_spring = 2.50;
    private final double porkroll = 1.29;
    private final double shrimproll = 1.39;
    private final double housesoup = 4.95;
    private final double seafoodsoup = 5.95;
    private final double smsoup_ed = 1.99;
    private final double lgsoup_ed = 2.99;
    private final double smsoup_hs = 2.70;
    private final double lgsoup_hs = 3.99;
    private final double friedshrimp = 6.99;

    Color reddish = new Color(204, 0, 0);       // Saves a shade of red color
    Color whitish = new Color(204, 204, 204);   // Saves a shade of white color
    Color greyish = new Color(153, 153, 153);   // Saves a shade of grey color
    Calendar cal = Calendar.getInstance();      //Create a calendar object
    
    // Use the two labels to search item in database to retrieve more details
    
    public NewGarden() {
        initComponents();
        foods.setVisible(false);
        edits.setVisible(false);
        more.setVisible(false);
        number.setVisible(false);
        cancelp.setVisible(false);
        timer.setVisible(false);
        editsorder.setVisible(false);
        // Initialze all the panels to be hidden
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);
        items.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
        items.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
        // Sets the titles of each column to be invisible
        items.setFillsViewportHeight(true);
        items.setBackground(Color.WHITE);
        // Sets the background to be entirely white
        items.getColumnModel().getColumn(1).setPreferredWidth(200);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        items.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        // Adjusts the right column's to be right justified
        items.setEnabled(false);
        // Disables manual selection of items
        orderedit.getColumnModel().getColumn(0).setHeaderRenderer(headerRenderer);
        orderedit.getColumnModel().getColumn(1).setHeaderRenderer(headerRenderer);
        // Sets the titles of each column to be invisible
        orderedit.setFillsViewportHeight(true);
        orderedit.setBackground(Color.WHITE);
        // Sets the background to be entirely white
        orderedit.setEnabled(false);
        // Disables manual selection of items
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        banner = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        touch = new javax.swing.JLabel();
        order = new javax.swing.JPanel();
        click = new javax.swing.JPanel();
        categ = new javax.swing.JPanel();
        fr = new javax.swing.JPanel();
        friedrice = new javax.swing.JLabel();
        lo = new javax.swing.JPanel();
        lomein = new javax.swing.JLabel();
        mai = new javax.swing.JPanel();
        maifun = new javax.swing.JLabel();
        chow = new javax.swing.JPanel();
        chowmein = new javax.swing.JLabel();
        chowmein1 = new javax.swing.JLabel();
        poul = new javax.swing.JPanel();
        poultry = new javax.swing.JLabel();
        poultry1 = new javax.swing.JLabel();
        pork = new javax.swing.JPanel();
        porks = new javax.swing.JLabel();
        poultry2 = new javax.swing.JLabel();
        beef = new javax.swing.JPanel();
        beefs = new javax.swing.JLabel();
        poultry3 = new javax.swing.JLabel();
        sea = new javax.swing.JPanel();
        shrimp = new javax.swing.JLabel();
        poultry4 = new javax.swing.JLabel();
        veg = new javax.swing.JPanel();
        vege = new javax.swing.JLabel();
        poultry5 = new javax.swing.JLabel();
        soup = new javax.swing.JPanel();
        soups = new javax.swing.JLabel();
        poultry6 = new javax.swing.JLabel();
        apps = new javax.swing.JPanel();
        app = new javax.swing.JLabel();
        side = new javax.swing.JPanel();
        sides = new javax.swing.JLabel();
        egg = new javax.swing.JPanel();
        foo = new javax.swing.JLabel();
        poultry7 = new javax.swing.JLabel();
        szech = new javax.swing.JPanel();
        szechs = new javax.swing.JLabel();
        hun = new javax.swing.JLabel();
        poultry8 = new javax.swing.JLabel();
        foods = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        l31 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        l41 = new javax.swing.JLabel();
        l42 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        l51 = new javax.swing.JLabel();
        l52 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        l61 = new javax.swing.JLabel();
        l62 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        l71 = new javax.swing.JLabel();
        l72 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        l81 = new javax.swing.JLabel();
        l82 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        l91 = new javax.swing.JLabel();
        l92 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        l101 = new javax.swing.JLabel();
        l102 = new javax.swing.JLabel();
        p11 = new javax.swing.JPanel();
        l111 = new javax.swing.JLabel();
        l112 = new javax.swing.JLabel();
        p12 = new javax.swing.JPanel();
        l121 = new javax.swing.JLabel();
        l122 = new javax.swing.JLabel();
        p13 = new javax.swing.JPanel();
        l131 = new javax.swing.JLabel();
        l132 = new javax.swing.JLabel();
        p14 = new javax.swing.JPanel();
        l141 = new javax.swing.JLabel();
        l142 = new javax.swing.JLabel();
        p15 = new javax.swing.JPanel();
        l151 = new javax.swing.JLabel();
        l152 = new javax.swing.JLabel();
        p16 = new javax.swing.JPanel();
        l161 = new javax.swing.JLabel();
        l162 = new javax.swing.JLabel();
        edits = new javax.swing.JPanel();
        sizes = new javax.swing.JPanel();
        even = new javax.swing.JPanel();
        even1 = new javax.swing.JPanel();
        evens1 = new javax.swing.JLabel();
        evenp1 = new javax.swing.JLabel();
        even2 = new javax.swing.JPanel();
        evens2 = new javax.swing.JLabel();
        evenp2 = new javax.swing.JLabel();
        even3 = new javax.swing.JPanel();
        evens3 = new javax.swing.JLabel();
        evenp3 = new javax.swing.JLabel();
        even4 = new javax.swing.JPanel();
        evens4 = new javax.swing.JLabel();
        evenp4 = new javax.swing.JLabel();
        odd = new javax.swing.JPanel();
        odd1 = new javax.swing.JPanel();
        odds1 = new javax.swing.JLabel();
        oddp1 = new javax.swing.JLabel();
        odd2 = new javax.swing.JPanel();
        odds2 = new javax.swing.JLabel();
        oddp2 = new javax.swing.JLabel();
        odd3 = new javax.swing.JPanel();
        odds3 = new javax.swing.JLabel();
        oddp3 = new javax.swing.JLabel();
        amount = new javax.swing.JPanel();
        add = new javax.swing.JPanel();
        l83 = new javax.swing.JLabel();
        value = new javax.swing.JPanel();
        val = new javax.swing.JLabel();
        minus = new javax.swing.JPanel();
        l73 = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        itemtotal = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        more = new javax.swing.JPanel();
        complete = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addmore = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        editorder = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        number = new javax.swing.JPanel();
        ordercard = new javax.swing.JPanel();
        ordernum = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        finaltotal = new javax.swing.JLabel();
        editsorder = new javax.swing.JPanel();
        ordersave = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        orderdown = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        orderup = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        orderminus = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        orderadd = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        orderdelete = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        price2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderedit = new javax.swing.JTable();
        total2 = new javax.swing.JPanel();
        ftotal_val2 = new javax.swing.JLabel();
        tax2 = new javax.swing.JLabel();
        subtotal2 = new javax.swing.JLabel();
        ftotal2 = new javax.swing.JLabel();
        tax_val2 = new javax.swing.JLabel();
        subtotal_val2 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        banner2 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        price = new javax.swing.JPanel();
        total = new javax.swing.JPanel();
        ftotal_val = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        ftotal = new javax.swing.JLabel();
        tax_val = new javax.swing.JLabel();
        subtotal_val = new javax.swing.JLabel();
        itemscroll = new javax.swing.JScrollPane();
        items = new javax.swing.JTable();
        back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        banner3 = new javax.swing.JPanel();
        titles = new javax.swing.JLabel();
        cancelp = new javax.swing.JPanel();
        complete2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addmore2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        defcancel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        editorder2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        banner5 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        timer = new javax.swing.JPanel();
        banner1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        here = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        countdown = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new javax.swing.OverlayLayout(main));

        home.setBackground(new java.awt.Color(0, 0, 0));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });

        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food.jpg"))); // NOI18N

        banner.setBackground(new java.awt.Color(204, 0, 51));

        title.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("NEW GARDEN");

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        bar.setBackground(new java.awt.Color(204, 0, 51));

        touch.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        touch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        touch.setText("TOUCH TO BEGIN");

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(touch, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(touch, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 391, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(home);

        click.setBackground(new java.awt.Color(204, 0, 0));
        click.setLayout(new javax.swing.OverlayLayout(click));

        categ.setBackground(new java.awt.Color(204, 204, 204));

        fr.setBackground(new java.awt.Color(204, 0, 0));
        fr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frMousePressed(evt);
            }
        });

        friedrice.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        friedrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friedrice.setText("Fried Rice");
        friedrice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout frLayout = new javax.swing.GroupLayout(fr);
        fr.setLayout(frLayout);
        frLayout.setHorizontalGroup(
            frLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friedrice, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        frLayout.setVerticalGroup(
            frLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friedrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lo.setBackground(new java.awt.Color(204, 0, 0));
        lo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loMousePressed(evt);
            }
        });

        lomein.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lomein.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lomein.setText("Lo Mein");
        lomein.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout loLayout = new javax.swing.GroupLayout(lo);
        lo.setLayout(loLayout);
        loLayout.setHorizontalGroup(
            loLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lomein, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        loLayout.setVerticalGroup(
            loLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lomein, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mai.setBackground(new java.awt.Color(204, 0, 0));
        mai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maiMousePressed(evt);
            }
        });

        maifun.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        maifun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maifun.setText("Mai Fun");
        maifun.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout maiLayout = new javax.swing.GroupLayout(mai);
        mai.setLayout(maiLayout);
        maiLayout.setHorizontalGroup(
            maiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maifun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        maiLayout.setVerticalGroup(
            maiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maifun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chow.setBackground(new java.awt.Color(204, 0, 0));
        chow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chowMousePressed(evt);
            }
        });

        chowmein.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        chowmein.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chowmein.setText("Chow Mein");
        chowmein.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        chowmein1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        chowmein1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chowmein1.setText("w/ Fried Noodles");
        chowmein1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout chowLayout = new javax.swing.GroupLayout(chow);
        chow.setLayout(chowLayout);
        chowLayout.setHorizontalGroup(
            chowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chowmein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chowmein1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        chowLayout.setVerticalGroup(
            chowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chowmein, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chowmein1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        poul.setBackground(new java.awt.Color(204, 0, 0));
        poul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                poulMousePressed(evt);
            }
        });

        poultry.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        poultry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry.setText("Poultry");
        poultry.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry1.setText("w/ White Rice");
        poultry1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout poulLayout = new javax.swing.GroupLayout(poul);
        poul.setLayout(poulLayout);
        poulLayout.setHorizontalGroup(
            poulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poultry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        poulLayout.setVerticalGroup(
            poulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poultry, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pork.setBackground(new java.awt.Color(204, 0, 0));
        pork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                porkMousePressed(evt);
            }
        });

        porks.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        porks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        porks.setText("Pork");
        porks.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry2.setText("w/ White Rice");
        poultry2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout porkLayout = new javax.swing.GroupLayout(pork);
        pork.setLayout(porkLayout);
        porkLayout.setHorizontalGroup(
            porkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(porkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        porkLayout.setVerticalGroup(
            porkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(porks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        beef.setBackground(new java.awt.Color(204, 0, 0));
        beef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                beefMousePressed(evt);
            }
        });

        beefs.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        beefs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beefs.setText("Beef");
        beefs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry3.setText("w/ White Rice");
        poultry3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout beefLayout = new javax.swing.GroupLayout(beef);
        beef.setLayout(beefLayout);
        beefLayout.setHorizontalGroup(
            beefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beefLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beefs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(poultry3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        beefLayout.setVerticalGroup(
            beefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beefLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beefs, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sea.setBackground(new java.awt.Color(204, 0, 0));
        sea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seaMousePressed(evt);
            }
        });

        shrimp.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        shrimp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shrimp.setText("Seafood");
        shrimp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry4.setText("w/ White Rice");
        poultry4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout seaLayout = new javax.swing.GroupLayout(sea);
        sea.setLayout(seaLayout);
        seaLayout.setHorizontalGroup(
            seaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poultry4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shrimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        seaLayout.setVerticalGroup(
            seaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shrimp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        veg.setBackground(new java.awt.Color(204, 0, 0));
        veg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vegMousePressed(evt);
            }
        });

        vege.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        vege.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vege.setText("Vegetable");
        vege.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry5.setText("w/ White Rice");
        poultry5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout vegLayout = new javax.swing.GroupLayout(veg);
        veg.setLayout(vegLayout);
        vegLayout.setHorizontalGroup(
            vegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        vegLayout.setVerticalGroup(
            vegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vege, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        soup.setBackground(new java.awt.Color(204, 0, 0));
        soup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soupMousePressed(evt);
            }
        });

        soups.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        soups.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soups.setText("Soup");
        soups.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry6.setText("w/ Fried Noodles");
        poultry6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout soupLayout = new javax.swing.GroupLayout(soup);
        soup.setLayout(soupLayout);
        soupLayout.setHorizontalGroup(
            soupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(soupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soups, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        soupLayout.setVerticalGroup(
            soupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soups, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        apps.setBackground(new java.awt.Color(204, 0, 0));
        apps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appsMousePressed(evt);
            }
        });

        app.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        app.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app.setText("Appetizers");
        app.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout appsLayout = new javax.swing.GroupLayout(apps);
        apps.setLayout(appsLayout);
        appsLayout.setHorizontalGroup(
            appsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        appsLayout.setVerticalGroup(
            appsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side.setBackground(new java.awt.Color(204, 0, 0));
        side.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sideMousePressed(evt);
            }
        });

        sides.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        sides.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sides.setText("Side Orders");
        sides.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout sideLayout = new javax.swing.GroupLayout(side);
        side.setLayout(sideLayout);
        sideLayout.setHorizontalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sides, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        sideLayout.setVerticalGroup(
            sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sides, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        egg.setBackground(new java.awt.Color(204, 0, 0));
        egg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eggMousePressed(evt);
            }
        });

        foo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        foo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foo.setText("Egg Foo Young");
        foo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poultry7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry7.setText("w/ White Rice");
        poultry7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout eggLayout = new javax.swing.GroupLayout(egg);
        egg.setLayout(eggLayout);
        eggLayout.setHorizontalGroup(
            eggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eggLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        eggLayout.setVerticalGroup(
            eggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eggLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry7)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        szech.setBackground(new java.awt.Color(204, 0, 0));
        szech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                szechMousePressed(evt);
            }
        });

        szechs.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        szechs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        szechs.setText("Szechuan &");
        szechs.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        hun.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hun.setText("Hunan Cuisine");

        poultry8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        poultry8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poultry8.setText("w/ White Rice");
        poultry8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout szechLayout = new javax.swing.GroupLayout(szech);
        szech.setLayout(szechLayout);
        szechLayout.setHorizontalGroup(
            szechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(szechLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(szechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(szechs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poultry8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        szechLayout.setVerticalGroup(
            szechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(szechLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(szechs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poultry8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout categLayout = new javax.swing.GroupLayout(categ);
        categ.setLayout(categLayout);
        categLayout.setHorizontalGroup(
            categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categLayout.createSequentialGroup()
                        .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(egg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(categLayout.createSequentialGroup()
                                .addComponent(poul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(veg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(szech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(categLayout.createSequentialGroup()
                        .addComponent(fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        categLayout.setVerticalGroup(
            categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categLayout.createSequentialGroup()
                        .addComponent(veg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(egg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(categLayout.createSequentialGroup()
                        .addGroup(categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(szech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        click.add(categ);

        foods.setBackground(new java.awt.Color(204, 204, 204));

        p1.setBackground(new java.awt.Color(204, 0, 0));
        p1.setPreferredSize(new java.awt.Dimension(140, 108));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p1MousePressed(evt);
            }
        });

        l11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l12)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(204, 0, 0));
        p2.setPreferredSize(new java.awt.Dimension(140, 108));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
        });

        l21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l22, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p3.setBackground(new java.awt.Color(204, 0, 0));
        p3.setPreferredSize(new java.awt.Dimension(140, 108));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p3MousePressed(evt);
            }
        });

        l31.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l32.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l32, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p4.setBackground(new java.awt.Color(204, 0, 0));
        p4.setPreferredSize(new java.awt.Dimension(140, 108));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p4MousePressed(evt);
            }
        });

        l41.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l42.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l41, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p5.setBackground(new java.awt.Color(204, 0, 0));
        p5.setPreferredSize(new java.awt.Dimension(140, 108));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p5MousePressed(evt);
            }
        });

        l51.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l52.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l51, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(l51, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l52)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        p6.setBackground(new java.awt.Color(204, 0, 0));
        p6.setPreferredSize(new java.awt.Dimension(140, 108));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p6MousePressed(evt);
            }
        });

        l61.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l62.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l61, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l62, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p7.setBackground(new java.awt.Color(204, 0, 0));
        p7.setPreferredSize(new java.awt.Dimension(140, 108));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p7MousePressed(evt);
            }
        });

        l71.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l72.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l71, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l72)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p8.setBackground(new java.awt.Color(204, 0, 0));
        p8.setPreferredSize(new java.awt.Dimension(140, 108));
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p8MousePressed(evt);
            }
        });

        l81.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l82.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l81, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l82)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p9.setBackground(new java.awt.Color(204, 0, 0));
        p9.setPreferredSize(new java.awt.Dimension(140, 108));
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p9MousePressed(evt);
            }
        });

        l91.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l92.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l91, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(l91, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l92)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        p10.setBackground(new java.awt.Color(204, 0, 0));
        p10.setPreferredSize(new java.awt.Dimension(140, 108));
        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p10MousePressed(evt);
            }
        });

        l101.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l102.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l101, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l102, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p11.setBackground(new java.awt.Color(204, 0, 0));
        p11.setPreferredSize(new java.awt.Dimension(140, 108));
        p11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p11MousePressed(evt);
            }
        });

        l111.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l112.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l111, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l112)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p12.setBackground(new java.awt.Color(204, 0, 0));
        p12.setPreferredSize(new java.awt.Dimension(140, 108));
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p12MousePressed(evt);
            }
        });

        l121.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l122.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l121, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l122)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p13.setBackground(new java.awt.Color(204, 0, 0));
        p13.setPreferredSize(new java.awt.Dimension(140, 108));
        p13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p13MousePressed(evt);
            }
        });

        l131.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l132.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l131, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(l131, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l132)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        p14.setBackground(new java.awt.Color(204, 0, 0));
        p14.setPreferredSize(new java.awt.Dimension(140, 108));
        p14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p14MousePressed(evt);
            }
        });

        l141.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l142.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p14Layout = new javax.swing.GroupLayout(p14);
        p14.setLayout(p14Layout);
        p14Layout.setHorizontalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l141, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p14Layout.setVerticalGroup(
            p14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l142, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p15.setBackground(new java.awt.Color(204, 0, 0));
        p15.setPreferredSize(new java.awt.Dimension(140, 108));
        p15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p15MousePressed(evt);
            }
        });

        l151.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l152.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p15Layout = new javax.swing.GroupLayout(p15);
        p15.setLayout(p15Layout);
        p15Layout.setHorizontalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l151, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p15Layout.setVerticalGroup(
            p15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l152)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p16.setBackground(new java.awt.Color(204, 0, 0));
        p16.setPreferredSize(new java.awt.Dimension(140, 108));
        p16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p16MousePressed(evt);
            }
        });

        l161.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l162.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        l162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p16Layout = new javax.swing.GroupLayout(p16);
        p16.setLayout(p16Layout);
        p16Layout.setHorizontalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l161, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(l162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p16Layout.setVerticalGroup(
            p16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(l161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l162)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout foodsLayout = new javax.swing.GroupLayout(foods);
        foods.setLayout(foodsLayout);
        foodsLayout.setHorizontalGroup(
            foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodsLayout.createSequentialGroup()
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodsLayout.createSequentialGroup()
                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodsLayout.createSequentialGroup()
                        .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(foodsLayout.createSequentialGroup()
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        foodsLayout.setVerticalGroup(
            foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(foodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        click.add(foods);

        edits.setBackground(new java.awt.Color(204, 204, 204));

        sizes.setLayout(new javax.swing.OverlayLayout(sizes));

        even.setBackground(new java.awt.Color(204, 204, 204));

        even1.setBackground(new java.awt.Color(204, 0, 0));
        even1.setPreferredSize(new java.awt.Dimension(140, 108));
        even1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                even1MousePressed(evt);
            }
        });

        evens1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evens1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        evenp1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evenp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout even1Layout = new javax.swing.GroupLayout(even1);
        even1.setLayout(even1Layout);
        even1Layout.setHorizontalGroup(
            even1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(even1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evenp1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(evens1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        even1Layout.setVerticalGroup(
            even1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(evens1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evenp1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        even2.setBackground(new java.awt.Color(204, 0, 0));
        even2.setPreferredSize(new java.awt.Dimension(140, 108));
        even2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                even2MousePressed(evt);
            }
        });

        evens2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evens2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        evenp2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evenp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout even2Layout = new javax.swing.GroupLayout(even2);
        even2.setLayout(even2Layout);
        even2Layout.setHorizontalGroup(
            even2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(even2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evenp2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(evens2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        even2Layout.setVerticalGroup(
            even2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(evens2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evenp2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        even3.setBackground(new java.awt.Color(204, 0, 0));
        even3.setPreferredSize(new java.awt.Dimension(140, 108));
        even3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                even3MousePressed(evt);
            }
        });

        evens3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evens3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        evenp3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evenp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout even3Layout = new javax.swing.GroupLayout(even3);
        even3.setLayout(even3Layout);
        even3Layout.setHorizontalGroup(
            even3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(even3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evens3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(evenp3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        even3Layout.setVerticalGroup(
            even3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(evens3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evenp3)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        even4.setBackground(new java.awt.Color(204, 0, 0));
        even4.setPreferredSize(new java.awt.Dimension(140, 108));
        even4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                even4MousePressed(evt);
            }
        });

        evens4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evens4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        evenp4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        evenp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout even4Layout = new javax.swing.GroupLayout(even4);
        even4.setLayout(even4Layout);
        even4Layout.setHorizontalGroup(
            even4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(even4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evens4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(evenp4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        even4Layout.setVerticalGroup(
            even4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(even4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(evens4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evenp4)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout evenLayout = new javax.swing.GroupLayout(even);
        even.setLayout(evenLayout);
        evenLayout.setHorizontalGroup(
            evenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(evenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(evenLayout.createSequentialGroup()
                        .addComponent(even1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(even2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(evenLayout.createSequentialGroup()
                        .addComponent(even3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(even4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        evenLayout.setVerticalGroup(
            evenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(evenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(even2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(even1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(evenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(even3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(even4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sizes.add(even);

        odd.setBackground(new java.awt.Color(204, 204, 204));

        odd1.setBackground(new java.awt.Color(204, 0, 0));
        odd1.setPreferredSize(new java.awt.Dimension(140, 108));
        odd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                odd1MousePressed(evt);
            }
        });

        odds1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odds1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        oddp1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        oddp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout odd1Layout = new javax.swing.GroupLayout(odd1);
        odd1.setLayout(odd1Layout);
        odd1Layout.setHorizontalGroup(
            odd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odds1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(oddp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        odd1Layout.setVerticalGroup(
            odd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(odds1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oddp1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        odd2.setBackground(new java.awt.Color(204, 0, 0));
        odd2.setPreferredSize(new java.awt.Dimension(140, 108));
        odd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                odd2MousePressed(evt);
            }
        });

        odds2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odds2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        oddp2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        oddp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout odd2Layout = new javax.swing.GroupLayout(odd2);
        odd2.setLayout(odd2Layout);
        odd2Layout.setHorizontalGroup(
            odd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odds2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(oddp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        odd2Layout.setVerticalGroup(
            odd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(odds2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oddp2)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        odd3.setBackground(new java.awt.Color(204, 0, 0));
        odd3.setPreferredSize(new java.awt.Dimension(140, 108));
        odd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                odd3MousePressed(evt);
            }
        });

        odds3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odds3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        oddp3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        oddp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout odd3Layout = new javax.swing.GroupLayout(odd3);
        odd3.setLayout(odd3Layout);
        odd3Layout.setHorizontalGroup(
            odd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odds3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(oddp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        odd3Layout.setVerticalGroup(
            odd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odd3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(odds3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oddp3)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout oddLayout = new javax.swing.GroupLayout(odd);
        odd.setLayout(oddLayout);
        oddLayout.setHorizontalGroup(
            oddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(odd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(odd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(odd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        oddLayout.setVerticalGroup(
            oddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(odd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(oddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sizes.add(odd);

        amount.setBackground(new java.awt.Color(204, 0, 0));

        add.setBackground(new java.awt.Color(204, 0, 0));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.setPreferredSize(new java.awt.Dimension(140, 108));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
        });

        l83.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        l83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l83.setText("+");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l83, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l83, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        value.setBackground(new java.awt.Color(255, 255, 255));
        value.setPreferredSize(new java.awt.Dimension(140, 108));

        val.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        val.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        val.setText("1");

        javax.swing.GroupLayout valueLayout = new javax.swing.GroupLayout(value);
        value.setLayout(valueLayout);
        valueLayout.setHorizontalGroup(
            valueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(val, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        valueLayout.setVerticalGroup(
            valueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(val, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        minus.setBackground(new java.awt.Color(204, 0, 0));
        minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        minus.setPreferredSize(new java.awt.Dimension(140, 108));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minusMousePressed(evt);
            }
        });

        l73.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        l73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l73.setText("-");

        javax.swing.GroupLayout minusLayout = new javax.swing.GroupLayout(minus);
        minus.setLayout(minusLayout);
        minusLayout.setHorizontalGroup(
            minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l73, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        minusLayout.setVerticalGroup(
            minusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l73, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout amountLayout = new javax.swing.GroupLayout(amount);
        amount.setLayout(amountLayout);
        amountLayout.setHorizontalGroup(
            amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        amountLayout.setVerticalGroup(
            amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(amountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(value, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        confirm.setBackground(new java.awt.Color(153, 153, 153));
        confirm.setPreferredSize(new java.awt.Dimension(140, 108));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add To Bag");

        itemtotal.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        itemtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemtotal.setText("$0.00");

        javax.swing.GroupLayout confirmLayout = new javax.swing.GroupLayout(confirm);
        confirm.setLayout(confirmLayout);
        confirmLayout.setHorizontalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        confirmLayout.setVerticalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        clear.setBackground(new java.awt.Color(204, 0, 0));
        clear.setPreferredSize(new java.awt.Dimension(140, 108));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clear Selected");

        javax.swing.GroupLayout clearLayout = new javax.swing.GroupLayout(clear);
        clear.setLayout(clearLayout);
        clearLayout.setHorizontalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        clearLayout.setVerticalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout editsLayout = new javax.swing.GroupLayout(edits);
        edits.setLayout(editsLayout);
        editsLayout.setHorizontalGroup(
            editsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(editsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(editsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        editsLayout.setVerticalGroup(
            editsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editsLayout.createSequentialGroup()
                .addGroup(editsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        click.add(edits);

        more.setBackground(new java.awt.Color(204, 204, 204));

        complete.setBackground(new java.awt.Color(204, 0, 0));
        complete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completeMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 42)); // NOI18N
        jLabel5.setText("Complete Order         >");

        javax.swing.GroupLayout completeLayout = new javax.swing.GroupLayout(complete);
        complete.setLayout(completeLayout);
        completeLayout.setHorizontalGroup(
            completeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, completeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        completeLayout.setVerticalGroup(
            completeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(completeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        addmore.setBackground(new java.awt.Color(204, 0, 0));
        addmore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addmoreMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 42)); // NOI18N
        jLabel6.setText("Continue Ordering      >");

        javax.swing.GroupLayout addmoreLayout = new javax.swing.GroupLayout(addmore);
        addmore.setLayout(addmoreLayout);
        addmoreLayout.setHorizontalGroup(
            addmoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addmoreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addmoreLayout.setVerticalGroup(
            addmoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmoreLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        editorder.setBackground(new java.awt.Color(204, 0, 0));
        editorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editorderMousePressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 42)); // NOI18N
        jLabel28.setText("Edit Order                 >");

        javax.swing.GroupLayout editorderLayout = new javax.swing.GroupLayout(editorder);
        editorder.setLayout(editorderLayout);
        editorderLayout.setHorizontalGroup(
            editorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
        editorderLayout.setVerticalGroup(
            editorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout moreLayout = new javax.swing.GroupLayout(more);
        more.setLayout(moreLayout);
        moreLayout.setHorizontalGroup(
            moreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addmore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(complete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        moreLayout.setVerticalGroup(
            moreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(complete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(addmore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(editorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        click.add(more);

        number.setBackground(new java.awt.Color(204, 204, 204));

        ordercard.setBackground(new java.awt.Color(255, 255, 255));

        ordernum.setFont(new java.awt.Font("Verdana", 0, 82)); // NOI18N
        ordernum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordernum.setText("1");
        ordernum.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Order #");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout ordercardLayout = new javax.swing.GroupLayout(ordercard);
        ordercard.setLayout(ordercardLayout);
        ordercardLayout.setHorizontalGroup(
            ordercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordercardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ordercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(ordernum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ordercardLayout.setVerticalGroup(
            ordercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordercardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordernum, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        finaltotal.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        finaltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout numberLayout = new javax.swing.GroupLayout(number);
        number.setLayout(numberLayout);
        numberLayout.setHorizontalGroup(
            numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numberLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(ordercard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(numberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finaltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        numberLayout.setVerticalGroup(
            numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numberLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(ordercard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(finaltotal)
                .addGap(125, 125, 125))
        );

        click.add(number);

        editsorder.setBackground(new java.awt.Color(204, 204, 204));

        ordersave.setBackground(new java.awt.Color(204, 0, 0));
        ordersave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ordersaveMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Save");

        javax.swing.GroupLayout ordersaveLayout = new javax.swing.GroupLayout(ordersave);
        ordersave.setLayout(ordersaveLayout);
        ordersaveLayout.setHorizontalGroup(
            ordersaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ordersaveLayout.setVerticalGroup(
            ordersaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderdown.setBackground(new java.awt.Color(204, 0, 0));
        orderdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderdownMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Down");

        javax.swing.GroupLayout orderdownLayout = new javax.swing.GroupLayout(orderdown);
        orderdown.setLayout(orderdownLayout);
        orderdownLayout.setHorizontalGroup(
            orderdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderdownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderdownLayout.setVerticalGroup(
            orderdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderdownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderup.setBackground(new java.awt.Color(204, 0, 0));
        orderup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderupMousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Up");

        javax.swing.GroupLayout orderupLayout = new javax.swing.GroupLayout(orderup);
        orderup.setLayout(orderupLayout);
        orderupLayout.setHorizontalGroup(
            orderupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderupLayout.setVerticalGroup(
            orderupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderminus.setBackground(new java.awt.Color(204, 0, 0));
        orderminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderminusMousePressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("-");

        javax.swing.GroupLayout orderminusLayout = new javax.swing.GroupLayout(orderminus);
        orderminus.setLayout(orderminusLayout);
        orderminusLayout.setHorizontalGroup(
            orderminusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderminusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderminusLayout.setVerticalGroup(
            orderminusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderminusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderadd.setBackground(new java.awt.Color(204, 0, 0));
        orderadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderaddMousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("+");

        javax.swing.GroupLayout orderaddLayout = new javax.swing.GroupLayout(orderadd);
        orderadd.setLayout(orderaddLayout);
        orderaddLayout.setHorizontalGroup(
            orderaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderaddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderaddLayout.setVerticalGroup(
            orderaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderaddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderdelete.setBackground(new java.awt.Color(204, 0, 0));
        orderdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderdeleteMousePressed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Delete");

        javax.swing.GroupLayout orderdeleteLayout = new javax.swing.GroupLayout(orderdelete);
        orderdelete.setLayout(orderdeleteLayout);
        orderdeleteLayout.setHorizontalGroup(
            orderdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderdeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderdeleteLayout.setVerticalGroup(
            orderdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderdeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Edit Quantity");

        price2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        orderedit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        orderedit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderedit.setRowHeight(30);
        jScrollPane1.setViewportView(orderedit);

        total2.setBackground(new java.awt.Color(255, 255, 255));

        ftotal_val2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ftotal_val2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ftotal_val2.setText("$0.00");

        tax2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tax2.setText("Tax");

        subtotal2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subtotal2.setText("Subtotal");

        ftotal2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ftotal2.setText("Final Total");

        tax_val2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tax_val2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tax_val2.setText("$0.00");

        subtotal_val2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subtotal_val2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotal_val2.setText("$0.00");

        javax.swing.GroupLayout total2Layout = new javax.swing.GroupLayout(total2);
        total2.setLayout(total2Layout);
        total2Layout.setHorizontalGroup(
            total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ftotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotal_val2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(ftotal_val2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tax_val2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        total2Layout.setVerticalGroup(
            total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal2)
                    .addComponent(subtotal_val2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax2)
                    .addComponent(tax_val2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(total2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftotal2)
                    .addComponent(ftotal_val2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout price2Layout = new javax.swing.GroupLayout(price2);
        price2.setLayout(price2Layout);
        price2Layout.setHorizontalGroup(
            price2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(price2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(total2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        price2Layout.setVerticalGroup(
            price2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout editsorderLayout = new javax.swing.GroupLayout(editsorder);
        editsorder.setLayout(editsorderLayout);
        editsorderLayout.setHorizontalGroup(
            editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editsorderLayout.createSequentialGroup()
                .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editsorderLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editsorderLayout.createSequentialGroup()
                                .addComponent(orderminus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addComponent(orderdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editsorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ordersave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderdown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        editsorderLayout.setVerticalGroup(
            editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editsorderLayout.createSequentialGroup()
                .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editsorderLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(orderup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                    .addGroup(editsorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ordersave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderdelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(editsorderLayout.createSequentialGroup()
                        .addGroup(editsorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orderadd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderminus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)))
                .addGap(11, 11, 11))
        );

        click.add(editsorder);

        sidebar.setBackground(new java.awt.Color(204, 0, 0));

        banner2.setBackground(new java.awt.Color(204, 0, 51));

        title3.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("NEW GARDEN");
        title3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout banner2Layout = new javax.swing.GroupLayout(banner2);
        banner2.setLayout(banner2Layout);
        banner2Layout.setHorizontalGroup(
            banner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banner2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        banner2Layout.setVerticalGroup(
            banner2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banner2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        total.setBackground(new java.awt.Color(255, 255, 255));

        ftotal_val.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ftotal_val.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ftotal_val.setText("$0.00");

        tax.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tax.setText("Tax");

        subtotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subtotal.setText("Subtotal");

        ftotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ftotal.setText("Final Total");

        tax_val.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tax_val.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tax_val.setText("$0.00");

        subtotal_val.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subtotal_val.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotal_val.setText("$0.00");

        javax.swing.GroupLayout totalLayout = new javax.swing.GroupLayout(total);
        total.setLayout(totalLayout);
        totalLayout.setHorizontalGroup(
            totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ftotal, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotal_val, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(ftotal_val, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tax_val, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalLayout.setVerticalGroup(
            totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal)
                    .addComponent(subtotal_val, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax)
                    .addComponent(tax_val, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftotal)
                    .addComponent(ftotal_val, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        itemscroll.setBorder(null);

        items.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        items.setRowHeight(20);
        items.setShowGrid(false);
        itemscroll.setViewportView(items);

        javax.swing.GroupLayout priceLayout = new javax.swing.GroupLayout(price);
        price.setLayout(priceLayout);
        priceLayout.setHorizontalGroup(
            priceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(priceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        priceLayout.setVerticalGroup(
            priceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, priceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        back.setBackground(new java.awt.Color(204, 0, 51));
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BACK");

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        cancel.setBackground(new java.awt.Color(204, 0, 51));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANCEL");

        javax.swing.GroupLayout cancelLayout = new javax.swing.GroupLayout(cancel);
        cancel.setLayout(cancelLayout);
        cancelLayout.setHorizontalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelLayout.setVerticalGroup(
            cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(banner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        banner3.setBackground(new java.awt.Color(204, 0, 0));

        titles.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        titles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titles.setText("-");
        titles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout banner3Layout = new javax.swing.GroupLayout(banner3);
        banner3.setLayout(banner3Layout);
        banner3Layout.setHorizontalGroup(
            banner3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banner3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        banner3Layout.setVerticalGroup(
            banner3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banner3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titles, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banner3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(orderLayout.createSequentialGroup()
                        .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orderLayout.createSequentialGroup()
                .addComponent(banner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(order);

        cancelp.setBackground(new java.awt.Color(204, 204, 204));

        complete2.setBackground(new java.awt.Color(204, 0, 0));
        complete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                complete2MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Order");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Complete");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout complete2Layout = new javax.swing.GroupLayout(complete2);
        complete2.setLayout(complete2Layout);
        complete2Layout.setHorizontalGroup(
            complete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, complete2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(complete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        complete2Layout.setVerticalGroup(
            complete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(complete2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addmore2.setBackground(new java.awt.Color(204, 0, 0));
        addmore2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addmore2MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ordering");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Continue");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout addmore2Layout = new javax.swing.GroupLayout(addmore2);
        addmore2.setLayout(addmore2Layout);
        addmore2Layout.setHorizontalGroup(
            addmore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmore2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addmore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        addmore2Layout.setVerticalGroup(
            addmore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addmore2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        defcancel.setBackground(new java.awt.Color(204, 0, 0));
        defcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                defcancelMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Order");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Cancel");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout defcancelLayout = new javax.swing.GroupLayout(defcancel);
        defcancel.setLayout(defcancelLayout);
        defcancelLayout.setHorizontalGroup(
            defcancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defcancelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(defcancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        defcancelLayout.setVerticalGroup(
            defcancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defcancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editorder2.setBackground(new java.awt.Color(204, 0, 0));
        editorder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editorder2MousePressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Order");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Edit");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout editorder2Layout = new javax.swing.GroupLayout(editorder2);
        editorder2.setLayout(editorder2Layout);
        editorder2Layout.setHorizontalGroup(
            editorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorder2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(editorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        editorder2Layout.setVerticalGroup(
            editorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        banner5.setBackground(new java.awt.Color(204, 0, 51));

        title4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("NEW GARDEN");

        javax.swing.GroupLayout banner5Layout = new javax.swing.GroupLayout(banner5);
        banner5.setLayout(banner5Layout);
        banner5Layout.setHorizontalGroup(
            banner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banner5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        banner5Layout.setVerticalGroup(
            banner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banner5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout cancelpLayout = new javax.swing.GroupLayout(cancelp);
        cancelp.setLayout(cancelpLayout);
        cancelpLayout.setHorizontalGroup(
            cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelpLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defcancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addmore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
            .addComponent(banner5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cancelpLayout.setVerticalGroup(
            cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelpLayout.createSequentialGroup()
                .addComponent(banner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(defcancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(cancelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(complete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addmore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        main.add(cancelp);

        timer.setBackground(new java.awt.Color(204, 204, 204));
        timer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timerMousePressed(evt);
            }
        });

        banner1.setBackground(new java.awt.Color(204, 0, 51));

        title1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("NEW GARDEN");

        javax.swing.GroupLayout banner1Layout = new javax.swing.GroupLayout(banner1);
        banner1.setLayout(banner1Layout);
        banner1Layout.setHorizontalGroup(
            banner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banner1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        banner1Layout.setVerticalGroup(
            banner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(banner1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        here.setBackground(new java.awt.Color(204, 0, 51));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Continue Ordering");

        javax.swing.GroupLayout hereLayout = new javax.swing.GroupLayout(here);
        here.setLayout(hereLayout);
        hereLayout.setHorizontalGroup(
            hereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hereLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        hereLayout.setVerticalGroup(
            hereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hereLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel29.setText("Are you still here?");

        countdown.setFont(new java.awt.Font("Verdana", 0, 82)); // NOI18N
        countdown.setText("10");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(timerLayout.createSequentialGroup()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(here, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(timerLayout.createSequentialGroup()
                            .addGap(417, 417, 417)
                            .addComponent(countdown)
                            .addGap(94, 94, 94)))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addComponent(banner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(here, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(countdown)
                .addGap(118, 118, 118))
        );

        main.add(timer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        // TODO add your handling code here:
        home.setVisible(false);
        order.setVisible(true);
        categ.setVisible(true);
        sidebar.setVisible(true);
        titles.setText("Categories");
        // Closes the home screen and shows the ordering section
        
        cal.setTime(new Date());
        int currentHour = cal.get(Calendar.HOUR_OF_DAY);
        pastLunch = (currentHour >= 15 && currentHour <= 23);
        // If it's after 3pm, then lunch sizes are over
        
        timerAFK();
    }//GEN-LAST:event_homeMousePressed

    private void frMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Fried Rice");
        
        l11.setText("Plain");
        l12.setText("Fried Rice");
        
        l21.setText("Regular");
        l22.setText("Fried Rice");
        
        l31.setText("Vegetable");
        l32.setText("Fried Rice");
        
        l41.setText("Pork");
        l42.setText("Fried Rice");
        
        l51.setText("Chicken");
        l52.setText("Fried Rice");
        
        l61.setText("Beef");
        l62.setText("Fried Rice");
        
        l71.setText("Shrimp");
        l72.setText("Fried Rice");
        
        l81.setText("House Special");
        l82.setText("Fried Rice");
        
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_frMousePressed

    private void loMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Lo Mein");
        
        l11.setText("Plain");
        l12.setText("Lo Mein");
        
        l21.setText("Regular");
        l22.setText("Lo Mein");
        
        l31.setText("Vegetable");
        l32.setText("Lo Mein");
        
        l41.setText("Pork");
        l42.setText("Lo Mein");
        
        l51.setText("Chicken");
        l52.setText("Lo Mein");
        
        l61.setText("Beef");
        l62.setText("Lo Mein");
        
        l71.setText("Shrimp");
        l72.setText("Lo Mein");
        
        l81.setText("House Special");
        l82.setText("Lo Mein");
        
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_loMousePressed

    private void maiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maiMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Mai Fun");
        
        l11.setText("Plain");
        l12.setText("Mai Fun");
        
        l21.setText("Regular");
        l22.setText("Mai Fun");
        
        l31.setText("Vegetable");
        l32.setText("Mai Fun");
        
        l41.setText("Pork");
        l42.setText("Mai Fun");
        
        l51.setText("Chicken");
        l52.setText("Mai Fun");
        
        l61.setText("Beef");
        l62.setText("Mai Fun");
        
        l71.setText("Shrimp");
        l72.setText("Mai Fun");
        
        l81.setText("House Special");
        l82.setText("Mai Fun");
        
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_maiMousePressed

    private void chowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chowMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Chow Mein");
        
        l11.setText("Vegetable");
        l12.setText("Chow Mein");
        
        l21.setText("Pork");
        l22.setText("Chow Mein");
        
        l31.setText("Chicken");
        l32.setText("Chow Mein");
        
        l41.setText("Beef");
        l42.setText("Chow Mein");
        
        l51.setText("Shrimp");
        l52.setText("Chow Mein");
        
        l61.setText("House Special");
        l62.setText("Chow Mein");
        
        p7.setBackground(whitish);
        p8.setBackground(whitish);
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_chowMousePressed

    private void poulMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poulMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Poultry");
        
        l11.setText("Moo Goo");
        l12.setText("Gai Pan");
        
        l21.setText("Chicken w/");
        l22.setText("Broccoli");
        
        l31.setText("Chicken w/");
        l32.setText("Snow Peas");
        
        l41.setText("Chicken w/");
        l42.setText("Cashew Nuts");
        
        l51.setText("Chicken w/");
        l52.setText("Mixed Veg.");
        
        l61.setText("Chicken w/");
        l62.setText("Garlic Sauce");
        
        l71.setText("Curry Chicken");
        l72.setText("w/ Onions");
        
        l81.setText("Kum Po");
        l82.setText("Chicken");
        
        l91.setText("Diced Chicken");
        l92.setText("& Shrimp");
        
        l101.setText("Sweet &");
        l102.setText("Sour Chicken");
        
        l111.setText("General Tso's");
        l112.setText("Chicken");
        
        l121.setText("Sesame");
        l122.setText("Chicken");
        
        l131.setText("Orange");
        l132.setText("Chicken");
        
        l141.setText("Crispy");
        l142.setText("Chicken");
        
        l151.setText("Coral");
        l152.setText("Chicken");
        
        l161.setText("Pepper");
        l162.setText("Chicken");
    }//GEN-LAST:event_poulMousePressed

    private void porkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porkMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Pork");
        
        l11.setText("Pork w/");
        l12.setText("Chinese Veg.");
        
        l21.setText("Pork w/");
        l22.setText("Broccoli");
        
        l31.setText("Pork w/");
        l32.setText("Snow Peas");
        
        l41.setText("Pork w/");
        l42.setText("Mushroom");
        
        l51.setText("Pork w/");
        l52.setText("Garlic Sauce");
        
        l61.setText("Sweet &");
        l62.setText("Sour Pork");
        
        l71.setText("Sauteed");
        l72.setText("Sliced Pork");
        
        p8.setBackground(whitish);
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_porkMousePressed

    private void beefMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beefMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Beef");
        
        l11.setText("Pepper Steak");
        l12.setText("w/ Onions");
        
        l21.setText("Beef w/");
        l22.setText("Broccoli");
        
        l31.setText("Beef w/");
        l32.setText("Snow Peas");
        
        l41.setText("Beef w/");
        l42.setText("Mushroom");
        
        l51.setText("Beef w/");
        l52.setText("Garlic Sauce");
        
        l61.setText("Beef w/");
        l62.setText("Chinese Veg.");
        
        l71.setText("Beef w/");
        l72.setText("Mixed Veg.");
        
        l81.setText("Curry Beef");
        l82.setText("w/ Onions");
        
        l91.setText("Orange");
        l92.setText("Beef");
        
        l101.setText("Mongolian");
        l102.setText("Beef");
        
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_beefMousePressed

    private void seaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Seafood");
        
        l11.setText("Shrimp w/");
        l12.setText("Lobster Sauce");
        
        l21.setText("Shrimp w/");
        l22.setText("Broccoli");
        
        l31.setText("Shrimp w/");
        l32.setText("Snow Peas");
        
        l41.setText("Shrimp w/");
        l42.setText("Cashew Nuts");
        
        l51.setText("Shrimp w/");
        l52.setText("Mixed Veg.");
        
        l61.setText("Shrimp w/");
        l62.setText("Garlic Sauce");
        
        l71.setText("Shrimp w/");
        l72.setText("Chinese Veg.");
        
        l81.setText("Shrimp w/");
        l82.setText("Curry Sauce");
        
        l91.setText("Kum Po");
        l92.setText("Shrimp");
        
        l101.setText("Sweet &");
        l102.setText("Sour Shrimp");
        
        l111.setText("Crab & Shrimp");
        l112.setText("Garlic Sauce");
        
        l121.setText("Coral");
        l122.setText("Shrimp");
        
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_seaMousePressed

    private void vegMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Vegetable");
        
        l11.setText("Buddhist");
        l12.setText("Delight");
        
        l21.setText("Moo Shu");
        l22.setText("Vegetable");
        
        l31.setText("Sauteed");
        l32.setText("Vegetable");
        
        l41.setText("Mixed Veg. w/");
        l42.setText("Garlic Sauce");
        
        l51.setText("Broccoli w/");
        l52.setText("Garlic Sauce");
        
        l61.setText("Hunan Bean");
        l62.setText("Curd");
        
        l71.setText("Ma Po");
        l72.setText("Tofu");
        
        l81.setText("Steam");
        l82.setText("Broccoli");
        
        l91.setText("Steam");
        l92.setText("Mixed Veg.");
        
        l101.setText("Steam Chicken");
        l102.setText("w/ Broccoli");
        
        l111.setText("Steam Chicken");
        l112.setText("w/ Mixed Veg.");
        
        l121.setText("Steam Shrimp");
        l122.setText("w/ Broccoli");
        
        l131.setText("Steam Shrimp");
        l132.setText("w/ Mixed Veg.");
        
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_vegMousePressed

    private void soupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soupMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Soup");
        
        l11.setText("Wonton");
        l12.setText("Soup");
        
        l21.setText("Wonton Egg");
        l22.setText("Drop Soup");
        
        l31.setText("Chicken Noodle");
        l32.setText("Soup");
        
        l41.setText("Chicken Rice");
        l42.setText("Soup");
        
        l51.setText("Veg. w/ Bean");
        l52.setText("Curd Soup");
        
        l61.setText("Egg Drop");
        l62.setText("Soup");
        
        l71.setText("Hot &");
        l72.setText("Sour Soup");
        
        l81.setText("House Special");
        l82.setText("Soup");
        
        l91.setText("Seafood");
        l92.setText("Soup");
        
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_soupMousePressed

    private void appsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Appetizers");
        
        l11.setText("Spring");
        l12.setText("Roll (2)");
        
        l21.setText("Pork Egg");
        l22.setText("Roll");
        
        l31.setText("Shrimp Egg");
        l32.setText("Roll");
        
        l41.setText("Boneless");
        l42.setText("Ribs");
        
        l51.setText("Fried");
        l52.setText("Dumplings (8)");
        
        l61.setText("Steamed");
        l62.setText("Dumplings (8)");
        
        l71.setText("Cheese");
        l72.setText("Wontons (8)");
        
        l81.setText("Fried Pork");
        l82.setText("Wontons (8)");
        
        l91.setText("Fried");
        l92.setText("Scallops (8)");
        
        l101.setText("Fried");
        l102.setText("Nuggets (8)");
        
        l111.setText("Fried");
        l112.setText("Onions (12)");
        
        l121.setText("Apple");
        l122.setText("Sticks (12)");
        
        l131.setText("Teriyaki");
        l132.setText("Chicken (5)");
        
        l141.setText("Teriyaki");
        l142.setText("Beef (5)");
        
        l151.setText("Fried");
        l152.setText("Shrimp (20)");

        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_appsMousePressed

    private void sideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Side Orders");
        
        l11.setText("White");
        l12.setText("Rice");
        
        l21.setText("Sweet &");
        l22.setText("Sour Sauce");
        
        l31.setText("Coral");
        l32.setText("Sauce");
        
        l41.setText("Dumpling");
        l42.setText("Sauce");
        
        l51.setText("Fried");
        l52.setText("Noodles");
        
        l61.setText("Hot");
        l62.setText("Oil");
        
        p7.setBackground(whitish);
        p8.setBackground(whitish);
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_sideMousePressed

    private void eggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eggMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Egg Foo Young");
        
        l11.setText("Vegetable");
        l12.setText("Egg Foo Young");
        
        l21.setText("Pork");
        l22.setText("Egg Foo Young");
        
        l31.setText("Chicken");
        l32.setText("Egg Foo Young");
        
        l41.setText("Beef");
        l42.setText("Egg Foo Young");
        
        l51.setText("Shrimp");
        l52.setText("Egg Foo Young");
        
        p6.setBackground(whitish);
        p7.setBackground(whitish);
        p8.setBackground(whitish);
        p9.setBackground(whitish);
        p10.setBackground(whitish);
        p11.setBackground(whitish);
        p12.setBackground(whitish);
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_eggMousePressed

    private void szechMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_szechMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        initFood("Szechuan & Hunan Cuisine");
        
        l11.setText("Seafood Pan");
        l12.setText("Fried Noodles");
        
        l21.setText("House Pan");
        l22.setText("Fried Noodles");
        
        l31.setText("Happy");
        l32.setText("Family");
        
        l41.setText("Seafood");
        l42.setText("Delight");
        
        l51.setText("Four");
        l52.setText("Seasons");
        
        l61.setText("Hunan Triple");
        l62.setText("Delight");
        
        l71.setText("Hunan");
        l72.setText("Beef");
        
        l81.setText("Hunan");
        l82.setText("Chicken");
        
        l91.setText("Moo Shu");
        l92.setText("Pork");
        
        l101.setText("Moo Shu");
        l102.setText("Chicken");
        
        l111.setText("Moo Shu");
        l112.setText("Shrimp");
        
        l121.setText("Szechuan");
        l122.setText("Chicken");
        
        p13.setBackground(whitish);
        p14.setBackground(whitish);
        p15.setBackground(whitish);
        p16.setBackground(whitish);
        // Sets the unused panels invisible
    }//GEN-LAST:event_szechMousePressed

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l11, l12);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p1MousePressed

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l21, l22);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p2MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l31, l32);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p3MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l41, l42);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l51, l52);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p5MousePressed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l61, l62);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p6MousePressed

    private void p7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l71, l72);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p7MousePressed

    private void p8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l81, l82);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p8MousePressed

    private void p9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l91, l92);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p9MousePressed

    private void p10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l101, l102);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p10MousePressed

    private void p11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l111, l112);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p11MousePressed

    private void p12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l121, l122);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p12MousePressed

    private void p13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l131, l132);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p13MousePressed

    private void p14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l141, l142);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p14MousePressed

    private void p15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l151, l152);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p15MousePressed

    private void p16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        refreshSize(); refreshSelected();
        initEdit(l161, l162);
        // Determines the sizes and price of that specific item
    }//GEN-LAST:event_p16MousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        timerReset();
        if (number.isVisible() == true) {
            number.setVisible(false);
            home.setVisible(true);
            refreshSidebar();
            // If at order number page, return to home page
        } else {
            timerAFK();
            if (more.isVisible() == true) {  
            more.setVisible(false);
            edits.setVisible(true);
            titles.setText(backVar);
            // If at complete/continue page, return to item edit page
            } else if (edits.isVisible() == true) {
            edits.setVisible(false);
            foods.setVisible(true);
            titles.setText(backVar2);
            // If at item edit page, return to that category's page
            } else if (foods.isVisible() == true) {
            foods.setVisible(false);
            categ.setVisible(true);
            titles.setText("Categories");
            // If at list of food page, return to all categories page
            } else if (items.getRowCount() > 0) {
            categ.setVisible(false);
            foods.setVisible(false);
            edits.setVisible(false);
            more.setVisible(false);
            number.setVisible(false);
            order.setVisible(false);
            cancelp.setVisible(true);
            titles.setText("Are you sure?");
            // If at all categories page with items in bag, ask to confirm
            } else if (categ.isVisible() == true) {
            order.setVisible(false);
            sidebar.setVisible(false);
            home.setVisible(true);
            refreshSidebar();
            // Return to home page if at all categories page
            }
        }
    }//GEN-LAST:event_backMousePressed

    private void cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMousePressed
        // TODO add your handling code here:
        timerReset();
        if (number.isVisible() == true) {
            number.setVisible(false);
            home.setVisible(true);
            refreshSidebar();
            // If at order number page, return to home page
        } else {
            timerAFK();
            if (items.getRowCount() == 0) {
            editorder2.setBackground(greyish);
            complete2.setBackground(greyish);
            // If no items in bag, disable edit order and complete order
            } else {
                editorder2.setBackground(reddish);
                complete2.setBackground(reddish);
                // Otherwise activate edit order and complete order
            }
            order.setVisible(false);
            cancelp.setVisible(true);
            // Hide every panel except the cancel page
        }
    }//GEN-LAST:event_cancelMousePressed

    private void even1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_even1MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        sizeButtons(even1, evens1, evenp1);
        // Sets the border when pressed of the size and it's corresponding price
    }//GEN-LAST:event_even1MousePressed

    private void even2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_even2MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        sizeButtons(even2, evens2, evenp2);
        // Sets the border when pressed of the size and it's corresponding price
    }//GEN-LAST:event_even2MousePressed

    private void even3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_even3MousePressed
        // TODO add your handling code here:
        if (irreg == false && pastLunch != true) {
            timerReset(); timerAFK();
            sizeButtons(even3, evens3, evenp3);
            // If it has 4 sizes instead of 2, and lunch hasn't passed
        }
    }//GEN-LAST:event_even3MousePressed

    private void even4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_even4MousePressed
        // TODO add your handling code here:
        if (irreg == false) {
            timerReset(); timerAFK();
            sizeButtons(even4, evens4, evenp4);
            // If it has 4 sizes instead of 2
        }
    }//GEN-LAST:event_even4MousePressed

    private void odd1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odd1MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        sizeButtons(odd1, odds1, oddp1);
        // Sets the border when pressed of the size and it's corresponding price
    }//GEN-LAST:event_odd1MousePressed

    private void odd2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odd2MousePressed
        // TODO add your handling code here:
        if (irreg == false && pastLunch != true) {
            timerReset(); timerAFK();
            sizeButtons(odd2, odds2, oddp2);
            // If it has 3 sizes instead of only 1, and lunch hasn't passed
        }
    }//GEN-LAST:event_odd2MousePressed

    private void odd3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odd3MousePressed
        // TODO add your handling code here:
        if (irreg == false) {
            timerReset(); timerAFK();
            sizeButtons(odd3, odds3, oddp3);
            // If it has 3 sizes instead of only 1
        }
    }//GEN-LAST:event_odd3MousePressed

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        quantityAdjustment(1);
        // Adjust the quantity by adding one
    }//GEN-LAST:event_addMousePressed

    private void minusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        quantityAdjustment(-1);
        // Adjust the quantity by subtracting one
    }//GEN-LAST:event_minusMousePressed

    private void confirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMousePressed
        // TODO add your handling code here:
        if (!"$0.00".equals(itemtotal.getText())) {
            timerReset(); timerAFK();
            edits.setVisible(false);
            more.setVisible(true);
            // If the item total isn't $0.00
            
            String topData[] = {size, titles.getText()};
            String botData[] = {itemtotal.getText(), "x"+val.getText()};
            DefaultTableModel model = (DefaultTableModel) items.getModel();
            model.addRow(topData); model.addRow(botData);
            // Adds the item, item size, item price, and quantity to bag
            titles.setText("Complete Or Continue Editing");
            items.scrollRectToVisible(items.getCellRect(items.getRowCount()-1, 0, true));
            // Always scrolls to the bottom for the most recent addition
            subtotalCalc(items, subtotal_val, tax_val, ftotal_val);
            // Calculates the subtotal, tax, and final total of current items in bag
            complete.setBackground(reddish);
            editorder.setBackground(reddish);
        }
    }//GEN-LAST:event_confirmMousePressed

    private void clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        if (odd.isVisible() == true && irreg == true) {
            val.setText("1");
            itemtotal.setText(oddp1.getText().substring(1));
            // If it only has one size, return quantity amount to one and retain the border selection
        } else {
            refreshSelected();
            // Otherwise reset both the quantity amount and the border selection
        }
    }//GEN-LAST:event_clearMousePressed

    private void completeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        orderComplete();
        // Completes the order from the continue/edit page
    }//GEN-LAST:event_completeMousePressed

    private void addmoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmoreMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        more.setVisible(false);
        categ.setVisible(true);
        titles.setText("Categories");
        // Continue ordering from the continue/edit page
    }//GEN-LAST:event_addmoreMousePressed

    private void complete2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complete2MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        orderComplete();
        // Completes the order from the cancel page
    }//GEN-LAST:event_complete2MousePressed

    private void addmore2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmore2MousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        if (more.isVisible() == true) {
            more.setVisible(false);
            categ.setVisible(true);
            titles.setText("Categories");
        } else {
            cancelp.setVisible(false);
            order.setVisible(true);
        }
        // Continue ordering from the cancel page
    }//GEN-LAST:event_addmore2MousePressed

    private void defcancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defcancelMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        cancelp.setVisible(false);
        home.setVisible(true);
        refreshSidebar();
        // Cancels the order
    }//GEN-LAST:event_defcancelMousePressed

    private void editorder2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editorder2MousePressed
        // TODO add your handling code here:
        if (items.getRowCount() > 0) {
            timerReset(); timerAFK();
            setupTable(orderedit, items);
            orderEdit();
            subtotalCalc(orderedit, subtotal_val2, tax_val2, ftotal_val2);
            // If an item is in the bag, setup the table to edit and calculate the current subtotal, tax, and final total
        }
    }//GEN-LAST:event_editorder2MousePressed

    private void orderupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderupMousePressed
        // TODO add your handling code here:
        if ((rowEdit-2) >= 0) {
            timerReset(); timerAFK();
            rowEdit-=2;
            orderedit.setRowSelectionInterval(rowEdit, rowEdit+1);
            // If row selection not at top, go up
        }
    }//GEN-LAST:event_orderupMousePressed

    private void orderdownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdownMousePressed
        // TODO add your handling code here:
        if ((rowEdit+2) < orderedit.getRowCount()) {
            timerReset(); timerAFK();
            rowEdit+=2;
            orderedit.setRowSelectionInterval(rowEdit, rowEdit+1);
            // If row selection not at bottom, go down
        }
    }//GEN-LAST:event_orderdownMousePressed

    private void orderminusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderminusMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        quantityAdjustmentEdits(-1);
        subtotalCalc(orderedit, subtotal_val2, tax_val2, ftotal_val2);
        // Adjust the quantity by removing one, and calculate subtotal, tax, and final total
    }//GEN-LAST:event_orderminusMousePressed

    private void orderaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderaddMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        quantityAdjustmentEdits(1);
        subtotalCalc(orderedit, subtotal_val2, tax_val2, ftotal_val2);
        // Adjust the quantity by adding one, and calculate subtotal, tax, and final total
    }//GEN-LAST:event_orderaddMousePressed

    private void orderdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderdeleteMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        DefaultTableModel model = (DefaultTableModel) orderedit.getModel();
        model.removeRow(rowEdit); model.removeRow(rowEdit);
        rowEdit = 0;
        subtotalCalc(orderedit, subtotal_val2, tax_val2, ftotal_val2);
        // Calculate the subtotal, tax, and final total after deletion
        orderedit.setRowSelectionInterval(0, 1);
        // Remove the selected item, and reset the row selection to the top
    }//GEN-LAST:event_orderdeleteMousePressed

    private void ordersaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersaveMousePressed
        // TODO add your handling code here:
        timerReset(); timerAFK();
        setupTable(items, orderedit);
        // Transfer the contents of edits into sidebar table
        subtotalCalc(items, subtotal_val, tax_val, ftotal_val);
        // Calculate the subtotal, tax, and final total of edited order
        editsorder.setVisible(false);
        more.setVisible(true);
        titles.setText("Complete or Continue Editing");
        if (items.getRowCount() == 0) {
            complete.setBackground(greyish);
            editorder.setBackground(greyish);
            // If no items in bag after editing, disable complete order and edit order
        }
    }//GEN-LAST:event_ordersaveMousePressed

    private void editorderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editorderMousePressed
        // TODO add your handling code here:
        if (items.getRowCount() > 0) {
            timerReset(); timerAFK();
            setupTable(orderedit, items);
            orderEdit();
            subtotalCalc(orderedit, subtotal_val2, tax_val2, ftotal_val2);
            // If an item is in the bag, setup the table to edit and calculate the current subtotal, tax, and final total
        }
    }//GEN-LAST:event_editorderMousePressed

    private void timerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timerMousePressed
        // TODO add your handling code here:
        timer.setVisible(false);
        order.setVisible(true);
        
        Timer cdTime = new Timer();
        cdTime = new Timer(false);
        for (int i = 10; i < 0; i--) {
            final int cd = i;
            cdTime.schedule(new TimerTask() {
                @Override
                public void run() {
                    countdown.setText(String.valueOf(cd));
                }
            }, 0, i * 1000);
        }
    }//GEN-LAST:event_timerMousePressed
    
    // Calculates the subtotal, tax, and final total
    private void subtotalCalc(JTable table, JLabel sub, JLabel tax, JLabel ftot) {
        double subtotals = 0;
        for (int i=1; i < table.getRowCount(); i+=2) {
                subtotals += Double.parseDouble((table.getValueAt(i, 0).toString()).substring(1));
                // Add every item total together
        }
        sub.setText("$"+String.format("%.2f", subtotals));
        tax.setText("$"+String.format("%.2f", (subtotals * (taxes-1))));
        ftot.setText("$"+String.format("%.2f", (subtotals * (taxes))));
    }
    
    // Clears the table and restructure with the data from items table
    private void setupTable(JTable copyTo, JTable copyFrom) {
        String cell1 = ""; String cell2 = "";
        DefaultTableModel model = (DefaultTableModel) copyTo.getModel();
        for (int i = copyTo.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
            // Clears the table
        }
        for (int x = 0; x < copyFrom.getRowCount(); x++) {
            for (int y = 0; y < copyFrom.getColumnCount(); y++) {
                if ("".equals(cell1)) {
                    cell1 = copyFrom.getValueAt(x, y).toString();                   
                } else {
                    cell2 = copyFrom.getValueAt(x, y).toString();
                }
            } 
            String data[] = {cell1, cell2};
            model.addRow(data);
            cell1 = ""; cell2 = "";
            // Copys the data from one table to a different one
        }
    }
    
    // Adjusts border and item total when a size button is pressed
    private void sizeButtons(JPanel box, JLabel sizes, JLabel prices) {
        even1.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even3.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even4.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        
        odd1.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        odd2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        odd3.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        
        size = sizes.getText();
        int intQuantity = Integer.parseInt(val.getText());
        sizePrice = Double.parseDouble(prices.getText().substring(1));
        itemtotal.setText("$"+String.format("%.2f", sizePrice * intQuantity));
        confirm.setBackground(reddish);
        box.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        // Clears all of the borders except one and calculates item price
    }
    
    // Adjusts the quantity of a specific item of food to be adjusted on the item page
    private void quantityAdjustment(int posneg) {
        int intQuantity = Integer.parseInt(val.getText());
        intQuantity += posneg;
        if (intQuantity > 0) {
            String strQuan = String.valueOf(intQuantity);
            val.setText(strQuan);
            itemtotal.setText("$"+String.format("%.2f", sizePrice * intQuantity));
            // If quantity still greater than 1 after adjustment, re-adjust item total
        }
    }
    
    // Allows the quantity of a specifc item of food to be adjusted on the edit page
    private void quantityAdjustmentEdits(int posneg) {
        String cell2 = orderedit.getValueAt(rowEdit+1, 1).toString();
        int intQuantity = Integer.parseInt(cell2.substring(1));
        intQuantity += posneg;
        if (intQuantity > 0) {
            String cell1 = orderedit.getValueAt(rowEdit+1, 0).toString();
            double dubPrice = Double.parseDouble(cell1.substring(1));
            dubPrice += (dubPrice / (intQuantity -= posneg) * posneg);
            // Retrieves the unit price, and changes the new total accordingly
            String data[] = {"$"+String.format("%.2f", dubPrice), "x"+(intQuantity += posneg)};
            DefaultTableModel model = (DefaultTableModel) orderedit.getModel();
            model.removeRow(rowEdit+1);
            model.insertRow(rowEdit+1, data);
            // Replaces the previous data of that same item
            orderedit.setRowSelectionInterval(rowEdit,rowEdit+1);
            // If quantity still greater than 1 after adjustment, re-adjust item total
        }
    }
    
    // Shows the user an order number and their total
    private void orderComplete() {
        if (items.getRowCount() > 0) {
            categ.setVisible(false);
            foods.setVisible(false);
            edits.setVisible(false);
            more.setVisible(false);
            cancelp.setVisible(false);
            order.setVisible(true);
            number.setVisible(true);
            titles.setText("Thank you for ordering! :)");
            finaltotal.setText("Your total is "+ftotal_val.getText());
            // Displays the order number and the customer's final total for payment
        
            ordernum.setText(String.valueOf(++orderNumber));
            if (orderNumber >= 99) {
                orderNumber = 1;
                // If order numbers surpasses double digits, reset back to one
            }
        }
    }
    
    // Allows the user to edit their order
    private void orderEdit() {
        order.setVisible(true);
        more.setVisible(false);
        cancelp.setVisible(false);
        editsorder.setVisible(true);
        titles.setText("Edit Your Order");
        rowEdit = 0;
        orderedit.setRowSelectionInterval(0,1);
        // Automatically select the first item
    }
    
    private void timerAFK() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                order.setVisible(false);
                cancelp.setVisible(false);
                timer.setVisible(true);
            }
        };
        time = new Timer();
        time.schedule(timerTask, 5000);
    }
    
    private void timerReset() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

            }
        };
        time.cancel();
        time = new Timer();
        time.schedule(timerTask, 0010);
    }
    
    // Reset all food panels to it's original state
    private void refreshFood() {     
        l11.setText("");
        l12.setText("");
        l21.setText("");
        l22.setText("");
        l31.setText("");
        l32.setText("");
        l41.setText("");
        l42.setText("");
        l51.setText("");
        l52.setText("");
        l61.setText("");
        l62.setText("");
        l71.setText("");
        l72.setText("");
        l81.setText("");
        l82.setText("");
        l91.setText("");
        l92.setText("");
        l101.setText("");
        l102.setText("");
        l111.setText("");
        l112.setText("");
        l121.setText("");
        l122.setText("");
        l131.setText("");
        l132.setText("");
        l141.setText("");
        l142.setText("");
        l151.setText("");
        l152.setText("");
        l161.setText("");
        l162.setText("");
        
        p1.setBackground(reddish);
        p2.setBackground(reddish);
        p3.setBackground(reddish);
        p4.setBackground(reddish);
        p5.setBackground(reddish);
        p6.setBackground(reddish);
        p7.setBackground(reddish);
        p8.setBackground(reddish);
        p9.setBackground(reddish);
        p10.setBackground(reddish);
        p11.setBackground(reddish);
        p12.setBackground(reddish);
        p13.setBackground(reddish);
        p14.setBackground(reddish);
        p15.setBackground(reddish);
        p16.setBackground(reddish);
    }
    
    // Resets non-irreg size panels back to its original state
    private void refreshSize() {
        if (pastLunch == true) {
            even3.setBackground(greyish);
            odd2.setBackground(greyish);
        } else {
            even3.setBackground(reddish);
            odd2.setBackground(reddish);
        }
        even4.setBackground(reddish);
        odd3.setBackground(reddish);
        
        evens3.setText("");
        evens4.setText("");
        odds2.setText("");
        odds3.setText("");
        
        evenp3.setText("");
        evenp4.setText("");
        oddp2.setText("");
        oddp3.setText("");
    }
    
    // Refreshes the selection borders and resets quantity/item total
    private void refreshSelected() {
        val.setText("1");
        sizePrice = 0.00;
        itemtotal.setText("$0.00");
        even1.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even3.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        even4.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        odd1.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        odd2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        odd3.setBorder(BorderFactory.createLineBorder(Color.black, 0));
        confirm.setBackground(greyish);
    }
    
    // Resets the bag total to $0.00
    private void refreshSidebar() {
        DefaultTableModel dtm = (DefaultTableModel) items.getModel();
        dtm.setRowCount(0);
        subtotal_val.setText("$0.00");
        tax_val.setText("$0.00");
        ftotal_val.setText("$0.00");
    }
    
    // Initializes the food items
    private void initFood(String name) {
        refreshFood();
        categ.setVisible(false);
        foods.setVisible(true);
        titles.setText(name);
        backVar = titles.getText();
    }
    
    // Return to home screen after 30 sec AFK (still need time?)
    // Edit rice option, spice, and vegetables
    // SM: Auto select WR. Edits only include FR
    // LG: Auto select WR. Edits include both FR/Lo
    // Lunch: Auto select FR. Edits include both FR/Lo
    // Combo: Auto select FR. Edits include both FR/Lo. Egg Roll option
    // Statistics of # of times item ordered
    // Put prices of each food in database
    // Remove useless panels/labels
    
    private void initEdit(JLabel one, JLabel two) {
        if (!"".equals(one.getText())) {
            // Ensures the panel selected is an actual item
            confirm.setBackground(greyish);
            irreg = false;
            foods.setVisible(false);
            edits.setVisible(true);
            backVar2 = backVar;
            backVar = one.getText()+" "+two.getText();
            titles.setText(one.getText()+" "+two.getText());
            // Sets the title of the page to be the item name
            if (("House Special".equals(one.getText()) || "Seafood".equals(one.getText())) && "Soup".equals(two.getText())) {
                // If it's either 'House Special Soup' or 'Seafood Soup' (1 size only)
                odd.setVisible(true);
                even.setVisible(false);
                odd2.setBackground(whitish);
                odd3.setBackground(whitish);
                odds1.setText("Regular");
                size = odds1.getText();
                // Showcase the irregular item page that only has one size
                if ("House Special".equals(one.getText())) {
                    oddp1.setText("$"+String.format("%.2f", housesoup));
                } else {
                    oddp1.setText("$"+String.format("%.2f", seafoodsoup));
                }
                // Sets the prices of each item accordingly
                odd1.setBorder(BorderFactory.createLineBorder(Color.black, 4));
                itemtotal.setText(oddp1.getText());
                sizePrice = Double.parseDouble(oddp1.getText().substring(1));
                confirm.setBackground(reddish);
                irreg = true;
                // Since it only has one size, automatically select the panel and adjust item price
            } else if ("Fried Rice".equals(two.getText()) || two.getText().contains("Soup") || "White".equals(one.getText())) {
                // If the item is rice or soup that has 2 sizes (2 sizes only)
                even.setVisible(true);
                odd.setVisible(false);
                even3.setBackground(whitish);
                even4.setBackground(whitish);
                evens1.setText("Small");
                evens2.setText("Large");
                if ("White".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smwr_spring));
                    evenp2.setText("$"+String.format("%.2f", lgwr));
                } else if ("Plain".equals(one.getText()) || "Regular".equals(one.getText()) || "Vegetable".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_1));
                    evenp2.setText("$"+String.format("%.2f", lgfr_1));
                } else if ("Pork".equals(one.getText()) || "Chicken".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_2));
                    evenp2.setText("$"+String.format("%.2f", lgfr_2));
                } else if ("Beef".equals(one.getText()) || "Shrimp".equals(one.getText()) || "House Special".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_3));
                    evenp2.setText("$"+String.format("%.2f", lgfr_3));
                } else if ("Hot &".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smsoup_hs));
                    evenp2.setText("$"+String.format("%.2f", lgsoup_hs));
                } else if ("Egg Drop".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smsoup_ed));
                    evenp2.setText("$"+String.format("%.2f", lgsoup_ed));
                } else {
                    evenp1.setText("$"+String.format("%.2f", smsoup));
                    evenp2.setText("$"+String.format("%.2f", lgsoup));
                }
                irreg = true;
                // Also irregular size page since bottom two panels are unnecessary
            } else if ("Egg Foo Young".equals(two.getText()) || "Pepper".equals(one.getText()) || "Mongolian".equals(one.getText())) {
                // If the item is an 'Egg Foo Young' category, 'Pepper Chicken,' or 'Mongolian Beef' (2 sizes only)
                even.setVisible(true);
                odd.setVisible(false);
                even3.setBackground(whitish);
                even4.setBackground(whitish);
                evens1.setText("Large");
                evens2.setText("Combo");
                if ("Egg Foo Young".equals(two.getText())) {
                    if ("Vegetable".equals(one.getText()) || "Pork".equals(one.getText()) || "Chicken".equals(one.getText())) {
                        evenp1.setText("$"+String.format("%.2f", eggfoo_1));
                        evenp2.setText("$"+String.format("%.2f", combo_1));
                    } else if ("Beef".equals(one.getText()) || "Shrimp".equals(one.getText())) {
                        evenp1.setText("$"+String.format("%.2f", eggfoo_2));
                        evenp2.setText("$"+String.format("%.2f", combo_2));
                    }
                } else if ("Pepper".equals(one.getText()) || "Mongolian".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", sahc_1));
                    evenp2.setText("$"+String.format("%.2f", combo_2));
                }
                irreg = true;
                // Also irregular size page since bottom two panels are unnecessary
            } else if (("Sweet &".equals(one.getText()) || "Coral".equals(one.getText())) && (!two.getText().contains("Sauce"))) {
                // If the item is a 'Sweet & Sour' item or 'Coral' item, but not a sauce (3 sizes)
                odd.setVisible(true);
                even.setVisible(false);
                odds1.setText("Large");
                odds2.setText("Lunch");
                odds3.setText("Combo");
                if ("Sweet &".equals(one.getText())) {
                    oddp2.setText("$"+String.format("%.2f", lunch_1));
                    oddp3.setText("$"+String.format("%.2f", combo_1));
                    if ("Sour Shrimp".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", lgbs));
                    } else {
                        oddp1.setText("$"+String.format("%.2f", lgcp));
                    }
                } else if ("Coral".equals(one.getText())) {
                    oddp2.setText("$"+String.format("%.2f", lunch_2));
                    if ("Shrimp".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", sahc_5));
                        oddp3.setText("$"+String.format("%.2f", combo_2));
                    } else {
                        oddp1.setText("$"+String.format("%.2f", sahc_1));
                        oddp3.setText("$"+String.format("%.2f", combo_1));
                    }
                }
            } else if ("Crispy".equals(one.getText()) || "Hunan".equals(one.getText()) || "Crab & Shrimp".equals(one.getText())) {
                // If the item is a 'Crispy,' 'Hunan,' or 'Crab & Shrimp' item (3 sizes)
                odd.setVisible(true);
                even.setVisible(false);
                odds1.setText("Large");
                odds2.setText("Lunch");
                odds3.setText("Combo");
                if ("Crab & Shrimp".equals(one.getText())) {
                    oddp1.setText("$"+String.format("%.2f", lgbs));
                    oddp2.setText("$"+String.format("%.2f", lunch_1));
                    oddp3.setText("$"+String.format("%.2f", combo_1));
                } else {
                    oddp1.setText("$"+String.format("%.2f", sahc_1));
                    oddp2.setText("$"+String.format("%.2f", lunch_2));
                    oddp3.setText("$"+String.format("%.2f", combo_2));
                }
            } else if ("General Tso's".equals(one.getText()) || "Sesame".equals(one.getText()) || "Orange".equals(one.getText())) {
                // If the item is a 'General Tso's,' 'Sesame,' or 'Orange' item (3 sizes)
                odd.setVisible(true);
                even.setVisible(false);
                odds1.setText("Large");
                odds2.setText("Lunch");
                odds3.setText("Combo");
                oddp2.setText("$"+String.format("%.2f", lunch_2));
                oddp3.setText("$"+String.format("%.2f", combo_2));
                if ("Beef".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", sahc_2));
                } else {
                oddp1.setText("$"+String.format("%.2f", sahc_1));
                }           
            } else if ("Lo Mein".equals(two.getText()) || "Mai Fun".equals(two.getText()) || "Chow Mein".equals(two.getText())) {
                // If the item is a 'Lo Mein,' 'Mai Fun,' or 'Chow Mein' item (4 sizes)
                even.setVisible(true);
                odd.setVisible(false);
                evens1.setText("Small");
                evens2.setText("Large");
                evens3.setText("Lunch");
                evens4.setText("Combo");
                evenp3.setText("$"+String.format("%.2f", lunch_1));
                evenp4.setText("$"+String.format("%.2f", combo_1));
                if ("Plain".equals(one.getText()) || "Regular".equals(one.getText()) || "Vegetable".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_1));
                    evenp2.setText("$"+String.format("%.2f", lgfr_1));
                } else if ("Pork".equals(one.getText()) || "Chicken".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_2));
                    evenp2.setText("$"+String.format("%.2f", lgfr_2));
                } else if ("Beef".equals(one.getText()) || "Shrimp".equals(one.getText()) || "House Special".equals(one.getText())) {
                    evenp1.setText("$"+String.format("%.2f", smfr_3));
                    evenp2.setText("$"+String.format("%.2f", lgfr_3));
                }
            } else if ("Chicken w/".equals(one.getText()) || "Pork w/".equals(one.getText()) || "Steam Chicken".equals(one.getText()) || "Diced Chicken".equals(one.getText())) {
                // If the item is a chicken or pork item (4 sizes)
                even.setVisible(true);
                odd.setVisible(false);
                evens1.setText("Small");
                evens2.setText("Large");
                evens3.setText("Lunch");
                evens4.setText("Combo");
                evenp1.setText("$"+String.format("%.2f", smcp));
                evenp2.setText("$"+String.format("%.2f", lgcp));
                evenp3.setText("$"+String.format("%.2f", lunch_1));
                evenp4.setText("$"+String.format("%.2f", combo_1));
            } else if ("Beef w/".equals(one.getText()) || "Shrimp w/".equals(one.getText()) || "Steam Shrimp".equals(one.getText())) {
                // If the item is a beef or shrimp item (4 sizes)
                even.setVisible(true);
                odd.setVisible(false);
                evens1.setText("Small");
                evens2.setText("Large");
                evens3.setText("Lunch");
                evens4.setText("Combo");
                evenp1.setText("$"+String.format("%.2f", smbs));
                evenp2.setText("$"+String.format("%.2f", lgbs));
                evenp3.setText("$"+String.format("%.2f", lunch_1));
                evenp4.setText("$"+String.format("%.2f", combo_1));
            }  else if ("w/ Onions".equals(two.getText()) || "Kum Po".equals(one.getText()) || "Boneless".equals(one.getText()) || "Moo Goo".equals(one.getText())) {
                // If the item is 'w/ Onions,' 'Kum Po,' 'Boneless,' or 'Moo Goo' item (4 sizes)
                even.setVisible(true);
                odd.setVisible(false);
                evens1.setText("Small");
                evens2.setText("Large");
                evens3.setText("Lunch");
                evens4.setText("Combo");
                if ("Boneless".equals(one.getText())){
                    evenp1.setText("$"+String.format("%.2f", lunch_1));
                    evenp2.setText("$"+String.format("%.2f", sahc_1));
                    evenp3.setText("$"+String.format("%.2f", lunch_2));
                    evenp4.setText("$"+String.format("%.2f", combo_2));
                } else {
                    evenp3.setText("$"+String.format("%.2f", lunch_1));
                    evenp4.setText("$"+String.format("%.2f", combo_1));
                    if ("Curry Chicken".equals(one.getText()) || "Chicken".equals(two.getText()) || "Moo Goo".equals(one.getText())) {
                        evenp1.setText("$"+String.format("%.2f", smcp));
                        evenp2.setText("$"+String.format("%.2f", lgcp));
                    } else {
                        evenp1.setText("$"+String.format("%.2f", smbs));
                        evenp2.setText("$"+String.format("%.2f", lgbs));
                    }
                }
            } else {
                // Else all others only have one size
                odd.setVisible(true);
                even.setVisible(false);
                odd2.setBackground(whitish);
                odd3.setBackground(whitish);
                odds1.setText("Regular");
                size = odds1.getText();
                if (two.getText().contains("Roll") == true) {
                    if ("Spring".equals(one.getText())) {
                        oddp1.setText("$"+String.format("%.2f", smwr_spring));
                    } else if ("Pork Egg".equals(one.getText())) {
                        oddp1.setText("$"+String.format("%.2f", porkroll));
                    } else if ("Shrimp Egg".equals(one.getText())) {
                        oddp1.setText("$"+String.format("%.2f", shrimproll));
                    }
                } else if ("Teriyaki".equals(one.getText())) {
                    if ("Chicken (5)".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", teri_c));
                    } else if ("Beef (5)".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", teri_b));
                    }
                } else if ("Wontons (8)".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", wonton));
                } else if ("Dumplings (8)".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", dumpling));
                } else if ("Scallops (8)".equals(two.getText()) || "Nuggets (8)".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", scalnug));
                } else if ("Onions (12)".equals(two.getText()) || "Sticks (12)".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", onionapple));
                } else if ("Fried".equals(one.getText()) && "Shrimp".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", friedshrimp));
                } else if ("Oil".equals(two.getText()) || "Noodles".equals(two.getText()) || "Dumpling".equals(one.getText())) {
                    oddp1.setText("$"+String.format("%.2f", side_1));
                } else if ("Sour Sauce".equals(two.getText()) || "Sauce".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", side_2));
                } else if ("Moo Shu".equals(one.getText())) {
                    if ("Shrimp".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", lgbs));
                    } else if ("Vegetable".equals(two.getText())) {
                        oddp1.setText("$"+String.format("%.2f", vegs));
                    } else {
                        oddp1.setText("$"+String.format("%.2f", lgcp));
                    }
                } else if ("Fried Noodles".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", sahc_4));
                } else if ("Delight".equals(two.getText()) || "Happy".equals(one.getText())) {
                    if ("Hunan Triple".equals(one.getText())) {
                        oddp1.setText("$"+String.format("%.2f", sahc_2));
                    } else if ("Buddhist".equals(one.getText())) {
                        oddp1.setText("$"+String.format("%.2f", vegs));
                    } else {
                        oddp1.setText("$"+String.format("%.2f", sahc_4));
                    }
                } else if ("Four".equals(one.getText())) {
                    oddp1.setText("$"+String.format("%.2f", sahc_3));
                } else if ("Szechuan".equals(one.getText())) {
                    oddp1.setText("$"+String.format("%.2f", sahc_1));
                } else if ("Sliced Pork".equals(two.getText())) {
                    oddp1.setText("$"+String.format("%.2f", lgcp));
                } else {
                    oddp1.setText("$"+String.format("%.2f", vegs));
                }
                odd1.setBorder(BorderFactory.createLineBorder(Color.black, 4));
                itemtotal.setText(oddp1.getText());
                sizePrice = Double.parseDouble(oddp1.getText().substring(1));
                confirm.setBackground(reddish);
                irreg = true;
                // Ireggular sizes since it only has one size
            } 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGarden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewGarden().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel addmore;
    private javax.swing.JPanel addmore2;
    private javax.swing.JPanel amount;
    private javax.swing.JLabel app;
    private javax.swing.JPanel apps;
    private javax.swing.JPanel back;
    private javax.swing.JPanel banner;
    private javax.swing.JPanel banner1;
    private javax.swing.JPanel banner2;
    private javax.swing.JPanel banner3;
    private javax.swing.JPanel banner5;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel beef;
    private javax.swing.JLabel beefs;
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel cancelp;
    private javax.swing.JPanel categ;
    private javax.swing.JPanel chow;
    private javax.swing.JLabel chowmein;
    private javax.swing.JLabel chowmein1;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel click;
    private javax.swing.JPanel complete;
    private javax.swing.JPanel complete2;
    private javax.swing.JPanel complete3;
    private javax.swing.JPanel complete4;
    private javax.swing.JPanel complete5;
    private javax.swing.JPanel confirm;
    private javax.swing.JLabel countdown;
    private javax.swing.JPanel defcancel;
    private javax.swing.JPanel editorder;
    private javax.swing.JPanel editorder2;
    private javax.swing.JPanel edits;
    private javax.swing.JPanel editsorder;
    private javax.swing.JPanel egg;
    private javax.swing.JPanel even;
    private javax.swing.JPanel even1;
    private javax.swing.JPanel even2;
    private javax.swing.JPanel even3;
    private javax.swing.JPanel even4;
    private javax.swing.JLabel evenp1;
    private javax.swing.JLabel evenp2;
    private javax.swing.JLabel evenp3;
    private javax.swing.JLabel evenp4;
    private javax.swing.JLabel evens1;
    private javax.swing.JLabel evens2;
    private javax.swing.JLabel evens3;
    private javax.swing.JLabel evens4;
    private javax.swing.JLabel finaltotal;
    private javax.swing.JLabel foo;
    private javax.swing.JPanel foods;
    private javax.swing.JPanel fr;
    private javax.swing.JLabel friedrice;
    private javax.swing.JLabel ftotal;
    private javax.swing.JLabel ftotal1;
    private javax.swing.JLabel ftotal2;
    private javax.swing.JLabel ftotal_val;
    private javax.swing.JLabel ftotal_val1;
    private javax.swing.JLabel ftotal_val2;
    private javax.swing.JPanel here;
    private javax.swing.JPanel home;
    private javax.swing.JLabel hun;
    private javax.swing.JTable items;
    private javax.swing.JScrollPane itemscroll;
    private javax.swing.JLabel itemtotal;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l101;
    private javax.swing.JLabel l102;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l111;
    private javax.swing.JLabel l112;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l121;
    private javax.swing.JLabel l122;
    private javax.swing.JLabel l131;
    private javax.swing.JLabel l132;
    private javax.swing.JLabel l141;
    private javax.swing.JLabel l142;
    private javax.swing.JLabel l151;
    private javax.swing.JLabel l152;
    private javax.swing.JLabel l161;
    private javax.swing.JLabel l162;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l41;
    private javax.swing.JLabel l42;
    private javax.swing.JLabel l51;
    private javax.swing.JLabel l52;
    private javax.swing.JLabel l61;
    private javax.swing.JLabel l62;
    private javax.swing.JLabel l71;
    private javax.swing.JLabel l72;
    private javax.swing.JLabel l73;
    private javax.swing.JLabel l81;
    private javax.swing.JLabel l82;
    private javax.swing.JLabel l83;
    private javax.swing.JLabel l91;
    private javax.swing.JLabel l92;
    private javax.swing.JPanel lo;
    private javax.swing.JLabel lomein;
    private javax.swing.JPanel mai;
    private javax.swing.JLabel maifun;
    private javax.swing.JPanel main;
    private javax.swing.JPanel minus;
    private javax.swing.JPanel more;
    private javax.swing.JPanel number;
    private javax.swing.JPanel odd;
    private javax.swing.JPanel odd1;
    private javax.swing.JPanel odd2;
    private javax.swing.JPanel odd3;
    private javax.swing.JLabel oddp1;
    private javax.swing.JLabel oddp2;
    private javax.swing.JLabel oddp3;
    private javax.swing.JLabel odds1;
    private javax.swing.JLabel odds2;
    private javax.swing.JLabel odds3;
    private javax.swing.JPanel order;
    private javax.swing.JPanel orderadd;
    private javax.swing.JPanel ordercard;
    private javax.swing.JPanel orderdelete;
    private javax.swing.JPanel orderdown;
    private javax.swing.JTable orderedit;
    private javax.swing.JPanel orderminus;
    private javax.swing.JLabel ordernum;
    private javax.swing.JPanel ordersave;
    private javax.swing.JPanel orderup;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p15;
    private javax.swing.JPanel p16;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JLabel pic;
    private javax.swing.JPanel pork;
    private javax.swing.JLabel porks;
    private javax.swing.JPanel poul;
    private javax.swing.JLabel poultry;
    private javax.swing.JLabel poultry1;
    private javax.swing.JLabel poultry2;
    private javax.swing.JLabel poultry3;
    private javax.swing.JLabel poultry4;
    private javax.swing.JLabel poultry5;
    private javax.swing.JLabel poultry6;
    private javax.swing.JLabel poultry7;
    private javax.swing.JLabel poultry8;
    private javax.swing.JPanel price;
    private javax.swing.JPanel price2;
    private javax.swing.JPanel sea;
    private javax.swing.JLabel shrimp;
    private javax.swing.JPanel side;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sides;
    private javax.swing.JPanel sizes;
    private javax.swing.JPanel soup;
    private javax.swing.JLabel soups;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel subtotal1;
    private javax.swing.JLabel subtotal2;
    private javax.swing.JLabel subtotal_val;
    private javax.swing.JLabel subtotal_val1;
    private javax.swing.JLabel subtotal_val2;
    private javax.swing.JPanel szech;
    private javax.swing.JLabel szechs;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel tax1;
    private javax.swing.JLabel tax2;
    private javax.swing.JLabel tax_val;
    private javax.swing.JLabel tax_val1;
    private javax.swing.JLabel tax_val2;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel titles;
    private javax.swing.JPanel total;
    private javax.swing.JPanel total1;
    private javax.swing.JPanel total2;
    private javax.swing.JLabel touch;
    private javax.swing.JLabel val;
    private javax.swing.JPanel value;
    private javax.swing.JPanel veg;
    private javax.swing.JLabel vege;
    // End of variables declaration//GEN-END:variables
}
