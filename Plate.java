import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
public class Plate extends JFrame
{
    public Plate()
    {
        setTitle("Esseky");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel grid = new JPanel(new GridLayout(8, 8));
        JButton[][] square = new JButton[8][8];
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                square[i][j] = new JButton();
                if((i+j)%2 == 0)
                    square[i][j].setBackground(Color.WHITE);
                else
                    square[i][j].setBackground(Color.DARK_GRAY);
                square[i][j].setBorderPainted(true);
                grid.add(square[i][j]);
            }
        }
        add(grid);
        setVisible(true);
    }
    public void initializePlate()
    {

    }
    public void update()
    {
        
    }

}