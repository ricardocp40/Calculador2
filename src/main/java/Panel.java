import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private GridBagConstraints gbc;
    private GridBagLayout gbl;

    public Panel() {
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(gbl);
    }

    public void addGBC(Component comp, int px, int py, int width, int height, float weightx,  float weighty, int ipadx, int ipady, Insets insets, int fill, int anchor){
        gbc.gridx = px;
        gbc.gridy = py;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        gbc.ipadx = ipadx;
        gbc.ipady = ipady;
        gbc.insets = insets;
        gbc.fill = fill;
        gbc.anchor = anchor;

        add(comp, gbc);

    }
}
