package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;

public class Login {
	/***************************************************************
	 * El usuario y contraseña para entrar es admin en ambos campos*
	 ***************************************************************/

	private JFrame frameLogin;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField tfUsuario;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JButton btnLimpiar;
	private JLabel lblTitulo;
	private JLabel lblAviso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	public JFrame getFrame() {
		return frameLogin;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.setResizable(false);
		frameLogin.setTitle(MessagesLogin.getString("Login.frameLogin.title")); //$NON-NLS-1$
		frameLogin.setBounds(100, 100, 547, 353);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frameLogin.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		lblUsuario = new JLabel(MessagesLogin.getString("Login.lblUsuario.text")); //$NON-NLS-1$
		lblUsuario.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblUsuario.setBounds(93, 93, 87, 16);
		panel.add(lblUsuario);

		lblContrasea = new JLabel(MessagesLogin.getString("Login.lblContrasea.text")); //$NON-NLS-1$
		lblContrasea.setFont(new Font("Verdana", Font.PLAIN, 15)); //$NON-NLS-1$
		lblContrasea.setBounds(93, 137, 97, 16);
		panel.add(lblContrasea);

		tfUsuario = new JTextField();
		tfUsuario.addFocusListener(new TfUsuarioFocusListener());
		tfUsuario.setBounds(202, 91, 215, 22);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addFocusListener(new TfUsuarioFocusListener());
		passwordField.setBounds(202, 135, 215, 22);
		panel.add(passwordField);

		btnEntrar = new JButton(MessagesLogin.getString("Login.btnEntrar.text")); //$NON-NLS-1$
		btnEntrar.setIcon(new ImageIcon(Login.class.getResource(MessagesLogin.getString("Login.2")))); //$NON-NLS-1$
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(93, 202, 153, 54);
		panel.add(btnEntrar);

		btnLimpiar = new JButton(MessagesLogin.getString("Login.btnLimpiar.text")); //$NON-NLS-1$
		btnLimpiar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/double-sided-eraser.png"))); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		btnLimpiar.setBounds(264, 202, 153, 54);
		panel.add(btnLimpiar);

		lblTitulo = new JLabel(MessagesLogin.getString("Login.lblTitulo.text")); //$NON-NLS-1$
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Sitka Subheading", Font.BOLD, 18)); //$NON-NLS-1$
		lblTitulo.setBounds(49, 23, 441, 46);
		panel.add(lblTitulo);

		lblAviso = new JLabel(""); //$NON-NLS-1$
		lblAviso.setOpaque(true);
		lblAviso.setBounds(93, 170, 324, 34);
		panel.add(lblAviso);
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (!(String.valueOf(tfUsuario.getText()).equals("admin")) //$NON-NLS-1$
					|| !(String.valueOf(passwordField.getPassword()).equals("admin"))) { //$NON-NLS-1$
				lblAviso.setForeground(Color.RED);
				lblAviso.setText(MessagesLogin.getString("Login.UsuarioCont")); //$NON-NLS-1$
				lblAviso.setVisible(true);
			} else {
				new Inicio().getFrame().setVisible(true);
				frameLogin.dispose();
			}
			/*new Inicio().getFrame().setVisible(true);
			frameLogin.dispose();*/
		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			tfUsuario.setText(""); //$NON-NLS-1$
			passwordField.setText(""); //$NON-NLS-1$
		}
	}

	private class TfUsuarioFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			lblAviso.setVisible(false);
		}
	}
}
