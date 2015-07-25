package menu.settings.security.login;

import java.awt.Graphics;

import javax.swing.JPasswordField;

import menu.buffer.BufferPanel;

public class EnterPassField extends JPasswordField
{
	BufferPanel bufferPanel;
	
	public EnterPassField (BufferPanel bufferPanel) 
    {
        this.bufferPanel = bufferPanel;
    }

 	protected void paintComponent(Graphics g) 
    {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    
    protected void paintBorder(Graphics g) 
    {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15,15);
    }
}