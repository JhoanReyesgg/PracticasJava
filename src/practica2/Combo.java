package practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Combo {

	public JFrame frameFechaDeNacimiento;
	private JLabel lblResultado;
	private JComboBox cboDias;
	private JLabel lblMes;
	private JComboBox cboMeses;
	private JLabel lblFecha;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combo window = new Combo();
					window.frameFechaDeNacimiento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Combo() {
		initialize();
	}
	
	public void imprimirfecha() {
		lblResultado.setText(cboDias.getSelectedItem().toString() +  " de " + cboMeses.getSelectedItem().toString());
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameFechaDeNacimiento = new JFrame();
		frameFechaDeNacimiento.setTitle("FECHA DE NACIMIENTO");
		frameFechaDeNacimiento.setLocationRelativeTo(null);
		frameFechaDeNacimiento.setResizable(false);
		Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Dia.png"));
       
		frameFechaDeNacimiento.setIconImage(icono);
		frameFechaDeNacimiento.setBounds(100, 100, 572, 382);
		frameFechaDeNacimiento.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frameFechaDeNacimiento.getContentPane().setLayout(null);
		
		JLabel lblDia = new JLabel("Dia\r\n");
		lblDia.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDia.setBounds(67, 34, 108, 29);
		frameFechaDeNacimiento.getContentPane().add(lblDia);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(67, 163, 285, 105);
		frameFechaDeNacimiento.getContentPane().add(lblResultado);
		
		cboDias = new JComboBox();
		cboDias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				imprimirfecha();
			}
		});
		cboDias.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDias.setBounds(184, 31, 168, 29);
		frameFechaDeNacimiento.getContentPane().add(cboDias);
		
		lblMes = new JLabel("Mes");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMes.setBounds(67, 74, 108, 29);
		frameFechaDeNacimiento.getContentPane().add(lblMes);
		
		cboMeses = new JComboBox();
		cboMeses.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				imprimirfecha();
				
			}
		});
		cboMeses.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		cboMeses.setBounds(184, 71, 168, 29);
		frameFechaDeNacimiento.getContentPane().add(cboMeses);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFecha.setBounds(67, 126, 98, 29);
		frameFechaDeNacimiento.getContentPane().add(lblFecha);
	}
}
