package Piece;
import javax.swing.ImageIcon;

public class Piece
{
    protected ImageIcon icone;
    protected String camp;
    protected String name;
    public void setName(String str)
    {
        name = str;
    }
    public String getName()
    {
        return name;
    }
    public void setCamp(String str)
    {
        camp = str;
    }
    public String getCamp()
    {
        return camp;
    }
    
    public Piece()
    {
        name = "";
        camp = "";
        icone = new ImageIcon();
    }
}