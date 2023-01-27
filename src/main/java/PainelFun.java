import javax.swing.*;
import java.awt.*;

public class PainelFun extends Panel {

    private JButton btce, btlim, btresult;

    public PainelFun(){

        initComponent();
        addGBC(btce, 0,0,1,1,0.1f, 0.12f, 0,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btlim, 0,2,1,1,0.1f, 0.12f, 0,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btresult, 0,3,1,1,0.2f, 0.3f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

    }

    private void initComponent(){
        btce = new JButton("  CE");
        btlim = new JButton("  <-");
        btresult = new JButton("  = ");
    }
}
