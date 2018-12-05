package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Productos {

	private JFrame frame;
	private JPanel panel;
	private JButton btnAadirProducto;
	private JButton btnDarDeAlta;
	private JButton btnEditar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos window = new Productos();
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
	public Productos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 983, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 765, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{436, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);

		GridBagConstraints gbc_btnAadirProducto = new GridBagConstraints();
		gbc_btnAadirProducto.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirProducto.gridx = 0;
		gbc_btnAadirProducto.gridy = 1;
		frame.getContentPane().add(btnAadirProducto, gbc_btnAadirProducto);
		
		btnDarDeAlta = new JButton("Dar de alta");
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 0;
		gbc_btnDarDeAlta.gridy = 1;
		frame.getContentPane().add(btnDarDeAlta, gbc_btnDarDeAlta);
		
		btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 0;
		gbc_btnEditar.gridy = 2;
		frame.getContentPane().add(btnEditar, gbc_btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 0;
		gbc_btnEliminar.gridy = 3;
		frame.getContentPane().add(btnEliminar, gbc_btnEliminar);
	}

}
