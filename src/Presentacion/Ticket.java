package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Ticket {

	private JFrame frmTicket;
	private JLabel lblCliente;
	private JLabel lblClienteVip;
	private JLabel lblTotal;
	private JLabel lblPuntosRecibidos;
	private JLabel lblDescuento;
	private JLabel lblEnvioADomocilio;
	private JLabel lblImporteTotal;
	private JLabel lblMtodoDePago;
	private JLabel lblLeAtendi;
	private JButton btnImprimir;
	private JTextField txtTotal;
	private JTextField txtPuntosRecibidos;
	private JTextField txtDescuento;
	private JTextField txtEnvioADomocilio;
	private JTextField txtImporteTotal;
	private JTextField txtMetodoDePago;
	private JTextField txtLeAtendio;
	private JTextField txtCliente;
	private JTextField txtClienteVip;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
					window.frmTicket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket() {
		initialize();
	}

	public JFrame getFrame() {
		return frmTicket;
	}

	public JTextField getMetodoPago() {
		return txtMetodoDePago;
	}
	public JTextField getLeAtendio() {
		return 	txtLeAtendio;
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicket = new JFrame();
		frmTicket.setResizable(false);
		frmTicket.setTitle(MessagesTicket.getString("Ticket.frmTicket.title")); //$NON-NLS-1$
		frmTicket.setBounds(600, 150, 537, 689);
		frmTicket.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 101, 89, 151, 123, 61, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 23, 0, 9, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		frmTicket.getContentPane().setLayout(gridBagLayout);

		lblCliente = new JLabel(MessagesTicket.getString("Ticket.lblCliente.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.WEST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 0;
		gbc_lblCliente.gridy = 1;
		frmTicket.getContentPane().add(lblCliente, gbc_lblCliente);

		txtCliente = new JTextField();
		txtCliente.setText("Ana Martín"); //$NON-NLS-1$
		txtCliente.setEditable(false);
		txtCliente.setBorder(null);
		txtCliente.setHorizontalAlignment(SwingConstants.LEFT);
		txtCliente.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtCliente = new GridBagConstraints();
		gbc_txtCliente.gridwidth = 2;
		gbc_txtCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCliente.gridx = 1;
		gbc_txtCliente.gridy = 1;
		frmTicket.getContentPane().add(txtCliente, gbc_txtCliente);
		txtCliente.setColumns(10);

		lblClienteVip = new JLabel(MessagesTicket.getString("Ticket.lblClienteVip.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblClienteVip = new GridBagConstraints();
		gbc_lblClienteVip.anchor = GridBagConstraints.WEST;
		gbc_lblClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_lblClienteVip.gridx = 0;
		gbc_lblClienteVip.gridy = 2;
		frmTicket.getContentPane().add(lblClienteVip, gbc_lblClienteVip);

		txtClienteVip = new JTextField();
		txtClienteVip.setText(MessagesTicket.getString("Ticket.txtClienteVip.text")); //$NON-NLS-1$
		txtClienteVip.setEditable(false);
		txtClienteVip.setBorder(null);
		txtClienteVip.setHorizontalAlignment(SwingConstants.LEFT);
		txtClienteVip.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtClienteVip = new GridBagConstraints();
		gbc_txtClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_txtClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClienteVip.gridx = 1;
		gbc_txtClienteVip.gridy = 2;
		frmTicket.getContentPane().add(txtClienteVip, gbc_txtClienteVip);
		txtClienteVip.setColumns(10);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		frmTicket.getContentPane().add(scrollPane, gbc_scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(
			new Object[][] {
				{MessagesTicket.getString("Ticket.ProductoNombre1"), new Integer(1), new Double(7.99)}, //$NON-NLS-1$
				{MessagesTicket.getString("Ticket.ProductoNombre2"), new Integer(2), new Double(16.98)}, //$NON-NLS-1$
				{MessagesTicket.getString("Ticket.ProductoNombre3"), new Integer(2), new Double(3.0)}, //$NON-NLS-1$
			},
			new String[] {
				MessagesTicket.getString("Ticket.ProductoColNombre"), MessagesTicket.getString("Ticket.ProductoColCantidadTic"), MessagesTicket.getString("Ticket.ProductoColPrecioTic") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setMinWidth(10);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setMinWidth(10);
		scrollPane.setViewportView(table);

		lblTotal = new JLabel(MessagesTicket.getString("Ticket.lblTotal.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.WEST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 3;
		gbc_lblTotal.gridy = 4;
		frmTicket.getContentPane().add(lblTotal, gbc_lblTotal);

		txtTotal = new JTextField();
		txtTotal.setText("27.97€"); //$NON-NLS-1$
		txtTotal.setBorder(null);
		txtTotal.setHorizontalAlignment(SwingConstants.LEFT);
		txtTotal.setEditable(false);
		txtTotal.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.anchor = GridBagConstraints.NORTH;
		gbc_txtTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 4;
		gbc_txtTotal.gridy = 4;
		frmTicket.getContentPane().add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

		lblPuntosRecibidos = new JLabel(MessagesTicket.getString("Ticket.lblPuntosRecibidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPuntosRecibidos = new GridBagConstraints();
		gbc_lblPuntosRecibidos.anchor = GridBagConstraints.WEST;
		gbc_lblPuntosRecibidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosRecibidos.gridx = 3;
		gbc_lblPuntosRecibidos.gridy = 5;
		frmTicket.getContentPane().add(lblPuntosRecibidos, gbc_lblPuntosRecibidos);

		txtPuntosRecibidos = new JTextField();
		txtPuntosRecibidos.setText("2"); //$NON-NLS-1$
		txtPuntosRecibidos.setBorder(null);
		txtPuntosRecibidos.setHorizontalAlignment(SwingConstants.LEFT);
		txtPuntosRecibidos.setEditable(false);
		txtPuntosRecibidos.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtPuntosRecibidos = new GridBagConstraints();
		gbc_txtPuntosRecibidos.anchor = GridBagConstraints.NORTH;
		gbc_txtPuntosRecibidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntosRecibidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntosRecibidos.gridx = 4;
		gbc_txtPuntosRecibidos.gridy = 5;
		frmTicket.getContentPane().add(txtPuntosRecibidos, gbc_txtPuntosRecibidos);
		txtPuntosRecibidos.setColumns(10);

		lblDescuento = new JLabel(MessagesTicket.getString("Ticket.lblDescuento.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.anchor = GridBagConstraints.WEST;
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento.gridx = 3;
		gbc_lblDescuento.gridy = 6;
		frmTicket.getContentPane().add(lblDescuento, gbc_lblDescuento);

		txtDescuento = new JTextField();
		txtDescuento.setText("-20%"); //$NON-NLS-1$
		txtDescuento.setBorder(null);
		txtDescuento.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescuento.setEditable(false);
		txtDescuento.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtDescuento = new GridBagConstraints();
		gbc_txtDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescuento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescuento.gridx = 4;
		gbc_txtDescuento.gridy = 6;
		frmTicket.getContentPane().add(txtDescuento, gbc_txtDescuento);
		txtDescuento.setColumns(10);

		lblEnvioADomocilio = new JLabel(MessagesTicket.getString("Ticket.lblEnvioADomocilio.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEnvioADomocilio = new GridBagConstraints();
		gbc_lblEnvioADomocilio.anchor = GridBagConstraints.WEST;
		gbc_lblEnvioADomocilio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnvioADomocilio.gridx = 3;
		gbc_lblEnvioADomocilio.gridy = 7;
		frmTicket.getContentPane().add(lblEnvioADomocilio, gbc_lblEnvioADomocilio);

		txtEnvioADomocilio = new JTextField();
		txtEnvioADomocilio.setText("2.00€"); //$NON-NLS-1$
		txtEnvioADomocilio.setBorder(null);
		txtEnvioADomocilio.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnvioADomocilio.setEditable(false);
		txtEnvioADomocilio.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtEnvioADomocilio = new GridBagConstraints();
		gbc_txtEnvioADomocilio.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnvioADomocilio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnvioADomocilio.gridx = 4;
		gbc_txtEnvioADomocilio.gridy = 7;
		frmTicket.getContentPane().add(txtEnvioADomocilio, gbc_txtEnvioADomocilio);
		txtEnvioADomocilio.setColumns(10);

		lblImporteTotal = new JLabel(MessagesTicket.getString("Ticket.lblImporteTotal.text")); //$NON-NLS-1$
		lblImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
		GridBagConstraints gbc_lblImporteTotal = new GridBagConstraints();
		gbc_lblImporteTotal.gridwidth = 2;
		gbc_lblImporteTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblImporteTotal.gridx = 1;
		gbc_lblImporteTotal.gridy = 9;
		frmTicket.getContentPane().add(lblImporteTotal, gbc_lblImporteTotal);

		txtImporteTotal = new JTextField();
		txtImporteTotal.setText("24.37€"); //$NON-NLS-1$
		txtImporteTotal.setBorder(null);
		txtImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
		txtImporteTotal.setHorizontalAlignment(SwingConstants.LEFT);
		txtImporteTotal.setEditable(false);
		txtImporteTotal.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtImporteTotal = new GridBagConstraints();
		gbc_txtImporteTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtImporteTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtImporteTotal.gridx = 3;
		gbc_txtImporteTotal.gridy = 9;
		frmTicket.getContentPane().add(txtImporteTotal, gbc_txtImporteTotal);
		txtImporteTotal.setColumns(10);

		lblMtodoDePago = new JLabel(MessagesTicket.getString("Ticket.lblMtodoDePago.text")); //$NON-NLS-1$
		lblMtodoDePago.setFont(new Font("Tahoma", Font.PLAIN, 13)); //$NON-NLS-1$
		GridBagConstraints gbc_lblMtodoDePago = new GridBagConstraints();
		gbc_lblMtodoDePago.gridwidth = 2;
		gbc_lblMtodoDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtodoDePago.gridx = 1;
		gbc_lblMtodoDePago.gridy = 10;
		frmTicket.getContentPane().add(lblMtodoDePago, gbc_lblMtodoDePago);

		txtMetodoDePago = new JTextField();
		txtMetodoDePago.setBorder(null);
		txtMetodoDePago.setHorizontalAlignment(SwingConstants.LEFT);
		txtMetodoDePago.setEditable(false);
		txtMetodoDePago.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtMetodoDePago = new GridBagConstraints();
		gbc_txtMetodoDePago.insets = new Insets(0, 0, 5, 5);
		gbc_txtMetodoDePago.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMetodoDePago.gridx = 3;
		gbc_txtMetodoDePago.gridy = 10;
		frmTicket.getContentPane().add(txtMetodoDePago, gbc_txtMetodoDePago);
		txtMetodoDePago.setColumns(10);

		lblLeAtendi = new JLabel(MessagesTicket.getString("Ticket.lblLeAtendi.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblLeAtendi = new GridBagConstraints();
		gbc_lblLeAtendi.gridwidth = 2;
		gbc_lblLeAtendi.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeAtendi.gridx = 1;
		gbc_lblLeAtendi.gridy = 11;
		frmTicket.getContentPane().add(lblLeAtendi, gbc_lblLeAtendi);

		txtLeAtendio = new JTextField();
		txtLeAtendio.setBorder(null);
		txtLeAtendio.setHorizontalAlignment(SwingConstants.LEFT);
		txtLeAtendio.setEditable(false);
		txtLeAtendio.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtLeAtendio = new GridBagConstraints();
		gbc_txtLeAtendio.insets = new Insets(0, 0, 5, 5);
		gbc_txtLeAtendio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLeAtendio.gridx = 3;
		gbc_txtLeAtendio.gridy = 11;
		frmTicket.getContentPane().add(txtLeAtendio, gbc_txtLeAtendio);
		txtLeAtendio.setColumns(10);

		btnImprimir = new JButton(MessagesTicket.getString("Ticket.btnImprimir.text")); //$NON-NLS-1$
		btnImprimir.setIcon(new ImageIcon(Ticket.class.getResource("/Presentacion/printer.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimir.gridx = 2;
		gbc_btnImprimir.gridy = 13;
		frmTicket.getContentPane().add(btnImprimir, gbc_btnImprimir);
	}

}
