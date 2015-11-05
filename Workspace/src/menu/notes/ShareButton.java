package menu.notes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import menu.buffer.BufferPanel;

public class ShareButton extends JButton
{
	private BufferPanel bufferPanel;
	
	public ShareButton (BufferPanel bufferPanel)
	{
		super();
		this.bufferPanel = bufferPanel;
	}
	
	public void initialize()
	{
		createBtn();
		addListeners();
	}
	
	public void createBtn()
	{
		setIcon(new ImageIcon("Images/Button_Images/Notes/Share.png"));
		validate();
	}
	
	public void addListeners()
	{
		addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("shareBtn");
			}
		});
	}
	
	

}
