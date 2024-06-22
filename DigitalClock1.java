import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DigitalClock1 extends RoundedJFrame
{
    JLabel l1, l2;
    SimpleDateFormat d1, d2;
    Timer timer;

    DigitalClock1(String s1)
    {
        super(s1);
        setComponents();
    }

    void setComponents()
    {
        l1 = new JLabel();
        l1.setFont(new Font("Verdana", Font.BOLD, 40));
        Color c1 = Color.RED;
        Color c2 = c1.brighter();
        l1.setForeground(c2);
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);

        l2 = new JLabel();
        l2.setFont(new Font("Verdana", Font.BOLD, 40));
        l2.setForeground(c2);
        l2.setBackground(Color.BLACK);
        l2.setOpaque(true);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(l1, BorderLayout.NORTH);
        panel.add(l2, BorderLayout.CENTER);

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        panel.setBorder(BorderFactory.createCompoundBorder(
                panel.getBorder(),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        add(panel);

        d1 = new SimpleDateFormat("hh:mm:ss a");
        String time = d1.format(Calendar.getInstance().getTime());
        l1.setText(time);

        d2 = new SimpleDateFormat("MM:dd:yyyy");
        String day = d2.format(Calendar.getInstance().getTime());
        l2.setText(day);

        timer = new Timer(1000, new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent e) {
              String  time = d1.format(Calendar.getInstance().getTime());
                l1.setText(time);

               String day = d2.format(Calendar.getInstance().getTime());
                l2.setText(day);
            }
        });
        timer.start();
    }

    public static void main(String[] args)
    {
        DigitalClock1 d1 = new DigitalClock1("Digital Clock");
        d1.setVisible(true);
        d1.setSize(300, 300);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class RoundedJFrame extends JFrame {

    public RoundedJFrame(String title) {
        super(title);
        setUndecorated(true); // remove the default title bar
    }

    //@Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Create a rounded rectangle shape
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 100, 100);

        // Draw the rounded rectangle
        g2d.setColor(getBackground());
        g2d.fill(rect);

        // Draw the border
        g2d.setColor(getForeground());
        g2d.draw(rect);
    }
}