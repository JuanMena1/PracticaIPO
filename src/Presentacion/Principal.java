package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;

public class Principal {

	private JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel tabClientes;
	private JPanel tabProductos;
	private JPanel tabOfertas;
	private JButton btnDarDeAlta;
	private JButton btnEditar;
	private JButton btnEliminar;
	private JScrollPane scrollPaneTree;
	private JScrollPane scrollPaneList;
	private JList list;
	private JList listCategorias;
	private JPanel pnlDetalles;
	private JTextField txtIngredientes;
	private JTextField txtAlergenos;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnS;
	private JRadioButton rdbtnNo;
	private JTextField txtPrecio;
	private JLabel lblPrecio;
	private JLabel lblPicante;
	private JLabel lblAlrgenos;
	private JLabel lblIngredientes;
	private JScrollPane scrollPane;
	private JList list_1;
	private JButton btnAadirClienteVip;
	private JButton btnEditarClienteVip;
	private JButton btnBorrarClienteVip;
	private JPanel panel;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelfono;
	private JLabel lblDireccin;
	private JLabel lblCorreoElectrnico;
	private JLabel lblVegetarianovegano;
	private JLabel lblAlrgenos_1;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JComboBox comboBox;
	private JTextField txtAlergenosC;
	private JLabel lblImagen;
	private JLabel lblFoto;
	private JPanel tabPedidos;
	private JPanel panelPedidos;
	private JButton btnCrearPedido;
	private JButton btnEditarPedido;
	private JButton btnEliminarPedido;
	private JScrollPane scrollPane_1;
	private JTable tablePedidos;
	private JButton btnAadirProducto;
	private JButton btnEditarProductos;
	private JButton btnEliminarProducto;
	private JLabel lblMtodoDePago;
	private JCheckBox chckbxEfectivo;
	private JCheckBox chckbxTarjeta;
	private JCheckBox chckbxCanjearPuntos;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JScrollPane scrollPane_2;
	private JLabel lblImporteTotal;
	private JTextField txtImporte;
	private JButton btnMostrarTicket;
	private JTable tableProductos;
	private JButton btnAadirOferta;
	private JButton btnEditarOferta;
	private JButton btnBorrarOferta;
	private JScrollPane scrollPane_3;
	private JList list_2;
	private JPanel pnlDetallesOf;
	private JPanel pnlEnvioOf;
	private JLabel lblDescripcin;
	private JTextField txtDesc;
	private JLabel lblValidaHasta;
	private JFormattedTextField ftxtValido;
	private JButton btnEnviar;
	private JButton btnEliminar_1;
	private JButton btnSeleccionar;
	private JScrollPane scrollPaneCVIP;
	private JScrollPane scrollPaneEnv;
	private JList listCVIP;
	private JList listEnv;
	private JLabel lblTotalClientesVip;
	private JLabel lblEnviarA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 1200, 600));
		// frame.setBounds(100, 100, 960, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabClientes = new JPanel();
		tabbedPane.addTab("Clientes", null, tabClientes, null);
		GridBagLayout gbl_tabClientes = new GridBagLayout();
		gbl_tabClientes.columnWidths = new int[]{0, 179, 52, 0, 0, 0, 0};
		gbl_tabClientes.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_tabClientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_tabClientes.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		tabClientes.setLayout(gbl_tabClientes);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		tabClientes.add(scrollPane, gbc_scrollPane);
		
		list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"VIP01 - Ana Martín", "VIP02 - Pedro Serrano", "VIP03 - Carlos Gallego"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 6;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 1;
		tabClientes.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{152, 52, 0, 246, 160, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 2;
		gbc_lblId.gridy = 1;
		panel.add(lblId, gbc_lblId);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.anchor = GridBagConstraints.NORTH;
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 3;
		gbc_txtID.gridy = 1;
		panel.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		lblImagen = new JLabel("Imagen");
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.gridheight = 4;
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 0;
		gbc_lblImagen.gridy = 2;
		panel.add(lblImagen, gbc_lblImagen);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 2;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 3;
		panel.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 3;
		gbc_txtApellidos.gridy = 3;
		panel.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblTelfono = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.WEST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 2;
		gbc_lblTelfono.gridy = 4;
		panel.add(lblTelfono, gbc_lblTelfono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 3;
		gbc_txtTelefono.gridy = 4;
		panel.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblDireccin = new JLabel("Dirección:");
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 2;
		gbc_lblDireccin.gridy = 5;
		panel.add(lblDireccin, gbc_lblDireccin);
		
		txtDireccion = new JTextField();
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 2;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 3;
		gbc_txtDireccion.gridy = 5;
		panel.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		lblFoto = new JLabel("Foto");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 6;
		panel.add(lblFoto, gbc_lblFoto);
		
		lblCorreoElectrnico = new JLabel("Correo electrónico:");
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.WEST;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 2;
		gbc_lblCorreoElectrnico.gridy = 6;
		panel.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		
		txtCorreo = new JTextField();
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.gridwidth = 2;
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridx = 3;
		gbc_txtCorreo.gridy = 6;
		panel.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);
		
		lblVegetarianovegano = new JLabel("Vegetariano/Vegano:");
		GridBagConstraints gbc_lblVegetarianovegano = new GridBagConstraints();
		gbc_lblVegetarianovegano.anchor = GridBagConstraints.WEST;
		gbc_lblVegetarianovegano.insets = new Insets(0, 0, 5, 5);
		gbc_lblVegetarianovegano.gridx = 2;
		gbc_lblVegetarianovegano.gridy = 7;
		panel.add(lblVegetarianovegano, gbc_lblVegetarianovegano);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Vegetariano/a", "Vegano/a"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 7;
		panel.add(comboBox, gbc_comboBox);
		
		lblAlrgenos_1 = new JLabel("Alérgenos:");
		GridBagConstraints gbc_lblAlrgenos_1 = new GridBagConstraints();
		gbc_lblAlrgenos_1.anchor = GridBagConstraints.WEST;
		gbc_lblAlrgenos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlrgenos_1.gridx = 2;
		gbc_lblAlrgenos_1.gridy = 8;
		panel.add(lblAlrgenos_1, gbc_lblAlrgenos_1);
		
		txtAlergenosC = new JTextField();
		txtAlergenosC.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_txtAlergenosC = new GridBagConstraints();
		gbc_txtAlergenosC.gridwidth = 2;
		gbc_txtAlergenosC.gridheight = 2;
		gbc_txtAlergenosC.fill = GridBagConstraints.BOTH;
		gbc_txtAlergenosC.gridx = 3;
		gbc_txtAlergenosC.gridy = 8;
		panel.add(txtAlergenosC, gbc_txtAlergenosC);
		txtAlergenosC.setColumns(10);
		
		btnAadirClienteVip = new JButton("Añadir cliente VIP");
		GridBagConstraints gbc_btnAadirClienteVip = new GridBagConstraints();
		gbc_btnAadirClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirClienteVip.gridx = 1;
		gbc_btnAadirClienteVip.gridy = 4;
		tabClientes.add(btnAadirClienteVip, gbc_btnAadirClienteVip);
		
		btnEditarClienteVip = new JButton("Editar cliente VIP");
		GridBagConstraints gbc_btnEditarClienteVip = new GridBagConstraints();
		gbc_btnEditarClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarClienteVip.gridx = 1;
		gbc_btnEditarClienteVip.gridy = 5;
		tabClientes.add(btnEditarClienteVip, gbc_btnEditarClienteVip);
		
		btnBorrarClienteVip = new JButton("Borrar cliente VIP");
		GridBagConstraints gbc_btnBorrarClienteVip = new GridBagConstraints();
		gbc_btnBorrarClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarClienteVip.gridx = 1;
		gbc_btnBorrarClienteVip.gridy = 6;
		tabClientes.add(btnBorrarClienteVip, gbc_btnBorrarClienteVip);

		tabProductos = new JPanel();
		tabbedPane.addTab("Productos", null, tabProductos, null);
		GridBagLayout gbl_tabProductos = new GridBagLayout();
		gbl_tabProductos.columnWidths = new int[] { 0, 144, 0, 450, 200, 0, 0 };
		gbl_tabProductos.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_tabProductos.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_tabProductos.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		tabProductos.setLayout(gbl_tabProductos);

		scrollPaneTree = new JScrollPane();
		scrollPaneTree.setMinimumSize(new Dimension(50, 50));
		GridBagConstraints gbc_scrollPaneTree = new GridBagConstraints();
		gbc_scrollPaneTree.gridwidth = 2;
		gbc_scrollPaneTree.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneTree.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneTree.gridx = 1;
		gbc_scrollPaneTree.gridy = 1;
		tabProductos.add(scrollPaneTree, gbc_scrollPaneTree);

		listCategorias = new JList();
		listCategorias.setPreferredSize(new Dimension(170, 170));
		listCategorias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listCategorias.setModel(new AbstractListModel() {
			String[] values = new String[] { "Ensaladas", "Arroces y pastas", "Pescados", "Asados", "Pizzas",
					"Hamburguesas", "Bocadillos", "Postres", "Bebidas" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPaneTree.setViewportView(listCategorias);

		scrollPaneList = new JScrollPane();
		GridBagConstraints gbc_scrollPaneList = new GridBagConstraints();
		gbc_scrollPaneList.gridheight = 4;
		gbc_scrollPaneList.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneList.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneList.gridx = 3;
		gbc_scrollPaneList.gridy = 1;
		tabProductos.add(scrollPaneList, gbc_scrollPaneList);

		list = new JList();
		scrollPaneList.setViewportView(list);

		pnlDetalles = new JPanel();
		pnlDetalles.setBorder(
				new TitledBorder(null, "Detalles del producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetalles = new GridBagConstraints();
		gbc_pnlDetalles.gridheight = 4;
		gbc_pnlDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_pnlDetalles.fill = GridBagConstraints.BOTH;
		gbc_pnlDetalles.gridx = 4;
		gbc_pnlDetalles.gridy = 1;
		tabProductos.add(pnlDetalles, gbc_pnlDetalles);
		GridBagLayout gbl_pnlDetalles = new GridBagLayout();
		gbl_pnlDetalles.columnWidths = new int[] { 90, 0, 50, 0 };
		gbl_pnlDetalles.rowHeights = new int[] { 36, 0, 38, 0, 39, 0, 0, 0, 37, 0 };
		gbl_pnlDetalles.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlDetalles.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlDetalles.setLayout(gbl_pnlDetalles);

		lblIngredientes = new JLabel("Ingredientes:");
		GridBagConstraints gbc_lblIngredientes = new GridBagConstraints();
		gbc_lblIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngredientes.gridx = 0;
		gbc_lblIngredientes.gridy = 0;
		pnlDetalles.add(lblIngredientes, gbc_lblIngredientes);

		txtIngredientes = new JTextField();
		GridBagConstraints gbc_txtIngredientes = new GridBagConstraints();
		gbc_txtIngredientes.gridwidth = 3;
		gbc_txtIngredientes.fill = GridBagConstraints.BOTH;
		gbc_txtIngredientes.insets = new Insets(0, 0, 5, 0);
		gbc_txtIngredientes.gridx = 0;
		gbc_txtIngredientes.gridy = 1;
		pnlDetalles.add(txtIngredientes, gbc_txtIngredientes);
		txtIngredientes.setColumns(10);

		lblAlrgenos = new JLabel("Alérgenos:");
		GridBagConstraints gbc_lblAlrgenos = new GridBagConstraints();
		gbc_lblAlrgenos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlrgenos.gridx = 0;
		gbc_lblAlrgenos.gridy = 2;
		pnlDetalles.add(lblAlrgenos, gbc_lblAlrgenos);

		txtAlergenos = new JTextField();
		GridBagConstraints gbc_txtAlergenos = new GridBagConstraints();
		gbc_txtAlergenos.gridwidth = 3;
		gbc_txtAlergenos.fill = GridBagConstraints.BOTH;
		gbc_txtAlergenos.insets = new Insets(0, 0, 5, 0);
		gbc_txtAlergenos.gridx = 0;
		gbc_txtAlergenos.gridy = 3;
		pnlDetalles.add(txtAlergenos, gbc_txtAlergenos);
		txtAlergenos.setColumns(10);

		lblPicante = new JLabel("Picante:");
		GridBagConstraints gbc_lblPicante = new GridBagConstraints();
		gbc_lblPicante.anchor = GridBagConstraints.WEST;
		gbc_lblPicante.insets = new Insets(0, 0, 5, 5);
		gbc_lblPicante.gridx = 0;
		gbc_lblPicante.gridy = 4;
		pnlDetalles.add(lblPicante, gbc_lblPicante);

		rdbtnS = new JRadioButton("Sí");
		buttonGroup.add(rdbtnS);
		GridBagConstraints gbc_rdbtnS = new GridBagConstraints();
		gbc_rdbtnS.anchor = GridBagConstraints.WEST;
		gbc_rdbtnS.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnS.gridx = 0;
		gbc_rdbtnS.gridy = 5;
		pnlDetalles.add(rdbtnS, gbc_rdbtnS);

		rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		GridBagConstraints gbc_rdbtnNo = new GridBagConstraints();
		gbc_rdbtnNo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNo.gridx = 1;
		gbc_rdbtnNo.gridy = 5;
		pnlDetalles.add(rdbtnNo, gbc_rdbtnNo);

		lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 6;
		pnlDetalles.add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.gridwidth = 2;
		gbc_txtPrecio.anchor = GridBagConstraints.NORTH;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 0;
		gbc_txtPrecio.gridy = 7;
		pnlDetalles.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		btnDarDeAlta = new JButton("Dar de alta");
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 2;
		tabProductos.add(btnDarDeAlta, gbc_btnDarDeAlta);

		btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 1;
		gbc_btnEditar.gridy = 3;
		tabProductos.add(btnEditar, gbc_btnEditar);

		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 1;
		gbc_btnEliminar.gridy = 4;
		tabProductos.add(btnEliminar, gbc_btnEliminar);
		
		tabPedidos = new JPanel();
		tabbedPane.addTab("Pedidos", null, tabPedidos, null);
		GridBagLayout gbl_tabPedidos = new GridBagLayout();
		gbl_tabPedidos.columnWidths = new int[]{0, 0, 0, 0};
		gbl_tabPedidos.rowHeights = new int[]{0, 0, 5, 0, 0, 0};
		gbl_tabPedidos.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_tabPedidos.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		tabPedidos.setLayout(gbl_tabPedidos);
		
		panelPedidos = new JPanel();
		panelPedidos.setBorder(new TitledBorder(null, "Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelPedidos = new GridBagConstraints();
		gbc_panelPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_panelPedidos.fill = GridBagConstraints.BOTH;
		gbc_panelPedidos.gridx = 1;
		gbc_panelPedidos.gridy = 1;
		tabPedidos.add(panelPedidos, gbc_panelPedidos);
		GridBagLayout gbl_panelPedidos = new GridBagLayout();
		gbl_panelPedidos.columnWidths = new int[]{822, 0, 0, 0};
		gbl_panelPedidos.rowHeights = new int[]{32, 0, 81, 0, 0};
		gbl_panelPedidos.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelPedidos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelPedidos.setLayout(gbl_panelPedidos);
		
		btnCrearPedido = new JButton("Crear pedido");
		GridBagConstraints gbc_btnCrearPedido = new GridBagConstraints();
		gbc_btnCrearPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrearPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnCrearPedido.gridx = 2;
		gbc_btnCrearPedido.gridy = 0;
		panelPedidos.add(btnCrearPedido, gbc_btnCrearPedido);
		
		btnEditarPedido = new JButton("Editar pedido");
		GridBagConstraints gbc_btnEditarPedido = new GridBagConstraints();
		gbc_btnEditarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarPedido.gridx = 2;
		gbc_btnEditarPedido.gridy = 1;
		panelPedidos.add(btnEditarPedido, gbc_btnEditarPedido);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panelPedidos.add(scrollPane_1, gbc_scrollPane_1);
		
		tablePedidos = new JTable();
		tablePedidos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Estado", "Tipo", "Fecha", "Hora", "Pagado", "Cliente", "ID Cliente", "VIP", "Importe", "Direcci\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, Boolean.class, Double.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablePedidos.getColumnModel().getColumn(0).setResizable(false);
		tablePedidos.getColumnModel().getColumn(1).setResizable(false);
		tablePedidos.getColumnModel().getColumn(2).setResizable(false);
		tablePedidos.getColumnModel().getColumn(3).setResizable(false);
		tablePedidos.getColumnModel().getColumn(4).setResizable(false);
		tablePedidos.getColumnModel().getColumn(5).setResizable(false);
		tablePedidos.getColumnModel().getColumn(6).setResizable(false);
		tablePedidos.getColumnModel().getColumn(7).setResizable(false);
		tablePedidos.getColumnModel().getColumn(8).setResizable(false);
		tablePedidos.getColumnModel().getColumn(9).setResizable(false);
		tablePedidos.getColumnModel().getColumn(10).setResizable(false);
		scrollPane_1.setViewportView(tablePedidos);
		
		btnEliminarPedido = new JButton("Eliminar pedido");
		GridBagConstraints gbc_btnEliminarPedido = new GridBagConstraints();
		gbc_btnEliminarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarPedido.gridx = 2;
		gbc_btnEliminarPedido.gridy = 3;
		panelPedidos.add(btnEliminarPedido, gbc_btnEliminarPedido);
		
		JPanel panelProductos = new JPanel();
		panelProductos.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelProductos = new GridBagConstraints();
		gbc_panelProductos.insets = new Insets(0, 0, 5, 5);
		gbc_panelProductos.fill = GridBagConstraints.BOTH;
		gbc_panelProductos.gridx = 1;
		gbc_panelProductos.gridy = 3;
		tabPedidos.add(panelProductos, gbc_panelProductos);
		GridBagLayout gbl_panelProductos = new GridBagLayout();
		gbl_panelProductos.columnWidths = new int[]{641, 0, 0, 0, 0, 0};
		gbl_panelProductos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelProductos.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelProductos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProductos.setLayout(gbl_panelProductos);
		
		btnAadirProducto = new JButton("Añadir producto");
		GridBagConstraints gbc_btnAadirProducto = new GridBagConstraints();
		gbc_btnAadirProducto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirProducto.gridx = 1;
		gbc_btnAadirProducto.gridy = 0;
		panelProductos.add(btnAadirProducto, gbc_btnAadirProducto);
		
		btnEditarProductos = new JButton("Editar productos");
		GridBagConstraints gbc_btnEditarProductos = new GridBagConstraints();
		gbc_btnEditarProductos.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarProductos.gridx = 1;
		gbc_btnEditarProductos.gridy = 1;
		panelProductos.add(btnEditarProductos, gbc_btnEditarProductos);
		
		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridheight = 6;
		gbc_scrollPane_2.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 0;
		panelProductos.add(scrollPane_2, gbc_scrollPane_2);
		
		tableProductos = new JTable();
		tableProductos.setModel(new DefaultTableModel(
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
		});
		tableProductos.getColumnModel().getColumn(0).setResizable(false);
		tableProductos.getColumnModel().getColumn(1).setResizable(false);
		tableProductos.getColumnModel().getColumn(2).setResizable(false);
		scrollPane_2.setViewportView(tableProductos);
		
		lblImporteTotal = new JLabel("Importe Total");
		GridBagConstraints gbc_lblImporteTotal = new GridBagConstraints();
		gbc_lblImporteTotal.gridheight = 2;
		gbc_lblImporteTotal.gridwidth = 3;
		gbc_lblImporteTotal.insets = new Insets(0, 0, 5, 0);
		gbc_lblImporteTotal.gridx = 2;
		gbc_lblImporteTotal.gridy = 0;
		panelProductos.add(lblImporteTotal, gbc_lblImporteTotal);
		
		txtImporte = new JTextField();
		txtImporte.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtImporte = new GridBagConstraints();
		gbc_txtImporte.gridwidth = 3;
		gbc_txtImporte.insets = new Insets(0, 0, 5, 0);
		gbc_txtImporte.fill = GridBagConstraints.BOTH;
		gbc_txtImporte.gridx = 2;
		gbc_txtImporte.gridy = 2;
		panelProductos.add(txtImporte, gbc_txtImporte);
		txtImporte.setColumns(10);
		
		lblMtodoDePago = new JLabel("Método de pago:");
		GridBagConstraints gbc_lblMtodoDePago = new GridBagConstraints();
		gbc_lblMtodoDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtodoDePago.gridx = 1;
		gbc_lblMtodoDePago.gridy = 3;
		panelProductos.add(lblMtodoDePago, gbc_lblMtodoDePago);
		
		chckbxEfectivo = new JCheckBox("Efectivo");
		buttonGroup_1.add(chckbxEfectivo);
		GridBagConstraints gbc_chckbxEfectivo = new GridBagConstraints();
		gbc_chckbxEfectivo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxEfectivo.gridx = 2;
		gbc_chckbxEfectivo.gridy = 3;
		panelProductos.add(chckbxEfectivo, gbc_chckbxEfectivo);
		
		chckbxTarjeta = new JCheckBox("Tarjeta");
		buttonGroup_1.add(chckbxTarjeta);
		GridBagConstraints gbc_chckbxTarjeta = new GridBagConstraints();
		gbc_chckbxTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTarjeta.gridx = 3;
		gbc_chckbxTarjeta.gridy = 3;
		panelProductos.add(chckbxTarjeta, gbc_chckbxTarjeta);
		
		chckbxCanjearPuntos = new JCheckBox("Canjear puntos");
		buttonGroup_1.add(chckbxCanjearPuntos);
		GridBagConstraints gbc_chckbxCanjearPuntos = new GridBagConstraints();
		gbc_chckbxCanjearPuntos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxCanjearPuntos.gridx = 4;
		gbc_chckbxCanjearPuntos.gridy = 3;
		panelProductos.add(chckbxCanjearPuntos, gbc_chckbxCanjearPuntos);
		
		btnMostrarTicket = new JButton("Mostrar ticket");
		GridBagConstraints gbc_btnMostrarTicket = new GridBagConstraints();
		gbc_btnMostrarTicket.fill = GridBagConstraints.BOTH;
		gbc_btnMostrarTicket.gridwidth = 3;
		gbc_btnMostrarTicket.gridheight = 2;
		gbc_btnMostrarTicket.gridx = 2;
		gbc_btnMostrarTicket.gridy = 4;
		panelProductos.add(btnMostrarTicket, gbc_btnMostrarTicket);
		
		btnEliminarProducto = new JButton("Eliminar producto");
		GridBagConstraints gbc_btnEliminarProducto = new GridBagConstraints();
		gbc_btnEliminarProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarProducto.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarProducto.gridx = 1;
		gbc_btnEliminarProducto.gridy = 5;
		panelProductos.add(btnEliminarProducto, gbc_btnEliminarProducto);

		tabOfertas = new JPanel();
		tabbedPane.addTab("Ofertas y menús", null, tabOfertas, null);
		GridBagLayout gbl_tabOfertas = new GridBagLayout();
		gbl_tabOfertas.columnWidths = new int[]{0, 0, 0, 109, 250, 228, 0};
		gbl_tabOfertas.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_tabOfertas.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_tabOfertas.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		tabOfertas.setLayout(gbl_tabOfertas);
		
		scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 1;
		tabOfertas.add(scrollPane_3, gbc_scrollPane_3);
		
		list_2 = new JList();
		scrollPane_3.setViewportView(list_2);
		
		pnlDetallesOf = new JPanel();
		pnlDetallesOf.setBorder(new TitledBorder(null, "Detalles", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetallesOf = new GridBagConstraints();
		gbc_pnlDetallesOf.insets = new Insets(0, 0, 5, 5);
		gbc_pnlDetallesOf.fill = GridBagConstraints.BOTH;
		gbc_pnlDetallesOf.gridx = 4;
		gbc_pnlDetallesOf.gridy = 1;
		tabOfertas.add(pnlDetallesOf, gbc_pnlDetallesOf);
		GridBagLayout gbl_pnlDetallesOf = new GridBagLayout();
		gbl_pnlDetallesOf.columnWidths = new int[]{194, 0};
		gbl_pnlDetallesOf.rowHeights = new int[]{53, 175, 42, 29, 0};
		gbl_pnlDetallesOf.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlDetallesOf.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDetallesOf.setLayout(gbl_pnlDetallesOf);
		
		lblDescripcin = new JLabel("Descripción:");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.fill = GridBagConstraints.BOTH;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 0;
		pnlDetallesOf.add(lblDescripcin, gbc_lblDescripcin);
		
		txtDesc = new JTextField();
		GridBagConstraints gbc_txtDesc = new GridBagConstraints();
		gbc_txtDesc.fill = GridBagConstraints.BOTH;
		gbc_txtDesc.insets = new Insets(0, 0, 5, 0);
		gbc_txtDesc.gridx = 0;
		gbc_txtDesc.gridy = 1;
		pnlDetallesOf.add(txtDesc, gbc_txtDesc);
		txtDesc.setColumns(10);
		
		lblValidaHasta = new JLabel("Válida hasta:");
		GridBagConstraints gbc_lblValidaHasta = new GridBagConstraints();
		gbc_lblValidaHasta.fill = GridBagConstraints.BOTH;
		gbc_lblValidaHasta.insets = new Insets(0, 0, 5, 0);
		gbc_lblValidaHasta.gridx = 0;
		gbc_lblValidaHasta.gridy = 2;
		pnlDetallesOf.add(lblValidaHasta, gbc_lblValidaHasta);
		
		ftxtValido = new JFormattedTextField();
		ftxtValido.setMinimumSize(new Dimension(6, 10));
		ftxtValido.setPreferredSize(new Dimension(6, 10));
		GridBagConstraints gbc_ftxtValido = new GridBagConstraints();
		gbc_ftxtValido.fill = GridBagConstraints.BOTH;
		gbc_ftxtValido.gridx = 0;
		gbc_ftxtValido.gridy = 3;
		pnlDetallesOf.add(ftxtValido, gbc_ftxtValido);
		
		pnlEnvioOf = new JPanel();
		pnlEnvioOf.setBorder(new TitledBorder(null, "Envio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlEnvioOf = new GridBagConstraints();
		gbc_pnlEnvioOf.insets = new Insets(0, 0, 5, 0);
		gbc_pnlEnvioOf.fill = GridBagConstraints.BOTH;
		gbc_pnlEnvioOf.gridx = 5;
		gbc_pnlEnvioOf.gridy = 1;
		tabOfertas.add(pnlEnvioOf, gbc_pnlEnvioOf);
		GridBagLayout gbl_pnlEnvioOf = new GridBagLayout();
		gbl_pnlEnvioOf.columnWidths = new int[]{0, 51, 0, 52, 0, 0};
		gbl_pnlEnvioOf.rowHeights = new int[]{0, 0, 0, 0, 24, 0};
		gbl_pnlEnvioOf.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlEnvioOf.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlEnvioOf.setLayout(gbl_pnlEnvioOf);
		
		lblTotalClientesVip = new JLabel("Total clientes VIP");
		GridBagConstraints gbc_lblTotalClientesVip = new GridBagConstraints();
		gbc_lblTotalClientesVip.anchor = GridBagConstraints.WEST;
		gbc_lblTotalClientesVip.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalClientesVip.gridx = 0;
		gbc_lblTotalClientesVip.gridy = 0;
		pnlEnvioOf.add(lblTotalClientesVip, gbc_lblTotalClientesVip);
		
		lblEnviarA = new JLabel("Enviar a ");
		GridBagConstraints gbc_lblEnviarA = new GridBagConstraints();
		gbc_lblEnviarA.anchor = GridBagConstraints.WEST;
		gbc_lblEnviarA.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnviarA.gridx = 4;
		gbc_lblEnviarA.gridy = 0;
		pnlEnvioOf.add(lblEnviarA, gbc_lblEnviarA);
		
		scrollPaneCVIP = new JScrollPane();
		GridBagConstraints gbc_scrollPaneCVIP = new GridBagConstraints();
		gbc_scrollPaneCVIP.gridwidth = 2;
		gbc_scrollPaneCVIP.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneCVIP.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneCVIP.gridx = 0;
		gbc_scrollPaneCVIP.gridy = 1;
		pnlEnvioOf.add(scrollPaneCVIP, gbc_scrollPaneCVIP);
		
		listCVIP = new JList();
		scrollPaneCVIP.setViewportView(listCVIP);
		
		scrollPaneEnv = new JScrollPane();
		GridBagConstraints gbc_scrollPaneEnv = new GridBagConstraints();
		gbc_scrollPaneEnv.gridwidth = 2;
		gbc_scrollPaneEnv.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneEnv.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneEnv.gridx = 3;
		gbc_scrollPaneEnv.gridy = 1;
		pnlEnvioOf.add(scrollPaneEnv, gbc_scrollPaneEnv);
		
		listEnv = new JList();
		scrollPaneEnv.setViewportView(listEnv);
		
		btnSeleccionar = new JButton("Seleccionar");
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.gridwidth = 2;
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeleccionar.gridx = 0;
		gbc_btnSeleccionar.gridy = 2;
		pnlEnvioOf.add(btnSeleccionar, gbc_btnSeleccionar);
		
		btnEliminar_1 = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar_1 = new GridBagConstraints();
		gbc_btnEliminar_1.gridwidth = 2;
		gbc_btnEliminar_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar_1.gridx = 3;
		gbc_btnEliminar_1.gridy = 2;
		pnlEnvioOf.add(btnEliminar_1, gbc_btnEliminar_1);
		
		btnEnviar = new JButton("Enviar");
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.fill = GridBagConstraints.BOTH;
		gbc_btnEnviar.gridheight = 2;
		gbc_btnEnviar.gridwidth = 3;
		gbc_btnEnviar.gridx = 1;
		gbc_btnEnviar.gridy = 3;
		pnlEnvioOf.add(btnEnviar, gbc_btnEnviar);
		
		btnAadirOferta = new JButton("Añadir oferta");
		GridBagConstraints gbc_btnAadirOferta = new GridBagConstraints();
		gbc_btnAadirOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirOferta.gridx = 1;
		gbc_btnAadirOferta.gridy = 2;
		tabOfertas.add(btnAadirOferta, gbc_btnAadirOferta);
		
		btnEditarOferta = new JButton("Editar oferta");
		GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
		gbc_btnEditarOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarOferta.gridx = 2;
		gbc_btnEditarOferta.gridy = 2;
		tabOfertas.add(btnEditarOferta, gbc_btnEditarOferta);
		
		btnBorrarOferta = new JButton("Borrar oferta");
		GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
		gbc_btnBorrarOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarOferta.gridx = 3;
		gbc_btnBorrarOferta.gridy = 2;
		tabOfertas.add(btnBorrarOferta, gbc_btnBorrarOferta);
	}

}
