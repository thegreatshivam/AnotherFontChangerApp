import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    private JTextField textField;

    private Font defaultFont;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldNItalicFont;

    private JRadioButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton italicButton;
    private JRadioButton boldNItalicButton;

    private ButtonGroup buttonGroup;

    public Gui(){
        super("Another Font Changer App");
        setLayout(new FlowLayout());

        defaultFont = new Font("Default Font", Font.PLAIN, 25);

        textField = new JTextField("The Default Text", 20);
        textField.setFont(defaultFont);
        textField.setEditable(false);
        add(textField);

        plainButton = new JRadioButton("Plain", true);
        boldButton = new JRadioButton("Bold");
        italicButton = new JRadioButton("Italic");
        boldNItalicButton = new JRadioButton("Bold & Italic");

        add(plainButton);
        add(boldButton);
        add(italicButton);
        add(boldNItalicButton);

        buttonGroup = new ButtonGroup();

        buttonGroup.add(plainButton);
        buttonGroup.add(boldButton);
        buttonGroup.add(italicButton);
        buttonGroup.add(boldNItalicButton);

        plainFont = new Font("Plain", Font.PLAIN, 25);
        boldFont = new Font("Bold", Font.BOLD, 25);
        italicFont = new Font("Italic", Font.ITALIC, 25);
        boldNItalicFont = new Font("Bold & Italic", Font.BOLD + Font.ITALIC, 25);

        plainButton.addItemListener(new HandlerClass(plainFont));
        boldButton.addItemListener(new HandlerClass(boldFont));
        italicButton.addItemListener(new HandlerClass(italicFont));
        boldNItalicButton.addItemListener(new HandlerClass(boldNItalicFont));


    }
    private class HandlerClass implements ItemListener {
        private Font font;

        public HandlerClass(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }
}