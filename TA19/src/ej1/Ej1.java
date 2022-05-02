package ej1;

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

import ej2.Ej2;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
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
	public Ej1() {
		
		setTitle("Saludar");
		
		setBounds(400,400,400,400);
		
		//hacemos visible
		setVisible(true);
		//creo panel
		contentPane = new JPanel();
		//indicamos diseño
		contentPane.setLayout(null);
		//asigno panel a la ventana
		setContentPane(contentPane);
		
		//creo el componente
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar:");
		//colocamos
		etiqueta.setBounds(73, 70, 240, 20);
		//añadimos
		contentPane.add(etiqueta);
		
		//creo el textfield
		JTextField tfNombre = new JTextField();
		//coloco
		tfNombre.setBounds(110, 89, 170, 20);
		//añado
		contentPane.add(tfNombre);
		
		//creo button
		JButton btn = new JButton("¡Saludar!");
		//coloco
		btn.setBounds(160, 120, 85, 20);
		//añado
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + tfNombre.getText());
			}
		});
	}

}
