package ej4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ej4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfX;
	private JTextField tfY;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
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
	public Ej4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		tfX = new JTextField();
		tfX.setBounds(30, 46, 86, 20);
		contentPane.add(tfX);
		tfX.setColumns(10);
		
		tfY = new JTextField();
		tfY.setBounds(30, 110, 86, 20);
		contentPane.add(tfY);
		tfY.setColumns(10);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(30, 180, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(65, 21, 12, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Y");
		lblNewLabel_1.setBounds(65, 85, 12, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(46, 155, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Calculadora");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(158, 11, 141, 24);
		contentPane.add(lblNewLabel_3);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setBounds(177, 96, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnMulti = new JButton("Multiplicar");
		btnMulti.setBounds(177, 130, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(177, 162, 89, 23);
		contentPane.add(btnDividir);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(177, 62, 89, 23);
		contentPane.add(btnSumar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(tfX.getText());
				double y = Double.parseDouble(tfY.getText());
				
				tfResultado.setText((x+y)+"");
			}
		});
		
		btnRestar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(tfX.getText());
				double y = Double.parseDouble(tfY.getText());
				
				tfResultado.setText((x-y)+"");
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(tfX.getText());
				double y = Double.parseDouble(tfY.getText());
				
				tfResultado.setText((x*y)+"");
			}
		});
		
		btnDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(tfX.getText());
				double y = Double.parseDouble(tfY.getText());
				
				tfResultado.setText((x/y)+"");
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
}
