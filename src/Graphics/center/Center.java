package Graphics.center;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Center extends JPanel {

    SongsDisplay songsDisplay = new SongsDisplay();
    AlbumsDisplay albumDisplay = new AlbumsDisplay();

    public Center() throws IOException {

        this.setLayout(new FlowLayout());
        this.setBackground(new Color(3, 11, 21));
        // this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        //  this.add(songsDisplay,BorderLayout.CENTER);
        this.add(albumDisplay , new FlowLayout());
        // this.add(albumDisplay , BorderLayout.CENTER);
        this.setVisible(true);
    }


}