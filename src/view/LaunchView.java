package view;

import java.awt.Dimension;

import javax.swing.*;

public class LaunchView extends JFrame {

	private JButton comparar,buscar;
	private JTextArea textArea;
	private JTextField fichero1,fichero2,palabra;
	private JLabel label_f1,label_f2,label_pal;
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTextFieldIdentificador() {
		return textFieldIdentificador;
	}

	public void setTextFieldIdentificador(JTextField textFieldIdentificador) {
		this.textFieldIdentificador = textFieldIdentificador;
	}

	public JTextField getTextFieldAñoPublicacion() {
		return textFieldAñoPublicacion;
	}

	public void setTextFieldAñoPublicacion(JTextField textFieldAñoPublicacion) {
		this.textFieldAñoPublicacion = textFieldAñoPublicacion;
	}

	public JTextField getTextFieldNumeroDePaginas() {
		return textFieldNumeroDePaginas;
	}

	public void setTextFieldNumeroDePaginas(JTextField textFieldNumeroDePaginas) {
		this.textFieldNumeroDePaginas = textFieldNumeroDePaginas;
	}

	public JTextField getTextFieldTitulo() {
		return textFieldTitulo;
	}

	public void setTextFieldTitulo(JTextField textFieldTitulo) {
		this.textFieldTitulo = textFieldTitulo;
	}

	public JTextField getTextFieldAutor() {
		return textFieldAutor;
	}

	public void setTextFieldAutor(JTextField textFieldAutor) {
		this.textFieldAutor = textFieldAutor;
	}

	public JTextField getTextFieldEditor() {
		return textFieldEditor;
	}

	public void setTextFieldEditor(JTextField textFieldEditor) {
		this.textFieldEditor = textFieldEditor;
	}

	private JCheckBox primera;
	
	private JPanel panel;
	private JTextField textFieldIdentificador;
	private JTextField textFieldAñoPublicacion;
	private JTextField textFieldNumeroDePaginas;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldEditor;
	private JButton buttonRecuperar;
	private JButton btnGuardarLibro;
	
	public LaunchView() {
		
		setBounds(200,200,1000,450);
		setTitle("Proyecto Buffers");	
		panel = new JPanel();
		
		comparar = new JButton("Comparar contenido");
		comparar.setBounds(71, 5, 150, 26);
		comparar.setPreferredSize(new Dimension(150, 26));
		buscar = new JButton("Buscar palabra");
		buscar.setBounds(226, 5, 150, 26);
		buscar.setPreferredSize(new Dimension(150, 26));
					
		fichero1 = new JTextField("",10);
		fichero1.setBounds(434, 8, 86, 20);
		fichero2 = new JTextField("",10);
		fichero2.setBounds(578, 8, 86, 20);
		palabra = new JTextField("",10);
		palabra.setBounds(714, 8, 86, 20);
		
		label_f1 = new JLabel("Fichero 1:");
		label_f1.setBounds(381, 11, 48, 14);
		label_f2 = new JLabel("Fichero 2:");
		label_f2.setBounds(525, 11, 48, 14);
		label_pal = new JLabel("Palabra:");
		label_pal.setBounds(669, 11, 40, 14);
		
		primera = new JCheckBox("Primera aparición");
		primera.setBounds(805, 6, 107, 23);

		textArea = new JTextArea(20, 80);
		textArea.setBounds(39,36,644,364);
		textArea.setEditable(false);		
		panel.setLayout(null);
		
		panel.add(comparar);
		panel.add(buscar);
		panel.add(label_f1);
		panel.add(fichero1);
		panel.add(label_f2);
		panel.add(fichero2);
		panel.add(label_pal);
		panel.add(palabra);
		panel.add(primera);
		panel.add(textArea);
		
        // Añadimos el JPanel al JFrame
        this.getContentPane().add(panel);		
        
        JPanel panel_1Libro = new JPanel();
        panel_1Libro.setBounds(714, 66, 230, 239);
        panel.add(panel_1Libro);
        panel_1Libro.setLayout(null);
        
        JLabel lblNewLabelIdentificador = new JLabel("Identificador");
        lblNewLabelIdentificador.setBounds(0, 11, 68, 14);
        panel_1Libro.add(lblNewLabelIdentificador);
        
        textFieldIdentificador = new JTextField();
        textFieldIdentificador.setBounds(103, 8, 86, 20);
        panel_1Libro.add(textFieldIdentificador);
        textFieldIdentificador.setColumns(10);
        
        JLabel lblNewLabelAñoPublicacion = new JLabel("A\u00F1o publicacion");
        lblNewLabelAñoPublicacion.setBounds(0, 42, 74, 14);
        panel_1Libro.add(lblNewLabelAñoPublicacion);
        
        textFieldAñoPublicacion = new JTextField();
        textFieldAñoPublicacion.setBounds(103, 39, 86, 20);
        panel_1Libro.add(textFieldAñoPublicacion);
        textFieldAñoPublicacion.setColumns(10);
        
        JLabel lblNewLabelNumeroPaginas = new JLabel("Numero de p\u00E1ginas");
        lblNewLabelNumeroPaginas.setBounds(0, 77, 92, 14);
        panel_1Libro.add(lblNewLabelNumeroPaginas);
        
        textFieldNumeroDePaginas = new JTextField();
        textFieldNumeroDePaginas.setBounds(103, 74, 86, 20);
        panel_1Libro.add(textFieldNumeroDePaginas);
        textFieldNumeroDePaginas.setColumns(10);
        
        JLabel lblNewLabelTitulo = new JLabel("T\u00EDtulo");
        lblNewLabelTitulo.setBounds(0, 102, 56, 14);
        panel_1Libro.add(lblNewLabelTitulo);
        
        textFieldTitulo = new JTextField();
        textFieldTitulo.setBounds(103, 105, 86, 20);
        panel_1Libro.add(textFieldTitulo);
        textFieldTitulo.setColumns(10);
        
        JLabel lblNewLabelAutor = new JLabel("Autor ");
        lblNewLabelAutor.setBounds(0, 139, 46, 14);
        panel_1Libro.add(lblNewLabelAutor);
        
        textFieldAutor = new JTextField();
        textFieldAutor.setBounds(103, 136, 86, 20);
        panel_1Libro.add(textFieldAutor);
        textFieldAutor.setColumns(10);
        
        JLabel lblNewLabelEditor = new JLabel("Editor");
        lblNewLabelEditor.setBounds(0, 179, 46, 14);
        panel_1Libro.add(lblNewLabelEditor);
        
        textFieldEditor = new JTextField();
        textFieldEditor.setBounds(103, 176, 86, 20);
        panel_1Libro.add(textFieldEditor);
        textFieldEditor.setColumns(10);
        
        btnGuardarLibro = new JButton("Guardar");
        btnGuardarLibro.setBounds(0, 207, 110, 23);
        panel_1Libro.add(btnGuardarLibro);
        
        JButton btnNewButtonMostrar = new JButton("Mostrar");
        btnNewButtonMostrar.setBounds(123, 207, 89, 23);
        panel_1Libro.add(btnNewButtonMostrar);
		
	}	
	
	public JTextField getPalabra() {
		return palabra;
	}

	public void setPalabra(JTextField palabra) {
		this.palabra = palabra;
	}

	public JCheckBox getPrimera() {
		return primera;
	}

	public void setPrimera(JCheckBox primera) {
		this.primera = primera;
	}

	public JButton getButtonRecuperar() {
		return buttonRecuperar;
	}

	public void setButtonRecuperar(JButton buttonRecuperar) {
		this.buttonRecuperar = buttonRecuperar;
	}

	public JButton getBtnGuardarLibro() {
		return btnGuardarLibro;
	}

	public void setBtnGuardarLibro(JButton btnGuardarLibro) {
		this.btnGuardarLibro = btnGuardarLibro;
	}

	public JButton getComparar() {
		return comparar;
	}

	public void setComparar(JButton comparar) {
		this.comparar = comparar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
			
	public JTextField getFichero1() {
		return fichero1;
	}

	public void setFichero1(JTextField fichero1) {
		this.fichero1 = fichero1;
	}

	public JTextField getFichero2() {
		return fichero2;
	}

	public void setFichero2(JTextField fichero2) {
		this.fichero2 = fichero2;
	}

	public void showError(String m){
		JOptionPane.showMessageDialog(this.panel,
			    m,
			    "Error",
			    JOptionPane.ERROR_MESSAGE);
	}
}
