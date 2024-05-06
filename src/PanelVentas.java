import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelVentas extends JPanel {
    private JTable tablaVentas;
    private JButton btnNuevaVenta;
    private JButton btnBuscarVenta;
    private JTextField txtBusquedaVenta;

    private Color originalColor;

    public PanelVentas() {

        setLayout(new BorderLayout());

        tablaVentas = new JTable();
        btnNuevaVenta = new JButton("Registrar Venta");
        btnBuscarVenta = new JButton("Buscar Venta");
        txtBusquedaVenta = new JTextField();

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnNuevaVenta);
        panelBotones.add(btnBuscarVenta);

        add(new JScrollPane(tablaVentas), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        add(txtBusquedaVenta, BorderLayout.NORTH);

        btnNuevaVenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarNuevaVenta();
            }
        });

        add(new JScrollPane(tablaVentas), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        add(txtBusquedaVenta, BorderLayout.NORTH);



        btnBuscarVenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarVenta();
            }
        });
    }

    public void mostrarHistorialVentas() {

    }

    public void registrarNuevaVenta() {

    }

    public void buscarVenta() {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearVentana();
            }
        });
    }

    public static void crearVentana() {
        JFrame frame = new JFrame("Sistema de Ventas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelVentas panelVentas = new PanelVentas();
        frame.getContentPane().add(panelVentas);

        frame.pack();
        frame.setVisible(true);
    }
}

