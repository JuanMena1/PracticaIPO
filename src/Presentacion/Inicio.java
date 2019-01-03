package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frmInicio;
	private JPanel panel;
	private JButton btnPedidos;
	private JButton btnClientesVip;
	private JButton btnOfertasYMens;
	private JButton btnProductos;
	private JButton btnReparto;
	private JButton btnCerrarSesin;
	private JLabel lblFoto;
	private JLabel lblInfo;
	private JMenuBar menuBar;
	private JMenu mnIdioma;
	private JMenu mnFuente;
	private JMenu mnAyuda;
	private JRadioButtonMenuItem rdbtnmntmEspaol;
	private JRadioButtonMenuItem rdbtnmntmIngls;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButtonMenuItem rdbtnmntmPequea;
	private JRadioButtonMenuItem rdbtnmntmNormal;
	private JRadioButtonMenuItem rdbtnmntmGrande;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private Principal PrincipalWin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	public JFrame getFrame() {
		return frmInicio;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setTitle("Inicio");
		frmInicio.setBounds(100, 100, 750, 575);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frmInicio.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 38, 135, 190, 84, 175, 141, 34, 0 };
		gbl_panel.rowHeights = new int[] { 38, 0, 91, 100, 60, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/16480.jpg")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 4;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);

		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		lblInfo = new JLabel(
				"<html>Usuario: Admin" + "<br>Último acceso" + "<br>" + formato.format(new Date()) + "</html>");
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfo.gridx = 5;
		gbc_lblInfo.gridy = 0;
		panel.add(lblInfo, gbc_lblInfo);
		
				btnClientesVip = new JButton("Clientes VIP");
				btnClientesVip.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/star.png")));
				btnClientesVip.addActionListener(new BtnClientesVipActionListener());
				GridBagConstraints gbc_btnClientesVip = new GridBagConstraints();
				gbc_btnClientesVip.gridwidth = 2;
				gbc_btnClientesVip.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnClientesVip.insets = new Insets(0, 0, 5, 5);
				gbc_btnClientesVip.gridx = 1;
				gbc_btnClientesVip.gridy = 1;
				panel.add(btnClientesVip, gbc_btnClientesVip);
		
				btnProductos = new JButton("Productos");
				btnProductos
						.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/shopping-cart-black-shape (1).png")));
				btnProductos.addActionListener(new BtnProductosActionListener());
				GridBagConstraints gbc_btnProductos = new GridBagConstraints();
				gbc_btnProductos.gridwidth = 2;
				gbc_btnProductos.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnProductos.insets = new Insets(0, 0, 5, 5);
				gbc_btnProductos.gridx = 4;
				gbc_btnProductos.gridy = 1;
				panel.add(btnProductos, gbc_btnProductos);

		btnReparto = new JButton("Reparto");
		btnReparto.addActionListener(new BtnRepartoActionListener());
		btnReparto.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/scooter.png")));
		btnReparto.addActionListener(new BtnRepartoActionListener());
		
				btnOfertasYMens = new JButton("Ofertas y menús");
				btnOfertasYMens.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/tag.png")));
				btnOfertasYMens.addActionListener(new BtnOfertasYMensActionListener());
				
						btnPedidos = new JButton("Pedidos");
						btnPedidos.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/shopping-list.png")));
						btnPedidos.addActionListener(new BtnPedidosActionListener());
						GridBagConstraints gbc_btnPedidos = new GridBagConstraints();
						gbc_btnPedidos.gridwidth = 2;
						gbc_btnPedidos.fill = GridBagConstraints.HORIZONTAL;
						gbc_btnPedidos.insets = new Insets(0, 0, 5, 5);
						gbc_btnPedidos.gridx = 1;
						gbc_btnPedidos.gridy = 2;
						panel.add(btnPedidos, gbc_btnPedidos);
				GridBagConstraints gbc_btnOfertasYMens = new GridBagConstraints();
				gbc_btnOfertasYMens.gridwidth = 2;
				gbc_btnOfertasYMens.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnOfertasYMens.insets = new Insets(0, 0, 5, 5);
				gbc_btnOfertasYMens.gridx = 4;
				gbc_btnOfertasYMens.gridy = 2;
				panel.add(btnOfertasYMens, gbc_btnOfertasYMens);
		GridBagConstraints gbc_btnReparto = new GridBagConstraints();
		gbc_btnReparto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnReparto.gridwidth = 3;
		gbc_btnReparto.insets = new Insets(0, 0, 5, 5);
		gbc_btnReparto.gridx = 2;
		gbc_btnReparto.gridy = 3;
		panel.add(btnReparto, gbc_btnReparto);

		btnCerrarSesin = new JButton("Cerrar sesión");
		btnCerrarSesin.setIcon(new ImageIcon(Inicio.class.getResource("/Presentacion/sign-out-option.png")));
		btnCerrarSesin.addActionListener(new BtnCerrarSesinActionListener());
		GridBagConstraints gbc_btnCerrarSesin = new GridBagConstraints();
		gbc_btnCerrarSesin.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesin.anchor = GridBagConstraints.EAST;
		gbc_btnCerrarSesin.gridwidth = 2;
		gbc_btnCerrarSesin.gridx = 4;
		gbc_btnCerrarSesin.gridy = 4;
		panel.add(btnCerrarSesin, gbc_btnCerrarSesin);

		menuBar = new JMenuBar();
		frmInicio.setJMenuBar(menuBar);

		mnIdioma = new JMenu("Idioma");
		menuBar.add(mnIdioma);

		rdbtnmntmEspaol = new JRadioButtonMenuItem("Español");
		buttonGroup.add(rdbtnmntmEspaol);
		mnIdioma.add(rdbtnmntmEspaol);

		rdbtnmntmIngls = new JRadioButtonMenuItem("Inglés");
		buttonGroup.add(rdbtnmntmIngls);
		mnIdioma.add(rdbtnmntmIngls);

		mnFuente = new JMenu("Fuente");
		menuBar.add(mnFuente);

		rdbtnmntmPequea = new JRadioButtonMenuItem("Pequeña");
		buttonGroup_1.add(rdbtnmntmPequea);
		mnFuente.add(rdbtnmntmPequea);

		rdbtnmntmNormal = new JRadioButtonMenuItem("Normal");
		buttonGroup_1.add(rdbtnmntmNormal);
		mnFuente.add(rdbtnmntmNormal);

		rdbtnmntmGrande = new JRadioButtonMenuItem("Grande");
		buttonGroup_1.add(rdbtnmntmGrande);
		mnFuente.add(rdbtnmntmGrande);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
	}

	private class BtnProductosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (PrincipalWin == null) {
				PrincipalWin = new Principal();
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(1);
			} else {
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(1);
			}
		}
	}

	private class BtnPedidosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (PrincipalWin == null) {
				PrincipalWin = new Principal();
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(2);
			} else {
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(2);
			}
		}
	}

	private class BtnClientesVipActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (PrincipalWin == null) {
				PrincipalWin = new Principal();
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(0);
			} else {
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(0);

			}
		}
	}

	private class BtnOfertasYMensActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (PrincipalWin == null) {
				PrincipalWin = new Principal();
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(3);
			} else {
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(3);
			}
		}
	}

	private class BtnRepartoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (PrincipalWin == null) {
				PrincipalWin = new Principal();
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(4);
			} else {
				PrincipalWin.getFrame().setVisible(true);
				PrincipalWin.getTabbedPane().setSelectedIndex(4);
			}
		}
	}
	
	private class BtnCerrarSesinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			new Login().getFrame().setVisible(true);
			frmInicio.dispose();
		}
	}
}
