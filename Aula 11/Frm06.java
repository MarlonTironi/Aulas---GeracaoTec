package br.com.gt.swingnobraco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frm06 implements ActionListener {
	
	//Criando frame e Painel
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	
	//Criando labels e os campos de texto
	JLabel lblIdAluno = new JLabel("Id Aluno: ");
	JTextField txtIdAluno = new JTextField(" ");
	JLabel lblEnderec = new JLabel("Endereço: ");
	JTextField txtEnderec = new JTextField(" ");
	JLabel lblCep = new JLabel("CEP: ");
	JTextField txtCep = new JTextField(" ");
	JLabel lblCidade = new JLabel("Cidade: ");
	String[] perfis = { "           ", "Águas de Chapecó", "Blumenau", "Chapecó", "Maravilha", "São Lourenço" };
	JComboBox cbCidade = new JComboBox(perfis);
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField(" ");
	JLabel lblPais = new JLabel("Pais: ");
	JTextField txtPais = new JTextField(" ");
	
	//Criando os botões e label Status
	JButton btnAlterar = new JButton("Altera");
	JButton btnBuscar = new JButton("Buscar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnIncluir = new JButton("Incluir");
	JLabel lblStatus = new JLabel("Status");

	public void criarTela() {
		
		//Criando tela 
		f.setSize(370, 250);
		f.setLocation(150, 200);
		f.setTitle("Sistema Alunos");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(null);

		// Posição do objetos na tela
		lblIdAluno.setBounds(10, 20, 70, 20);
		txtIdAluno.setBounds(70, 20, 70, 20);
		lblEnderec.setBounds(10, 42, 70, 20);
		txtEnderec.setBounds(70, 42, 200, 20);
		lblCep.setBounds(10, 64, 70, 20);
		txtCep.setBounds(70, 64, 70, 20);
		lblCidade.setBounds(10, 86, 70, 20);
		cbCidade.setBounds(70, 86, 200, 20);
		lblEstado.setBounds(10, 108, 70, 20);
		txtEstado.setBounds(70, 108, 70, 20);
		lblPais.setBounds(10, 130, 70, 20);
		txtPais.setBounds(70, 130, 70, 20);
		btnAlterar.setBounds(10, 160, 80, 20);
		btnIncluir.setBounds(94, 160, 80, 20);
		btnBuscar.setBounds(178, 160, 80, 20);
		btnExcluir.setBounds(262, 160, 80, 20);
		lblStatus.setBounds(10, 182, 80, 20);

		// adicionando eventos aos botões
		btnAlterar.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnIncluir.addActionListener(this);

		//Adicionando os itens ao painel
		p.add(lblIdAluno);
		p.add(txtIdAluno);
		p.add(lblEnderec);
		p.add(txtEnderec);
		p.add(lblCep);
		p.add(txtCep);
		p.add(lblCidade);
		p.add(cbCidade);
		p.add(lblEstado);
		p.add(txtEstado);
		p.add(lblPais);
		p.add(txtPais);
		p.add(btnAlterar);
		p.add(btnIncluir);
		p.add(btnBuscar);
		p.add(btnExcluir);
		p.add(lblStatus);

		//Adicionando o Painel ao Frame e o tornando visivel
		f.getContentPane().add(p);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnAlterar) {
			alterar();
		}
		if (o == btnIncluir) {
			incluir();
		}
		if (o == btnBuscar) {
			buscar();
		}
		if (o == btnExcluir) {
			excluir();
		}
	}

	void alterar() {
		lblStatus.setText("Alterar");
	}

	void incluir() {
		lblStatus.setText("Incluir");
	}

	void buscar() {
		lblStatus.setText("Buscar");
	}

	void excluir() {
		lblStatus.setText("Excluir");
	}
}
