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
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
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
    
    private String prevTitle = "";
    private String prevCard = "";
    private String size_name = "";
    private int order_number = 0;
    private double size_price = 0.0;
    private final double tax = 1.06;
    private final Font verdana = new Font("Verdana", Font.PLAIN, 28);
    private final Color reddish = new Color(204, 0, 0);
    private final Color greyish = new Color(153, 153, 153);

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

    JPanel custom_page = new JPanel(new MigLayout("fill", "[][]", "[][][]"));
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
    JLabel bann_text = new JLabel("Are you sure?");
    JLabel canc_text = new JLabel("<html>Cancel<br>Order</html>");
    JLabel edit_text = new JLabel("<html>  Edit<br>Order</html>");
    JLabel comp_text = new JLabel("<html>Complete<br>Order</html>");
    JLabel cont_text = new JLabel("<html>Continue<br>Order</html>");
        
    public NewGarden() {
        String[] columns = {"",""};
        DefaultTableModel model = new DefaultTableModel(0, columns.length) ;
        model.setColumnIdentifiers(columns);
        order_list.setModel(model);
        order_list.setFont(new Font("Verdana", Font.PLAIN, 20));
        order_list.setRowHeight(30);
        order_list.getColumnModel().getColumn(1).setPreferredWidth(300);
        // Sets the size of the item and quantity column
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        order_list.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        // Adjusts the right column's to be right justified
        order_list.setEnabled(false);
        // Disables manual selection of items
        order_scroll.setBorder(createEmptyBorder());
        
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
        even1_panel.add(even1_label, "push, center align");
        even2_panel.add(even2_label, "push, center align");
        even3_panel.add(even3_label, "push, center align");
        even4_panel.add(even4_label, "push, center align");
        odd1_panel.add(odd1_label, "push, center align");
        odd2_panel.add(odd2_label, "push, center align");
        odd3_panel.add(odd3_label, "push, center align");
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
        custom_page.add(custom_sizes, "spany 2, top, left");
        custom_page.add(custom_quantity, "wrap, center align, w 400, h 100");
        custom_page.add(custom_clear, "wrap, aligny top, gaptop 20, center align, w 300, h 75");
        custom_page.add(custom_confirm, "span, center align, w 30%, h 100");
        
        con_comp_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        con_cont_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        con_edit_text.setFont(new Font("Verdana", Font.PLAIN, 48));
        continue_comp.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_cont.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_cont.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        continue_comp.setBackground(reddish);
        continue_cont.setBackground(reddish);
        continue_edit.setBackground(reddish);
        continue_comp.add(con_comp_text, "push, center align");
        continue_cont.add(con_cont_text, "push, center align");
        continue_edit.add(con_edit_text, "push, center align");
        continue_page.add(continue_comp, "wrap, w 100%, h 125, bottom");
        continue_page.add(continue_cont, "wrap, w 100%, h 125");
        continue_page.add(continue_edit, "w 100%, h 125, top");
        
        card_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        card_number.setFont(new Font("Verdana", Font.PLAIN, 132));
        complete_total.setFont(new Font("Verdana", Font.PLAIN, 32));
        complete_card.setBackground(Color.WHITE);
        complete_card.add(card_text, "top, align center, wrap");
        complete_card.add(card_number, "push, align center, gapbottom 20");
        complete_page.add(complete_card, "push, align center, wrap, w 350, h 200, bottom");
        complete_page.add(complete_total, "push, align center, top");
        
        bann_text.setFont(new Font("Verdana", Font.PLAIN, 64));
        canc_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        edit_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        comp_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        cont_text.setFont(new Font("Verdana", Font.PLAIN, 32));
        cancel_bann.setBackground(reddish);
        cancel_canc.setBackground(reddish);
        cancel_edit.setBackground(reddish);
        cancel_comp.setBackground(reddish);
        cancel_cont.setBackground(reddish);
        cancel_bann.add(bann_text, "push, align center");
        cancel_canc.add(canc_text, "push, align center");
        cancel_edit.add(edit_text, "push, align center");
        cancel_comp.add(comp_text, "push, align center");
        cancel_cont.add(cont_text, "push, align center");
        cancel_page.add(cancel_bann, "north");
        cancel_page.add(cancel_canc, "w 300, h 200, bottom, right");
        cancel_page.add(cancel_edit, "w 300, h 200, bottom, left, wrap");
        cancel_page.add(cancel_comp, "w 300, h 200, top, right");
        cancel_page.add(cancel_cont, "w 300, h 200, top, left");
        
        home_page.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) main.getLayout();
                cl.show(main, "order");
                prevCard = "home"; 
                initCategories();
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
                }
                if ("custom".equals(prevCard)) {
                    cl2.show(click, "custom");
                    prevCard = "food";
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
                if ("cont".equals(prevCard)) {
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
                    // If the item total isn't $0.00
                    String topData[] = {size_name, title.getText()};
                    String botData[] = {confirm_price.getText(), "x"+amt_value.getText()};
                    DefaultTableModel model = (DefaultTableModel) order_list.getModel();
                    model.addRow(topData); model.addRow(botData);
                    // Adds the item, item size, item price, and quantity to bag
                    order_list.scrollRectToVisible(order_list.getCellRect(order_list.getRowCount()-1, 0, true));
                    // Always scrolls to the bottom for the most recent addition
                    totalCalc(order_list);
                    CardLayout cl = (CardLayout) click.getLayout();
                    cl.show(click, "cont");
                    prevCard = "custom";
                    prevTitle = title.getText();
                    title.setText("Complete Or Continue Editing");
                }
            }
        });
        custom_clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                amt_value.setText("1");
                if ((odd2_panel.isVisible() == false) || (odd3_panel.isVisible() == false)) {
                    confirm_price.setText("$"+String.format("%.2f", size_price));
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
                sizeButtons(even1_panel, even1_label);
            }
        });
        even2_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(even2_panel, even2_label); 
            }
        });
        even3_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(even3_panel, even3_label);
            }
        });
        even4_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(even4_panel, even4_label);
            }
        });
        odd1_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(odd1_panel, odd1_label);
            }
        });
        odd2_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(odd2_panel, odd2_label);
            }
        });
        odd3_panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sizeButtons(odd3_panel, odd3_label);
            }
        });
        for (int i=0; i<item_names.length; i++) {
            final int x = i;
            item_names[x].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if ("home".equals(prevCard)) {
                        ArrayList<String> itemArray = MenuAccess.getAllFromCateg(item_names[x].getText().trim());
                        title.setText(item_names[x].getText());
                        for (int j=0; j<itemArray.size(); j++) {
                            item_names[j].setText("\n"+itemArray.get(j));
                            item_names[j].setVisible(true);
                            item_names[j].setBorder(BorderFactory.createLineBorder(Color.black, 2));
                        }
                        for (int j=15; j>=itemArray.size(); j--) {
                            item_names[j].setText("");
                            item_names[j].setVisible(false);
                        }
                        prevCard = "categ";
                    } else {
                        title.setText(item_names[x].getText().trim());
                        CardLayout cl = (CardLayout) click.getLayout();
                        cl.show(click, "custom");
                        prevCard = "food";
                        ArrayList<MenuProperties> menuArray = MenuAccess.getItemSizes(title.getText());
                        MenuProperties menuItem = menuArray.get(0);
                        double size1 = menuItem.getSizeOne();
                        double size2 = menuItem.getSizeTwo();
                        double size3 = menuItem.getSizeThree();
                        double size4 = menuItem.getSizeFour();
                        double[] sizeCount = {size1, size2, size3, size4};
                        int counter = 0;
                        for (int i=0; i < sizeCount.length; i++) {
                            if (sizeCount[i] > 0) {
                                counter++;
                            }                           // Checks the item to see how many sizes exist
                        }
                        confirm_price.setText("$0.00");
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
        
        continue_comp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                CardLayout cl = (CardLayout) click.getLayout();
                cl.show(click, "comp");
                prevCard = "cont";
                title.setText("Thank you for ordering! :)");
                complete_total.setText("Your total is "+price_ftot.getText());
                // Displays the order number and the customer's final total for payment
        
                card_number.setText(String.valueOf(++order_number));
                if (order_number >= 99) {
                    order_number = 1;
                    // If order numbers surpasses double digits, reset back to one
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
        continue_edit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
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
        cancel_edit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
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
                    // Displays the order number and the customer's final total for payment
                    card_number.setText(String.valueOf(++order_number));
                    if (order_number >= 99) {
                        order_number = 1;
                        // If order numbers surpasses double digits, reset back to one
                    }
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
        
        custom_sizes.add(custom_even, "even");
        custom_sizes.add(custom_odd, "odd");
        click.add(order_categ, "categ");
        click.add(custom_page, "custom");
        click.add(continue_page, "cont");
        click.add(complete_page, "comp");
        main.add(home_page, "home");
        main.add(order_page, "order");
        main.add(cancel_page, "cancel");
        frame.add(main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Garden");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);
        frame.setVisible(true);
    }
    
    private void totalCalc(JTable table) {
        double subtotals = 0;
        for (int i=1; i < table.getRowCount(); i+=2) {
                subtotals += Double.parseDouble((table.getValueAt(i, 0).toString()).substring(1));
                // Add every item total together
        }
        price_sub.setText("$"+String.format("%.2f", subtotals));
        price_tax.setText("$"+String.format("%.2f", (subtotals * (tax-1))));
        price_ftot.setText("$"+String.format("%.2f", (subtotals * (tax))));
        // Assign the subtotal, tax, and final total with new values
    }
    
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
        size_price = Double.parseDouble(sandp.substring(sandp.length() - 4));
        int intQuantity = Integer.parseInt(amt_value.getText());
        confirm_price.setText("$"+String.format("%.2f", size_price * intQuantity));
        custom_confirm.setBackground(reddish);
        box.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        // Clears all of the borders except one and calculates item price
    }
    
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
    
    private void refreshSidebar() {
        DefaultTableModel model = (DefaultTableModel) order_list.getModel();
        model.setRowCount(0);
        price_sub.setText("$0.00");
        price_tax.setText("$0.00");
        price_ftot.setText("$0.00");
    }
    
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
    }
    
    // Cancel Page
    // Edit Page
    // Rice Option
    
    public static void main(String[] args) {
        new NewGarden();
        // Minor issues: text alignment, listeners for multiple buttons
    }
}
