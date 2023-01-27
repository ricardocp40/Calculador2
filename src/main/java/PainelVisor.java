import javax.swing.*;
import java.awt.*;

public class PainelVisor extends Panel {

    private JTextArea visor;

    public PainelVisor(){
        visor = new JTextArea();
        addGBC(visor, 0, 0, 1, 1, 1f, 1f, 1, 1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

    }
}
