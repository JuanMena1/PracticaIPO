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
	private JTable table;
	private JButton btnImprimir;

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicket = new JFrame();
		frmTicket.setTitle("Ticket");
		frmTicket.setBounds(100, 100, 628, 689);
		frmTicket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{33, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmTicket.getContentPane().setLayout(gridBagLayout);
		
		lblCliente = new JLabel("Cliente:");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.WEST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 1;
		gbc_lblCliente.gridy = 1;
		frmTicket.getContentPane().add(lblCliente, gbc_lblCliente);
		
		lblClienteVip = new JLabel("Cliente VIP:");
		GridBagConstraints gbc_lblClienteVip = new GridBagConstraints();
		gbc_lblClienteVip.anchor = GridBagConstraints.WEST;
		gbc_lblClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_lblClienteVip.gridx = 1;
		gbc_lblClienteVip.gridy = 2;
		frmTicket.getContentPane().add(lblClienteVip, gbc_lblClienteVip);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Cantidad", "Precio"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 5;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		frmTicket.getContentPane().add(table, gbc_table);
		
		lblTotal = new JLabel("Total:");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.WEST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 4;
		gbc_lblTotal.gridy = 4;
		frmTicket.getContentPane().add(lblTotal, gbc_lblTotal);
		
		lblPuntosRecibidos = new JLabel("Puntos recibidos:");
		GridBagConstraints gbc_lblPuntosRecibidos = new GridBagConstraints();
		gbc_lblPuntosRecibidos.anchor = GridBagConstraints.WEST;
		gbc_lblPuntosRecibidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosRecibidos.gridx = 4;
		gbc_lblPuntosRecibidos.gridy = 5;
		frmTicket.getContentPane().add(lblPuntosRecibidos, gbc_lblPuntosRecibidos);
		
		lblDescuento = new JLabel("Descuento:");
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.anchor = GridBagConstraints.WEST;
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento.gridx = 4;
		gbc_lblDescuento.gridy = 6;
		frmTicket.getContentPane().add(lblDescuento, gbc_lblDescuento);
		
		lblEnvioADomocilio = new JLabel("Envio a domocilio:");
		GridBagConstraints gbc_lblEnvioADomocilio = new GridBagConstraints();
		gbc_lblEnvioADomocilio.anchor = GridBagConstraints.WEST;
		gbc_lblEnvioADomocilio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnvioADomocilio.gridx = 4;
		gbc_lblEnvioADomocilio.gridy = 7;
		frmTicket.getContentPane().add(lblEnvioADomocilio, gbc_lblEnvioADomocilio);
		
		lblImporteTotal = new JLabel("Importe Total:");
		GridBagConstraints gbc_lblImporteTotal = new GridBagConstraints();
		gbc_lblImporteTotal.gridwidth = 2;
		gbc_lblImporteTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblImporteTotal.gridx = 2;
		gbc_lblImporteTotal.gridy = 8;
		frmTicket.getContentPane().add(lblImporteTotal, gbc_lblImporteTotal);
		
		lblMtodoDePago = new JLabel("Método de pago:");
		GridBagConstraints gbc_lblMtodoDePago = new GridBagConstraints();
		gbc_lblMtodoDePago.gridwidth = 2;
		gbc_lblMtodoDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtodoDePago.gridx = 2;
		gbc_lblMtodoDePago.gridy = 9;
		frmTicket.getContentPane().add(lblMtodoDePago, gbc_lblMtodoDePago);
		
		lblLeAtendi = new JLabel("Le atendió:");
		GridBagConstraints gbc_lblLeAtendi = new GridBagConstraints();
		gbc_lblLeAtendi.gridwidth = 2;
		gbc_lblLeAtendi.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeAtendi.gridx = 2;
		gbc_lblLeAtendi.gridy = 10;
		frmTicket.getContentPane().add(lblLeAtendi, gbc_lblLeAtendi);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(Ticket.class.getResource("/Presentacion/printer.png")));
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.gridwidth = 3;
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimir.gridx = 2;
		gbc_btnImprimir.gridy = 12;
		frmTicket.getContentPane().add(btnImprimir, gbc_btnImprimir);
	}

}
