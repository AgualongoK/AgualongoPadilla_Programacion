import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Formulario extends JFrame{
    private JPanel mainPanel;
    private JLabel Adivinador;
    private JLabel Peticion;
    private JTextField textField1;
    private JLabel Pregunta;
    private JTextField textField2;
    private JSeparator id2;
    private JSeparator id4;
    private JSeparator id1;
    private JSeparator id3;


    String oracion= "Me gustaria saber lo siguiente ";
    Integer contador = 0;
    String respuesta="";
    boolean punto=false;

    public Formulario(){
        setContentPane(mainPanel);
        setTitle("Adivinador");
        setSize(500, 400);
        setLocation(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(e.getKeyChar()=='.'){
                    punto=true;
                }
                if(punto==false){
                    respuesta=respuesta+e.getKeyChar();
                }
                if(contador<oracion.length()){
                        e.setKeyChar(oracion.charAt(contador));
                    }
                contador++;
            }
        });

        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    JOptionPane.showMessageDialog(null, respuesta);
                }
            }
        });
    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
    }

}
