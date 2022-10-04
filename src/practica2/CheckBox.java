package practica2;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckBox {

	public JFrame frame;
	private JLabel lblQueTrae;
	private JLabel lblCumple;
	private JCheckBox chkUniforme;
	private JCheckBox chkCredencial;
	private JCheckBox chkCubrebocas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox window = new CheckBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CheckBox() {
		initialize();
		checarAlumno();
	}

	public void checarAlumno() {
		String check="";
		if(chkUniforme.isSelected()) {
			check+=" SI UNIFORME";
		}else {
			check+=" NO UNIFORME";
		}
		if(chkCredencial.isSelected()) {
			check+=" SI CREDENCIAL";
		}else {
			check+=" NO CREDENCIAL";
		}if(chkCubrebocas.isSelected()) {
			check+=" SI CUBREBOCAS ";
		}else {
			check+=" NO CUBREBOCAS";
		}
		lblQueTrae.setText(check);
		if(chkUniforme.isSelected()&&chkCredencial.isSelected()&&chkCubrebocas.isSelected()) {
			lblCumple.setText(" SI CUMPLE Y PUEDE PASAR AL PLANTEL CECYTEM ");
		}else {
			lblCumple.setText(" NO CUMPLE Y SE VA A REPORTAR ");
		}
		}
		

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JOption.class.getResource("/img/CECyT.png")));
		frame.setTitle("INGRESO CECyT");
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 488, 255);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		chkUniforme = new JCheckBox("Uniforme");
		chkUniforme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkUniforme.setBounds(6, 40, 97, 23);
		frame.getContentPane().add(chkUniforme);

		chkCredencial = new JCheckBox("Credencial");
		chkCredencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkCredencial.setBounds(6, 92, 97, 23);
		frame.getContentPane().add(chkCredencial);

		chkCubrebocas = new JCheckBox("Cubrebocas ");
		chkCubrebocas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarAlumno();
			}
		});
		chkCubrebocas.setBounds(6, 154, 97, 23);
		frame.getContentPane().add(chkCubrebocas);

		lblQueTrae = new JLabel("");
		lblQueTrae.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueTrae.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblQueTrae.setBounds(109, 40, 332, 57);
		frame.getContentPane().add(lblQueTrae);

		lblCumple = new JLabel("");
		lblCumple.setHorizontalAlignment(SwingConstants.CENTER);
		lblCumple.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCumple.setBounds(109, 131, 332, 46);
		frame.getContentPane().add(lblCumple);
	}
}
