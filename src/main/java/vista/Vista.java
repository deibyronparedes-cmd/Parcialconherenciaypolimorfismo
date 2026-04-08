package vista;

import javax.swing.*;
import controlador.Controlador;

public class Vista extends JFrame {

    private JTextField txtCodigo, txtNombre, txtDesarrollo, txtMatematica;
    private JCheckBox chkBeca;
    private JTextArea area;
    private Controlador controlador;
    private JComboBox<String> comboOpciones;
    private JButton btn;

    public Vista() {

        controlador = new Controlador();

        setTitle("Sistema de Estudiantes");
        setSize(400, 450);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        comboOpciones = new JComboBox<>();
        comboOpciones.addItem("Agregar estudiante");
        comboOpciones.addItem("Modificar nota");
        comboOpciones.addItem("Aplicar incremento");
        comboOpciones.setBounds(10, 10, 200, 20);
        add(comboOpciones);

        JLabel l1 = new JLabel("Código:");
        l1.setBounds(10, 40, 100, 20);
        add(l1);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 40, 100, 20);
        add(txtCodigo);

        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(10, 70, 100, 20);
        add(l2);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 70, 100, 20);
        add(txtNombre);

        JLabel l3 = new JLabel(" Nota Desarrollo:");
        l3.setBounds(10, 100, 100, 20);
        add(l3);

        txtDesarrollo = new JTextField();
        txtDesarrollo.setBounds(120, 100, 100, 20);
        add(txtDesarrollo);

        JLabel l4 = new JLabel(" Nota Matemática:");
        l4.setBounds(10, 130, 100, 20);
        add(l4);

        txtMatematica = new JTextField();
        txtMatematica.setBounds(120, 130, 100, 20);
        add(txtMatematica);

        chkBeca = new JCheckBox("Estudiante con beca");
        chkBeca.setBounds(10, 160, 200, 20);
        add(chkBeca);

        btn = new JButton("Ejecutar");
        btn.setBounds(10, 190, 100, 30);
        add(btn);

        area = new JTextArea();
        area.setBounds(10, 230, 360, 150);
        add(area);

        btn.addActionListener(e -> ejecutarOpcion());

        setVisible(true);
    }

    private void ejecutarOpcion() {

        String opcion = (String) comboOpciones.getSelectedItem();

        if (opcion.equals("Agregar estudiante")) {
            agregar();
        } else if (opcion.equals("Modificar nota")) {
            modificarNota();
        } else if (opcion.equals("Aplicar incremento")) {
            incrementar();
        }
    }

    private void agregar() {
        int cod = Integer.parseInt(txtCodigo.getText());
        String nom = txtNombre.getText();
        double nd = Double.parseDouble(txtDesarrollo.getText());
        double nm = Double.parseDouble(txtMatematica.getText());

        boolean beca = chkBeca.isSelected();

        controlador.agregarEstudiante(cod, nom, nd, nm, beca);

        area.setText(controlador.mostrarEstudiantes());
    }

    private void modificarNota() {
        int cod = Integer.parseInt(txtCodigo.getText());
        double nd = Double.parseDouble(txtDesarrollo.getText());
        double nm = Double.parseDouble(txtMatematica.getText());

        controlador.modificarNota(cod, nd, nm);

        area.setText(controlador.mostrarEstudiantes());
    }

    private void incrementar() {
        int cod = Integer.parseInt(txtCodigo.getText());
        double valor = Double.parseDouble(txtDesarrollo.getText());

        controlador.incrementarNota(cod, valor);

        area.setText(controlador.mostrarEstudiantes());
    }
}