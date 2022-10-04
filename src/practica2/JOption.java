package practica2;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOption {

	public JFrame frameTiposDeJoption;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOption window = new JOption();
					window.frameTiposDeJoption.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JOption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameTiposDeJoption = new JFrame();
		frameTiposDeJoption.setTitle("TIPOS DE JOPTION");
		frameTiposDeJoption.setIconImage(Toolkit.getDefaultToolkit().getImage(JOption.class.getResource("/img/java.png")));
		frameTiposDeJoption.setBounds(100, 100, 329, 241);
		frameTiposDeJoption.setLocationRelativeTo(null);
		frameTiposDeJoption.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameTiposDeJoption.getContentPane().setLayout(null);

		JButton btnMensaje = new JButton("Mensaje");
		btnMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "MENSAJE 1");
				JOptionPane.showMessageDialog(null, "MENSAJE 2", "TIPO MESSAGE", 2);
			}
		});
		btnMensaje.setBounds(10, 11, 114, 28);
		frameTiposDeJoption.getContentPane().add(btnMensaje);

		JButton btnInput = new JButton("Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = JOptionPane.showInputDialog("INTROUCE MENSAJE");
				lblMensaje.setText(mensaje);
			}
		});
		btnInput.setBounds(10, 50, 114, 38);
		frameTiposDeJoption.getContentPane().add(btnInput);

		JButton btnConfirmacion = new JButton("Confimacion");
		btnConfirmacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO??");
				System.out.println(opcion);
				if (opcion == 0)
					lblMensaje.setText("SI");
				if (opcion == 1)
					lblMensaje.setText("NO");
				if (opcion == 2)
					lblMensaje.setText("CANCELAR");
			}
		});
		btnConfirmacion.setBounds(10, 99, 114, 33);
		frameTiposDeJoption.getContentPane().add(btnConfirmacion);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("");
			}
		});
		btnBorrar.setBounds(100, 143, 123, 48);
		frameTiposDeJoption.getContentPane().add(btnBorrar);

		lblMensaje = new JLabel("");
		lblMensaje.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMensaje.setBounds(191, 50, 112, 59);
		frameTiposDeJoption.getContentPane().add(lblMensaje);
	}
}
