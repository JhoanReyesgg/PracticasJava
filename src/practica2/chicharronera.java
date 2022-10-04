package practica2;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class chicharronera {

	public JFrame frame;
	private JSlider sldValorA;
	private JSlider sldValorB;
	private JSlider sldValorC;
	private JLabel lblValorA;
	private JLabel lblValorB;
	private JLabel lblValorC;
	int a = 0, b = 0, c = 0;
	double x1 = 0, x2 = 0;
	private JLabel lblEcuacion;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chicharronera window = new chicharronera();
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
	public chicharronera() {
		initialize();
	}

	public double redondear(double numero) {
		return Math.round(numero * 100.0) / 100.0;

	}

	public void calcular() {
		try {
			lblEcuacion.setText(a + "x^2+" + b + "x+" + c + "=0");
			int valor = (b * b) - (4 * a * c);
			if (valor > 0) {
				x1 = (-b + Math.sqrt(valor)) / (2 * a);
				x2 = (-b + Math.sqrt(valor)) / (2 * a);
				lblResultado.setText("x1=" + redondear(x1) + " x2=" + redondear(x2));
			} else if (valor == 0) {
				x1 = (-b) / (2 * a);
				lblResultado.setText("x1=" + redondear(x1));
			} else if (valor < 0) {
				lblResultado.setText("NO HAY SOLUCION");
			}
		} catch (Exception ex) {

		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 355);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Calculadora.jpg")));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("LA CHICHARRONERA ");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Valor De A");
		lblNewLabel.setBounds(10, 11, 57, 14);
		frame.getContentPane().add(lblNewLabel);

		lblValorA = new JLabel("0\r\n");
		lblValorA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValorA.setBounds(220, 24, 68, 37);
		frame.getContentPane().add(lblValorA);

		lblValorB = new JLabel("0\r\n");
		lblValorB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValorB.setBounds(220, 90, 68, 37);
		frame.getContentPane().add(lblValorB);

		lblValorC = new JLabel("0\r\n");
		lblValorC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValorC.setBounds(220, 162, 68, 37);
		frame.getContentPane().add(lblValorC);

		lblEcuacion = new JLabel("");
		lblEcuacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEcuacion.setBounds(10, 211, 299, 31);
		frame.getContentPane().add(lblEcuacion);

		sldValorA = new JSlider();
		sldValorA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a = sldValorA.getValue();
				lblValorA.setText("" + a);
				calcular();
			}
		});
		sldValorA.setValue(0);
		sldValorA.setMaximum(50);
		sldValorA.setMinimum(-50);
		sldValorA.setBounds(10, 36, 200, 26);
		frame.getContentPane().add(sldValorA);

		JLabel lblValorDeB = new JLabel("Valor De B");
		lblValorDeB.setBounds(10, 77, 57, 14);
		frame.getContentPane().add(lblValorDeB);

		sldValorB = new JSlider();
		sldValorB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b = sldValorB.getValue();
				lblValorB.setText("" + b);
				calcular();
			}
		});
		sldValorB.setValue(0);
		sldValorB.setMinimum(-50);
		sldValorB.setMaximum(50);
		sldValorB.setBounds(10, 102, 200, 26);
		frame.getContentPane().add(sldValorB);

		JLabel lblValorDeC = new JLabel("Valor De C");
		lblValorDeC.setBounds(10, 149, 57, 14);
		frame.getContentPane().add(lblValorDeC);

		sldValorC = new JSlider();
		sldValorC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				c = sldValorC.getValue();
				lblValorC.setText("" + c);
				calcular();
			}
		});
		sldValorC.setValue(0);
		sldValorC.setMinimum(-50);
		sldValorC.setMaximum(50);
		sldValorC.setBounds(10, 174, 200, 26);
		frame.getContentPane().add(sldValorC);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(10, 248, 324, 46);
		frame.getContentPane().add(lblResultado);

	}
}
