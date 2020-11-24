import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea1=new JTextArea();
    JTextArea textArea2=new JTextArea();
    //构造方法
    public App() {

       textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if ((textArea1.getText()).equals("干饭")&&e.getKeyCode() == KeyEvent.VK_ENTER) {
                    textArea2.append("恭喜答对！\n干饭人，干饭魂，干饭都是人上人!\n");
                }else {
                    textArea2.append("输入错误");
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        //textArea1.setText("输入干饭！");
        textArea1.setBounds(100,100,200,150);
        textArea1.setBackground(Color.cyan);
        textArea2.setBounds(100,300,200,150);
        textArea2.setBackground(Color.yellow);
        myPanel.add(textArea1);
        myPanel.add(textArea2);

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
