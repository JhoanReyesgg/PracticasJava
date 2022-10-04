package practica2;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radio {

	public JFrame frame;
	ButtonGroup grupo = new ButtonGroup();
	private JRadioButton radRojo;
	private JRadioButton radAzul;
	private JRadioButton radNegro;
	private JRadioButton radVerde;
	private JLabel lblColor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio window = new Radio();
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
	public Radio() {
		initialize();
	}

	public void cambiarColor() {
		if (radRojo.isSelected()) {
			lblColor.setBackground(Color.red);
		} else {
			if (radAzul.isSelected()) {
				lblColor.setBackground(Color.blue);
			} else {
				if (radNegro.isSelected()) {
					lblColor.setBackground(Color.black);
				} else {
					if (radVerde.isSelected()) {
						lblColor.setBackground(Color.green);
					}
				}
			}
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Colores.jpg"));
		frame.setIconImage(icono);
		frame.setLocationRelativeTo(null);
		frame.setTitle(" EJEMPLO RADIO ");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		radRojo = new JRadioButton("Rojo\r\n");
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		radRojo.setBounds(6, 24, 109, 23);
		frame.getContentPane().add(radRojo);

		radAzul = new JRadioButton("Azul\r\n");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();

			}
		});
		radAzul.setBounds(6, 65, 109, 23);
		frame.getContentPane().add(radAzul);

		radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();

			}
		});
		radNegro.setBounds(6, 115, 109, 23);
		frame.getContentPane().add(radNegro);

		radVerde = new JRadioButton("Verde\r\n");
		radVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();

			}
		});
		radVerde.setBounds(6, 162, 109, 23);
		frame.getContentPane().add(radVerde);
		grupo.add(radVerde);
		grupo.add(radNegro);
		grupo.add(radAzul);
		grupo.add(radRojo);

		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setBounds(154, 23, 238, 174);
		frame.getContentPane().add(lblColor);
	}
}
