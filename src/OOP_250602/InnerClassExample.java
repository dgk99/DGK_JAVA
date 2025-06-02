package OOP_250602;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class InnerClassExample1 extends JFrame {

    private String originalTitle = "Original Title";

    public InnerClassExample1() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 외부 클래스 객체를 명시적으로 전달
        addMouseListener(new MouseEventHandler());

        setVisible(true);
    }

    class MouseEventHandler implements MouseListener {

        public void mouseEntered(MouseEvent e) { setTitle("Mouse on"); }
        public void mouseExited(MouseEvent e) { setTitle(originalTitle); }

        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
}

public class InnerClassExample {
    public static void main(String[] args) { new InnerClassExample1(); }
}
