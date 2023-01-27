import javax.swing.*;
import java.awt.*;

public class PainelOperacao extends Panel{

    private JButton btsoma, btsub, btdiv, btmult;

    public PainelOperacao(){

        initComponent();
        addGBC(btdiv, 0,0,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btmult, 0,1,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btsub, 0,2,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btsoma, 0,3,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

    }

    private void initComponent(){
        btsoma = new JButton(" + ");
        btsub = new JButton(" - ");
        btdiv = new JButton(" / ");
        btmult = new JButton(" * ");
    }
}
