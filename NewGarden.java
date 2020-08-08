/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewGarden;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import net.miginfocom.swing.MigLayout;
import org.jsoup.Jsoup;

/**
 *
 * @author johnnyjiang
 */
public class NewGarden {
    
    private boolean riceCheck = false;
    private boolean pastLunch = false;
    private String prevTitle = "";
    private String prevCard = "";
    private String size_name = "";
    private int rowEdit = 0;
    private int order_number = 0;
    private double size_price = 0.0;
    private final double tax = 1.06;
    private final Font verdana = new Font("Verdana", Font.PLAIN, 28);
    private final Color reddish = new Color(204, 0, 0);
    private final Color greyish = new Color(153, 153, 153);
    LineBorder liner = new LineBorder(Color.BLACK, 2);
    Calendar cal = Calendar.getInstance();

    JFrame frame = new JFrame();
    JPanel main = new JPanel(new CardLayout());
    JPanel home_page = new JPanel(new MigLayout());
    ImageIcon food_img = new ImageIcon(getClass().getResource("food.jpg"));
    JLabel home_image = new JLabel();
    JLabel home_title = new JLabel("NEW GARDEN");
    JLabel home_touch = new JLabel("TOUCH TO BEGIN");
    JPanel home_backdrop = new JPanel(new MigLayout());
    JPanel home_banner = new JPanel(new MigLayout());
    JPanel home_bar = new JPanel(new MigLayout());

    JPanel click = new JPanel(new CardLayout());
    JLabel title = new JLabel("Categories");
    JLabel sidebar_title = new JLabel("NEW GARDEN");
    JLabel back_text = new JLabel("Back");
    JLabel cancel_text = new JLabel("Cancel");
    JPanel order_page = new JPanel(new MigLayout("", "[]", "[]"));
    JPanel order_banner = new JPanel(new MigLayout());
    JPanel order_sidebar = new JPanel(new MigLayout("", "[]", "[]5[]10[]"));
    JPanel order_categ = new JPanel(new MigLayout("fill", "[]20[]20[]20[]", "[]20[]20[]20[]0"));
    JPanel back_button = new JPanel(new MigLayout());
    JPanel cancel_button = new JPanel(new MigLayout());
    JPanel whitebar_section = new JPanel(new MigLayout("insets 0"));
    JPanel price_section = new JPanel(new MigLayout("insets 5", "[][]", "[][][]"));
    JLabel price_left = new JLabel("<html>Subtotal<br>Tax<br>Final Total</html>");
    JLabel price_sub = new JLabel("$0.00");
    JLabel price_tax = new JLabel("$0.00");
    JLabel price_ftot = new JLabel("$0.00");
    JTable order_list = new JTable();
    JScrollPane order_scroll = new JScrollPane(order_list);
    JTextPane[] item_names = new JTextPane[16];
    SimpleAttributeSet set = new SimpleAttributeSet();

    JPanel custom_page = new JPanel(new MigLayout("fill", "[][]", "[][][][]"));
    JPanel custom_quantity = new JPanel(new MigLayout("fill"));
    JPanel custom_add = new JPanel(new MigLayout());
    JPanel custom_sub = new JPanel(new MigLayout());
    JPanel custom_amt = new JPanel(new MigLayout());
    JPanel custom_clear = new JPanel(new MigLayout());
    JPanel custom_sizes = new JPanel(new CardLayout());
    JPanel custom_even = new JPanel(new MigLayout("", "[]25[]", "[]25[]"));
    JPanel custom_odd = new JPanel(new MigLayout("", "[]25[]", "[]25[]"));
    JPanel even1_panel = new JPanel(new MigLayout());
    JPanel even2_panel = new JPanel(new MigLayout());
    JPanel even3_panel = new JPanel(new MigLayout());
    JPanel even4_panel = new JPanel(new MigLayout());
    JPanel odd1_panel = new JPanel(new MigLayout());
    JPanel odd2_panel = new JPanel(new MigLayout());
    JPanel odd3_panel = new JPanel(new MigLayout());
    JPanel custom_confirm = new JPanel(new MigLayout("", "[]", "[][]"));
    JLabel confirm_text = new JLabel("Add To Order");
    JLabel confirm_price = new JLabel("$0.00");
    JLabel clear_text = new JLabel("Clear Selected");
    JLabel amt_plus = new JLabel("+");
    JLabel amt_minus = new JLabel("-");
    JLabel amt_value = new JLabel("1");
    JLabel even1_label = new JLabel();
    JLabel even2_label = new JLabel();
    JLabel even3_label = new JLabel();
    JLabel even4_label = new JLabel();
    JLabel odd1_label = new JLabel();
    JLabel odd2_label = new JLabel();
    JLabel odd3_label = new JLabel();
    JPanel custom_rice = new JPanel(new MigLayout());
    JLabel rice_text = new JLabel("Edit Rice Option");
    JLabel rice_name = new JLabel("None");
    //JLabel eggroll_text = new JLabel("w/ Pork Egg Roll");

    JPanel continue_page = new JPanel(new MigLayout("fill, insets 0", "[]", "[][0][]"));
    JPanel continue_comp = new JPanel(new MigLayout());
    JPanel continue_cont = new JPanel(new MigLayout());
    JPanel continue_edit = new JPanel(new MigLayout());
    JLabel con_comp_text = new JLabel("Complete Order");
    JLabel con_cont_text = new JLabel("Continue Ordering");
    JLabel con_edit_text = new JLabel("Edit Order");
    
    JPanel complete_page = new JPanel(new MigLayout("fill", "[]", "[][]"));
    JPanel complete_card = new JPanel(new MigLayout("insets 0", "[]", "[][]"));
    JLabel card_text = new JLabel("Order Number");
    JLabel card_number = new JLabel();
    JLabel complete_total = new JLabel();
    
    JPanel cancel_page = new JPanel(new MigLayout("fill", "[]50[]", "[]50[]"));
    JPanel cancel_bann = new JPanel(new MigLayout());
    JPanel cancel_canc = new JPanel(new MigLayout());
    JPanel cancel_edit = new JPanel(new MigLayout());
    JPanel cancel_comp = new JPanel(new MigLayout());
    JPanel cancel_cont = new JPanel(new MigLayout());
    JLabel cbann_text = new JLabel("Are you sure?");
    JLabel canc_text = new JLabel("<html>Cancel<br>Order</html>");
    JLabel edit_text = new JLabel("<html>  Edit<br>Order</html>");
    JLabel comp_text = new JLabel("<html>Complete<br>Order</html>");
    JLabel cont_text = new JLabel("<html>Continue<br>Order</html>");
    
    JPanel edit_page = new JPanel(new MigLayout("fill", "[][][][]", "[][][]20"));
    JPanel edit_bann = new JPanel(new MigLayout());
    JPanel edit_up = new JPanel(new MigLayout());
    JPanel edit_down = new JPanel(new MigLayout());
    JPanel edit_add = new JPanel(new MigLayout());
    JPanel edit_sub = new JPanel(new MigLayout());
    JPanel edit_undo = new JPanel(new MigLayout());
    JPanel edit_del = new JPanel(new MigLayout());
    JPanel edit_save = new JPanel(new MigLayout());
    JLabel ebann_text = new JLabel("Edit Order");
    JLabel up_text = new JLabel("Up");
    JLabel down_text = new JLabel("Down");
    JLabel add_text = new JLabel("+");
    JLabel sub_text = new JLabel("-");
    JLabel undo_text = new JLabel ("Undo");
    JLabel del_text = new JLabel("Delete");
    JLabel save_text = new JLabel("Save");
    JLabel quan_text = new JLabel("Edit Quantity");
    JTable edit_list = new JTable();
    JScrollPane edit_scroll = new JScrollPane(edit_list);
    JPanel ewhitebar_section = new JPanel(new MigLayout("insets 0"));
    JPanel eprice_section = new JPanel(new MigLayout("insets 5", "[][]", "[][][]"));
    JLabel eprice_left = new JLabel("<html>Subtotal<br>Tax<br>Final Total</html>");
    JLabel eprice_sub = new JLabel("$0.00");
    JLabel eprice_tax = new JLabel("$0.00");
    JLabel eprice_ftot = new JLabel("$0.00");
    JTable undo_list = new JTable();
    JScrollPane undo_scroll = new JScrollPane(undo_list);
        
    public NewGarden() {
        String[] columns = {"",""};
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        DefaultTableModel model = new DefaultTableModel(0, columns.length);
        model.setColumnIdentifiers(columns);
        order_list.setModel(model);
        order_list.setFont(new Font("Verdana", Font.PLAIN, 20));
        order_list.setRowHeight(30);
        order_list.getColumnModel().getColumn(1).setPreferredWidth(300);
        order_list.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        order_list.setEnabled(false);
        order_scroll.setBorder(createEmptyBorder());
        
        DefaultTableModel model2 = new DefaultTableModel(0, columns.length);
        model2.setColumnIdentifiers(columns);
        edit_list.setModel(model2);
        edit_list.setFont(new Font("Verdana", Font.BOLD, 30));
        edit_list.setRowHeight(40);
        edit_list.setEnabled(false);
        edit_scroll.setBorder(createEmptyBorder());
        
        DefaultTableModel model3 = new DefaultTableModel(0, columns.length);
        model3.setColumnIdentifiers(columns);
        undo_list.setModel(model3);
        
        home_title.setFont(new Font("Verdana", Font.BOLD, 64));
        home_touch.setFont(new Font("Verdana", Font.PLAIN, 48));
        home_image.setIcon(food_img);
        home_banner.setBackground(reddish);
        home_bar.setBackground(reddish);
        home_backdrop.setBackground(Color.black);
        home_banner.add(home_title, "push, align center");
        home_bar.add(home_touch, "push, align center");
        home_backdrop.add(home_image, "push, align center");
        home_page.add(home_banner, "north");
        home_page.add(home_bar, "south");
        home_page.add(home_backdrop, "w 100%, h 100%");
        
        StyleConstants.setAlignment(set, StyleConstants.ALIGN_CENTER);
        StyleConstants.setFontSize(set, 28);
        StyleConstants.setFontFamily(set, "verdana");
        for (int i=0; i<item_names.length; i++) {
            item_names[i] = new JTextPane();
            item_names[i].setEditable(false);
            item_names[i].setBackground(reddish);
            item_names[i].setMargin(new Insets(4, 0, 0, 0));
            item_names[i].setParagraphAttributes(set, true);
            if ((i+1) % 4 == 0) {
                order_categ.add(item_names[i], "wrap, w 250, h 200");
            } else {
                order_categ.add(item_names[i], "w 250, h 200");
            }
            item_names[i].setVisible(false);
        }
        
        title.setFont(new Font("Verdana", Font.BOLD, 48));
        sidebar_title.setFont(new Font("Verdana", Font.BOLD, 48));
        back_text.setFont(verdana); cancel_text.setFont(verdana);
        price_left.setFont(new Font("Verdana", Font.PLAIN, 20));
        price_sub.setFont(new Font("Verdana", Font.PLAIN, 20));
        price_tax.setFont(new Font("Verdana", Font.PLAIN, 20));
        price_ftot.setFont(new Font("Verdana", Font.PLAIN, 20));
        whitebar_section.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        back_button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        order_banner.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        price_section.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        back_button.setBackground(reddish);
        cancel_button.setBackground(reddish);
        order_banner.setBackground(reddish);
        order_sidebar.setBackground(reddish);
        price_section.setBackground(Color.WHITE);
        back_button.add(back_text, "push, align center");
        cancel_button.add(cancel_text, "push, align center");
        order_banner.add(title, "push, align center, gapbottom 10");
        price_section.add(price_left, "spany 3");
        price_section.add(price_sub, "wrap, push, align right");
        price_section.add(price_tax, "wrap, align right");
        price_section.add(price_ftot, "align right");
        whitebar_section.add(order_scroll, "h 500");
        whitebar_section.add(price_section, "south, h 45");
        order_sidebar.add(sidebar_title, "push, align center, wrap");
        order_sidebar.add(whitebar_section, "h 545, wrap");
        order_sidebar.add(back_button, "split 2, w 50%, h 100, gapbottom 5");
        order_sidebar.add(cancel_button, "w 50%, h 100, gapbottom 5");
        order_page.add(order_sidebar, "east, w 900");
        order_page.add(order_banner, "north, h 200, gapright 5");
        order_page.add(click, "w 100%, h 100%");
        
        //eggroll_text.setFont(new Font("Verdana", Font.PLAIN, 20));
        rice_text.setFont(new Font("Verdana", Font.PLAIN, 20));
        rice_name.setFont(new Font("Verdana", Font.PLAIN, 28));
        clear_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        confirm_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        confirm_price.setFont(new Font("Verdana", Font.PLAIN, 28));
        amt_plus.setFont(new Font("Verdana", Font.PLAIN, 64));
        amt_value.setFont(new Font("Verdana", Font.PLAIN, 64));
        amt_minus.setFont(new Font("Verdana", Font.PLAIN, 64));
        even1_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        even2_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        even3_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        even4_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        even1_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        odd1_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        odd2_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        odd3_label.setFont(new Font("Verdana", Font.PLAIN, 28));
        custom_quantity.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_confirm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_clear.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_add.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.BLACK));
        custom_sub.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        even1_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even2_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even3_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even4_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_rice.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_quantity.setBackground(Color.WHITE);
        custom_clear.setBackground(reddish);
        custom_confirm.setBackground(greyish);
        custom_amt.setBackground(Color.WHITE);
        custom_add.setBackground(reddish);
        custom_sub.setBackground(reddish);
        even1_panel.setBackground(reddish);
        even2_panel.setBackground(reddish);
        even3_panel.setBackground(reddish);
        even4_panel.setBackground(reddish);
        odd1_panel.setBackground(reddish);
        odd2_panel.setBackground(reddish);
        odd3_panel.setBackground(reddish);
        custom_rice.setBackground(greyish);
        custom_rice.add(rice_name, "push, align center");
        even1_panel.add(even1_label, "push, align center");
        even2_panel.add(even2_label, "push, align center");
        even3_panel.add(even3_label, "push, align center");
        even4_panel.add(even4_label, "push, align center");
        odd1_panel.add(odd1_label, "push, align center");
        odd2_panel.add(odd2_label, "push, align center");
        odd3_panel.add(odd3_label, "push, align center");
        custom_even.add(even1_panel, "w 200, h 150"); 
        custom_even.add(even2_panel, "wrap, w 200, h 150");
        custom_even.add(even3_panel, "w 200, h 150"); 
        custom_even.add(even4_panel, "w 200, h 150");
        custom_odd.add(odd1_panel, "span 2, wrap, w 200, h 150, align center");
        custom_odd.add(odd2_panel, "w 200, h 150");
        custom_odd.add(odd3_panel, "w 200, h 150");
        custom_sub.add(amt_minus, "push, align center");
        custom_amt.add(amt_value, "push, align center");
        custom_add.add(amt_plus, "push, align center");
        custom_quantity.add(custom_add, "east, w 130, h 100");
        custom_quantity.add(custom_amt, "center, w 130, h 100");
        custom_quantity.add(custom_sub, "west, w 130, h 100");
        custom_confirm.add(confirm_text, "align center, bottom, wrap");
        custom_confirm.add(confirm_price, "push, align center, top");
        custom_clear.add(clear_text, "push, align center");
        custom_page.add(custom_sizes, "spany 3, top, left");
        custom_page.add(custom_quantity, "wrap, center align, w 400, h 100");
        custom_page.add(custom_clear, "wrap, aligny top, gaptop 20, align center, w 300, h 75");
        custom_page.add(custom_rice, "wrap, aligny top, , gaptop 10, align center, w 300, h 75, id rice");
        custom_page.add(rice_text, "pos (rice.x) (rice.y - 30)");
        custom_page.add(custom_confirm, "span, center align, w 30%, h 100");
        
        con_comp_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        con_cont_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        con_edit_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        continue_comp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_cont.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_edit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_comp.setBackground(reddish);
        continue_cont.setBackground(reddish);
        continue_edit.setBackground(reddish);
        continue_comp.add(con_comp_text, "push, center align");
        continue_cont.add(con_cont_text, "push, center align");
        continue_edit.add(con_edit_text, "push, center align");
        continue_page.add(continue_comp, "wrap, w 100%, h 125, bottom");
        continue_page.add(continue_cont, "wrap, w 100%, h 125");
        continue_page.add(continue_edit, "w 100%, h 125, top");
        
        complete_card.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        card_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        card_number.setFont(new Font("Verdana", Font.PLAIN, 132));
        complete_total.setFont(new Font("Verdana", Font.PLAIN, 32));
        complete_card.setBackground(Color.WHITE);
        complete_card.add(card_text, "top, align center, wrap");
        complete_card.add(card_number, "push, align center, gapbottom 20");
        complete_page.add(complete_card, "push, align center, wrap, w 350, h 200, bottom");
        complete_page.add(complete_total, "push, align center, top");
        
        
        cbann_text.setFont(new Font("Verdana", Font.PLAIN, 64));
        canc_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        edit_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        comp_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        cont_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        cancel_bann.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_canc.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_edit.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_comp.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_cont.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_bann.setBackground(reddish);
        cancel_canc.setBackground(reddish);
        cancel_edit.setBackground(reddish);
        cancel_comp.setBackground(reddish);
        cancel_cont.setBackground(reddish);
        cancel_bann.add(cbann_text, "push, align center");
        cancel_canc.add(canc_text, "push, align center");
        cancel_edit.add(edit_text, "push, align center");
        cancel_comp.add(comp_text, "push, align center");
        cancel_cont.add(cont_text, "push, align center");
        cancel_page.add(cancel_bann, "north");
        cancel_page.add(cancel_canc, "w 300, h 200, bottom, right");
        cancel_page.add(cancel_edit, "w 300, h 200, bottom, left, wrap");
        cancel_page.add(cancel_comp, "w 300, h 200, top, right");
        cancel_page.add(cancel_cont, "w 300, h 200, top, left");
        
        quan_text.setFont(new Font("Verdana", Font.PLAIN, 20));
        eprice_left.setFont(new Font("Verdana", Font.PLAIN, 28));
        eprice_sub.setFont(new Font("Verdana", Font.PLAIN, 28));
        eprice_tax.setFont(new Font("Verdana", Font.PLAIN, 28));
        eprice_ftot.setFont(new Font("Verdana", Font.PLAIN, 28));
        ebann_text.setFont(new Font("Verdana", Font.PLAIN, 64));
        up_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        down_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        sub_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        add_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        undo_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        del_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        save_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        ewhitebar_section.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_bann.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_up.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_down.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_sub.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_add.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_undo.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_del.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        edit_save.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        eprice_section.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        edit_bann.setBackground(reddish);
        edit_up.setBackground(reddish);
        edit_down.setBackground(reddish);
        edit_sub.setBackground(reddish);
        edit_add.setBackground(reddish);
        edit_undo.setBackground(greyish);
        edit_del.setBackground(reddish);
        edit_save.setBackground(reddish);
        eprice_section.setBackground(Color.WHITE);
        eprice_section.add(eprice_left, "spany 3");
        eprice_section.add(eprice_sub, "wrap, push, align right");
        eprice_section.add(eprice_tax, "wrap, align right");
        eprice_section.add(eprice_ftot, "align right");
        ewhitebar_section.add(edit_scroll, "w 100%, h 80%");
        ewhitebar_section.add(eprice_section, "south, w 100%, h 20%");
        edit_bann.add(ebann_text, "push, align center");
        edit_up.add(up_text, "push, align center");
        edit_down.add(down_text, "push, align center");
        edit_sub.add(sub_text, "push, align center");
        edit_add.add(add_text, "push, align center");
        edit_undo.add(undo_text, "push, align center");
        edit_del.add(del_text, "push, align center");
        edit_save.add(save_text, "push, align center");
        edit_page.add(edit_bann, "north");
        edit_page.add(ewhitebar_section, "span 3 2, top, left, w 75%, h 60%, gaptop 30, gapleft 40");
        edit_page.add(edit_up, "wrap, bottom, align center, w 150, h 200, left, gaptop 60, gapleft 20");
        edit_page.add(edit_down, "wrap, top, align center, w 150, h 200, left, gapleft 20");
        edit_page.add(edit_sub, "right, w 200, h 100, top, gapleft 100, id sub");
        edit_page.add(edit_add, "left, w 200, h 100, top, gapbottom 40");
        edit_page.add(quan_text, "pos (sub.x2 - 70) (sub.y2 + 5)");
        edit_page.add(edit_undo, "w 200, h 100, top, split 2, align center");
        edit_page.add(edit_del, "w 200, h 100, top, align center");
        edit_page.add(edit_save, "w 200, h 100, top, left, gapright 60");
        
        home_page.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                cl.show(main, "order");
                prevCard = "home"; 
                initCategories();
                cal.setTime(new Date());
                int currentHour = cal.get(Calendar.HOUR_OF_DAY);
                pastLunch = (currentHour >= 15 && currentHour <= 23);
                // If it's after 3pm, then lunch sizes are over
            }
        });
        back_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                CardLayout cl2 = (CardLayout) click.getLayout();
                if ("cont".equals(prevCard)) {
                    cl.show(main, "home");
                    cl2.show(click, "categ");
                    refreshSidebar(); refreshSelected();
                } else if ("custom".equals(prevCard)) {
                    cl2.show(click, "custom");
                    prevCard = "food";
                    ArrayList<String> prevCateg = MenuAccess.getItemCateg(prevTitle);
                    ArrayList<MenuSource> itemArray = MenuAccess.getAllFromCateg(prevCateg.get(0));
                    initFoods(itemArray);
                    title.setText(prevTitle);
                } else if ("food".equals(prevCard)) {
                    cl2.show(click, "categ");
                    prevCard = "categ";
                    ArrayList<String> menuArray = MenuAccess.getItemCateg(title.getText());
                    title.setText(menuArray.get(0));
                } else if ("categ".equals(prevCard)) {
                    initCategories();
                    prevCard = "home";
                } else if (order_list.getRowCount() > 0) {
                    // show cancel page
                } else if ("home".equals(prevCard)) {
                    cl.show(main, "home");
                }
            }
        });
        cancel_button.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                CardLayout cl2 = (CardLayout) click.getLayout();
                if (("cont".equals(prevCard)) || (("home".equals(prevCard)) && (order_list.getRowCount() == 0))) {
                    cl.show(main, "home");
                    cl2.show(click, "categ");
                    refreshSidebar(); refreshSelected();
                } else {
                    if (order_list.getRowCount() == 0) {
                        cancel_edit.setBackground(greyish);
                        cancel_comp.setBackground(greyish);
                    } else {
                        cancel_edit.setBackground(reddish);
                        cancel_comp.setBackground(reddish);
                    }
                    cl.show(main, "cancel");
                }         
            }
        });
        custom_confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!"$0.00".equals(confirm_price.getText())) {
                    String topData[] = {size_name, title.getText()};
                    String botData[] = {confirm_price.getText(), "x"+amt_value.getText()};
                    DefaultTableModel model = (DefaultTableModel) order_list.getModel();
                    model.addRow(topData); model.addRow(botData);
                    // Adds the item, item size, item price, and quantity to bag
                    order_list.scrollRectToVisible(order_list.getCellRect(order_list.getRowCount()-1, 0, true));
                    // Always scrolls to the bottom for the most recent addition
                    totalCalc(order_list, price_sub, price_tax, price_ftot);
                    CardLayout cl = (CardLayout) click.getLayout();
                    cl.show(click, "cont");
                    prevCard = "custom";
                    prevTitle = title.getText();
                    title.setText("Complete Or Continue Editing");
                    continue_comp.setBackground(reddish);
                    continue_edit.setBackground(reddish);
                }
            }
        });
        custom_clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                amt_value.setText("1");
                if ((odd2_panel.isVisible() == false) || (odd3_panel.isVisible() == false)) {
                    confirm_price.setText("$"+String.format("%.2f", size_price));
                    // reset large to WR
                } else {
                    refreshSelected();
                }
            }
        });
        custom_add.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                quantityAdjustment(1);  
            }
        });
        custom_sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                quantityAdjustment(-1); 
            }
        });
        even1_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                riceInit(even1_label);
                sizeButtons(even1_panel, even1_label);
            }
        });
        even2_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                riceInit(even2_label);
                sizeButtons(even2_panel, even2_label); 
            }
        });
        even3_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (pastLunch == false) {
                    riceInit(even3_label);
                    sizeButtons(even3_panel, even3_label);
                }
            }
        });
        even4_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                riceInit(even4_label);
                sizeButtons(even4_panel, even4_label);
            }
        });
        odd1_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                riceInit(odd1_label);
                sizeButtons(odd1_panel, odd1_label);
            }
        });
        odd2_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (pastLunch == false) {
                    riceInit(odd2_label);
                    sizeButtons(odd2_panel, odd2_label);
                }
            }
        });
        odd3_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                riceInit(odd3_label);
                sizeButtons(odd3_panel, odd3_label);
            }
        });
        for (int i=0; i<item_names.length; i++) {
            final int x = i;
            item_names[x].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    CardLayout cl = (CardLayout) click.getLayout();
                    if ("home".equals(prevCard)) {
                        ArrayList<MenuSource> itemArray = MenuAccess.getAllFromCateg(item_names[x].getText().trim());
                        title.setText(item_names[x].getText());
                        initFoods(itemArray);
                        prevCard = "categ";
                    } else if ("custom".equals(prevCard)) {
                        cl.show(click, "custom");
                        prevCard = "food";
                        title.setText(prevTitle);
                        rice_name.setText(item_names[x].getText());
                        ArrayList<String> prevCateg = MenuAccess.getItemCateg(prevTitle);
                        ArrayList<MenuSource> itemArray = MenuAccess.getAllFromCateg(prevCateg.get(0));
                        initFoods(itemArray);
                    } else {
                        if (pastLunch == true) {
                            even3_panel.setBackground(greyish);
                            odd2_panel.setBackground(greyish);
                        }
                        title.setText(item_names[x].getText().replaceAll("\\n"," ").trim());
                        cl.show(click, "custom");
                        refreshSelected();
                        prevCard = "food";
                        ArrayList<MenuSizes> menuArray = MenuAccess.getItemSizes(title.getText());
                        MenuSizes menuItem = menuArray.get(0);
                        double size1 = menuItem.getSizeOne();
                        double size2 = menuItem.getSizeTwo();
                        double size3 = menuItem.getSizeThree();
                        double size4 = menuItem.getSizeFour();
                        double[] sizeCount = {size1, size2, size3, size4};
                        int counter = 0;
                        for (int i=0; i < sizeCount.length; i++) {
                            if (sizeCount[i] > 0) {
                                counter++;
                            }               // Checks the item to see how many sizes exist
                        }
                        odd2_panel.setVisible(true);
                        odd3_panel.setVisible(true);
                        rice_name.setText("None");
                        custom_rice.setBackground(greyish);
                        confirm_price.setText("$0.00");
                        size_name = "";
                        CardLayout cl2 = (CardLayout) custom_sizes.getLayout();
                        switch (counter) {
                            case 1:                     // Accounts for Large or Regular size
                                cl2.show(custom_sizes, "odd");
                                odd2_panel.setVisible(false);
                                odd3_panel.setVisible(false);
                                if (size1 > 0) {
                                    size_name = "Regular";
                                    size_price = size1;
                                    odd1_label.setText("<html>Regular<br>$"+String.format("%.2f", size1)+"</html>");
                                } else if (size2 > 0) {
                                    size_name = "Large";
                                    size_price = size2;
                                    odd1_label.setText("<html>Large<br>$"+String.format("%.2f", size2)+"</html>");
                                    rice_name.setText("White Rice");
                                    custom_rice.setBackground(reddish);
                                    riceCheck = true;
                                }
                                confirm_price.setText("$"+String.format("%.2f", size_price));
                                custom_confirm.setBackground(reddish);
                                odd1_panel.setBorder(BorderFactory.createLineBorder(Color.black, 5));
                                break;
                            case 2:                     // Accounts for Small or Large / Large or Combo size
                                cl2.show(custom_sizes, "even");
                                even3_panel.setVisible(false);
                                even4_panel.setVisible(false);
                                if (size1 > 0) {
                                    even1_label.setText("<html>Small<br>$"+String.format("%.2f", size1)+"</html>");
                                    even2_label.setText("<html>Large<br>$"+String.format("%.2f", size2)+"</html>");
                                } else if (size4 > 0) {
                                    even1_label.setText("<html>Large<br>$"+String.format("%.2f", size2)+"</html>");
                                    even2_label.setText("<html>Combo<br>$"+String.format("%.2f", size4)+"</html>");
                                }
                                break;
                            case 3:                     // Accounts for Large, Lunch, or Combo size
                                cl2.show(custom_sizes, "odd");
                                odd1_label.setText("<html>Large<br>$"+String.format("%.2f", size2)+"</html>");
                                odd2_label.setText("<html>Lunch<br>$"+String.format("%.2f", size3)+"</html>");
                                odd3_label.setText("<html>Combo<br>$"+String.format("%.2f", size4)+"</html>");
                                break;
                            case 4:                     // Accounts for items that have all four sizes
                                cl2.show(custom_sizes, "even");
                                even3_panel.setVisible(true);
                                even4_panel.setVisible(true);
                                even1_label.setText("<html>Small<br>$"+String.format("%.2f", size1)+"</html>");
                                even2_label.setText("<html>Large<br>$"+String.format("%.2f", size2)+"</html>");
                                even3_label.setText("<html>Lunch<br>$"+String.format("%.2f", size3)+"</html>");
                                even4_label.setText("<html>Combo<br>$"+String.format("%.2f", size4)+"</html>");
                                break;
                            default:
                                break;
                        }
                    }
                } 
            });
        }   
        MouseAdapter edit_button = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (order_list.getRowCount() > 0) {
                    CardLayout cl = (CardLayout) main.getLayout();
                    cl.show(main, "edit");
                    setupTable(edit_list, order_list);
                    rowEdit = 0;
                    edit_list.setRowSelectionInterval(0,1);
                    totalCalc(edit_list, eprice_sub, eprice_tax, eprice_ftot);
                }
            }
        };
        continue_edit.addMouseListener(edit_button);
        cancel_edit.addMouseListener(edit_button);
        continue_comp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (order_list.getRowCount() > 0) {
                    CardLayout cl = (CardLayout) click.getLayout();
                    cl.show(click, "comp");
                    prevCard = "cont";
                    title.setText("Thank you for ordering! :)");
                    complete_total.setText("Your total is "+price_ftot.getText());
                    card_number.setText(String.valueOf(++order_number));
                    if (order_number >= 99) {
                        order_number = 1;
                    }
                    orderStats();
                }
            }
        });
        continue_cont.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) click.getLayout();
                cl.show(click, "categ");
                prevCard = "home";
                initCategories();
            }
        });
        cancel_canc.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                CardLayout cl2 = (CardLayout) click.getLayout();
                cl.show(main, "home");
                cl2.show(click, "categ");
                refreshSidebar(); refreshSelected();
            }
        });
        cancel_comp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (order_list.getRowCount() > 0) {
                    CardLayout cl = (CardLayout) main.getLayout();
                    CardLayout cl2 = (CardLayout) click.getLayout();
                    cl.show(main, "order");
                    cl2.show(click, "comp");
                    prevCard = "cont";
                    title.setText("Thank you for ordering! :)");
                    complete_total.setText("Your total is "+price_ftot.getText());
                    card_number.setText(String.valueOf(++order_number));
                    if (order_number >= 99) {
                        order_number = 1;
                    }
                    orderStats();
                }
            }
        });
        cancel_cont.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                cl.show(main, "order");
            }
        });
        edit_up.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if ((rowEdit-2) >= 0) {
                    rowEdit-=2;
                    edit_list.getSelectionModel().setSelectionInterval(rowEdit, rowEdit+1);
                    // If row selection not at top, go up
                    edit_list.scrollRectToVisible(new Rectangle(edit_list.getCellRect(rowEdit, 0, true)));
                    // If row selection out of view, adjust scrollbar
                }
            }
        });
        edit_down.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if ((rowEdit+2) < edit_list.getRowCount()) {
                    rowEdit+=2;
                    edit_list.getSelectionModel().setSelectionInterval(rowEdit, rowEdit+1);
                    // If row selection not at bottom, go down
                    edit_list.scrollRectToVisible(new Rectangle(edit_list.getCellRect(rowEdit+1, 0, true)));
                    // If row selection out of view, adjust scrollbar
                }
            }
        });
        edit_add.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                quantityAdjustmentEdits(1);
                totalCalc(edit_list, eprice_sub, eprice_tax, eprice_ftot);
            }
        });
        edit_sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                quantityAdjustmentEdits(-1);
                totalCalc(edit_list, eprice_sub, eprice_tax, eprice_ftot);
            }
        });
        edit_del.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (edit_list.getRowCount() > 0) {
                    DefaultTableModel model = (DefaultTableModel) edit_list.getModel();
                    DefaultTableModel model2 = (DefaultTableModel) undo_list.getModel();
                    for (int i=0; i < 2; i++) {
                        String cell1 = model.getValueAt(rowEdit, 0).toString();
                        String cell2 = model.getValueAt(rowEdit, 1).toString();
                        model.removeRow(rowEdit); 
                        String data[] = {cell1, cell2};
                        model2.addRow(data);
                    }
                    rowEdit = 0;
                    edit_undo.setBackground(reddish);
                    totalCalc(edit_list, eprice_sub, eprice_tax, eprice_ftot);
                    if (edit_list.getRowCount() == 0) {
                        edit_del.setBackground(greyish);
                    } else {
                        edit_list.setRowSelectionInterval(0, 1);

                    }
                }
            }
        });
        edit_undo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (undo_list.getRowCount() > 0) {
                    DefaultTableModel model = (DefaultTableModel) undo_list.getModel();
                    DefaultTableModel model2 = (DefaultTableModel) edit_list.getModel();
                    for (int i=0; i < 2; i++) {
                        String cell1 = model.getValueAt(0, 0).toString();
                        String cell2 = model.getValueAt(0, 1).toString();
                        model.removeRow(rowEdit); 
                        String data[] = {cell1, cell2};
                        model2.addRow(data);
                    }
                    edit_list.setRowSelectionInterval(0, 1);
                    edit_del.setBackground(reddish);
                    totalCalc(edit_list, eprice_sub, eprice_tax, eprice_ftot);
                    if (undo_list.getRowCount() == 0) {
                        edit_undo.setBackground(greyish);
                    }
                }
            }
        });
        edit_save.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                CardLayout cl2 = (CardLayout) click.getLayout();
                cl.show(main, "order");
                cl2.show(click, "cont");
                setupTable(order_list, edit_list);
                // Transfer the contents of edits into sidebar table
                totalCalc(order_list, price_sub, price_tax, price_ftot);
                // Calculate the subtotal, tax, and final total of edited order
                title.setText("Complete or Continue Editing");
                if (order_list.getRowCount() == 0) {
                    continue_comp.setBackground(greyish);
                    continue_edit.setBackground(greyish);
                    // If no items in bag after editing, disable complete order and edit order
                }
            }
        });
        custom_rice.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (riceCheck == true) {
                    CardLayout cl = (CardLayout) click.getLayout();
                    cl.show(click, "categ");
                    prevCard = "custom";
                    prevTitle = title.getText();
                    title.setText("Rice Replacement");
                    ArrayList<MenuSides> sideArray = MenuAccess.getSidePrices();    
                    ArrayList<MenuSource> riceArray = MenuAccess.getAllFromCateg("Fried Rice");
                    ArrayList<MenuSource> loArray = MenuAccess.getAllFromCateg("Lo Mein");
                    riceArray.addAll(loArray);
                    for (int i=0; i<riceArray.size(); i++) {
                        if (("Small".equals(size_name)) && (i>7) && (i != 15)) {
                            item_names[i].setVisible(false);
                        } else {
                            MenuSides rice_price = sideArray.get(i);
                            if ("Small".equals(size_name)) {
                                item_names[i].setText("+$"+String.format("%.2f", rice_price.getSizeOne())+"\n"+rice_price.getName());
                            } else if ("Large".equals(size_name)) {
                                item_names[i].setText("+$"+String.format("%.2f", rice_price.getSizeTwo())+"\n"+rice_price.getName());
                            } else {
                                item_names[i].setText("+$"+String.format("%.2f", rice_price.getSizeThree())+"\n"+rice_price.getName());
                            }
                            item_names[i].setVisible(true);
                            item_names[i].setBorder(BorderFactory.createLineBorder(Color.black, 2));
                        }
                    }
                }
            }
        });
        
        custom_sizes.add(custom_even, "even");
        custom_sizes.add(custom_odd, "odd");
        click.add(order_categ, "categ");
        click.add(custom_page, "custom");
        click.add(continue_page, "cont");
        click.add(complete_page, "comp");
        main.add(home_page, "home");
        main.add(order_page, "order");
        main.add(cancel_page, "cancel");
        main.add(edit_page, "edit");
        frame.add(main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Garden");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);
        frame.setVisible(true);
    }
    
    // Calculates the total of order
    private void totalCalc(JTable table, JLabel sub, JLabel taxes, JLabel ftot) {
        double subtotals = 0;
        for (int i=1; i < table.getRowCount(); i+=2) {
                subtotals += Double.parseDouble((table.getValueAt(i, 0).toString()).substring(1));
                // Add every item total together
        }
        sub.setText("$"+String.format("%.2f", subtotals));
        taxes.setText("$"+String.format("%.2f", (subtotals * (tax-1))));
        ftot.setText("$"+String.format("%.2f", (subtotals * (tax))));
        // Assign the subtotal, tax, and final total with new values
    }
    
    // Adjusts the quantity of item
    private void quantityAdjustment(int posneg) {
        int intQuantity = Integer.parseInt(amt_value.getText());
        intQuantity += posneg;
        if (intQuantity > 0) {
            String strQuan = String.valueOf(intQuantity);
            amt_value.setText(strQuan);
            confirm_price.setText("$"+String.format("%.2f", size_price * intQuantity));
            // If quantity still greater than 1 after adjustment, re-adjust item total
        }
    }
    
    // Adjusts item total and size selection
    private void sizeButtons(JPanel box, JLabel sizeprice) {
        even1_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even2_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even3_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even4_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        odd1_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        odd2_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        odd3_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        String sandp = Jsoup.parse(sizeprice.getText()).text();
        size_name = sandp.substring(0, sandp.indexOf(' '));
        size_price = Double.parseDouble(sandp.substring(sandp.indexOf('$')+1));
        int intQuantity = Integer.parseInt(amt_value.getText());
        confirm_price.setText("$"+String.format("%.2f", size_price * intQuantity));
        custom_confirm.setBackground(reddish);
        box.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        // Clears all of the borders except one and calculates item price
    }
    
    // Initializes category page
    private void initCategories() {
        title.setText("Categories");
        ArrayList<String> menuArray = MenuAccess.getAllCateg();
        for (int i=0; i<menuArray.size(); i++) { 
            item_names[i].setText("\n"+menuArray.get(i));
            item_names[i].setVisible(true);
            item_names[i].setBorder(BorderFactory.createLineBorder(Color.black, 2));
        }
        for (int i=15; i>=menuArray.size(); i--) {
            item_names[i].setVisible(false);
        }
    }
    
    // Initializes foods page
    private void initFoods(ArrayList<MenuSource> itemArray) {
        for (int j=0; j<itemArray.size(); j++) {
            MenuSource item = itemArray.get(j);
            item_names[j].setText("\n"+item.getHalf1()+'\n'+item.getHalf2());
            item_names[j].setVisible(true);
            item_names[j].setBorder(BorderFactory.createLineBorder(Color.black, 2));
        }
        for (int j=15; j>=itemArray.size(); j--) {
            item_names[j].setText("");
            item_names[j].setVisible(false);
        }
    }
    
    // Refreshes items in order
    private void refreshSidebar() {
        DefaultTableModel model = (DefaultTableModel) order_list.getModel();
        model.setRowCount(0);
        price_sub.setText("$0.00");
        price_tax.setText("$0.00");
        price_ftot.setText("$0.00");
    }
    
    // Refreshes selected sizes
    private void refreshSelected() {
        size_name = "";
        size_price = 0.00;
        amt_value.setText("1");
        confirm_price.setText("$0.00");
        custom_confirm.setBackground(greyish);
        even1_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even2_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even3_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        even4_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        odd1_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        odd2_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        odd3_panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        rice_name.setText("None");
        riceCheck = false;
        custom_rice.setBackground(greyish);
    }
    
    // Clears the table and restructure with the data from another table
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
    
    // Adjusts the quantity of an item on the edit page
    private void quantityAdjustmentEdits(int posneg) {
        if (edit_list.getRowCount() > 0) {
            String cell2 = edit_list.getValueAt(rowEdit+1, 1).toString();
            int intQuantity = Integer.parseInt(cell2.replaceAll("\\D+",""));
            // Extract only the digits of given cell
            intQuantity += posneg;
            if (intQuantity > 0) {
                String cell1 = edit_list.getValueAt(rowEdit+1, 0).toString();
                double dubPrice = Double.parseDouble(cell1.substring(1));
                dubPrice += (dubPrice / (intQuantity -= posneg) * posneg);
                // Retrieves the unit price, and changes the new total accordingly
                String data[] = {"$"+String.format("%.2f", dubPrice), "x"+(intQuantity += posneg)};
                DefaultTableModel model = (DefaultTableModel) edit_list.getModel();
                model.removeRow(rowEdit+1);
                model.insertRow(rowEdit+1, data);
                // Replaces the previous data of that same item
                edit_list.setRowSelectionInterval(rowEdit,rowEdit+1);
                // If quantity still greater than 1 after adjustment, re-adjust item total
            }
        }
    }
    
    // Updates item statistics of amount of times ordered
    private void orderStats() {
        for (int i=0; i < order_list.getRowCount(); i+=2) {
            String cell = order_list.getValueAt(i+1, 1).toString();
            int quantity = Integer.parseInt(cell.replaceAll("\\D+",""));
            String item = order_list.getValueAt(i, 1).toString();
            ArrayList<Integer> menuArray = MenuAccess.getItemAmt(item);
            int newAmount = menuArray.get(0) + quantity;
            MenuAccess.updateItem(newAmount, item);
        }
    }

    private void riceInit(JLabel sizeLabel) {
        String sandp = Jsoup.parse(sizeLabel.getText()).text();
        String curr_size = sandp.substring(0, sandp.indexOf(' '));
        if (!size_name.equals(curr_size)) {
            rice_name.setText("None");
            riceCheck = false;
            custom_rice.setBackground(greyish);
            if (("Large".equals(curr_size)) || ("Small".equals(curr_size))) {
                ArrayList<String> menuArray = MenuAccess.getItemCateg(title.getText());
                String category = menuArray.get(0);
                if (!"Fried Rice".equals(category) && !"Soup".equals(category) && (!category.equals("Appetizers"))) {
                        if ((!"Lo Mein".equals(category)) && (!"Mai Fun".equals(category)) && (!"Boneless Spare Ribs".equals(title.getText()))) { 
                            rice_name.setText("White Rice");
                            custom_rice.setBackground(reddish);
                            riceCheck = true;
                        }
                    }   
            } else if (("Combo".equals(curr_size)) || ("Lunch".equals(curr_size))) {
                rice_name.setText("Pork Fried Rice");
                custom_rice.setBackground(reddish);
                riceCheck = true;
            }
        }
    }
    
    /* private void finalizeOrder() {
        for (int x=0; x < items.getRowCount(); x++) {
            for (int y=0; y < items.getColumnCount(); y++) {
                if (y % 2 == 0) {       // Column 1
                    if (x % 2 == 0) {   // Size
                        String tempSize = "";
                        if ("Small".equals(items.getValueAt(x, y).toString())) {
                            tempSize = "Sm";
                        } else if ("Large".equals(items.getValueAt(x, y).toString())) {
                            tempSize = "Lg";
                        } else if ("Lunch".equals(items.getValueAt(x, y).toString())) {
                            tempSize = "L ";
                        } else if ("Combo".equals(items.getValueAt(x, y).toString())) {
                            tempSize = "C ";
                        } 
                        sizeList.add(tempSize);
                    } else {            // Price
                        String spacer = "";
                        if (items.getValueAt(x, y).toString().length() == 5) {
                            spacer = " ";
                        }
                        priceList.add(spacer + items.getValueAt(x, y).toString().substring(1));
                    }
                } else {                // Column 2
                    if (x % 2 == 0) {   // Item
                        itemList.add(items.getValueAt(x, y).toString());
                    } else {            // Side/Qty
                        qtyList.add((items.getValueAt(x, y).toString()).replaceAll("\\D+", ""));
                        sideList.add(items.getValueAt(x, y).toString().substring(0, 6));
                    }
                }
            }
        }
    }
    
    protected static double CM_to_PP(double cm) {            
        return (cm * 0.393600787) * 72d;            
    }
    
    private void printReceipt() {
        Printable contentToPrint = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {                                                      
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                    // A single page is zero-based
                }
                Graphics2D g2d = (Graphics2D) graphics;
                g2d.setFont(new Font("Arial", Font.BOLD, 30));
                g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
                // Translate X and Y values to page format to avoid clipping
                
                Date currentDate = new Date();
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String time = timeFormat.format(currentDate);
                String date = dateFormat.format(currentDate);
                int y = 30;
                g2d.drawString("Order #"+orderNumber, 40, y); y+=10;
                g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
                g2d.drawString("-------------------------------------",10,y);y+=10;
                g2d.drawString("    New Garden Chinese Restaurant",12,y);y+=10;
                g2d.drawString("        1852 Butcher Shop Rd    ",12,y);y+=10;
                g2d.drawString("        Mifflintown PA, 17059    ",12,y);y+=10;
                g2d.drawString("           (717) 436-9863       ",12,y);y+=10;
                g2d.drawString("-------------------------------------",10,y);y+=10;
                g2d.drawString(" Order #"+orderNumber+"          "+time+" "+date,10,y);y+=10;
                g2d.drawString(" QTY  ITEM                    TOTAL",10,y);y+=10;
                
                for (int i=0; i < itemList.size(); i++) {
                    g2d.drawString(" "+qtyList.get(i)+" "+sizeList.get(i)+" "+itemList.get(i), 10, y);
                    g2d.drawString(priceList.get(i)+" ", 160, y); y+=10;
                    if (sideList.get(i).contains("w/")) {
                        g2d.drawString("    "+sideList.get(i), 10, y); y+=10;
                    }
                } y+=10;  
                String spacer = ""; String spacer2 = "";
                if (subtotal_val.getText().length() == 5) {
                    spacer = " ";
                }
                if (ftotal_val.getText().length() == 5) {
                    spacer2 = " ";
                }
                
                g2d.drawString(" Subtotal:", 10, y); g2d.drawString(spacer+subtotal_val.getText().substring(1)+" ", 160, y); y+=10;
                g2d.drawString(" Tax:", 10, y); g2d.drawString(" "+tax_val.getText().substring(1), 160, y); y+=10;
                g2d.drawString(" Final total:", 10, y); g2d.drawString(spacer2+ftotal_val.getText().substring(1)+" ", 160, y); y+=10;
                g2d.drawString("-------------------------------------", 10, y); y+=10;
                g2d.drawString("              THANK YOU",12,y); y+=10;
                g2d.drawString("          PLEASE COME AGAIN!", 12, y);y+=10;
                g2d.drawString("-------------------------------------", 10, y);y+=10;
                return PAGE_EXISTS;
            }
        };
        int isNone = 0;
        for (int i=0; i < sideList.size(); i++) {
            if (!sideList.get(i).contains("w/")) {
                isNone++;
            }
        }
        PrinterJob job = PrinterJob.getPrinterJob();
        PageFormat pf = job.defaultPage();
        Paper paper = pf.getPaper();       
        double width = CM_to_PP(8); 
        double height = CM_to_PP(7.5+sizeList.size()-(isNone*0.5)); 
        paper.setSize(width, height);
        paper.setImageableArea(0,10,width,height - CM_to_PP(1));  // Sets margins
        pf.setOrientation(PageFormat.PORTRAIT);  
        pf.setPaper(paper); 
        Book book = new Book();
        book.append(contentToPrint, pf);
        job.setPageable(book);
        // Allows multi-page printing
        try {
            job.print();
        } catch (PrinterException e) {
            System.err.println(e.getMessage());
        }
        qtyList.clear();
        sizeList.clear();
        itemList.clear();
        priceList.clear();
        sideList.clear();
    }       
    
    // Timer that countsdown for inactivity
    private void timerAFK() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                order.setVisible(false);
                if (number.isVisible() == true) {
                    number.setVisible(false);
                    home.setVisible(true);
                    refreshSidebar();
                } else {
                    cancelp.setVisible(false);
                    timer.setVisible(true);
                    timerFinal();
                    // If countdown expires, start final countdown
                }
            }
        };
        time = new Timer();
        time.schedule(timerTask, 20000);
        // AFK timer set at 20 seconds
    }
    
    
    // Resets the AFK timer
    private void timerReset() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

            }
        };
        time.cancel();
        time = new Timer();
        time.schedule(timerTask, 0100);
    }
    
    // The final countdown before user is sent back to home screen
    private void timerFinal() {
        try {
            for (int i = 10; i >= 0; i--) {
                countdown.setText(String.valueOf(i));
                Thread.sleep(1000);
                // Countdown from 10 every second
            }
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
        if (timer.isVisible() == true) {
            timer.setVisible(false);
            home.setVisible(true);
            refreshSidebar();
            // If no activity after 0, reset and return to home page
        } 
    }*/

    public static void main(String[] args) {
        new NewGarden();
        // Minor issues: text alignment
    }
}
