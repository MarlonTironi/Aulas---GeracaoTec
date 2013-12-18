package br.curso.aula12.usuarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import br.curso.aula12.metodos.MetodosImplementados;
import br.curso.aula12.negocios.Conexao;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CadastroDeCursos extends MetodosImplementados {

	private JFrame frmCadastroDeCursos;
	private JLabel lblCodigo;
	private JLabel lblCurso;
	private JLabel lblPreco;
	private JLabel lblStatus;
	private JLabel lblValorStatus;
	private JTextField textCodigo;
	private JTextField textCurso;
	private JTextField textPreco;
	private JButton btnBuscar;
	private JButton btnAlterar;
	private JButton btnIncluir;
	private JButton btnExcluir;
	private Statement consulta;
	private ResultSet retorno;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCursos window = new CadastroDeCursos();
					window.frmCadastroDeCursos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroDeCursos() {
		initialize();
		getConnection();
	}

	private void initialize() {
		frmCadastroDeCursos = new JFrame();
		frmCadastroDeCursos.setVisible(true);
		frmCadastroDeCursos.setTitle("Cadastro de Cursos");
		frmCadastroDeCursos.setBounds(100, 100, 462, 268);
		frmCadastroDeCursos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeCursos.getContentPane().setLayout(null);

		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 11, 59, 19);
		frmCadastroDeCursos.getContentPane().add(lblCodigo);

		lblCurso = new JLabel("Curso");
		lblCurso.setBounds(10, 41, 46, 14);
		frmCadastroDeCursos.getContentPane().add(lblCurso);

		lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setBounds(10, 66, 46, 14);
		frmCadastroDeCursos.getContentPane().add(lblPreco);

		lblStatus = new JLabel("Status:");
		lblStatus.setBounds(10, 168, 46, 14);
		frmCadastroDeCursos.getContentPane().add(lblStatus);

		lblValorStatus = new JLabel("                 ");
		lblValorStatus.setBounds(66, 168, 705, 14);
		frmCadastroDeCursos.getContentPane().add(lblValorStatus);

		textCodigo = new JTextField();
		textCodigo.setBounds(79, 10, 258, 20);
		frmCadastroDeCursos.getContentPane().add(textCodigo);
		textCodigo.setColumns(10);

		textCurso = new JTextField();
		textCurso.setBounds(79, 38, 357, 20);
		frmCadastroDeCursos.getContentPane().add(textCurso);
		textCurso.setColumns(10);

		textPreco = new JTextField();
		textPreco.setBounds(79, 63, 258, 20);
		frmCadastroDeCursos.getContentPane().add(textPreco);
		textPreco.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodosImplementados m = new MetodosImplementados();
					lblValorStatus.setText(m.buscar(textCodigo.getText()));
					textCurso.setText(m.getCurso());
					textPreco.setText(m.getPreco());
			}
		});
		btnBuscar.setBounds(347, 9, 89, 23);
		frmCadastroDeCursos.getContentPane().add(btnBuscar);

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodosImplementados m = new MetodosImplementados();
					int op = JOptionPane.showConfirmDialog(
							frmCadastroDeCursos,
							"Confirmação alteração do curso "
									+ textCurso.getText() + "?", "Proceder?",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);
					if (op == 0) {
						lblValorStatus.setText(m.alterar(textCodigo.getText(),
								textCurso.getText(), textPreco.getText()));
					}
			}
		});
		btnAlterar.setBounds(10, 124, 89, 23);
		frmCadastroDeCursos.getContentPane().add(btnAlterar);

		btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodosImplementados m = new MetodosImplementados();
				int confirma = JOptionPane
						.showConfirmDialog(frmCadastroDeCursos,
								"Confirmação de inclusão",
								"Confira se preencheu todos os dados",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
				if (confirma == 0) {
					lblValorStatus.setText(m.incluir(textCodigo.getText(),
							textCurso.getText(), textPreco.getText()));
				}
			}
		});
		btnIncluir.setBounds(186, 124, 89, 23);
		frmCadastroDeCursos.getContentPane().add(btnIncluir);

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MetodosImplementados m = new MetodosImplementados();
				lblValorStatus.setText(m.excluir(textCodigo.getText()));
			}
		});
		btnExcluir.setBounds(347, 124, 89, 23);
		frmCadastroDeCursos.getContentPane().add(btnExcluir);
	}
}
