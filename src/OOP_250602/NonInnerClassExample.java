package OOP_250602;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class NonInnerClassExample1 extends JFrame {
    private String originalTitle = "Original Title";

    public NonInnerClassExample1() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 외부 클래스 객체를 명시적으로 전달
        addMouseListener(new ExternalMouseEventHandler(this));

        setVisible(true);
    }

    // getter, setter 필요
    public void updateTitle(String title) { setTitle(title); }
    public String getOriginalTitle() { return originalTitle; }
}

class ExternalMouseEventHandler implements MouseListener {
    private NonInnerClassExample1 frame;

    public ExternalMouseEventHandler(NonInnerClassExample1 frame) { this.frame = frame; }

    public void mouseEntered(MouseEvent e) { frame.updateTitle("Mouse on"); }
    public void mouseExited(MouseEvent e) { frame.updateTitle(frame.getOriginalTitle()); }

    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}

public class NonInnerClassExample {
    public static void main(String[] args) { new NonInnerClassExample1(); }
}
