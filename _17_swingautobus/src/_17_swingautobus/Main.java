package _17_swingautobus;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
    	
    	Autobus autobus = new Autobus();
    	
        // Crea la finestra
        JFrame frame = new JFrame("Crea Persona");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        
        // ===== Pannello passeggero =====
        JPanel passeggeroPanel = new JPanel(new GridLayout(5, 2));

        // Crea i componenti
        JLabel passeggeroNomeLabel = new JLabel("Nome:");
        JTextField passeggeroNomeField = new JTextField(15);

        JLabel passeggeroCognomeLabel = new JLabel("Cognome:");
        JTextField passeggeroCognomeField = new JTextField(15);

        JLabel passeggeroCFLabel = new JLabel("Codice fiscale:");
        JTextField passeggeroCFField = new JTextField(16);
        
        JLabel passeggeroDestinazioneLabel = new JLabel("Destinazione:");
        JTextField passeggeroDestinazioneField = new JTextField(16);

        JCheckBox bagaglioCheckBox = new JCheckBox("Bagaglio");
        JButton passeggeroButton = new JButton("Aggiungi passeggero");

        passeggeroPanel.add(passeggeroNomeLabel);
        passeggeroPanel.add(passeggeroNomeField);
        passeggeroPanel.add(passeggeroCognomeLabel);
        passeggeroPanel.add(passeggeroCognomeField);
        passeggeroPanel.add(passeggeroCFLabel);
        passeggeroPanel.add(passeggeroCFField);
        passeggeroPanel.add(passeggeroDestinazioneLabel);
        passeggeroPanel.add(passeggeroDestinazioneField);
        passeggeroPanel.add(bagaglioCheckBox);
        passeggeroPanel.add(passeggeroButton);

        // Azione al click del bottone
        passeggeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = passeggeroNomeField.getText().trim();
                String cognome = passeggeroCognomeField.getText().trim();
                String CF = passeggeroCFField.getText().trim();
                boolean bagaglio = bagaglioCheckBox.isSelected();
                String destinazione = passeggeroDestinazioneField.getText().trim();

                Passeggero p = new Passeggero(nome, cognome, CF, bagaglio, destinazione);

                try {
                    autobus.aggiungiPasseggero(p);
                    JOptionPane.showMessageDialog(frame,
                        "Passeggero aggiunto:\nNome: " + p.getNome() + "\nCognome: " + p.getCognome() +
                        "\nCodice Fiscale: " + p.getCF() + "\nBagaglio: " + p.getBagaglio() +
                        "\nDestinazione: " + p.getDestinazione());
                } catch (PostiEsauritiPasseggeroException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // ===== Pannello Autista =====
        JPanel autistaPanel = new JPanel(new GridLayout(6, 2));
        
        JLabel autistaNomeLabel = new JLabel("Nome:");
        JTextField autistaNomeField = new JTextField(15);

        JLabel autistaCognomeLabel = new JLabel("Cognome:");
        JTextField autistaCognomeField = new JTextField(15);

        JLabel autistaCFLabel = new JLabel("Codice fiscale:");
        JTextField autistaCFField = new JTextField(16);
        
        JLabel autistaPatenteLabel = new JLabel("Patente:");
        JTextField autistaPatenteField = new JTextField();
        
        JLabel autistaAnniEsperienzaLabel = new JLabel("Anni di esperienza:");
        JTextField autistaAnniEsperienzaField = new JTextField();
        
        JButton autistaButton = new JButton("Aggiungi Autista");
        autistaPanel.add(autistaNomeLabel);
        autistaPanel.add(autistaNomeField);
        autistaPanel.add(autistaCognomeLabel);
        autistaPanel.add(autistaCognomeField);
        autistaPanel.add(autistaCFLabel);
        autistaPanel.add(autistaCFField);
        autistaPanel.add(autistaPatenteLabel);
        autistaPanel.add(autistaPatenteField);
        autistaPanel.add(autistaAnniEsperienzaLabel);
        autistaPanel.add(autistaAnniEsperienzaField);
        autistaPanel.add(new JLabel());
        autistaPanel.add(autistaButton);

        // Azione al click del bottone
        autistaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = autistaNomeField.getText().trim();
                    String cognome = autistaCognomeField.getText().trim();
                    String CF = autistaCFField.getText().trim();
                    String patente = autistaPatenteField.getText().trim();
                    int anniEsperienza = Integer.parseInt(autistaAnniEsperienzaField.getText().trim());

                    Autista a = new Autista(nome, cognome, CF, patente, anniEsperienza);

                    autobus.aggiungiAutista(a);
                    JOptionPane.showMessageDialog(frame,
                        "Autista aggiunto:\nNome: " + a.getNome() + "\nCognome: " + a.getCognome() +
                        "\nCodice Fiscale: " + a.getCF() + "\nPatente: " + a.getPatente() +
                        "\nAnni di Esperienza: " + a.getAnniEsperienza());
                } catch (PostiEsauritiAutistaException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        tabbedPane.addTab("Passeggero", passeggeroPanel);
        tabbedPane.addTab("Autista", autistaPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);

    }
}