import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class telaCal extends JFrame {

	private JPanel contentPane;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton b1;
	private JButton b4;
	private JButton b7;
	private JButton b8;
	private JButton b0;
	private JButton b5;
	private JButton b2;
	private JButton b3;
	private JButton b6;
	private JButton b9;
	private JLabel Titulo;
	private JTextField Resultado;
	private Calculadora c;
	private String n1;
	private String n2;
	private String s;
	private JTextField Ca;
	private JButton Apagar;
	private JButton Excluir;
	private LinkedList<JButton> lista;
	private LinkedList<JButton> lista2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					telaCal frame = new telaCal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void resultado() {
		double r;
		r = c.calres(c.getNum1(), c.getNum2(), c.getSimbolo());
		this.Resultado.setText(String.valueOf(r));
	}
	
	public void digito() {
		for (JButton bt : lista) {
			bt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(c.getSimbolo().equals("")) {
						n1 += bt.getText();
						c.setNum1(Double.parseDouble(n1));
						Ca.setText(n1+" "+s+" "+n2);
					}else {
						n2 += bt.getText();
						c.setNum2(Double.parseDouble(n2));
						Ca.setText(n1+" "+s+" "+n2);
					}
				}
			});
		}
	}
	
	public telaCal() {
		initComponents();
		c = new Calculadora();
		c.setSimbolo(" ");
		n1 = "";
		n2 = "";
		s = "";
		
		lista = new LinkedList<JButton>();
		lista2 = new LinkedList<JButton>();

		lista.add(b0);
		lista.add(b1);
		lista.add(b2);
		lista.add(b3);
		lista.add(b4);
		lista.add(b5);
		lista.add(b6);
		lista.add(b7);
		lista.add(b8);
		lista.add(b9);
		lista2.add(bt1);
		lista2.add(bt2);
		lista2.add(bt3);
		lista2.add(bt4);
		lista2.add(bt5);
		lista2.add(Apagar);
		lista2.add(Excluir);
		
		digito();
	}
	private void initComponents() {
		c = new Calculadora();
		c.setSimbolo(" ");
		n1 = "";
		n2 = "";
		s = "";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 406);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(this.contentPane);
		this.contentPane.setLayout(new MigLayout("", "[][44.00,fill][44.00][50.00,fill][50.00,fill][50.00,fill][44.00,fill][43.00,center][]", "[24.00,fill][24.00,fill][24.00,fill][24.00,fill][24.00,fill][24.00,fill][24.00,fill]"));
		
		this.Titulo = new JLabel("Caculadora");
		this.Titulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		this.Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.Titulo, "cell 3 0 3 1,growx");
		
		//Numeros
		this.b1 = new JButton("1");
		this.contentPane.add(this.b1, "cell 3 2");
		
		this.b2 = new JButton("2");
		this.contentPane.add(this.b2, "cell 4 2");
		
		this.b3 = new JButton("3");
		this.contentPane.add(this.b3, "cell 5 2");
		
		this.b4 = new JButton("4");
		this.contentPane.add(this.b4, "cell 3 3");
		
		this.b5 = new JButton("5");
		this.contentPane.add(this.b5, "cell 4 3");
		
		this.b6 = new JButton("6");
		this.contentPane.add(this.b6, "cell 5 3");
		
		this.b7 = new JButton("7");
		this.contentPane.add(this.b7, "cell 3 4");
		
		this.b8 = new JButton("8");
		this.contentPane.add(this.b8, "cell 4 4");
		
		this.b9 = new JButton("9");
		this.contentPane.add(this.b9, "cell 5 4");
		
		this.b0 = new JButton("0");
		this.contentPane.add(this.b0, "cell 4 5");
		
		//Operações
		this.bt1 = new JButton("+");
		this.bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setSimbolo("s");
				s = "+";
				Ca.setText(n1+" "+s+" "+n2);
			}
		});
		
		this.bt2 = new JButton("-");
		this.bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setSimbolo("d");
				s = "-";
				Ca.setText(n1+" "+s+" "+n2);
			}
		});
		this.contentPane.add(this.bt2, "cell 1 3");
		
		this.bt3 = new JButton("*");
		this.bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setSimbolo("m");
				s = "*";
				Ca.setText(n1+" "+s+" "+n2);
			}
		});
		this.contentPane.add(this.bt3, "cell 1 4");
		
		this.bt4 = new JButton("/");
		this.bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setSimbolo("dd");
				s = "/";
				Ca.setText(n1+" "+s+" "+n2);
			}
		});
		this.contentPane.add(this.bt4, "cell 1 5");
		
		this.bt5 = new JButton("=");
		this.bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ca.setText(n1+" "+s+" "+n2);
				resultado();
				c.setSimbolo(" ");
				c.setNum1(0);
				c.setNum2(0);
				n1 = "";
				n2 = "";
				s = "";
			}
		});
		this.contentPane.add(this.bt5, "cell 1 6");
		
		this.Apagar = new JButton("Apagar");
		this.Apagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.getSimbolo().equals(" ")) {
					n1 ="";
					c.setNum1(0);
					Ca.setText(n1+" "+s+" "+n2);
				}else {
					n2 ="";
					c.setNum2(0);
					Ca.setText(n1+" "+s+" "+n2);
				}
			}
		});
		this.contentPane.add(this.Apagar, "cell 7 2,growx");
		
		this.Excluir = new JButton("Excluir");
		this.Excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setSimbolo(" ");
				c.setNum1(0);
				c.setNum2(0);
				n1 = "";
				n2 = "";
				s = "";
				Ca.setText(" ");
				Resultado.setText(String.valueOf(""));
			}
		});
		this.contentPane.add(this.Excluir, "cell 7 3,growx");
		
		//Telas de Respostas
		this.Ca = new JTextField();
		this.Ca.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.Ca, "cell 3 1 3 1,growx");
		this.Ca.setColumns(10);
		this.contentPane.add(this.bt1, "cell 1 2");
		
		this.Resultado = new JTextField();
		this.Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		this.Resultado.setFont(new Font("Times New Roman", Font.BOLD, 18));
		this.contentPane.add(this.Resultado, "cell 3 6 3 1,growx");
		this.Resultado.setColumns(10);
	}

}
