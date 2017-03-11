import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Bing on 2017/1/5.
 */
public class Calculate extends JFrame implements ActionListener{

    private final String[] KEYS ={"7","8","9","/","sqrt","4","5","6","*","%",
    "1","2","3","-","1/x","0","+/-",".","="};

    private final String [] COMMAND ={"Backspace","CE","C"};

    private final String [] M ={" ","MC","MR","MS","M+"};

    private  JButton keys[] = new JButton[KEYS.length];

    private  JButton commands[] =new JButton[COMMAND.length];

    private  JButton m[] =new JButton[M.length];

    private  JTextField resultText = new JTextField("0");

    private  boolean firstDigit =true;

    private double resultNum=0.0;

    private String operator="=";

    private boolean operateValidFlag=true;

    /**
     * 构造函数
     */
    public Calculate(){
        super();
        init();
        this.setBackground(Color.LIGHT_GRAY);
        this.setTitle("计算器");
        this.setLocation(500,300);
        this.setResizable(false);
        this.pack();

    }
    /**
     *  初始化计算器
     */
    private void init(){
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setEditable(false);
        resultText.setBackground(Color.white);
        JPanel calckeysPanel = new JPanel();
        calckeysPanel.setLayout(new GridLayout(4,5,3,3));
        for(int i=0;i<KEYS.length;i++){
            keys[i] =new JButton((KEYS[i]));
            calckeysPanel.add(keys[i]);
            keys[i].setForeground(Color.blue);
        }
    }













}
