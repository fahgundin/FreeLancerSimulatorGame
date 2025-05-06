package FreeLancer;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public int val_max; // o valor de 100% do botao
    public String titulo; // o titulo do botao
    private int value;
    private JButton button = new JButton(); // o botao
    Player player;

    public Buttons(String titulo, int val_max, JPanel panel, int value, int y, Player player) {
        this.player = player;
        this.titulo = titulo; // declarando titulo
        this.val_max = val_max; // declarando o 100
        button = new JButton(this.titulo); // colocando o botao
        button.setBounds(20, y, 350, 20); // posição e dimensão do botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ProgressBar(Game.panel, button.getWidth() + 20, button.getY(), val_max, button, value, player);
                
                
            }
        });

        // ActionListener
        panel.add(button); // adicionando o botao na tela
        
        
    }

}
