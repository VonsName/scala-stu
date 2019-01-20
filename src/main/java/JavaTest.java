import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author vons0
 */
public class JavaTest implements MouseListener {

    public static void main(String[] args) throws IOException {
        String str = "abc";
        String str2 = new String("abc");
        System.out.println(str.compareTo(str2));
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Integer x = 234567;
        System.out.println(x.toString().substring(2, 4));

        RandomAccessFile randomAccessFile = new RandomAccessFile("", "r");
        Socket socket = new Socket("localhost", 8080);

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JList list = new JList();
        Object selectedValue = list.getSelectedValue();

        URL url = new URL("");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

class Test30 extends Applet {

    private static final long serialVersionUID = -5578576873452934338L;

    @Override
    public void start() {
        AudioClip audioClip = getAudioClip(getCodeBase(), "");
        audioClip.play();
    }
}
