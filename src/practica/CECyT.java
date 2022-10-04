package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CECyT {

	private JFrame frame;
	JCheckBox chkUniforme, chkCredencial, chkCubrebocas; 
	JLabel lblQuetrae, lblCumple;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CECyT window = new CECyT();
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
	public CECyT() {
		initialize();

	}
	public void inicialize (){
		String Quetrae = null;
		if (chkUniforme.isSelected()){
			Quetrae+="Si Uniforme ";
		}else {
			Quetrae+="No Uniforme ";			
		}
		if (chkCredencial.isSelected()){
			Quetrae+="Si Credencial ";
		}else {
			Quetrae+="No Credencial ";			
		}
		if (chkCubrebocas.isSelected()){
			Quetrae+="Si Cubrebocas ";
		}else {
			Quetrae+="No Cubrebocas ";			
		}
		lblQuetrae.setText(Quetrae);
		if (chkUniforme.isSelected()&&chkCredencial.isSelected()&&chkCubrebocas.isSelected()) {
			lblCumple.setText(" SI CUMPLE Y PUEDE PASAR ");
		}else {
			lblCumple.setText(" NO CUMPLE, NO PUEDO PASAR");
		}
		
	

	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REQUISITOS PARA ENTRAR AL CECyTEM\r\n");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.BOLD, 18));
		lblNewLabel.setBounds(91, 11, 250, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblQuetrae = new JLabel("\r\n\r\n");
		lblQuetrae.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblQuetrae.setBounds(32, 173, 336, 14);
		frame.getContentPane().add(lblQuetrae);
		
		JLabel lblCumple = new JLabel("");
		lblCumple.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCumple.setBounds(65, 198, 250, 14);
		frame.getContentPane().add(lblCumple);
		
		JCheckBox chkUniforme = new JCheckBox("Uniforme\r\n");
		chkUniforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AQUI VA EL CÓDIGO
					checarAlumno();		
				
			}
		});
		chkUniforme.setBounds(32, 48, 97, 23);
		frame.getContentPane().add(chkUniforme);
		
		JCheckBox chkCredencial = new JCheckBox("Credencial");
		chkCredencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AQUI VA EL CÓDIGO			
					checarAlumno();
				
			}
		});
		chkCredencial.setBounds(32, 74, 97, 23);
		frame.getContentPane().add(chkCredencial);
		
		JCheckBox chkCubrebocas = new JCheckBox("Cubrebocas");
		chkCubrebocas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//AQUI VA EL CÓDIGO
				checarAlumno();
			}
		});
		chkCubrebocas.setBounds(32, 100, 97, 23);
		frame.getContentPane().add(chkCubrebocas);
	}

	protected void checarAlumno() {
		// TODO Auto-generated method stub
		
	}

	
		// TODO Auto-generated method stub
		
	}

