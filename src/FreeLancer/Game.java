package FreeLancer;

import FreeLancer.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.xml.crypto.Data;

import java.lang.Class;

public class Game extends Frame {

    public static JPanel panel = new JPanel(); // painel
    public static JPanel ljpanel = new JPanel();
    public static Player player = new Player();
    public static JLabel dinheiro_do_jogador = new JLabel(String.format("%d $",0));
    public static ItensLoja[] item = new ItensLoja[9];

    public static Buttons[] actions = new Buttons[10]; // quantidade de ações, "programar hello world" e etc

    public static void main(String[] args) throws Exception {        

        

        dinheiro_do_jogador.setText(String.format("%d $",player.bit_coins));
        DataBase.getConnection();
        player.setCoin(DataBase.getMoney());
        Game.dinheiro_do_jogador.setText(String.format("%d $",player.bit_coins));
        ljpanel.add(dinheiro_do_jogador);
        
        new DataBase();
        

        mainPanel();
        tabs();
        
        

        


    }
    public static void lojaPanel() throws Exception{
        ljpanel.setLayout(new FlowLayout());
        ljpanel.setBackground(Color.GRAY);
        ljpanel.setVisible(true);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(625,1500));
        JScrollPane pane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setPreferredSize(new Dimension(620,480));


        

        
        
        item[0] = new ItensLoja("Página com 3 seções e um botão ", 180, panel, 0, 5000, 55,DataBase.checkActivated(0)); 
        item[1] = new ItensLoja("Landing page com formulário", 300, panel,1, 7500, 80,DataBase.checkActivated(1)); 
        item[2] = new ItensLoja("Sistema de login que só funciona no localhost", 520, panel,2, 10000, 120,DataBase.checkActivated(2)); 
        item[3] = new ItensLoja("Chat em tempo real (com refresh manual)", 950, panel,3, 15000, 175,DataBase.checkActivated(3));
        item[4] = new ItensLoja("E-commerce com carrinho, sem checkout", 1520, panel,4, 20000, 250,DataBase.checkActivated(4)); 
        item[5] = new ItensLoja("Dashboard com gráficos", 2200, panel,5, 40000, 500,DataBase.checkActivated(5)); 
        item[6] = new ItensLoja("Site multilíngue que só tem português", 2990, panel,6, 100000, 1500,DataBase.checkActivated(6)); 
        item[7] = new ItensLoja("Site responsivo… só no Chrome", 4000, panel,7, 125000,2000,DataBase.checkActivated(7)); 
        item[8] = new ItensLoja("Sistema legado feito em COBOL", 7000, panel,8, 200000, 5000,DataBase.checkActivated(8));  

        ljpanel.add(pane);


    }
    public static void mainPanel(){
        panel.setSize(520, 580); // o tamanho do painel
        panel.setLayout(null); // layout do painel(sempre em null )


        

        actions[0] = new Buttons("Site com <h1>Hello World</h1>", 1000, panel, 10, 20, player); // aqui são os botoes, pode ser
                                                                                         // de 0 a
    }
}
