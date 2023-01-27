import javax.swing.*;
import java.awt.*;

public class PainelNumerico extends Panel {

    private JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btp, btsinal;

    public PainelNumerico(){
        initComponent();

        addGBC(bt1, 0,1,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt2, 1,1,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt3, 2,1,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addGBC(bt4, 0,2,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt5, 1,2,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt6, 2,2,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addGBC(bt7, 0,3,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt8, 1,3,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt9, 2,3,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

        addGBC(btp, 0,4,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(bt0, 1,4,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addGBC(btsinal, 2,4,1,1,0.1f, 0.1f, 1,1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);

    }

    public void initComponent(){
        bt0 = new JButton(" 0 ");
        bt1 = new JButton(" 1 ");
        bt2 = new JButton(" 2 ");
        bt3 = new JButton(" 3 ");
        bt4 = new JButton(" 4 ");
        bt5 = new JButton(" 5 ");
        bt6 = new JButton(" 6 ");
        bt7 = new JButton(" 7 ");
        bt8 = new JButton(" 8 ");
        bt9 = new JButton(" 9 ");
        btp = new JButton(" . ");
        btsinal = new JButton("-/+");
    }

}
