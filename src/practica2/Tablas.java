package practica2;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

public class Tablas {


	public JFrame frameTablasMultiplicar;
	private JTextArea txtResultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas window = new Tablas();
					window.frameTablasMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTablasMultiplicar = new JFrame();
		frameTablasMultiplicar
				.setIconImage(Toolkit.getDefaultToolkit().getImage(Tablas.class.getResource("/img/tablas.jpg")));
		frameTablasMultiplicar.setBounds(100, 100, 268, 425);
		frameTablasMultiplicar.setLocationRelativeTo(null);
		frameTablasMultiplicar.setTitle("TABLAS MULTIPLICAR");
		frameTablasMultiplicar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameTablasMultiplicar.getContentPane().setLayout(null);

		JSpinner spnNumero = new JSpinner();
		spnNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numero = Integer.parseInt(spnNumero.getValue().toString());
				String tabla = "";
				for (int i = 1; i <= 10; i++) {
					tabla += numero + " X " + i + " = " + (numero * i) + "\n";
				}
				txtResultado.setText(tabla);
			}
		});
		spnNumero.setBounds(10, 11, 80, 20);
		frameTablasMultiplicar.getContentPane().add(spnNumero);

		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtResultado.setEditable(false);
		txtResultado.setBounds(10, 44, 120, 220);
		frameTablasMultiplicar.getContentPane().add(txtResultado);

		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spnNumero.setValue(1);
				txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(122, 10, 89, 23);
		frameTablasMultiplicar.getContentPane().add(btnBorrar);
	}
}
