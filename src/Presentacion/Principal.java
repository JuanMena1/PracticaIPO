package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
import java.awt.Image;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JToolBar;
import javax.swing.JTextArea;

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
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JComboBox comboBox;
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
	private JButton btnMostrarTicket;
	private JTable tableProductos;
	private JButton btnAadirOferta;
	private JButton btnEditarOferta;
	private JButton btnBorrarOferta;
	private JScrollPane scrollPane_3;
	private JPanel pnlDetallesOf;
	private JPanel pnlEnvioOf;
	private JLabel lblDescripcin;
	private JLabel lblValidaHasta;
	private JButton btnEnviar;
	private JButton btnEliminar_1;
	private JButton btnSeleccionar;
	private JScrollPane scrollPaneCVIP;
	private JScrollPane scrollPaneEnv;
	private JList listCVIP;
	private JList listEnv;
	private JLabel lblTotalClientesVip;
	private JLabel lblEnviarA;
	private JTabbedPane tabpnlCliente;
	private JPanel Clientes;
	private JPanel panel;
	private JPanel tabHist;
	private JPanel tabMenusOfertas;
	private JTabbedPane tabpnlMenusyOfertas;
	private JPanel tabMenu;
	private JScrollPane scrollPane_4;
	private JPanel panel_3;
	private JLabel label;
	private JLabel lblPrecio_1;
	private JFormattedTextField formattedTextField;
	private JPanel panel_4;
	private JLabel label_2;
	private JLabel label_3;
	private JScrollPane scrollPane_5;
	private JScrollPane scrollPane_6;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton btnAadirMen;
	private JButton btnEditarMen;
	private JButton btnBorrarMen;
	private JList listVIPMenu;
	private JList listEnvMenu;
	private JPanel tabReparto;
	private JLabel lblPuntosAcumulados;
	private JLabel lblPuntosCanjeados;
	private JLabel lblCaducidadDePuntos;
	private JTextField txtPuntosAcumulados;
	private JTextField txtPuntosCanjeados;
	private JTextField txtCaducidadPuntos;
	private JPanel pnlDetallesPedido;
	private JPanel pnlMapa;
	private JScrollPane scrollPane_7;
	private JCheckBox chckbxPagado;
	private JRadioButton rdbtnCaliente;
	private JRadioButton rdbtnFro;
	private JLabel lblHoraAproximadaDe;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JScrollPane scrollPane_8;
	private JTable table;
	private JScrollPane scrollPane_9;
	private JTable table_1;
	private JTextField txtImporteTotal;
	private JFormattedTextField ftxtTelefono;
	private JDateChooser dateChooser;
	private ImageIcon imagen;
	private JLabel[] imagenes = new JLabel[5];
	private String ensaladas[] = new String[] { MessagesPrincipal.getString("Principal.Ensalada1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Ensalada2"), MessagesPrincipal.getString("Principal.Ensalada3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Ensalada4"), MessagesPrincipal.getString("Principal.Ensalada5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String arroces[] = new String[] { MessagesPrincipal.getString("Principal.ArrozPasta1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.ArrozPasta2"), MessagesPrincipal.getString("Principal.ArrozPasta3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.ArrozPasta4"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.ArrozPasta5") }; //$NON-NLS-1$
	private String pescados[] = new String[] { MessagesPrincipal.getString("Principal.Pescados1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Pescados2"), MessagesPrincipal.getString("Principal.Pescados3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Pescados4"), MessagesPrincipal.getString("Principal.Pescados5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String asados[] = new String[] { MessagesPrincipal.getString("Principal.Asados1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Asados2"), MessagesPrincipal.getString("Principal.Asados3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Asados4"), MessagesPrincipal.getString("Principal.Asados5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String pizzas[] = new String[] { MessagesPrincipal.getString("Principal.Pizza1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Pizza2"), MessagesPrincipal.getString("Principal.Pizza3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Pizza4"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Pizza5") }; //$NON-NLS-1$
	private String hamburguesas[] = new String[] { MessagesPrincipal.getString("Principal.Hamb1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Hamb2"), MessagesPrincipal.getString("Principal.Hamb3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Hamb4"), MessagesPrincipal.getString("Principal.Hamb5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String bocadillos[] = new String[] { MessagesPrincipal.getString("Principal.Bocadillo1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Bocadillo2"), MessagesPrincipal.getString("Principal.Bocadillo3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Bocadillo4"), MessagesPrincipal.getString("Principal.Bocadillo5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String postres[] = new String[] { MessagesPrincipal.getString("Principal.Postres1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Postres2"), MessagesPrincipal.getString("Principal.Postres3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Postres4"), MessagesPrincipal.getString("Principal.Postres5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String bebidas[] = new String[] { MessagesPrincipal.getString("Principal.Bebidas1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Bebidas2"), MessagesPrincipal.getString("Principal.Bebidas3"), //$NON-NLS-1$ //$NON-NLS-2$
			MessagesPrincipal.getString("Principal.Bebidas4"), MessagesPrincipal.getString("Principal.Bebidas5") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String menus[] = new String[] { MessagesPrincipal.getString("Principal.Menu1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Menu2"), MessagesPrincipal.getString("Principal.Menu3") }; //$NON-NLS-1$ //$NON-NLS-2$
	private String ofertas[] = new String[] { MessagesPrincipal.getString("Principal.Oferta1"), //$NON-NLS-1$
			MessagesPrincipal.getString("Principal.Oferta2") }; //$NON-NLS-1$
	private JTree tree;
	private JPanel panelCard;
	private JToolBar toolBar;
	private JButton btnCargarMapa;
	private JButton btnUbicacin;
	private JButton btnSeleccin;

	private MiAreaDibujo miAreaDibujo;
	int modo = -1;
	private final int UBICACION = 1;
	private final int SELECCION = 2;
	private Toolkit toolkit;
	private Image imagUbicacion;
	private Image imagSeleccion;
	private Cursor cursorUbicacion;
	private Cursor cursorSeleccion;

	private int x, y;
	private JLabel lblNombreP;
	private JTextField txtNombreP;

	private DefaultListModel modelolista;
	private DefaultListModel modelolistaOf;
	private JLabel lblNombre_1;
	private JTextField txtNombreOf;
	private JLabel lblNombre_2;
	private JTextField txtNombreMenus;
	private JButton btnImagen;
	private JButton btnModificarImagen;
	private JButton btnModificarFoto;
	private JButton btnModificarImagen_1;
	private JPanel pnlMenu;
	private JPanel pnlOfertas;
	private JTextField txtHoraentrega;
	private JTextArea txtDescMenu;
	private JTextArea txtDescOfertas;
	private JTextArea txtAlergenosCl;

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
		frame.setBounds(new Rectangle(100, 100, 1200, 600));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabClientes = new JPanel();
		tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabClientes"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/starx24.png")), //$NON-NLS-1$
				tabClientes, null);
		tabClientes.setLayout(new BorderLayout(0, 0));

		tabpnlCliente = new JTabbedPane(JTabbedPane.TOP);
		tabClientes.add(tabpnlCliente);

		Clientes = new JPanel();
		tabpnlCliente.addTab(MessagesPrincipal.getString("Principal.Clientes"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/user.png")), Clientes, null); //$NON-NLS-1$
		GridBagLayout gbl_Clientes = new GridBagLayout();
		gbl_Clientes.columnWidths = new int[] { 0, 62, 92, 74, 665, 40, 0 };
		gbl_Clientes.rowHeights = new int[] { 0, 153, 0, 0, 0, 0, 0 };
		gbl_Clientes.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_Clientes.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		Clientes.setLayout(gbl_Clientes);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		Clientes.add(scrollPane, gbc_scrollPane);

		list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] { "VIP01 - Ana Martín", "VIP02 - Pedro Serrano", "VIP03 - Carlos Gallego" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setSelectedIndex(0);
		scrollPane.setViewportView(list_1);

		panel = new JPanel();
		panel.setBorder(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 1;
		Clientes.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 88, 117, 51, 150, 49, 68, 0 };
		gbl_panel.rowHeights = new int[] { 52, 0, 0, 0, 0, 0, 0, 0, 0, 61, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblImagen = new JLabel(""); //$NON-NLS-1$
		lblImagen.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.gridwidth = 2;
		gbc_lblImagen.gridheight = 6;
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 0;
		gbc_lblImagen.gridy = 0;
		panel.add(lblImagen, gbc_lblImagen);

		lblId = new JLabel(MessagesPrincipal.getString("Principal.lblId.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 1;
		panel.add(lblId, gbc_lblId);

		txtID = new JTextField();
		txtID.setText("VIP01"); //$NON-NLS-1$
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.gridx = 4;
		gbc_txtID.gridy = 1;
		panel.add(txtID, gbc_txtID);
		txtID.setColumns(10);

		lblNombre = new JLabel(MessagesPrincipal.getString("Principal.lblNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 2;
		panel.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		txtNombre.setText("Ana"); //$NON-NLS-1$
		txtNombre.addKeyListener(new TxtNombreKeyListener());

		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 2;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		lblApellidos = new JLabel(MessagesPrincipal.getString("Principal.lblApellidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.WEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 3;
		gbc_lblApellidos.gridy = 3;
		panel.add(lblApellidos, gbc_lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setText("Martín"); //$NON-NLS-1$
		txtApellidos.addKeyListener(new TxtNombreKeyListener());
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.gridx = 4;
		gbc_txtApellidos.gridy = 3;
		panel.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);

		lblTelfono = new JLabel(MessagesPrincipal.getString("Principal.lblTelfono.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.WEST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 3;
		gbc_lblTelfono.gridy = 4;
		panel.add(lblTelfono, gbc_lblTelfono);

		// ftxtTelefono = new JFormattedTextField();

		MaskFormatter formatoTlfno;
		try {
			formatoTlfno = new MaskFormatter("###' ###' ###"); //$NON-NLS-1$
			formatoTlfno.setPlaceholderCharacter('*');
			ftxtTelefono = new JFormattedTextField(formatoTlfno);
			ftxtTelefono.setText("698253417"); //$NON-NLS-1$
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GridBagConstraints gbc_ftxtTelefono = new GridBagConstraints();
		gbc_ftxtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtTelefono.gridx = 4;
		gbc_ftxtTelefono.gridy = 4;
		panel.add(ftxtTelefono, gbc_ftxtTelefono);

		lblDireccin = new JLabel(MessagesPrincipal.getString("Principal.lblDireccin.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.WEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 3;
		gbc_lblDireccin.gridy = 5;
		panel.add(lblDireccin, gbc_lblDireccin);

		txtDireccion = new JTextField();
		txtDireccion.setText("C/ Reyes Católicos 27, Ciudad Real"); //$NON-NLS-1$
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridwidth = 2;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.gridx = 4;
		gbc_txtDireccion.gridy = 5;
		panel.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);

		lblFoto = new JLabel(MessagesPrincipal.getString("Principal.lblFoto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 2;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 6;
		panel.add(lblFoto, gbc_lblFoto);

		lblCorreoElectrnico = new JLabel(MessagesPrincipal.getString("Principal.lblCorreoElectrnico.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.anchor = GridBagConstraints.WEST;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 3;
		gbc_lblCorreoElectrnico.gridy = 6;
		panel.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);

		txtCorreo = new JTextField();
		txtCorreo.setText("ana_martin@gmail.com"); //$NON-NLS-1$
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridwidth = 2;
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreo.gridx = 4;
		gbc_txtCorreo.gridy = 6;
		panel.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);

		lblVegetarianovegano = new JLabel(MessagesPrincipal.getString("Principal.lblVegetarianovegano.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblVegetarianovegano = new GridBagConstraints();
		gbc_lblVegetarianovegano.anchor = GridBagConstraints.WEST;
		gbc_lblVegetarianovegano.insets = new Insets(0, 0, 5, 5);
		gbc_lblVegetarianovegano.gridx = 3;
		gbc_lblVegetarianovegano.gridy = 7;
		panel.add(lblVegetarianovegano, gbc_lblVegetarianovegano);

		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 7;
		panel.add(comboBox, gbc_comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "No", MessagesPrincipal.getString("Principal.ComboVegetar"), MessagesPrincipal.getString("Principal.ComboVegano") })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		btnModificarFoto = new JButton(MessagesPrincipal.getString("Principal.btnModificarFoto.text")); //$NON-NLS-1$
		btnModificarFoto.addActionListener(new BtnModificarFotoActionListener());
		btnModificarFoto.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/frame-landscape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificarFoto = new GridBagConstraints();
		gbc_btnModificarFoto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarFoto.gridwidth = 2;
		gbc_btnModificarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarFoto.gridx = 0;
		gbc_btnModificarFoto.gridy = 8;
		panel.add(btnModificarFoto, gbc_btnModificarFoto);

		lblAlrgenos_1 = new JLabel(MessagesPrincipal.getString("Principal.lblAlrgenos_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAlrgenos_1 = new GridBagConstraints();
		gbc_lblAlrgenos_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAlrgenos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlrgenos_1.gridx = 3;
		gbc_lblAlrgenos_1.gridy = 8;
		panel.add(lblAlrgenos_1, gbc_lblAlrgenos_1);
		
		txtAlergenosCl = new JTextArea();
		txtAlergenosCl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAlergenosCl.setLineWrap(true);
		txtAlergenosCl.setWrapStyleWord(true);
		txtAlergenosCl.setText(MessagesPrincipal.getString("Principal.textAlergenosCl.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtAlergenosCl = new GridBagConstraints();
		gbc_txtAlergenosCl.gridheight = 2;
		gbc_txtAlergenosCl.insets = new Insets(0, 0, 5, 5);
		gbc_txtAlergenosCl.fill = GridBagConstraints.BOTH;
		gbc_txtAlergenosCl.gridx = 4;
		gbc_txtAlergenosCl.gridy = 8;
		panel.add(txtAlergenosCl, gbc_txtAlergenosCl);

		btnAadirClienteVip = new JButton(MessagesPrincipal.getString("Principal.btnAadirClienteVip.text")); //$NON-NLS-1$
		btnAadirClienteVip.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadirClienteVip = new GridBagConstraints();
		gbc_btnAadirClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirClienteVip.gridx = 1;
		gbc_btnAadirClienteVip.gridy = 2;
		Clientes.add(btnAadirClienteVip, gbc_btnAadirClienteVip);

		btnEditarClienteVip = new JButton(MessagesPrincipal.getString("Principal.btnEditarClienteVip.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditarClienteVip = new GridBagConstraints();
		gbc_btnEditarClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarClienteVip.anchor = GridBagConstraints.NORTH;
		gbc_btnEditarClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarClienteVip.gridx = 1;
		gbc_btnEditarClienteVip.gridy = 3;
		Clientes.add(btnEditarClienteVip, gbc_btnEditarClienteVip);
		btnEditarClienteVip.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$

		btnBorrarClienteVip = new JButton(MessagesPrincipal.getString("Principal.btnBorrarClienteVip.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrarClienteVip = new GridBagConstraints();
		gbc_btnBorrarClienteVip.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarClienteVip.anchor = GridBagConstraints.NORTH;
		gbc_btnBorrarClienteVip.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarClienteVip.gridx = 1;
		gbc_btnBorrarClienteVip.gridy = 4;
		Clientes.add(btnBorrarClienteVip, gbc_btnBorrarClienteVip);
		btnBorrarClienteVip.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$

		tabHist = new JPanel();
		tabpnlCliente.addTab(MessagesPrincipal.getString("Principal.tabHist"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/history-clock-button.png")), tabHist, null); //$NON-NLS-1$
		GridBagLayout gbl_tabHist = new GridBagLayout();
		gbl_tabHist.columnWidths = new int[] { 0, 147, 139, 0, 0, 0 };
		gbl_tabHist.rowHeights = new int[] { 0, 291, 0, 0, 0, 0, 0, 0 };
		gbl_tabHist.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_tabHist.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		tabHist.setLayout(gbl_tabHist);

		scrollPane_8 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_8 = new GridBagConstraints();
		gbc_scrollPane_8.gridwidth = 3;
		gbc_scrollPane_8.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_8.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_8.gridx = 1;
		gbc_scrollPane_8.gridy = 1;
		tabHist.add(scrollPane_8, gbc_scrollPane_8);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ new Integer(1), MessagesPrincipal.getString("Principal.HistoTipoPedido1"), "30/09/2018", //$NON-NLS-1$ //$NON-NLS-2$
						new Double(35.95), " " }, //$NON-NLS-1$
				{ new Integer(2), MessagesPrincipal.getString("Principal.HistoTipoPedido2"), "10/10/2018", "16.98", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						"C/ Concepci\u00F3n Arenal 3 4\u00AAA  Ciudad Real" }, //$NON-NLS-1$
				{ new Integer(3), MessagesPrincipal.getString("Principal.HistoTipoPedido3"), "11/11/2018", "27.97", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						"C/ Concepci\u00F3n Arenal 3 4\u00AAA  Ciudad Real" }, }, //$NON-NLS-1$
				new String[] { MessagesPrincipal.getString("Principal.ColumnaHistPedidos"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColumnaHistTipo"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColumnaHistFecha"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColumnaHistImporte"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColumnaHistDireccion") }) { //$NON-NLS-1$
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setMinWidth(50);
		scrollPane_8.setViewportView(table);

		lblPuntosAcumulados = new JLabel(MessagesPrincipal.getString("Principal.lblPuntosAcumulados.text")); //$NON-NLS-1$
		lblPuntosAcumulados.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblPuntosAcumulados = new GridBagConstraints();
		gbc_lblPuntosAcumulados.anchor = GridBagConstraints.WEST;
		gbc_lblPuntosAcumulados.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosAcumulados.gridx = 1;
		gbc_lblPuntosAcumulados.gridy = 3;
		tabHist.add(lblPuntosAcumulados, gbc_lblPuntosAcumulados);

		txtPuntosAcumulados = new JTextField();
		txtPuntosAcumulados.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		txtPuntosAcumulados.setText(MessagesPrincipal.getString("Principal.PuntosTotales")); //$NON-NLS-1$
		txtPuntosAcumulados.setBorder(null);
		txtPuntosAcumulados.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtPuntosAcumulados = new GridBagConstraints();
		gbc_txtPuntosAcumulados.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntosAcumulados.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntosAcumulados.gridx = 2;
		gbc_txtPuntosAcumulados.gridy = 3;
		tabHist.add(txtPuntosAcumulados, gbc_txtPuntosAcumulados);
		txtPuntosAcumulados.setColumns(10);

		lblPuntosCanjeados = new JLabel(MessagesPrincipal.getString("Principal.lblPuntosCanjeados.text")); //$NON-NLS-1$
		lblPuntosCanjeados.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblPuntosCanjeados = new GridBagConstraints();
		gbc_lblPuntosCanjeados.anchor = GridBagConstraints.WEST;
		gbc_lblPuntosCanjeados.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosCanjeados.gridx = 1;
		gbc_lblPuntosCanjeados.gridy = 4;
		tabHist.add(lblPuntosCanjeados, gbc_lblPuntosCanjeados);

		txtPuntosCanjeados = new JTextField();
		txtPuntosCanjeados.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		txtPuntosCanjeados.setText(MessagesPrincipal.getString("Principal.PuntosCanjeados")); //$NON-NLS-1$
		txtPuntosCanjeados.setBorder(null);
		txtPuntosCanjeados.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtPuntosCanjeados = new GridBagConstraints();
		gbc_txtPuntosCanjeados.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntosCanjeados.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntosCanjeados.gridx = 2;
		gbc_txtPuntosCanjeados.gridy = 4;
		tabHist.add(txtPuntosCanjeados, gbc_txtPuntosCanjeados);
		txtPuntosCanjeados.setColumns(10);

		lblCaducidadDePuntos = new JLabel(MessagesPrincipal.getString("Principal.lblCaducidadDePuntos.text")); //$NON-NLS-1$
		lblCaducidadDePuntos.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_lblCaducidadDePuntos = new GridBagConstraints();
		gbc_lblCaducidadDePuntos.anchor = GridBagConstraints.WEST;
		gbc_lblCaducidadDePuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblCaducidadDePuntos.gridx = 1;
		gbc_lblCaducidadDePuntos.gridy = 5;
		tabHist.add(lblCaducidadDePuntos, gbc_lblCaducidadDePuntos);

		txtCaducidadPuntos = new JTextField();
		txtCaducidadPuntos.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
		txtCaducidadPuntos.setText("30/01/2019"); //$NON-NLS-1$
		txtCaducidadPuntos.setBorder(null);
		txtCaducidadPuntos.setBackground(SystemColor.menu);
		GridBagConstraints gbc_txtCaducidadPuntos = new GridBagConstraints();
		gbc_txtCaducidadPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_txtCaducidadPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCaducidadPuntos.gridx = 2;
		gbc_txtCaducidadPuntos.gridy = 5;
		tabHist.add(txtCaducidadPuntos, gbc_txtCaducidadPuntos);
		txtCaducidadPuntos.setColumns(10);

		tabProductos = new JPanel();
		tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabProductos"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/shopping-cart-black-shapex24.png")), //$NON-NLS-1$
				tabProductos, null);
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

		tree = new JTree();
		tree.setRootVisible(false);
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Categorías") { //$NON-NLS-1$
			{
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasEnsaladas"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasArroz"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasPescados"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasAsados"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasPizzas"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasHamb"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasBocadillos"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasPostres"))); //$NON-NLS-1$
				add(new DefaultMutableTreeNode(MessagesPrincipal.getString("Principal.CategoriasBebidas"))); //$NON-NLS-1$
			}
		}));
		scrollPaneTree.setViewportView(tree);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		scrollPaneList = new JScrollPane();
		GridBagConstraints gbc_scrollPaneList = new GridBagConstraints();
		gbc_scrollPaneList.gridheight = 4;
		gbc_scrollPaneList.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneList.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneList.gridx = 3;
		gbc_scrollPaneList.gridy = 1;
		tabProductos.add(scrollPaneList, gbc_scrollPaneList);

		panelCard = new JPanel();
		scrollPaneList.setViewportView(panelCard);
		panelCard.setLayout(new GridLayout(1, 0, 0, 0));
		GridLayout layout = (GridLayout) panelCard.getLayout();
		layout.setRows(2);
		panelCard.revalidate();

		pnlDetalles = new JPanel();
		pnlDetalles.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlDetalles.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetalles = new GridBagConstraints();
		gbc_pnlDetalles.gridheight = 4;
		gbc_pnlDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_pnlDetalles.fill = GridBagConstraints.BOTH;
		gbc_pnlDetalles.gridx = 4;
		gbc_pnlDetalles.gridy = 1;
		tabProductos.add(pnlDetalles, gbc_pnlDetalles);
		GridBagLayout gbl_pnlDetalles = new GridBagLayout();
		gbl_pnlDetalles.columnWidths = new int[] { 90, 0, 50, 0 };
		gbl_pnlDetalles.rowHeights = new int[] { 0, 0, 36, 0, 38, 0, 39, 0, 0, 0, 37, 0 };
		gbl_pnlDetalles.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlDetalles.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlDetalles.setLayout(gbl_pnlDetalles);

		lblNombreP = new JLabel(MessagesPrincipal.getString("Principal.lblNombreP.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombreP = new GridBagConstraints();
		gbc_lblNombreP.anchor = GridBagConstraints.WEST;
		gbc_lblNombreP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreP.gridx = 0;
		gbc_lblNombreP.gridy = 0;
		pnlDetalles.add(lblNombreP, gbc_lblNombreP);

		txtNombreP = new JTextField();
		GridBagConstraints gbc_txtNombreP = new GridBagConstraints();
		gbc_txtNombreP.gridwidth = 3;
		gbc_txtNombreP.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreP.gridx = 0;
		gbc_txtNombreP.gridy = 1;
		pnlDetalles.add(txtNombreP, gbc_txtNombreP);
		txtNombreP.setColumns(10);

		lblIngredientes = new JLabel(MessagesPrincipal.getString("Principal.lblIngredientes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblIngredientes = new GridBagConstraints();
		gbc_lblIngredientes.anchor = GridBagConstraints.WEST;
		gbc_lblIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngredientes.gridx = 0;
		gbc_lblIngredientes.gridy = 2;
		pnlDetalles.add(lblIngredientes, gbc_lblIngredientes);

		txtIngredientes = new JTextField();
		GridBagConstraints gbc_txtIngredientes = new GridBagConstraints();
		gbc_txtIngredientes.gridwidth = 3;
		gbc_txtIngredientes.fill = GridBagConstraints.BOTH;
		gbc_txtIngredientes.insets = new Insets(0, 0, 5, 0);
		gbc_txtIngredientes.gridx = 0;
		gbc_txtIngredientes.gridy = 3;
		pnlDetalles.add(txtIngredientes, gbc_txtIngredientes);
		txtIngredientes.setColumns(10);

		lblAlrgenos = new JLabel(MessagesPrincipal.getString("Principal.lblAlrgenos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAlrgenos = new GridBagConstraints();
		gbc_lblAlrgenos.anchor = GridBagConstraints.WEST;
		gbc_lblAlrgenos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlrgenos.gridx = 0;
		gbc_lblAlrgenos.gridy = 4;
		pnlDetalles.add(lblAlrgenos, gbc_lblAlrgenos);

		txtAlergenos = new JTextField();
		GridBagConstraints gbc_txtAlergenos = new GridBagConstraints();
		gbc_txtAlergenos.gridwidth = 3;
		gbc_txtAlergenos.fill = GridBagConstraints.BOTH;
		gbc_txtAlergenos.insets = new Insets(0, 0, 5, 0);
		gbc_txtAlergenos.gridx = 0;
		gbc_txtAlergenos.gridy = 5;
		pnlDetalles.add(txtAlergenos, gbc_txtAlergenos);
		txtAlergenos.setColumns(10);

		lblPicante = new JLabel(MessagesPrincipal.getString("Principal.lblPicante.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPicante = new GridBagConstraints();
		gbc_lblPicante.anchor = GridBagConstraints.WEST;
		gbc_lblPicante.insets = new Insets(0, 0, 5, 5);
		gbc_lblPicante.gridx = 0;
		gbc_lblPicante.gridy = 6;
		pnlDetalles.add(lblPicante, gbc_lblPicante);

		rdbtnS = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnS.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnS);
		GridBagConstraints gbc_rdbtnS = new GridBagConstraints();
		gbc_rdbtnS.anchor = GridBagConstraints.WEST;
		gbc_rdbtnS.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnS.gridx = 0;
		gbc_rdbtnS.gridy = 7;
		pnlDetalles.add(rdbtnS, gbc_rdbtnS);

		rdbtnNo = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnNo.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnNo);
		GridBagConstraints gbc_rdbtnNo = new GridBagConstraints();
		gbc_rdbtnNo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNo.gridx = 1;
		gbc_rdbtnNo.gridy = 7;
		pnlDetalles.add(rdbtnNo, gbc_rdbtnNo);

		lblPrecio = new JLabel(MessagesPrincipal.getString("Principal.lblPrecio.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 8;
		pnlDetalles.add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(new TxtPrecioKeyListener());
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.gridwidth = 2;
		gbc_txtPrecio.anchor = GridBagConstraints.NORTH;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 0;
		gbc_txtPrecio.gridy = 9;
		pnlDetalles.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		btnModificarImagen_1 = new JButton(MessagesPrincipal.getString("Principal.btnModificarImagen_1.text")); //$NON-NLS-1$
		btnModificarImagen_1.addActionListener(new BtnModificarImagen_1ActionListener());
		btnModificarImagen_1.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/frame-landscape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificarImagen_1 = new GridBagConstraints();
		gbc_btnModificarImagen_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarImagen_1.gridwidth = 2;
		gbc_btnModificarImagen_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnModificarImagen_1.gridx = 0;
		gbc_btnModificarImagen_1.gridy = 10;
		pnlDetalles.add(btnModificarImagen_1, gbc_btnModificarImagen_1);

		btnDarDeAlta = new JButton(MessagesPrincipal.getString("Principal.btnDarDeAlta.text")); //$NON-NLS-1$
		btnDarDeAlta.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.gridwidth = 2;
		gbc_btnDarDeAlta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 2;
		tabProductos.add(btnDarDeAlta, gbc_btnDarDeAlta);

		btnEditar = new JButton(MessagesPrincipal.getString("Principal.btnEditar.text")); //$NON-NLS-1$
		btnEditar.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.gridwidth = 2;
		gbc_btnEditar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 1;
		gbc_btnEditar.gridy = 3;
		tabProductos.add(btnEditar, gbc_btnEditar);

		btnEliminar = new JButton(MessagesPrincipal.getString("Principal.btnEliminar.text")); //$NON-NLS-1$
		btnEliminar.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.gridwidth = 2;
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 1;
		gbc_btnEliminar.gridy = 4;
		tabProductos.add(btnEliminar, gbc_btnEliminar);

		tabPedidos = new JPanel();
		tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabPedidos"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/shopping-listx24.png")), //$NON-NLS-1$
				tabPedidos, null);
		GridBagLayout gbl_tabPedidos = new GridBagLayout();
		gbl_tabPedidos.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_tabPedidos.rowHeights = new int[] { 208, 19, 223, 17, 0 };
		gbl_tabPedidos.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_tabPedidos.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		tabPedidos.setLayout(gbl_tabPedidos);

		panelPedidos = new JPanel();
		panelPedidos.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.panelPedidos.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelPedidos = new GridBagConstraints();
		gbc_panelPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_panelPedidos.fill = GridBagConstraints.BOTH;
		gbc_panelPedidos.gridx = 1;
		gbc_panelPedidos.gridy = 0;
		tabPedidos.add(panelPedidos, gbc_panelPedidos);
		GridBagLayout gbl_panelPedidos = new GridBagLayout();
		gbl_panelPedidos.columnWidths = new int[] { 822, 0, 0, 0 };
		gbl_panelPedidos.rowHeights = new int[] { 32, 0, 81, 0, 0 };
		gbl_panelPedidos.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelPedidos.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panelPedidos.setLayout(gbl_panelPedidos);

		btnCrearPedido = new JButton(MessagesPrincipal.getString("Principal.btnCrearPedido.text")); //$NON-NLS-1$
		btnCrearPedido.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnCrearPedido = new GridBagConstraints();
		gbc_btnCrearPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrearPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnCrearPedido.gridx = 2;
		gbc_btnCrearPedido.gridy = 0;
		panelPedidos.add(btnCrearPedido, gbc_btnCrearPedido);

		btnEditarPedido = new JButton(MessagesPrincipal.getString("Principal.btnEditarPedido.text")); //$NON-NLS-1$
		btnEditarPedido.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditarPedido = new GridBagConstraints();
		gbc_btnEditarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarPedido.gridx = 2;
		gbc_btnEditarPedido.gridy = 1;
		panelPedidos.add(btnEditarPedido, gbc_btnEditarPedido);

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panelPedidos.add(scrollPane_1, gbc_scrollPane_1);

		tablePedidos = new JTable();
		tablePedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablePedidos.setModel(new DefaultTableModel(
				new Object[][] { { "1", MessagesPrincipal.getString("Principal.PedidosEstado1"), //$NON-NLS-1$ //$NON-NLS-2$
						MessagesPrincipal.getString("Principal.PedidosTipo1"), "11/11/2018", "21:30", Boolean.TRUE, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						"Ana Mart\u00EDn", //$NON-NLS-1$
						"VIP01", Boolean.TRUE, new Double(27.97), "C/Concepci\u00F3n Arenal 3 4\u00BAA Ciudad Real" }, //$NON-NLS-1$ //$NON-NLS-2$
						{ "2", MessagesPrincipal.getString("Principal.PedidosEstado2"), //$NON-NLS-1$ //$NON-NLS-2$
								MessagesPrincipal.getString("Principal.PedidosTipo2"), "20/12/2018", "22:00", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								Boolean.FALSE, "Pedro Gallego", "CL02", null, //$NON-NLS-1$ //$NON-NLS-2$
								new Double(16.99), "-" }, }, //$NON-NLS-1$
				new String[] { "ID", MessagesPrincipal.getString("Principal.PedidosColEstado"), //$NON-NLS-1$ //$NON-NLS-2$
						MessagesPrincipal.getString("Principal.PedidosColTipo"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColFecha"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColEstadoHora"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColPagado"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColCliente"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColIDCliente"), "VIP", //$NON-NLS-1$ //$NON-NLS-2$
						MessagesPrincipal.getString("Principal.PedidosColImporte"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.PedidosColDireccion") }) { //$NON-NLS-1$
			Class[] columnTypes = new Class[] { Object.class, String.class, String.class, String.class, String.class,
					Boolean.class, String.class, String.class, Boolean.class, Double.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablePedidos.getColumnModel().getColumn(0).setResizable(false);
		tablePedidos.getColumnModel().getColumn(0).setPreferredWidth(15);
		tablePedidos.getColumnModel().getColumn(0).setMinWidth(10);
		tablePedidos.getColumnModel().getColumn(1).setResizable(false);
		tablePedidos.getColumnModel().getColumn(2).setResizable(false);
		tablePedidos.getColumnModel().getColumn(2).setPreferredWidth(50);
		tablePedidos.getColumnModel().getColumn(3).setResizable(false);
		tablePedidos.getColumnModel().getColumn(3).setPreferredWidth(40);
		tablePedidos.getColumnModel().getColumn(4).setResizable(false);
		tablePedidos.getColumnModel().getColumn(4).setPreferredWidth(20);
		tablePedidos.getColumnModel().getColumn(5).setResizable(false);
		tablePedidos.getColumnModel().getColumn(5).setPreferredWidth(15);
		tablePedidos.getColumnModel().getColumn(5).setMinWidth(10);
		tablePedidos.getColumnModel().getColumn(6).setResizable(false);
		tablePedidos.getColumnModel().getColumn(7).setResizable(false);
		tablePedidos.getColumnModel().getColumn(7).setPreferredWidth(25);
		tablePedidos.getColumnModel().getColumn(8).setResizable(false);
		tablePedidos.getColumnModel().getColumn(8).setPreferredWidth(15);
		tablePedidos.getColumnModel().getColumn(8).setMinWidth(10);
		tablePedidos.getColumnModel().getColumn(9).setResizable(false);
		tablePedidos.getColumnModel().getColumn(9).setPreferredWidth(20);
		tablePedidos.getColumnModel().getColumn(10).setResizable(false);
		tablePedidos.getColumnModel().getColumn(10).setPreferredWidth(210);
		scrollPane_1.setViewportView(tablePedidos);

		btnEliminarPedido = new JButton(MessagesPrincipal.getString("Principal.btnEliminarPedido.text")); //$NON-NLS-1$
		btnEliminarPedido.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminarPedido = new GridBagConstraints();
		gbc_btnEliminarPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarPedido.gridx = 2;
		gbc_btnEliminarPedido.gridy = 3;
		panelPedidos.add(btnEliminarPedido, gbc_btnEliminarPedido);

		JPanel panelProductos = new JPanel();
		panelProductos
				.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.panelProductos.borderTitle"), //$NON-NLS-1$
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelProductos = new GridBagConstraints();
		gbc_panelProductos.insets = new Insets(0, 0, 5, 5);
		gbc_panelProductos.fill = GridBagConstraints.BOTH;
		gbc_panelProductos.gridx = 1;
		gbc_panelProductos.gridy = 2;
		tabPedidos.add(panelProductos, gbc_panelProductos);
		GridBagLayout gbl_panelProductos = new GridBagLayout();
		gbl_panelProductos.columnWidths = new int[] { 641, 0, 0, 0, 0, 0 };
		gbl_panelProductos.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelProductos.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelProductos.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelProductos.setLayout(gbl_panelProductos);

		btnAadirProducto = new JButton(MessagesPrincipal.getString("Principal.btnAadirProducto.text")); //$NON-NLS-1$
		btnAadirProducto.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadirProducto = new GridBagConstraints();
		gbc_btnAadirProducto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirProducto.gridx = 1;
		gbc_btnAadirProducto.gridy = 0;
		panelProductos.add(btnAadirProducto, gbc_btnAadirProducto);

		btnEditarProductos = new JButton(MessagesPrincipal.getString("Principal.btnEditarProductos.text")); //$NON-NLS-1$
		btnEditarProductos.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$
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
				new Object[][] { { MessagesPrincipal.getString("Principal.ProductoNombre1"), "x1", new Double(7.99) }, //$NON-NLS-1$ //$NON-NLS-2$
						{ MessagesPrincipal.getString("Principal.ProductoNombre2"), "x2", new Double(16.98) }, //$NON-NLS-1$ //$NON-NLS-2$
						{ MessagesPrincipal.getString("Principal.ProductoNombre3"), "x2", new Double(3.0) }, }, //$NON-NLS-1$ //$NON-NLS-2$
				new String[] { MessagesPrincipal.getString("Principal.ColProductosNombre"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColProductosCantidad"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.ColProductosPrecio") }) { //$NON-NLS-1$
			Class[] columnTypes = new Class[] { String.class, String.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableProductos.getColumnModel().getColumn(0).setResizable(false);
		tableProductos.getColumnModel().getColumn(1).setResizable(false);
		tableProductos.getColumnModel().getColumn(2).setResizable(false);
		scrollPane_2.setViewportView(tableProductos);

		lblImporteTotal = new JLabel(MessagesPrincipal.getString("Principal.lblImporteTotal.text")); //$NON-NLS-1$
		lblImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
		GridBagConstraints gbc_lblImporteTotal = new GridBagConstraints();
		gbc_lblImporteTotal.gridwidth = 3;
		gbc_lblImporteTotal.insets = new Insets(0, 0, 5, 0);
		gbc_lblImporteTotal.gridx = 2;
		gbc_lblImporteTotal.gridy = 0;
		panelProductos.add(lblImporteTotal, gbc_lblImporteTotal);

		txtImporteTotal = new JTextField();
		txtImporteTotal.setBorder(null);
		txtImporteTotal.setBackground(SystemColor.menu);
		txtImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
		GridBagConstraints gbc_txtImporteTotal = new GridBagConstraints();
		gbc_txtImporteTotal.gridwidth = 3;
		gbc_txtImporteTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtImporteTotal.fill = GridBagConstraints.BOTH;
		gbc_txtImporteTotal.gridx = 2;
		gbc_txtImporteTotal.gridy = 1;
		panelProductos.add(txtImporteTotal, gbc_txtImporteTotal);
		txtImporteTotal.setColumns(10);

		lblMtodoDePago = new JLabel(MessagesPrincipal.getString("Principal.lblMtodoDePago.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMtodoDePago = new GridBagConstraints();
		gbc_lblMtodoDePago.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtodoDePago.gridx = 1;
		gbc_lblMtodoDePago.gridy = 3;
		panelProductos.add(lblMtodoDePago, gbc_lblMtodoDePago);

		chckbxEfectivo = new JCheckBox(MessagesPrincipal.getString("Principal.chckbxEfectivo.text")); //$NON-NLS-1$
		buttonGroup_1.add(chckbxEfectivo);
		GridBagConstraints gbc_chckbxEfectivo = new GridBagConstraints();
		gbc_chckbxEfectivo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxEfectivo.gridx = 2;
		gbc_chckbxEfectivo.gridy = 3;
		panelProductos.add(chckbxEfectivo, gbc_chckbxEfectivo);

		chckbxTarjeta = new JCheckBox(MessagesPrincipal.getString("Principal.chckbxTarjeta.text")); //$NON-NLS-1$
		buttonGroup_1.add(chckbxTarjeta);
		GridBagConstraints gbc_chckbxTarjeta = new GridBagConstraints();
		gbc_chckbxTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTarjeta.gridx = 3;
		gbc_chckbxTarjeta.gridy = 3;
		panelProductos.add(chckbxTarjeta, gbc_chckbxTarjeta);

		chckbxCanjearPuntos = new JCheckBox(MessagesPrincipal.getString("Principal.chckbxCanjearPuntos.text")); //$NON-NLS-1$
		buttonGroup_1.add(chckbxCanjearPuntos);
		GridBagConstraints gbc_chckbxCanjearPuntos = new GridBagConstraints();
		gbc_chckbxCanjearPuntos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxCanjearPuntos.gridx = 4;
		gbc_chckbxCanjearPuntos.gridy = 3;
		panelProductos.add(chckbxCanjearPuntos, gbc_chckbxCanjearPuntos);

		btnMostrarTicket = new JButton(MessagesPrincipal.getString("Principal.btnMostrarTicket.text")); //$NON-NLS-1$
		btnMostrarTicket.addActionListener(new BtnMostrarTicketActionListener());
		btnMostrarTicket.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/invoice.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnMostrarTicket = new GridBagConstraints();
		gbc_btnMostrarTicket.fill = GridBagConstraints.BOTH;
		gbc_btnMostrarTicket.gridwidth = 3;
		gbc_btnMostrarTicket.gridheight = 2;
		gbc_btnMostrarTicket.gridx = 2;
		gbc_btnMostrarTicket.gridy = 4;
		panelProductos.add(btnMostrarTicket, gbc_btnMostrarTicket);

		btnEliminarProducto = new JButton(MessagesPrincipal.getString("Principal.btnEliminarProducto.text")); //$NON-NLS-1$
		btnEliminarProducto.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminarProducto = new GridBagConstraints();
		gbc_btnEliminarProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminarProducto.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarProducto.gridx = 1;
		gbc_btnEliminarProducto.gridy = 5;
		panelProductos.add(btnEliminarProducto, gbc_btnEliminarProducto);

		tabMenusOfertas = new JPanel();
		tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabMenusOfertas"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/tagx24.png")), //$NON-NLS-1$
				tabMenusOfertas, null);
		tabMenusOfertas.setLayout(new BorderLayout(0, 0));

		tabpnlMenusyOfertas = new JTabbedPane(JTabbedPane.TOP);
		tabMenusOfertas.add(tabpnlMenusyOfertas);

		tabMenu = new JPanel();
		tabpnlMenusyOfertas.addTab(MessagesPrincipal.getString("Principal.tabMenu"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/menu.png")), tabMenu, null); //$NON-NLS-1$
		GridBagLayout gbl_tabMenu = new GridBagLayout();
		gbl_tabMenu.columnWidths = new int[] { 0, 173, 172, 175, 266, 343, 0 };
		gbl_tabMenu.rowHeights = new int[] { 0, 391, 0, 0, 0 };
		gbl_tabMenu.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_tabMenu.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		tabMenu.setLayout(gbl_tabMenu);

		scrollPane_4 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.gridwidth = 3;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_4.gridx = 1;
		gbc_scrollPane_4.gridy = 1;
		tabMenu.add(scrollPane_4, gbc_scrollPane_4);

		pnlMenu = new JPanel();

		for (int i = 0; i < 3; i++) {
			imagenes[i] = new JLabel(String.valueOf(i));
			imagenes[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			imagenes[i].setHorizontalAlignment(SwingConstants.CENTER);

			imagenes[i].setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/menu" + i + ".jpg"))); //$NON-NLS-1$ //$NON-NLS-2$
			imagenes[i].setText(menus[i]);
			imagenes[i].setHorizontalTextPosition(SwingConstants.CENTER);
			imagenes[i].setVerticalTextPosition(SwingConstants.BOTTOM);

			pnlMenu.add(imagenes[i]);
		}

		scrollPane_4.setViewportView(pnlMenu);

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.panel_3.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 4;
		gbc_panel_3.gridy = 1;
		tabMenu.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 194, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 0, 37, 171, 32, 29, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		lblNombre_2 = new JLabel(MessagesPrincipal.getString("Principal.lblNombre_2.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre_2 = new GridBagConstraints();
		gbc_lblNombre_2.anchor = GridBagConstraints.WEST;
		gbc_lblNombre_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNombre_2.gridx = 0;
		gbc_lblNombre_2.gridy = 0;
		panel_3.add(lblNombre_2, gbc_lblNombre_2);

		txtNombreMenus = new JTextField();
		txtNombreMenus.setText(MessagesPrincipal.getString("Principal.txtNombreMenus.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtNombreMenus = new GridBagConstraints();
		gbc_txtNombreMenus.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreMenus.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreMenus.gridx = 0;
		gbc_txtNombreMenus.gridy = 1;
		panel_3.add(txtNombreMenus, gbc_txtNombreMenus);
		txtNombreMenus.setColumns(10);

		label = new JLabel(MessagesPrincipal.getString("Principal.label.text")); //$NON-NLS-1$
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 2;
		panel_3.add(label, gbc_label);
		
		txtDescMenu = new JTextArea();
		txtDescMenu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDescMenu.setLineWrap(true);
		txtDescMenu.setWrapStyleWord(true);
		txtDescMenu.setText(MessagesPrincipal.getString("Principal.textArea.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtDescMenu = new GridBagConstraints();
		gbc_txtDescMenu.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescMenu.fill = GridBagConstraints.BOTH;
		gbc_txtDescMenu.gridx = 0;
		gbc_txtDescMenu.gridy = 3;
		panel_3.add(txtDescMenu, gbc_txtDescMenu);

		lblPrecio_1 = new JLabel(MessagesPrincipal.getString("Principal.lblPrecio_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrecio_1 = new GridBagConstraints();
		gbc_lblPrecio_1.fill = GridBagConstraints.BOTH;
		gbc_lblPrecio_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrecio_1.gridx = 0;
		gbc_lblPrecio_1.gridy = 4;
		panel_3.add(lblPrecio_1, gbc_lblPrecio_1);

		formattedTextField = new JFormattedTextField();
		formattedTextField.setText(MessagesPrincipal.getString("Principal.formattedTextField.text")); //$NON-NLS-1$
		formattedTextField.setPreferredSize(new Dimension(6, 10));
		formattedTextField.setMinimumSize(new Dimension(6, 10));
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 0);
		gbc_formattedTextField.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField.gridx = 0;
		gbc_formattedTextField.gridy = 5;
		panel_3.add(formattedTextField, gbc_formattedTextField);

		btnImagen = new JButton(MessagesPrincipal.getString("Principal.btnImagen.text")); //$NON-NLS-1$
		btnImagen.addActionListener(new BtnImagenActionListener());
		btnImagen.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/frame-landscape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnImagen = new GridBagConstraints();
		gbc_btnImagen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnImagen.gridx = 0;
		gbc_btnImagen.gridy = 6;
		panel_3.add(btnImagen, gbc_btnImagen);

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.panel_4.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 5;
		gbc_panel_4.gridy = 1;
		tabMenu.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 121, 64, 0, 65, 108, 0 };
		gbl_panel_4.rowHeights = new int[] { 0, 0, 0, 0, 24, 0 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_4.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_4.setLayout(gbl_panel_4);

		label_2 = new JLabel(MessagesPrincipal.getString("Principal.label_2.text")); //$NON-NLS-1$
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 0;
		panel_4.add(label_2, gbc_label_2);

		label_3 = new JLabel(MessagesPrincipal.getString("Principal.label_3.text")); //$NON-NLS-1$
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 0;
		panel_4.add(label_3, gbc_label_3);

		scrollPane_5 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
		gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_5.gridwidth = 2;
		gbc_scrollPane_5.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_5.gridx = 0;
		gbc_scrollPane_5.gridy = 1;
		panel_4.add(scrollPane_5, gbc_scrollPane_5);

		listVIPMenu = new JList();
		listVIPMenu.setModel(new AbstractListModel() {
			String[] values = new String[] { "Ana Martín", "Pedro Serrano", "Carlos Gallego" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_5.setViewportView(listVIPMenu);

		scrollPane_6 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_6 = new GridBagConstraints();
		gbc_scrollPane_6.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_6.gridwidth = 2;
		gbc_scrollPane_6.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_6.gridx = 3;
		gbc_scrollPane_6.gridy = 1;
		panel_4.add(scrollPane_6, gbc_scrollPane_6);

		listEnvMenu = new JList();
		modelolista = new DefaultListModel();
		listEnvMenu.setModel(modelolista);
		scrollPane_6.setViewportView(listEnvMenu);

		button = new JButton(MessagesPrincipal.getString("Principal.button.text")); //$NON-NLS-1$
		button.addActionListener(new ButtonActionListener());
		button.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/scroll-arrow-to-right.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridwidth = 2;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 2;
		panel_4.add(button, gbc_button);

		button_1 = new JButton(MessagesPrincipal.getString("Principal.button_1.text")); //$NON-NLS-1$
		button_1.addActionListener(new Button_1ActionListener());
		button_1.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/scroll-arrow-to-left.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridwidth = 2;
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 2;
		panel_4.add(button_1, gbc_button_1);

		button_2 = new JButton(MessagesPrincipal.getString("Principal.button_2.text")); //$NON-NLS-1$
		button_2.addActionListener(new Button_2ActionListener());
		button_2.setIcon(
				new ImageIcon(Principal.class.getResource("/Presentacion/black-back-closed-envelope-shape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.VERTICAL;
		gbc_button_2.gridheight = 2;
		gbc_button_2.gridwidth = 3;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 3;
		panel_4.add(button_2, gbc_button_2);

		btnAadirMen = new JButton(MessagesPrincipal.getString("Principal.btnAadirMen.text")); //$NON-NLS-1$
		btnAadirMen.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadirMen = new GridBagConstraints();
		gbc_btnAadirMen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirMen.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirMen.gridx = 1;
		gbc_btnAadirMen.gridy = 2;
		tabMenu.add(btnAadirMen, gbc_btnAadirMen);

		btnEditarMen = new JButton(MessagesPrincipal.getString("Principal.btnEditarMen.text")); //$NON-NLS-1$
		btnEditarMen.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditarMen = new GridBagConstraints();
		gbc_btnEditarMen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarMen.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarMen.gridx = 2;
		gbc_btnEditarMen.gridy = 2;
		tabMenu.add(btnEditarMen, gbc_btnEditarMen);

		btnBorrarMen = new JButton(MessagesPrincipal.getString("Principal.btnBorrarMen.text")); //$NON-NLS-1$
		btnBorrarMen.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrarMen = new GridBagConstraints();
		gbc_btnBorrarMen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarMen.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarMen.gridx = 3;
		gbc_btnBorrarMen.gridy = 2;
		tabMenu.add(btnBorrarMen, gbc_btnBorrarMen);

		tabOfertas = new JPanel();
		tabpnlMenusyOfertas.addTab(MessagesPrincipal.getString("Principal.tabOfertas"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/percentage.png")), tabOfertas, null); //$NON-NLS-1$
		GridBagLayout gbl_tabOfertas = new GridBagLayout();
		gbl_tabOfertas.columnWidths = new int[] { 0, 150, 0, 149, 243, 370, 0 };
		gbl_tabOfertas.rowHeights = new int[] { 0, 391, 0, 0, 0 };
		gbl_tabOfertas.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_tabOfertas.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		tabOfertas.setLayout(gbl_tabOfertas);

		scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 1;
		tabOfertas.add(scrollPane_3, gbc_scrollPane_3);

		pnlOfertas = new JPanel();

		for (int i = 0; i < 2; i++) {
			imagenes[i] = new JLabel(String.valueOf(i));
			imagenes[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			imagenes[i].setHorizontalAlignment(SwingConstants.CENTER);

			imagenes[i].setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/oferta" + i + ".jpg"))); //$NON-NLS-1$ //$NON-NLS-2$
			imagenes[i].setText(ofertas[i]);
			imagenes[i].setHorizontalTextPosition(SwingConstants.CENTER);
			imagenes[i].setVerticalTextPosition(SwingConstants.BOTTOM);

			pnlOfertas.add(imagenes[i]);
		}

		scrollPane_3.setViewportView(pnlOfertas);

		pnlDetallesOf = new JPanel();
		pnlDetallesOf
				.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlDetallesOf.borderTitle"), //$NON-NLS-1$
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetallesOf = new GridBagConstraints();
		gbc_pnlDetallesOf.insets = new Insets(0, 0, 5, 5);
		gbc_pnlDetallesOf.fill = GridBagConstraints.BOTH;
		gbc_pnlDetallesOf.gridx = 4;
		gbc_pnlDetallesOf.gridy = 1;
		tabOfertas.add(pnlDetallesOf, gbc_pnlDetallesOf);
		GridBagLayout gbl_pnlDetallesOf = new GridBagLayout();
		gbl_pnlDetallesOf.columnWidths = new int[] { 194, 0 };
		gbl_pnlDetallesOf.rowHeights = new int[] { 0, 0, 39, 175, 23, 41, 0, 0 };
		gbl_pnlDetallesOf.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pnlDetallesOf.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlDetallesOf.setLayout(gbl_pnlDetallesOf);

		lblNombre_1 = new JLabel(MessagesPrincipal.getString("Principal.lblNombre_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNombre_1.gridx = 0;
		gbc_lblNombre_1.gridy = 0;
		pnlDetallesOf.add(lblNombre_1, gbc_lblNombre_1);

		txtNombreOf = new JTextField();
		txtNombreOf.setText(MessagesPrincipal.getString("Principal.txtNombreOf.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtNombreOf = new GridBagConstraints();
		gbc_txtNombreOf.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreOf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreOf.gridx = 0;
		gbc_txtNombreOf.gridy = 1;
		pnlDetallesOf.add(txtNombreOf, gbc_txtNombreOf);
		txtNombreOf.setColumns(10);

		lblDescripcin = new JLabel(MessagesPrincipal.getString("Principal.lblDescripcin.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.fill = GridBagConstraints.BOTH;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 2;
		pnlDetallesOf.add(lblDescripcin, gbc_lblDescripcin);
		
		txtDescOfertas = new JTextArea();
		txtDescOfertas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDescOfertas.setLineWrap(true);
		txtDescOfertas.setWrapStyleWord(true);
		txtDescOfertas.setText(MessagesPrincipal.getString("Principal.txtDesc.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtDescOfertas = new GridBagConstraints();
		gbc_txtDescOfertas.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescOfertas.fill = GridBagConstraints.BOTH;
		gbc_txtDescOfertas.gridx = 0;
		gbc_txtDescOfertas.gridy = 3;
		pnlDetallesOf.add(txtDescOfertas, gbc_txtDescOfertas);

		lblValidaHasta = new JLabel(MessagesPrincipal.getString("Principal.lblValidaHasta.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblValidaHasta = new GridBagConstraints();
		gbc_lblValidaHasta.fill = GridBagConstraints.BOTH;
		gbc_lblValidaHasta.insets = new Insets(0, 0, 5, 0);
		gbc_lblValidaHasta.gridx = 0;
		gbc_lblValidaHasta.gridy = 4;
		pnlDetallesOf.add(lblValidaHasta, gbc_lblValidaHasta);

		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setIcon(
				new ImageIcon(Principal.class.getResource("/com/toedter/calendar/images/JCalendarColor32.gif"))); //$NON-NLS-1$
		dateChooser.setDateFormatString("dd-MM-yyyy"); //$NON-NLS-1$
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridx = 0;
		gbc_dateChooser.gridy = 5;
		pnlDetallesOf.add(dateChooser, gbc_dateChooser);

		btnModificarImagen = new JButton(MessagesPrincipal.getString("Principal.btnModificarImagen.text")); //$NON-NLS-1$
		btnModificarImagen.addActionListener(new BtnModificarImagenActionListener());
		btnModificarImagen.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/frame-landscape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnModificarImagen = new GridBagConstraints();
		gbc_btnModificarImagen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarImagen.gridx = 0;
		gbc_btnModificarImagen.gridy = 6;
		pnlDetallesOf.add(btnModificarImagen, gbc_btnModificarImagen);

		pnlEnvioOf = new JPanel();
		pnlEnvioOf.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlEnvioOf.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlEnvioOf = new GridBagConstraints();
		gbc_pnlEnvioOf.insets = new Insets(0, 0, 5, 0);
		gbc_pnlEnvioOf.fill = GridBagConstraints.BOTH;
		gbc_pnlEnvioOf.gridx = 5;
		gbc_pnlEnvioOf.gridy = 1;
		tabOfertas.add(pnlEnvioOf, gbc_pnlEnvioOf);
		GridBagLayout gbl_pnlEnvioOf = new GridBagLayout();
		gbl_pnlEnvioOf.columnWidths = new int[] { 84, 72, 27, 90, 72, 0 };
		gbl_pnlEnvioOf.rowHeights = new int[] { 0, 0, 0, 0, 24, 0 };
		gbl_pnlEnvioOf.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlEnvioOf.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlEnvioOf.setLayout(gbl_pnlEnvioOf);

		lblTotalClientesVip = new JLabel(MessagesPrincipal.getString("Principal.lblTotalClientesVip.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTotalClientesVip = new GridBagConstraints();
		gbc_lblTotalClientesVip.anchor = GridBagConstraints.WEST;
		gbc_lblTotalClientesVip.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalClientesVip.gridx = 0;
		gbc_lblTotalClientesVip.gridy = 0;
		pnlEnvioOf.add(lblTotalClientesVip, gbc_lblTotalClientesVip);

		lblEnviarA = new JLabel(MessagesPrincipal.getString("Principal.lblEnviarA.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEnviarA = new GridBagConstraints();
		gbc_lblEnviarA.anchor = GridBagConstraints.WEST;
		gbc_lblEnviarA.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnviarA.gridx = 3;
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
		listCVIP.setModel(new DefaultListModel() {
			String[] values = new String[] { "Ana Martín", "Pedro Serrano", "Carlos Gallego" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
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
		modelolistaOf = new DefaultListModel();
		listEnv.setModel(modelolistaOf);
		scrollPaneEnv.setViewportView(listEnv);

		btnSeleccionar = new JButton(MessagesPrincipal.getString("Principal.btnSeleccionar.text")); //$NON-NLS-1$
		btnSeleccionar.addActionListener(new BtnSeleccionarActionListener());
		btnSeleccionar.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/scroll-arrow-to-right.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.gridwidth = 2;
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeleccionar.gridx = 0;
		gbc_btnSeleccionar.gridy = 2;
		pnlEnvioOf.add(btnSeleccionar, gbc_btnSeleccionar);

		btnEliminar_1 = new JButton(MessagesPrincipal.getString("Principal.btnEliminar_1.text")); //$NON-NLS-1$
		btnEliminar_1.addActionListener(new BtnEliminar_1ActionListener());
		btnEliminar_1.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/scroll-arrow-to-left.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminar_1 = new GridBagConstraints();
		gbc_btnEliminar_1.gridwidth = 2;
		gbc_btnEliminar_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar_1.gridx = 3;
		gbc_btnEliminar_1.gridy = 2;
		pnlEnvioOf.add(btnEliminar_1, gbc_btnEliminar_1);

		btnEnviar = new JButton(MessagesPrincipal.getString("Principal.btnEnviar.text")); //$NON-NLS-1$
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		btnEnviar.setIcon(
				new ImageIcon(Principal.class.getResource("/Presentacion/black-back-closed-envelope-shape.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEnviar.gridheight = 2;
		gbc_btnEnviar.gridwidth = 3;
		gbc_btnEnviar.gridx = 1;
		gbc_btnEnviar.gridy = 3;
		pnlEnvioOf.add(btnEnviar, gbc_btnEnviar);

		btnAadirOferta = new JButton(MessagesPrincipal.getString("Principal.btnAadirOferta.text")); //$NON-NLS-1$
		btnAadirOferta.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/add.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadirOferta = new GridBagConstraints();
		gbc_btnAadirOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAadirOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirOferta.gridx = 1;
		gbc_btnAadirOferta.gridy = 2;
		tabOfertas.add(btnAadirOferta, gbc_btnAadirOferta);

		btnEditarOferta = new JButton(MessagesPrincipal.getString("Principal.btnEditarOferta.text")); //$NON-NLS-1$
		btnEditarOferta.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/pencil-edit-button.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
		gbc_btnEditarOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarOferta.gridx = 2;
		gbc_btnEditarOferta.gridy = 2;
		tabOfertas.add(btnEditarOferta, gbc_btnEditarOferta);

		btnBorrarOferta = new JButton(MessagesPrincipal.getString("Principal.btnBorrarOferta.text")); //$NON-NLS-1$
		btnBorrarOferta.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/closed-paper-bin.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
		gbc_btnBorrarOferta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarOferta.gridx = 3;
		gbc_btnBorrarOferta.gridy = 2;
		tabOfertas.add(btnBorrarOferta, gbc_btnBorrarOferta);

		tabReparto = new JPanel();
		tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabReparto"), //$NON-NLS-1$
				new ImageIcon(Principal.class.getResource("/Presentacion/scooterx24.png")), //$NON-NLS-1$
				tabReparto, null);
		GridBagLayout gbl_tabReparto = new GridBagLayout();
		gbl_tabReparto.columnWidths = new int[] { 778, 410, 0 };
		gbl_tabReparto.rowHeights = new int[] { 41, 200, 5, 0 };
		gbl_tabReparto.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_tabReparto.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		tabReparto.setLayout(gbl_tabReparto);

		toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.insets = new Insets(0, 0, 5, 5);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		tabReparto.add(toolBar, gbc_toolBar);

		// Creación de imágenes y cursores
		toolkit = Toolkit.getDefaultToolkit();
		imagUbicacion = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/maps-and-flags.png")); //$NON-NLS-1$
		imagUbicacion = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/maps-and-flags.png")); //$NON-NLS-1$
		cursorUbicacion = toolkit.createCustomCursor(imagUbicacion, new Point(0, 0), "CURSOR_UBICACION"); //$NON-NLS-1$
		cursorSeleccion = Cursor.getDefaultCursor();

		btnCargarMapa = new JButton(MessagesPrincipal.getString("Principal.btnCargarMapa.text")); //$NON-NLS-1$
		btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());
		btnCargarMapa.setIcon(
				new ImageIcon(Principal.class.getResource("/Presentacion/earth-globe-with-continents-maps.png"))); //$NON-NLS-1$
		toolBar.add(btnCargarMapa);

		btnUbicacin = new JButton(MessagesPrincipal.getString("Principal.btnUbicacin.text")); //$NON-NLS-1$
		btnUbicacin.addActionListener(new BtnUbicacinActionListener());
		btnUbicacin.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/maps-and-flags.png"))); //$NON-NLS-1$
		toolBar.add(btnUbicacin);

		btnSeleccin = new JButton(MessagesPrincipal.getString("Principal.btnSeleccin.text")); //$NON-NLS-1$
		btnSeleccin.addActionListener(new BtnSeleccinActionListener());
		btnSeleccin.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/cursor.png"))); //$NON-NLS-1$
		toolBar.add(btnSeleccin);

		pnlMapa = new JPanel();
		pnlMapa.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlMapa.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlMapa = new GridBagConstraints();
		gbc_pnlMapa.insets = new Insets(0, 0, 5, 5);
		gbc_pnlMapa.fill = GridBagConstraints.BOTH;
		gbc_pnlMapa.gridx = 0;
		gbc_pnlMapa.gridy = 1;
		tabReparto.add(pnlMapa, gbc_pnlMapa);
		pnlMapa.setLayout(new BorderLayout(0, 0));

		scrollPane_7 = new JScrollPane();
		pnlMapa.add(scrollPane_7);

		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseListener(new LblMapaMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane_7.setViewportView(miAreaDibujo);

		pnlDetallesPedido = new JPanel();
		pnlDetallesPedido.setBorder(
				new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlDetallesPedido.borderTitle"), //$NON-NLS-1$
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetallesPedido = new GridBagConstraints();
		gbc_pnlDetallesPedido.insets = new Insets(0, 0, 5, 0);
		gbc_pnlDetallesPedido.fill = GridBagConstraints.BOTH;
		gbc_pnlDetallesPedido.gridx = 1;
		gbc_pnlDetallesPedido.gridy = 1;
		tabReparto.add(pnlDetallesPedido, gbc_pnlDetallesPedido);
		GridBagLayout gbl_pnlDetallesPedido = new GridBagLayout();
		gbl_pnlDetallesPedido.columnWidths = new int[] { 0, 187, 129, 0, 0 };
		gbl_pnlDetallesPedido.rowHeights = new int[] { 0, 0, 0, 0, 0, 27, 45, 0 };
		gbl_pnlDetallesPedido.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlDetallesPedido.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlDetallesPedido.setLayout(gbl_pnlDetallesPedido);

		scrollPane_9 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_9 = new GridBagConstraints();
		gbc_scrollPane_9.gridwidth = 4;
		gbc_scrollPane_9.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_9.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_9.gridx = 0;
		gbc_scrollPane_9.gridy = 1;
		pnlDetallesPedido.add(scrollPane_9, gbc_scrollPane_9);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { new Integer(1), "C/Concepci\u00F3n Arenal 3 4\u00BAA", Boolean.TRUE }, //$NON-NLS-1$
						{ new Integer(2), "C/ Calle Toledo 89", null }, //$NON-NLS-1$
				}, new String[] { MessagesPrincipal.getString("Principal.RepartoColOrden"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.RepartoColDireccion"), "VIP" //$NON-NLS-1$ //$NON-NLS-2$
				}) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, Boolean.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(15);
		table_1.getColumnModel().getColumn(0).setMinWidth(10);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(200);
		table_1.getColumnModel().getColumn(1).setMinWidth(25);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(15);
		table_1.getColumnModel().getColumn(2).setMinWidth(10);
		scrollPane_9.setViewportView(table_1);

		chckbxPagado = new JCheckBox(MessagesPrincipal.getString("Principal.chckbxPagado.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxPagado = new GridBagConstraints();
		gbc_chckbxPagado.anchor = GridBagConstraints.WEST;
		gbc_chckbxPagado.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPagado.gridx = 1;
		gbc_chckbxPagado.gridy = 3;
		pnlDetallesPedido.add(chckbxPagado, gbc_chckbxPagado);

		rdbtnCaliente = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnCaliente.text")); //$NON-NLS-1$
		rdbtnCaliente.setSelected(true);
		buttonGroup_2.add(rdbtnCaliente);
		GridBagConstraints gbc_rdbtnCaliente = new GridBagConstraints();
		gbc_rdbtnCaliente.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCaliente.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCaliente.gridx = 1;
		gbc_rdbtnCaliente.gridy = 4;
		pnlDetallesPedido.add(rdbtnCaliente, gbc_rdbtnCaliente);

		rdbtnFro = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnFro.text")); //$NON-NLS-1$
		rdbtnFro.setHorizontalAlignment(SwingConstants.LEFT);
		buttonGroup_2.add(rdbtnFro);
		GridBagConstraints gbc_rdbtnFro = new GridBagConstraints();
		gbc_rdbtnFro.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFro.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFro.gridx = 2;
		gbc_rdbtnFro.gridy = 4;
		pnlDetallesPedido.add(rdbtnFro, gbc_rdbtnFro);

		lblHoraAproximadaDe = new JLabel(MessagesPrincipal.getString("Principal.lblHoraAproximadaDe.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHoraAproximadaDe = new GridBagConstraints();
		gbc_lblHoraAproximadaDe.anchor = GridBagConstraints.WEST;
		gbc_lblHoraAproximadaDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraAproximadaDe.gridx = 1;
		gbc_lblHoraAproximadaDe.gridy = 5;
		pnlDetallesPedido.add(lblHoraAproximadaDe, gbc_lblHoraAproximadaDe);

		txtHoraentrega = new JTextField();
		txtHoraentrega.setHorizontalAlignment(SwingConstants.LEFT);
		txtHoraentrega.setBorder(null);
		txtHoraentrega.setBackground(SystemColor.menu);
		txtHoraentrega.setText("  22:30"); //$NON-NLS-1$
		GridBagConstraints gbc_txtHoraentrega = new GridBagConstraints();
		gbc_txtHoraentrega.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraentrega.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraentrega.gridx = 2;
		gbc_txtHoraentrega.gridy = 5;
		pnlDetallesPedido.add(txtHoraentrega, gbc_txtHoraentrega);
		txtHoraentrega.setColumns(10);

	}

	private class BtnMostrarTicketActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Ticket t = new Ticket();
			t.getFrame().setVisible(true);
			if (chckbxEfectivo.isSelected())
				t.getMetodoPago().setText(chckbxEfectivo.getText());
			else if (chckbxTarjeta.isSelected())
				t.getMetodoPago().setText(chckbxTarjeta.getText());
			else
				t.getMetodoPago().setText(chckbxCanjearPuntos.getText());

			t.getLeAtendio().setText("Admin"); //$NON-NLS-1$
		}
	}

	private class TxtNombreKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			if (!(Character.isLetter(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar())))
				e.consume();
		}
	}

	private class TxtPrecioKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			if (!Character.isDigit(e.getKeyChar()))
				e.consume();
		}
	}

	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {

			String nodo = (e.getPath().getLastPathComponent()).toString();
			String plato = ""; //$NON-NLS-1$
			String[] array = new String[5];

			switch (nodo) {
			case "Ensaladas": //$NON-NLS-1$
			case "Salads":
				plato = "ensalada"; //$NON-NLS-1$
				array = ensaladas;
				break;
			case "Arroces y pastas": //$NON-NLS-1$
			case "Rice and pasta":
				plato = "arrozpasta"; //$NON-NLS-1$
				array = arroces;
				break;
			case "Pescados": //$NON-NLS-1$
			case "Fish":
				plato = "pescados"; //$NON-NLS-1$
				array = pescados;
				break;
			case "Asados": //$NON-NLS-1$
			case "Roasted":
				plato = "asados"; //$NON-NLS-1$
				array = asados;
				break;
			case "Pizzas": //$NON-NLS-1$
				plato = "pizza"; //$NON-NLS-1$
				array = pizzas;
				break;
			case "Hamburguesas": //$NON-NLS-1$
			case "Burgers":
				plato = "hamburguesa"; //$NON-NLS-1$
				array = hamburguesas;
				break;
			case "Bocadillos": //$NON-NLS-1$
			case "Sandwiches":
				plato = "bocadillo"; //$NON-NLS-1$
				array = bocadillos;
				break;
			case "Postres": //$NON-NLS-1$
			case "Desserts":
				plato = "postres"; //$NON-NLS-1$
				array = postres;
				break;
			case "Bebidas": //$NON-NLS-1$
			case "Drinks":
				plato = "bebidas"; //$NON-NLS-1$
				array = bebidas;
				break;
			}
			panelCard.removeAll();

			for (int i = 0; i < 5; i++) {
				imagenes[i] = new JLabel(String.valueOf(i));
				imagenes[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				imagenes[i].setHorizontalAlignment(SwingConstants.CENTER);

				imagenes[i].setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/" + plato + i + ".jpg"))); //$NON-NLS-1$ //$NON-NLS-2$
				imagenes[i].setText(array[i]);
				imagenes[i].setHorizontalTextPosition(SwingConstants.CENTER);
				imagenes[i].setVerticalTextPosition(SwingConstants.BOTTOM);

				panelCard.add(imagenes[i]);
			}
		}
	}

	private class BtnUbicacinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = UBICACION;
			frame.setCursor(cursorUbicacion);
		}
	}

	private class BtnSeleccinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = SELECCION;
			frame.setCursor(cursorSeleccion);
		}
	}

	private ImageIcon seleccionar_label() {
		JFileChooser fcAbrir = new JFileChooser();
		int valorDevuelto = fcAbrir.showOpenDialog(frame);
		if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			imagen = new ImageIcon(file.getAbsolutePath());
		}
		return imagen;
	}

	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			miAreaDibujo.setIcon(seleccionar_label());
			miAreaDibujo.getObjetosGraficos().clear();
		}
	}

	private class LblMapaMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null) {
				switch (modo) {
				case UBICACION:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagUbicacion));
					miAreaDibujo.repaint();
					break;
				case SELECCION:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagSeleccion));
					miAreaDibujo.repaint();
					break;
				}
			}
		}
	}

	private class Button_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (modelolista.getSize() > 0) {
				if (JOptionPane.showConfirmDialog(frame, MessagesPrincipal.getString("Principal.MensajeEnvMenus"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.TituloEnvMenus"), //$NON-NLS-1$
						JOptionPane.YES_NO_OPTION) == 0) {
					JOptionPane.showMessageDialog(frame, MessagesPrincipal.getString("Principal.MensajeConfEnvMenus"), //$NON-NLS-1$
							MessagesPrincipal.getString("Principal.TituloConfEnvMenus"), //$NON-NLS-1$
							JOptionPane.INFORMATION_MESSAGE);
					modelolista.removeAllElements();
				}
			}
		}
	}

	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (modelolistaOf.getSize() > 0) {
				if (JOptionPane.showConfirmDialog(frame, MessagesPrincipal.getString("Principal.MensajeEnvOferta"), //$NON-NLS-1$
						MessagesPrincipal.getString("Principal.TituloEnvOferta"), //$NON-NLS-1$
						JOptionPane.YES_NO_OPTION) == 0) {
					JOptionPane.showMessageDialog(frame, MessagesPrincipal.getString("Principal.MensajeConfEnvOferta"), //$NON-NLS-1$
							MessagesPrincipal.getString("Principal.TituloConfEnvOferta"), //$NON-NLS-1$
							JOptionPane.INFORMATION_MESSAGE);
					modelolistaOf.removeAllElements();
				}
			}
		}
	}

	private class BtnSeleccionarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((!modelolistaOf.contains(listCVIP.getSelectedValue())) && listCVIP.getSelectedValue() != null)
				modelolistaOf.addElement(listCVIP.getSelectedValue().toString());
		}
	}

	private class BtnEliminar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modelolistaOf.removeElement(listEnv.getSelectedValue());
		}
	}

	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((!modelolista.contains(listVIPMenu.getSelectedValue())) && listVIPMenu.getSelectedValue() != null)
				modelolista.addElement(listVIPMenu.getSelectedValue().toString());
		}
	}

	private class Button_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modelolista.removeElement(listEnvMenu.getSelectedValue());
		}
	}

	private class BtnModificarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblImagen.setIcon(seleccionar_label());
		}
	}

	private class BtnModificarImagen_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seleccionar_label();
		}
	}

	private class BtnImagenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seleccionar_label();
		}
	}

	private class BtnModificarImagenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seleccionar_label();
		}
	}
}
