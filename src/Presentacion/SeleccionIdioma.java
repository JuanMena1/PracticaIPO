package Presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class SeleccionIdioma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rdbtnIngls;
	private JRadioButton rdbtnEspaol;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccionIdioma dialog = new SeleccionIdioma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionIdioma() {
		setBounds(100, 100, 577, 141);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblSeleccioneElIdioma = new JLabel("Seleccione el idioma deseado: ");
			contentPanel.add(lblSeleccioneElIdioma);
		}
		{
			rdbtnEspaol = new JRadioButton("Español");
			buttonGroup.add(rdbtnEspaol);
			rdbtnEspaol.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/Presentacion/banderaEsp.gif")));
			contentPanel.add(rdbtnEspaol);
		}
		{
			rdbtnIngls = new JRadioButton("Inglés");
			buttonGroup.add(rdbtnIngls);
			rdbtnIngls.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/Presentacion/banderaIng.gif")));
			contentPanel.add(rdbtnIngls);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new OkButtonActionListener());
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	private class OkButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (rdbtnIngls.isSelected()) {
				MessagesLogin.setIdioma("inglés");
				MessagesInicio.setIdioma("inglés");
				MessagesPrincipal.setIdioma("inglés");
				MessagesTicket.setIdioma("inglés");
			}
			Login login = new Login();
			login.getFrame().setVisible(true);
			dispose();
		}
	}
}
