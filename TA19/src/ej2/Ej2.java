package ej2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class Ej2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
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
	public Ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//creo el componente
		JLabel lbl1 = new JLabel("Escribe el titulo de una pelicula:");
		//colocamos
		lbl1.setBounds(110, 70, 170, 20);
		//añadimos
		contentPane.add(lbl1);
		
		//creo el textfield
		JTextField tfNombre = new JTextField();
		//coloco
		tfNombre.setBounds(110, 89, 170, 20);
		//añado
		contentPane.add(tfNombre);
		
		//creo button
		JButton btn = new JButton("Introducir");
		//coloco
		btn.setBounds(160, 120, 85, 20);
		//añado
		contentPane.add(btn);
		
		//creo el componente
		JLabel lbl2 = new JLabel("Peliculas:");
		//colocamos
		lbl2.setBounds(340, 70, 50, 20);
		//añadimos
		contentPane.add(lbl2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(340, 88, 140, 22);
		contentPane.add(comboBox);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(tfNombre.getText());
			}
		});
		
	}
}
