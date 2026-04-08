package vista;

import javax.swing.*;
import modelo.*;

public class Vista extends JFrame {

    private final JTextField txtCodigo;
    private final JTextField txtNombre;

    private final JTextField txtDesarrollo;
    private final JTextField txtMatematica;
    private final JButton btnAgregar;
    private final JTextArea area;

    private final Curso curso;

    public Vista() {
        curso = new Curso(10);

        setTitle("Sistema de Estudiantes");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel l1 = new JLabel("Código:");
        l1.setBounds(10, 10, 100, 20);
        add(l1);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 10, 100, 20);
        add(txtCodigo);

        JLabel l2 = new JLabel("Nombre:");
        l2.setBounds(10, 40, 100, 20);
        add(l2);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 40, 100, 20);
        add(txtNombre);

        JLabel l3 = new JLabel("Desarrollo:");
        l3.setBounds(10, 70, 100, 20);
        add(l3);

        txtDesarrollo = new JTextField();
        txtDesarrollo.setBounds(120, 70, 100, 20);
        add(txtDesarrollo);

        JLabel l4 = new JLabel("Matemática:");
        l4.setBounds(10, 100, 100, 20);
        add(l4);

        txtMatematica = new JTextField();
        txtMatematica.setBounds(120, 100, 100, 20);
        add(txtMatematica);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(10, 130, 100, 30);
        add(btnAgregar);

        area = new JTextArea();
        area.setBounds(10, 170, 350, 150);
        add(area);

        // Evento botón
        btnAgregar.addActionListener(e -> agregar());

        setVisible(true);
    }

    private void agregar() {
        int cod = Integer.parseInt(txtCodigo.getText());
        String nom = txtNombre.getText();
        double nd = Double.parseDouble(txtDesarrollo.getText());
        double nm = Double.parseDouble(txtMatematica.getText());

        Estudiante e = new Estudiante(cod, nom, nd, nm);
        curso.agregarEstudiante(e);

        area.append(nom + " -> " + e.calcularDefinitiva() + "\n");
    }
}