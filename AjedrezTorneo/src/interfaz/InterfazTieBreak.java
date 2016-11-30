package interfaz;

import logica.TieBreak;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class InterfazTieBreak extends JFrame  {
	private JTextField txtBucholz;
	private JTextField txtProgresivo;
	private JTextField txtSonnebornberger;
	public InterfazTieBreak() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{20, 208, 33, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panelEncabezado = new JPanel();
		panelEncabezado.setBackground(new Color(153, 204, 102));
		panelEncabezado.setForeground(Color.ORANGE);
		GridBagConstraints gbc_panelEncabezado = new GridBagConstraints();
		gbc_panelEncabezado.anchor = GridBagConstraints.NORTH;
		gbc_panelEncabezado.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelEncabezado.insets = new Insets(0, 0, 5, 0);
		gbc_panelEncabezado.gridx = 0;
		gbc_panelEncabezado.gridy = 0;
		getContentPane().add(panelEncabezado, gbc_panelEncabezado);
		GridBagLayout gbl_panelEncabezado = new GridBagLayout();
		gbl_panelEncabezado.columnWidths = new int[]{203, 28, 0};
		gbl_panelEncabezado.rowHeights = new int[] {50, 0};
		gbl_panelEncabezado.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelEncabezado.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelEncabezado.setLayout(gbl_panelEncabezado);
		
		JLabel Encabezado = new JLabel("TieBreak (Metodos de Desempates)");
		Encabezado.setForeground(new Color(0, 0, 0));
		Encabezado.setBackground(new Color(153, 204, 0));
		Encabezado.setFont(new Font("Castellar", Font.PLAIN, 14));
		GridBagConstraints gbc_Encabezado = new GridBagConstraints();
		gbc_Encabezado.insets = new Insets(0, 0, 0, 5);
		gbc_Encabezado.gridx = 0;
		gbc_Encabezado.gridy = 0;
		panelEncabezado.add(Encabezado, gbc_Encabezado);
		
		JPanel panelCuerpo = new JPanel();
		GridBagConstraints gbc_panelCuerpo = new GridBagConstraints();
		gbc_panelCuerpo.fill = GridBagConstraints.BOTH;
		gbc_panelCuerpo.insets = new Insets(0, 0, 5, 0);
		gbc_panelCuerpo.gridx = 0;
		gbc_panelCuerpo.gridy = 1;
		getContentPane().add(panelCuerpo, gbc_panelCuerpo);
		GridBagLayout gbl_panelCuerpo = new GridBagLayout();
		gbl_panelCuerpo.columnWidths = new int[]{320, 109, 0};
		gbl_panelCuerpo.rowHeights = new int[]{20, 20, 20, 10, 0, 0};
		gbl_panelCuerpo.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCuerpo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCuerpo.setLayout(gbl_panelCuerpo);
		
		txtBucholz = new JTextField();
		txtBucholz.setText("1.");
		GridBagConstraints gbc_txtBucholz = new GridBagConstraints();
		gbc_txtBucholz.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBucholz.insets = new Insets(0, 0, 5, 5);
		gbc_txtBucholz.gridx = 0;
		gbc_txtBucholz.gridy = 0;
		panelCuerpo.add(txtBucholz, gbc_txtBucholz);
		txtBucholz.setColumns(10);
		
		JComboBox comboTieBreak1 = new JComboBox();
		comboTieBreak1.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboTieBreak1 = new GridBagConstraints();
		gbc_comboTieBreak1.insets = new Insets(0, 0, 5, 0);
		gbc_comboTieBreak1.gridx = 1;
		gbc_comboTieBreak1.gridy = 0;
		panelCuerpo.add(comboTieBreak1, gbc_comboTieBreak1);
		
		txtProgresivo = new JTextField();
		txtProgresivo.setText("2.");
		GridBagConstraints gbc_txtProgresivo = new GridBagConstraints();
		gbc_txtProgresivo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProgresivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtProgresivo.gridx = 0;
		gbc_txtProgresivo.gridy = 1;
		panelCuerpo.add(txtProgresivo, gbc_txtProgresivo);
		txtProgresivo.setColumns(10);
		
		JComboBox comboTieBreak2 = new JComboBox();
		comboTieBreak2.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboTieBreak2 = new GridBagConstraints();
		gbc_comboTieBreak2.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboTieBreak2.insets = new Insets(0, 0, 5, 0);
		gbc_comboTieBreak2.gridx = 1;
		gbc_comboTieBreak2.gridy = 1;
		panelCuerpo.add(comboTieBreak2, gbc_comboTieBreak2);
		
		txtSonnebornberger = new JTextField();
		txtSonnebornberger.setText("3.");
		GridBagConstraints gbc_txtSonnebornberger = new GridBagConstraints();
		gbc_txtSonnebornberger.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSonnebornberger.insets = new Insets(0, 0, 5, 5);
		gbc_txtSonnebornberger.gridx = 0;
		gbc_txtSonnebornberger.gridy = 2;
		panelCuerpo.add(txtSonnebornberger, gbc_txtSonnebornberger);
		txtSonnebornberger.setColumns(10);
		
		JComboBox comboTieBreak3 = new JComboBox();
		comboTieBreak3.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboTieBreak3 = new GridBagConstraints();
		gbc_comboTieBreak3.insets = new Insets(0, 0, 5, 0);
		gbc_comboTieBreak3.gridx = 1;
		gbc_comboTieBreak3.gridy = 2;
		panelCuerpo.add(comboTieBreak3, gbc_comboTieBreak3);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 3;
		panelCuerpo.add(btnGuardar, gbc_btnGuardar);
		
		JPanel panelRegistrar = new JPanel();
		GridBagConstraints gbc_panelRegistrar = new GridBagConstraints();
		gbc_panelRegistrar.insets = new Insets(0, 0, 5, 0);
		gbc_panelRegistrar.anchor = GridBagConstraints.NORTH;
		gbc_panelRegistrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelRegistrar.gridx = 0;
		gbc_panelRegistrar.gridy = 2;
		getContentPane().add(panelRegistrar, gbc_panelRegistrar);
		GridBagLayout gbl_panelRegistrar = new GridBagLayout();
		gbl_panelRegistrar.columnWidths = new int[]{153, 127, 0};
		gbl_panelRegistrar.rowHeights = new int[] {25, 0};
		gbl_panelRegistrar.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelRegistrar.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelRegistrar.setLayout(gbl_panelRegistrar);
		
		JButton btnRegistrarFormulario = new JButton("Registrar formulario");
		GridBagConstraints gbc_btnRegistrarFormulario = new GridBagConstraints();
		gbc_btnRegistrarFormulario.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRegistrarFormulario.gridx = 1;
		gbc_btnRegistrarFormulario.gridy = 0;
		panelRegistrar.add(btnRegistrarFormulario, gbc_btnRegistrarFormulario);
	}

}
