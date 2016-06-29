package menu.notes.mailnote;

import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorPanel extends JPanel
{
	public static final int Window_Width = 700;
	public static final int Window_Height = 500;
	static JLabel toFieldError = new JLabel();
	static JLabel fromFieldError = new JLabel();
	static JLabel seclectNoteError = new JLabel();
	
	public ErrorPanel()
	{
		super();
		setOpaque(false);
	}
	
	public void initialize()
	{
		createComponents();
		addComponents();
	}
	
	public void createComponents()
	{
		URL url = ErrorPanel.class.getResource("/Button_Images/Notes/NoteErrors/Error.png");
		ImageIcon errorIcon = new ImageIcon(url);
		
		toFieldError.setIcon(errorIcon);
		fromFieldError.setIcon(errorIcon);
		seclectNoteError.setIcon(errorIcon);
		
		toFieldError.setToolTipText("Enter a Valid Email");
		fromFieldError.setToolTipText("Enter a name");
		seclectNoteError.setToolTipText("Select a note");
		
		toFieldError.setBounds(660,18,30,30);
		fromFieldError.setBounds(660,52,30,30);
		seclectNoteError.setBounds(660,79,30,30);
		
		hideAllErrors();
	}
	
	public void addComponents()
	{
		setLayout(null);
		setPreferredSize(new Dimension(Window_Width,Window_Height));
		
		add(toFieldError);
		add(fromFieldError);
		add(seclectNoteError);
	}
	
	public static void hideAllErrors()
	{
		toFieldError.setVisible(false);
		fromFieldError.setVisible(false);
		seclectNoteError.setVisible(false);
	}
}