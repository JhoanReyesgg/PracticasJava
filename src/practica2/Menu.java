package practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmMenu;
	JOption v3=new JOption();
	Tablas v4=new Tablas();
	CheckBox v5=new CheckBox();
	Radio v6=new Radio();
	chicharronera v7=new chicharronera();
	Combo v8=new Combo();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Menu() {
		initialize();
	}

	
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("MENU\r\n");
		frmMenu.setBounds(100, 100, 540, 483);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnCalculadora = new JButton("Practica Calculadora");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCalculadora.setBounds(10, 11, 129, 32);
		frmMenu.getContentPane().add(btnCalculadora);
		
		JButton btnAreaDelTriangulo = new JButton("Area Del Triangulo");
		btnAreaDelTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAreaDelTriangulo.setBounds(10, 54, 135, 32);
		frmMenu.getContentPane().add(btnAreaDelTriangulo);
		
		JButton btnTablas = new JButton("Tablas De Multiplicar\r\n");
		btnTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v4.frameTablasMultiplicar.setVisible(true);

			}
		});
		btnTablas.setBounds(10, 140, 135, 32);
		frmMenu.getContentPane().add(btnTablas);
		
		JButton btnUsoDeCheckbox = new JButton("Uso De CheckBox");
		btnUsoDeCheckbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v5.frame.setVisible(true);
			}
		});
		btnUsoDeCheckbox.setBounds(10, 183, 135, 32);
		frmMenu.getContentPane().add(btnUsoDeCheckbox);
		
		JButton btnRadioColores = new JButton("Radio Colores");
		btnRadioColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v6.frame.setVisible(true);
			}
		});
		btnRadioColores.setBounds(10, 226, 135, 32);
		frmMenu.getContentPane().add(btnRadioColores);
		
		JButton btnChicharronera = new JButton("Chicharronera");
		btnChicharronera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v7.frame.setVisible(true);
			}
		});
		btnChicharronera.setBounds(10, 269, 135, 32);
		frmMenu.getContentPane().add(btnChicharronera);
		
		JButton btnTipos = new JButton("Tipos De OPtion\r\n");
		btnTipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v3.frameTiposDeJoption.setVisible(true);
			}
		});
		btnTipos.setBounds(10, 97, 135, 32);
		frmMenu.getContentPane().add(btnTipos);
		
		JButton btnFechaDeNacimiento = new JButton("Fecha De Nacimiento ");
		btnFechaDeNacimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v8.frameFechaDeNacimiento.setVisible(true);

			
			}
		});
		btnFechaDeNacimiento.setBounds(10, 312, 135, 32);
		frmMenu.getContentPane().add(btnFechaDeNacimiento);
	}
}
