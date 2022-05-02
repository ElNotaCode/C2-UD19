package ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Ej3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Sistema Operativo");
		lblNewLabel.setBounds(30, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rb1 = new JRadioButton("Windows");
		buttonGroup.add(rb1);
		rb1.setBounds(30, 30, 109, 23);
		contentPane.add(rb1);
		rb1.setActionCommand("Windows");
		
		JRadioButton rb2 = new JRadioButton("Linux");
		buttonGroup.add(rb2);
		rb2.setBounds(30, 56, 109, 23);
		contentPane.add(rb2);
		rb2.setActionCommand("Linux");
		
		JRadioButton rb3 = new JRadioButton("Mac");
		buttonGroup.add(rb3);
		rb3.setBounds(30, 82, 109, 23);
		contentPane.add(rb3);
		rb3.setActionCommand("Mac");
		
		JLabel lblNewLabel_1 = new JLabel("Especialidad");
		lblNewLabel_1.setBounds(190, 11, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(190, 30, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxNewCheckBox_1.setBounds(190, 56, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administracion");
		chckbxNewCheckBox_2.setBounds(190, 82, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(30, 123, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setToolTipText("");
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(30, 148, 200, 26);
		contentPane.add(slider);

		JButton btn = new JButton("Entrar");
		btn.setBounds(30, 200, 89, 23);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "Sistema Operativo: " + buttonGroup.getSelection().getActionCommand() + "\n";
				str += "Especialidad: ";
				if(chckbxNewCheckBox.isSelected()){
					str += "Programacion " ;
				}
				if(chckbxNewCheckBox_1.isSelected()){
					str += "Diseño Gráfico " ;
				}
				if(chckbxNewCheckBox_2.isSelected()){
					str += "Administracion " ;
				}
				str += "\n";
				
			str += slider.getValue();
				
			JOptionPane.showMessageDialog(null, str);
			}
		});
		
	}
}
