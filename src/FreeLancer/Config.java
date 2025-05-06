package FreeLancer;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Config extends Frame{
    public static JPanel painel = new JPanel();


    Config() throws Exception{
        painel.setSize(520, 580); // o tamanho do painel
        painel.setLayout(new FlowLayout()); // layout do painel(sempre em null )
        JButton salvar = new JButton("Salvar");
        JButton resetar = new JButton("Resetar Dados");
        salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    
                for(int i = 0; i < 9; i ++){
                    DataBase.setActivated(i, Game.item[i].isActivated());
                    System.out.println(Game.item[i].isActivated());
                    
                }

                DataBase.setMoney(1,Game.player.bit_coins);
                
            }catch(Exception EE){
                System.out.println(EE);
            }
            }
        });
        resetar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    
                    DataBase.disableAll();
                    DataBase.setMoney(1,0);
                    
                    DataBase.closeConnection();
                    System.exit(0);

                }catch(Exception EE){
                    System.out.println(EE);
                }
            }
        });


        painel.add(salvar);
        painel.add(resetar);


    }


    
}