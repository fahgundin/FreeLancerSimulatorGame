package FreeLancer;

import java.awt.*;
import javax.swing.*;

public class Frame{
    public static int width; // largura do frame
    public static int height; // altura do frame
    static JFrame frame = new JFrame("FreeLancer Simulator"); 
    static JTabbedPane tabs = new JTabbedPane();

    public static void tabs() throws Exception{

        

        frame.add(tabs);
        CreateWindow();
        tabs.setBounds(0,0,625,550);
        tabs.addTab("Inicio", Game.panel );
        tabs.addTab("Loja", Game.ljpanel);
        tabs.add("Config", Config.painel);
        
        Game.lojaPanel();
        
        new Config();

        

    }
    
    public static void CreateWindow(){ // simplesmente cirar a janela, nada demais
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(700, 640);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        width = frame.getWidth();
        height = frame.getHeight();
        
    }
    
    
  

}