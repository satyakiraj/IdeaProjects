import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;

public class filehandling extends JFrame {

    private JTextField filePathField;
    private JTextArea outputArea;

    public filehandling() {
        setTitle("Desktop Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // File path input
        filePathField = new JTextField(30);
        JButton createButton = new JButton("Create File");
        JButton deleteButton = new JButton("Delete File");
        JButton findButton = new JButton("Find File");

        JPanel panel = new JPanel();
        panel.add(new JLabel("File/Directory Path:"));
        panel.add(filePathField);
        panel.add(createButton);
        panel.add(deleteButton);
        panel.add(findButton);

        // Output area
        outputArea = new JTextArea(15, 50);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Action listeners
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createFile();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteFile();
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findFile();
            }
        });
    }

    private void createFile() {
        String path = filePathField.getText();
        try {
            Files.createFile(Paths.get(path));
            outputArea.append("File created: " + path + "\n");
        } catch (IOException e) {
            outputArea.append("Error creating file: " + e.getMessage() + "\n");
        }
    }

    private void deleteFile() {
        String path = filePathField.getText();
        try {
            Files.delete(Paths.get(path));
            outputArea.append("File deleted: " + path + "\n");
        } catch (IOException e) {
            outputArea.append("Error deleting file: " + e.getMessage() + "\n");
        }
    }

    private void findFile() {
        String path = filePathField.getText();
        try {
            if (Files.exists(Paths.get(path))) {
                outputArea.append("File found: " + path + "\n");
            } else {
                outputArea.append("File not found: " + path + "\n");
            }
        } catch (Exception e) {
            outputArea.append("Error finding file: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new filehandling().setVisible(true);
        });
    }
}

