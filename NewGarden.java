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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author johnnyjiang
 */
public class NewGarden {
    
        String backvar = ""; String backvar2 = "";
        Font verdana = new Font("Verdana", Font.PLAIN, 28);
        Color reddish = new Color(204, 0, 0);
        Color greyish = new Color(153, 153, 153);
        Color whitish = new Color(204, 204, 204);
        
    public NewGarden() {
        
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
        
        JPanel click = new JPanel(new CardLayout());
        JLabel title = new JLabel("CATEGORIES");
        JLabel sidebar_title = new JLabel("NEW GARDEN");
        JLabel back_text = new JLabel("BACK");
        JLabel cancel_text = new JLabel("CANCEL");
        JPanel order_page = new JPanel(new MigLayout("", "[]", "[]"));
        JPanel order_banner = new JPanel(new MigLayout());
        JPanel order_sidebar = new JPanel(new MigLayout("", "[]", "[]5[]10[]"));
        JPanel order_categ = new JPanel(new MigLayout("fill", "[]20[]20[]20[]", "[]20[]20[]20[]0"));
        JTable order_list = new JTable();
        JScrollPane order_scroll = new JScrollPane(order_list);
        JPanel back_button = new JPanel(new MigLayout());
        JPanel cancel_button = new JPanel(new MigLayout());
        JTextPane[] item_names = new JTextPane[16];
        SimpleAttributeSet set = new SimpleAttributeSet();
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
        order_scroll.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        back_button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        cancel_button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        back_button.setBackground(reddish);
        cancel_button.setBackground(reddish);
        order_banner.setBackground(reddish);
        order_sidebar.setBackground(reddish);
        back_button.add(back_text, "push, align center");
        cancel_button.add(cancel_text, "push, align center");
        order_banner.add(title, "push, align center, gapbottom 10");
        order_sidebar.add(sidebar_title, "push, align center, wrap");
        order_sidebar.add(order_scroll, "h 545, wrap");
        order_sidebar.add(back_button, "split 2, w 50%, h 100, gapbottom 5");
        order_sidebar.add(cancel_button, "w 50%, h 100, gapbottom 5");
        order_page.add(order_sidebar, "east, w 900");
        order_page.add(order_banner, "north, h 200, gapright 5");
        order_page.add(click, "w 100%, h 100%");
        
        ArrayList<String> menuArray = MenuAccess.getAllCateg();
        for (int i=0; i<menuArray.size(); i++) { 
            item_names[i].setText("\n"+menuArray.get(i));
            item_names[i].setVisible(true);
            item_names[i].setBorder(BorderFactory.createLineBorder(Color.black, 2));
        }
        
        JPanel custom_page = new JPanel(new MigLayout("fill, debug", "[][]", "[][][]"));
        JPanel custom_quantity = new JPanel(new MigLayout("fill"));
        JPanel custom_add = new JPanel(new MigLayout());
        JPanel custom_sub = new JPanel(new MigLayout());
        JPanel custom_amt = new JPanel(new MigLayout());
        JPanel custom_clear = new JPanel(new MigLayout());
        JPanel custom_sizes = new JPanel(new CardLayout());
        JPanel custom_even = new JPanel(new MigLayout("debug", "[]25[]", "[]25[]"));
        JPanel custom_odd = new JPanel(new MigLayout("", "[][]", "[][]"));
        JPanel even1_panel = new JPanel(new MigLayout());
        JPanel even2_panel = new JPanel(new MigLayout());
        JPanel even3_panel = new JPanel(new MigLayout());
        JPanel even4_panel = new JPanel(new MigLayout());
        JPanel odd1_panel = new JPanel(new MigLayout());
        JPanel odd2_panel = new JPanel(new MigLayout());
        JPanel odd3_panel = new JPanel(new MigLayout());
        JPanel custom_confirm = new JPanel(new MigLayout());
        JLabel clear_text = new JLabel("CLEAR SELECTED");
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
        
        clear_text.setFont(new Font("Verdana", Font.PLAIN, 28));
        amt_plus.setFont(new Font("Verdana", Font.PLAIN, 64));
        amt_value.setFont(new Font("Verdana", Font.PLAIN, 64));
        amt_minus.setFont(new Font("Verdana", Font.PLAIN, 64));
        custom_quantity.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_confirm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        custom_add.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.BLACK));
        custom_sub.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        even1_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even2_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even3_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        even4_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
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
        //custom_add.setBorder(new);
        even1_panel.add(even1_label);
        even2_panel.add(even2_label);
        even3_panel.add(even3_label);
        even4_panel.add(even4_label);
        odd1_panel.add(odd1_label);
        odd2_panel.add(odd2_label);
        odd3_panel.add(odd3_label);
        custom_even.add(even1_panel, "w 200, h 150"); 
        custom_even.add(even2_panel, "wrap, w 200, h 150");
        custom_even.add(even3_panel, "w 200, h 150"); 
        custom_even.add(even4_panel, "w 200, h 150");
        custom_odd.add(odd1_panel, "span 2, wrap");
        custom_odd.add(odd2_panel);
        custom_odd.add(odd3_panel);
        custom_sub.add(amt_minus, "push, align center");
        custom_amt.add(amt_value, "push, align center");
        custom_add.add(amt_plus, "push, align center");
        custom_quantity.add(custom_add, "east, w 130, h 100");
        custom_quantity.add(custom_amt, "center, w 130, h 100");
        custom_quantity.add(custom_sub, "west, w 130, h 100");
        custom_clear.add(clear_text, "push, align center");
        custom_page.add(custom_sizes, "spany 2, top, left");
        custom_page.add(custom_quantity, "wrap, center align, w 400, h 100");
        custom_page.add(custom_clear, "wrap, aligny top, gaptop 20, center align, w 300, h 75");
        custom_page.add(custom_confirm, "span, center align, w 30%, h 100");
        
        home_page.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                cl.show(main, "order");
                backvar = "home";
            }
        });
        back_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                
            }
        });
        for (int i=0; i<item_names.length; i++) {
            final int x = i;
            item_names[x].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if ("home".equals(backvar)) {
                        ArrayList<String> itemArray = MenuAccess.getAllFromCateg(item_names[x].getText().trim());
                        title.setText(item_names[x].getText().toUpperCase());
                        for (int j=0; j<itemArray.size(); j++) {
                            item_names[j].setText("\n"+itemArray.get(j));
                            item_names[j].setVisible(true);
                            item_names[j].setBorder(BorderFactory.createLineBorder(Color.black, 2));
                        }
                        for (int j=15; j>=itemArray.size(); j--) {
                            item_names[j].setText("");
                            item_names[j].setVisible(false);
                        }
                        backvar = "categ";
                    } else {
                        CardLayout cl = (CardLayout) click.getLayout();
                        cl.show(click, "custom");
                        
                    }
                } 
            });
        }   
        
        custom_sizes.add(custom_even, "even");
        custom_sizes.add(custom_odd, "odd");
        click.add(order_categ, "categ");
        click.add(custom_page, "custom");
        main.add(home_page, "home");
        main.add(order_page, "order");
        frame.add(main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Garden");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new NewGarden();
    }
}
