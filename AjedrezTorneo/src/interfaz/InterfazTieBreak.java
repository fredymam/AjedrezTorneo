package interfaz;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 102));
		panel_1.setForeground(Color.ORANGE);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{203, 28, 0};
		gbl_panel_1.rowHeights = new int[] {50, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblTiebreakmetodosDe = new JLabel("TieBreak (Metodos de Desempates)");
		lblTiebreakmetodosDe.setForeground(new Color(0, 0, 0));
		lblTiebreakmetodosDe.setBackground(new Color(153, 204, 0));
		lblTiebreakmetodosDe.setFont(new Font("Castellar", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTiebreakmetodosDe = new GridBagConstraints();
		gbc_lblTiebreakmetodosDe.insets = new Insets(0, 0, 0, 5);
		gbc_lblTiebreakmetodosDe.gridx = 0;
		gbc_lblTiebreakmetodosDe.gridy = 0;
		panel_1.add(lblTiebreakmetodosDe, gbc_lblTiebreakmetodosDe);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{320, 109, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 20, 10, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtBucholz = new JTextField();
		txtBucholz.setText("1.");
		GridBagConstraints gbc_txtBucholz = new GridBagConstraints();
		gbc_txtBucholz.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBucholz.insets = new Insets(0, 0, 5, 5);
		gbc_txtBucholz.gridx = 0;
		gbc_txtBucholz.gridy = 0;
		panel.add(txtBucholz, gbc_txtBucholz);
		txtBucholz.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 0;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		txtProgresivo = new JTextField();
		txtProgresivo.setText("2.");
		GridBagConstraints gbc_txtProgresivo = new GridBagConstraints();
		gbc_txtProgresivo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProgresivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtProgresivo.gridx = 0;
		gbc_txtProgresivo.gridy = 1;
		panel.add(txtProgresivo, gbc_txtProgresivo);
		txtProgresivo.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		panel.add(comboBox, gbc_comboBox);
		
		txtSonnebornberger = new JTextField();
		txtSonnebornberger.setText("3.");
		GridBagConstraints gbc_txtSonnebornberger = new GridBagConstraints();
		gbc_txtSonnebornberger.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSonnebornberger.insets = new Insets(0, 0, 5, 5);
		gbc_txtSonnebornberger.gridx = 0;
		gbc_txtSonnebornberger.gridy = 2;
		panel.add(txtSonnebornberger, gbc_txtSonnebornberger);
		txtSonnebornberger.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Bucholz", "Progresivo", "SonnebornBerger"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 2;
		panel.add(comboBox_2, gbc_comboBox_2);
		
		JButton btnNewButton = new JButton("Guardar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.anchor = GridBagConstraints.NORTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{153, 127, 0};
		gbl_panel_2.rowHeights = new int[] {25, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnRegistrarFormulario = new JButton("Registrar formulario");
		GridBagConstraints gbc_btnRegistrarFormulario = new GridBagConstraints();
		gbc_btnRegistrarFormulario.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRegistrarFormulario.gridx = 1;
		gbc_btnRegistrarFormulario.gridy = 0;
		panel_2.add(btnRegistrarFormulario, gbc_btnRegistrarFormulario);
	}

}
