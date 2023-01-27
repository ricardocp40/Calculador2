import java.awt.*;

public class Teclado extends Panel{

    private  PainelNumerico pn;
    private PainelVisor pv;
    private PainelOperacao po;
    private PainelFun pf;

    public Teclado(){
        pn = new PainelNumerico();
        pv = new PainelVisor();
        po = new PainelOperacao();
        pf = new PainelFun();

       addGBC(pv, 0, 0,3,1, 0.5f, 0.5f, 0, 0, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
       addGBC(pn, 0, 1,1,1, 1f, 1f, 1, 1, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
       addGBC(po, 1, 1,1,1, 0.5f, 0.5f, 0, 0, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
       addGBC(pf, 2, 1,1,1, 0.5f, 0.5f, 0, 0, new Insets(2,2,2,2), GridBagConstraints.BOTH, GridBagConstraints.CENTER);
       //revalidate();
    }


}
