package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import entity.sistemacomputadores;
import entity.tipocomputador;
import model.computadorModel;
import model.tipocomputadorModel;

public class Frmtipocomputador extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtDiscoDuro;
	private JTextField txtRAM;
	private JTextField txtProcesador;
	private JTextField txtPrecio;
	private JTextField txtEstado;
	private JComboBox<tipocomputador> cboTipoComputador;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmtipocomputador frame = new Frmtipocomputador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frmtipocomputador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro Computador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 10, 674, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(44, 77, 83, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(44, 114, 56, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marca:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(44, 154, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(44, 196, 83, 12);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Procesador:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(44, 237, 97, 12);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RAM:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(44, 279, 66, 12);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Disco Duro:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(44, 323, 97, 12);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Precio:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(44, 360, 66, 12);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Estado:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(44, 407, 66, 12);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Tipo Computador:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(44, 454, 147, 12);
		contentPane.add(lblNewLabel_10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(115, 75, 363, 18);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(110, 109, 183, 18);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(120, 152, 192, 18);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(115, 194, 197, 18);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		cboTipoComputador = new JComboBox<tipocomputador>();
		cboTipoComputador.setBounds(174, 451, 211, 20);
		contentPane.add(cboTipoComputador);
		
		txtDiscoDuro = new JTextField();
		txtDiscoDuro.setBounds(120, 321, 192, 18);
		contentPane.add(txtDiscoDuro);
		txtDiscoDuro.setColumns(10);
		
		txtRAM = new JTextField();
		txtRAM.setBounds(110, 277, 125, 18);
		contentPane.add(txtRAM);
		txtRAM.setColumns(10);
		
		txtProcesador = new JTextField();
		txtProcesador.setBounds(138, 235, 147, 18);
		contentPane.add(txtProcesador);
		txtProcesador.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(120, 358, 96, 18);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(120, 405, 144, 18);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrar.setBounds(57, 527, 134, 25);
		contentPane.add(btnRegistrar);

		// Cargar los tipos de computador al inicializar la ventana
		cargarComboTipo();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			handleBtnRegistrarActionPerformed(e);
		}
	}

	protected void handleBtnRegistrarActionPerformed(ActionEvent e) {
		// 1. Lectura de campos
		String nombre = txtNombre.getText().trim();
		String codigo = txtCodigo.getText().trim();
		String marca = txtMarca.getText().trim();
		String modelo = txtModelo.getText().trim();
		String procesador = txtProcesador.getText().trim();
		String ram = txtRAM.getText().trim();
		String discoDuro = txtDiscoDuro.getText().trim();
		String precio = txtPrecio.getText().trim();
		String estado = txtEstado.getText().trim();

		// 2. Obtención segura del elemento seleccionado en el combo
		Object selectedItem = cboTipoComputador.getSelectedItem();
		tipocomputador tipo = null;
		if (selectedItem instanceof tipocomputador) {
			tipo = (tipocomputador) selectedItem;
		}

		// 3. Validación rápida de campos obligatorios
		if (nombre.isEmpty() || codigo.isEmpty() || tipo == null) {
			JOptionPane.showMessageDialog(this, "Por favor complete los campos obligatorios (Nombre, Código y Tipo de Computador).", "Advertencia", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 4. Crear y llenar objeto de la entidad
		sistemacomputadores comp = new sistemacomputadores();
		comp.setNombre(nombre);
		comp.setCodigo(codigo);
		comp.setMarca(marca);
		comp.setModelo(modelo);
		comp.setProcesador(procesador);
		comp.setRam(ram);
		comp.setDiscoDuro(discoDuro);
		comp.setPrecio(precio);
		comp.setEstado(estado);
		comp.setTipocomputador(tipo);

		// 5. Enviar a la base de datos
		computadorModel model = new computadorModel();
		int res = model.insertacomputador(comp);

		if (res > 0) {
			JOptionPane.showMessageDialog(this, "¡Computador registrado exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			limpiarFormulario();
		} else {
			JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos. Verifique la conexión o los tipos de datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void cargarComboTipo() {
		try {
			tipocomputadorModel model = new tipocomputadorModel();
			List<tipocomputador> lista = model.listarTipoComputador();

			cboTipoComputador.removeAllItems();

			if (lista != null && !lista.isEmpty()) {
				for (tipocomputador item : lista) {
					cboTipoComputador.addItem(item);
				}
			} else {
				System.err.println("La lista de tipos de computador regresó vacía o nula.");
			}
		} catch (Exception e) {
			System.err.println("Error al cargar el ComboBox: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void limpiarFormulario() {
		txtNombre.setText("");
		txtCodigo.setText("");
		txtMarca.setText("");
		txtModelo.setText("");
		txtProcesador.setText("");
		txtRAM.setText("");
		txtDiscoDuro.setText("");
		txtPrecio.setText("");
		txtEstado.setText("");
		if (cboTipoComputador.getItemCount() > 0) {
			cboTipoComputador.setSelectedIndex(0);
		}
		txtNombre.requestFocus();
	}
}