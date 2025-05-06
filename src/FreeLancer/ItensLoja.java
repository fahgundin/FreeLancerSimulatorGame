package FreeLancer;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ItensLoja{
    public int value;
    public String name;
    public String description;
    private JButton button = new JButton();
    private boolean activated;


    public ItensLoja(String name, int value, JPanel panel, int id,int time, int itemvalue, boolean activated){
        this.name = name;
        this.value = value;
        setActivated(activated);
        button = new JButton(String.format("%s - %d $",this.name,this.value));
        button.setPreferredSize(new Dimension(300,300));
        button.setFont(new Font("Arial", Font.BOLD, 9));
        if(!this.activated){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    

                    button.setEnabled(buyItem(value,id,time));
                    setActivated(true);
                    
                }
            });
        }else{
            button.setEnabled(false);
            deployItem(id, time);
        }

        panel.add(button);
    }
    public boolean isActivated(){
        return activated;
    }
    public void setActivated(boolean setter){
        this.activated = setter;
    }



    private boolean buyItem(int value, int id, int time){
        if(Game.player.bit_coins >= value){
            Game.actions[id] = new Buttons(name, time, Game.panel, 20, 50 + (30*id), Game.player);
            Game.player.takeCoin(value);
            Game.dinheiro_do_jogador.setText(String.format("%d $",Game.player.bit_coins));
            
            return false;
        }else{
            JOptionPane.showMessageDialog(null,"Sem Moedas suficientes");
            return true;
        }


    }
    private void deployItem(int id, int time){
        Game.actions[id] = new Buttons(name, time, Game.panel, 20, 50 + (30*id), Game.player);
    }

}