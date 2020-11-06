package co.edu.uelbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaPrincipal  extends JFrame{
	
	private PanelPrincipal panelInicio;
	private PanelNuevo nuevo;
	
	public VentanaPrincipal() {
		
		setSize(972, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// getContentPane().setBackground(Color.RED);
		getContentPane().setLayout(new BorderLayout(10, 10));

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		panelInicio = new PanelPrincipal();
		nuevo = new PanelNuevo();
		getContentPane().add(panelInicio, BorderLayout.CENTER);

		
	}

	/**
	 * @return the panelInicio
	 */
	public PanelPrincipal getPanelInicio() {
		return panelInicio;
	}

	/**
	 * @param panelInicio the panelInicio to set
	 */
	public void setPanelInicio(PanelPrincipal panelInicio) {
		this.panelInicio = panelInicio;
	}

	/**
	 * @return the nuevo
	 */
	public PanelNuevo getNuevo() {
		return nuevo;
	}

	/**
	 * @param nuevo the nuevo to set
	 */
	public void setNuevo(PanelNuevo nuevo) {
		this.nuevo = nuevo;
	}

}
