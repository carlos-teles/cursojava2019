
package controller;

import javax.swing.*;
/**
 * 
 * @author Aluno
 * @version 1.0
 * @since   2019-12-02 
 * Isto e um teste de documentacao
 */
public class Exemplo {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "SENAI", "Exemplo GUI", 1);

		int sal = JOptionPane.showConfirmDialog(null, "Quer aumento de salário?", "Salário",
				JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(sal);
	}
}