
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class FormularioDemo extends JFrame {
    
    FormularioDemo(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout layoutMain = new GridLayout(4, 0, 10, 10);
        GridLayout layout1    = new GridLayout(3, 4, 10, 10);
        GridLayout layout2    = new GridLayout(4, 3, 10, 10);
        GridLayout layout3    = new GridLayout(1, 0, 10, 10);
        GridLayout layout4    = new GridLayout(1, 2, 10, 10);
        
        JPanel panelMain = new JPanel(layoutMain);
        JPanel panel1 = new JPanel(layout1);
        JPanel panel2 = new JPanel(layout2);
        JPanel panel3 = new JPanel(layout3);
        JPanel panel4 = new JPanel(layout4);
        
        JPanel panelCheck = new JPanel();
        panelCheck.setBorder(BorderFactory.createTitledBorder("Intereses"));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panelDocumento = new JPanel();
        JLabel labelNombre = new JLabel("Nombre :");
        JLabel labelApellido = new JLabel("Apellido :");
        JLabel labelTipoDocumento = new JLabel("Tipo Documento : ");
        JLabel labelNumeroDocumento = new JLabel("Numero :");
        JLabel labelPerfil = new JLabel("Perfil :");
        
        JLabel labelDireccion = new JLabel("Direccion");
        JLabel labelTelefono = new JLabel("Telefono");
        JLabel labelCelular  = new JLabel("Celular");
        JLabel labelCiudad = new JLabel("Ciudad");
        JLabel labelDepto = new JLabel ("Departamento");
        JLabel labelPais = new JLabel ("Pais");
        
        ButtonGroup tipoDocumento = new ButtonGroup();
        JRadioButton cedula = new JRadioButton("C.C");
        JRadioButton tarjetaIdentidad = new JRadioButton("T.I");
        JRadioButton registroCivil = new JRadioButton("R.C");
        tipoDocumento.add(cedula);
        tipoDocumento.add(tarjetaIdentidad);
        tipoDocumento.add(registroCivil);
        panelDocumento.add(cedula);
        panelDocumento.add(tarjetaIdentidad);
        panelDocumento.add(registroCivil);
        
        JTextField textoNombre = new JTextField();
        JTextField textoApellido = new JTextField();
        JTextField textoNumeroDocumento = new JTextField();
        
        JTextField textoDireccion = new JTextField();
        JTextField textoCiudad = new JTextField();
        JTextField textoDepto = new JTextField();
        JTextField textoPais = new JTextField();
        
        JTextArea areaPerfil = new JTextArea();
        JScrollPane scrollPerfil = new JScrollPane(areaPerfil);
        areaPerfil.setLineWrap(true);
        
        JCheckBox checkPeliculas   = new JCheckBox("Peliculas");
        JCheckBox checkVideojuegos = new JCheckBox("Videojuegos");
        JCheckBox checkViajes      = new JCheckBox("Viajes");
        JCheckBox checkEducacion   = new JCheckBox("Educacion");
        JCheckBox checkCompras     = new JCheckBox("Compras");
        JCheckBox checkVehiculos   = new JCheckBox("Compras");
        JCheckBox checkNegocios    = new JCheckBox("Compras");
        JCheckBox checkOtros       = new JCheckBox("Otros");   
        
        panelCheck.setLayout(new GridLayout(2, 4, 10 ,10));
        panelCheck.add(checkPeliculas);
        panelCheck.add(checkVideojuegos);
        panelCheck.add(checkViajes);
        panelCheck.add(checkEducacion);
        panelCheck.add(checkCompras);
        panelCheck.add(checkVehiculos);
        panelCheck.add(checkNegocios);
        panelCheck.add(checkOtros);
        
        JButton buttonCancelar = new JButton("Cancelar");
        JButton buttonEnviar   = new JButton("Enviar");   
        
        panel1.add(labelNombre);
        panel1.add(textoNombre);
        panel1.add(labelApellido);
        panel1.add(textoApellido);
        panel1.add(labelTipoDocumento);
        panel1.add(panelDocumento);
        panel1.add(labelNumeroDocumento);
        panel1.add(textoNumeroDocumento);
        panel1.add(labelPerfil);
        panel1.add(scrollPerfil);
        
        panel2.add(labelDireccion);
        panel2.add(labelTelefono);
        panel2.add(labelCelular);
        panel2.add(textoDireccion);
        try{
            MaskFormatter m = new MaskFormatter("###-####");
            JFormattedTextField formaTelefono = new JFormattedTextField(m);
            panel2.add(formaTelefono);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        try{
            MaskFormatter m = new MaskFormatter("###-###-####");
            JFormattedTextField formaCelular = new JFormattedTextField(m);
            panel2.add(formaCelular);
        }catch(ParseException ex){
            System.err.println("Error: " + ex.getMessage());
        }
        
        panel2.add(labelCiudad);
        panel2.add(labelDepto);
        panel2.add(labelPais);
        panel2.add(textoCiudad);
        panel2.add(textoDepto);
        panel2.add(textoPais);
        
        panel3.add(panelCheck);
        
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel4.add(buttonCancelar);
        panel4.add(buttonEnviar);
        
        panelMain.add(panel1);
        panelMain.add(panel2);
        panelMain.add(panel3);
        panelMain.add(panel4);
        
        
        getContentPane().add(panelMain);
        setVisible(true);
        pack();
        
                
    }
    }

