/**
 * Selectable interface
 * @author boran
 * @version 02.07.2021
 */
public interface Selectable 
{
    boolean getSelected();
    void setSelected( boolean a);
    Shape contains(int x, int y);
}
