import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Conversor {

	private JFrame frame;
	private JTextField txtValor;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
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
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 437, 293);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(164, 11, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Metical :");
		lblNewLabel_1.setBounds(38, 53, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtValor = new JTextField();
		txtValor.setBounds(116, 50, 107, 20);
		frame.getContentPane().add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnEur = new JButton("EUR");
		btnEur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = txtValor.getText();
				double val = Double.parseDouble(valor);
				double resul = val*64.02;
				String str = String.valueOf(resul);
				txtResultado.setText(str);
			}
		});
		btnEur.setBounds(127, 109, 75, 23);
		frame.getContentPane().add(btnEur);
		
		JButton btnUsd_1 = new JButton("USD");
		btnUsd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = txtValor.getText();
				double val = Double.parseDouble(valor);
				double resul = val*63.83;
				String str = String.valueOf(resul);
				txtResultado.setText(str);
			}
		});
		btnUsd_1.setBounds(38, 109, 75, 23);
		frame.getContentPane().add(btnUsd_1);
		
		JButton btnGbp = new JButton("GBP");
		btnGbp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = txtValor.getText();
				double val = Double.parseDouble(valor);
				double resul = val*75.49;
				String str = String.valueOf(resul);
				txtResultado.setText(str);
			}
		});
		btnGbp.setBounds(218, 109, 75, 23);
		frame.getContentPane().add(btnGbp);
		
		JButton btnZar = new JButton("ZAR");
		btnZar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = txtValor.getText();
				double val = Double.parseDouble(valor);
				double resul = val*3.76;
				String str = String.valueOf(resul);
				txtResultado.setText(str);
			}
		});
		btnZar.setBounds(306, 109, 75, 23);
		frame.getContentPane().add(btnZar);
		
		txtResultado = new JTextField();
		txtResultado.setForeground(Color.GREEN);
		txtResultado.setBounds(137, 195, 156, 29);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RESULTADO");
		lblNewLabel_2.setBounds(182, 229, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
