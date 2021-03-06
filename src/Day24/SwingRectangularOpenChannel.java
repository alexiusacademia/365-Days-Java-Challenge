package Day24;// Using the BoxLayout
// Implementing events

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingRectangularOpenChannel {
  static JFrame mainWindow;

  // Buttons
  static JButton btnClear;
  static JButton btnCancel;
  static JButton btnCalculate;

  // Input text fields
  static ArrayList<JTextField> inputFields;

  private static final String WINDOW_TITLE = "OPEN CHANNEL";
  private static final String WINDOW_PAGE_TITLE = "RECTANGULAR OPEN CHANNEL";

  public static void main(String[] args) {
    // Initialize inputField
    inputFields = new ArrayList<>();

    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run() {
        setUI();
      }
    });
  }

  private static void setUI() {
    // Initialize mainWindow
    mainWindow = new JFrame();
    mainWindow.setTitle(WINDOW_TITLE);

    // Create the main panel
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

    // mainWindow page title
    JLabel windowPageTitle = new JLabel(WINDOW_PAGE_TITLE);
    windowPageTitle.setForeground(Color.BLUE);
    windowPageTitle.setFont(new Font("SansSerif", Font.BOLD, 14));
    windowPageTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

    // Unknown panel
    JPanel panelUnknown = new JPanel();
    panelUnknown.setLayout(new BoxLayout(panelUnknown, BoxLayout.X_AXIS));

    JLabel unknownLabel = new JLabel("Set Unknown");
    JComboBox unknownComboBox = new JComboBox();

    panelUnknown.add(Box.createHorizontalStrut(20));
    panelUnknown.add(unknownLabel);
    panelUnknown.add(unknownComboBox);
    panelUnknown.add(Box.createHorizontalStrut(20));

    // Input Panel
    JPanel panelInput = new JPanel();
    panelInput.setLayout(new BoxLayout(panelInput, BoxLayout.Y_AXIS));
    panelInput.setBorder(BorderFactory.createTitledBorder("INPUTS"));
    createInputComponents(panelInput);
    panelInput.add(Box.createVerticalStrut(25));

    // Output Panel
    JPanel panelOutput = new JPanel();
    panelOutput.setLayout(new BoxLayout(panelOutput, BoxLayout.Y_AXIS));
    panelOutput.setBorder(BorderFactory.createTitledBorder("OUTPUTS"));
    createOutputComponents(panelOutput);

    // Display Panel
    JPanel panelDisplay = new JPanel();
    panelDisplay.add(Box.createHorizontalStrut(10));
    panelDisplay.add(panelInput);
    panelDisplay.add(panelOutput);
    panelDisplay.add(Box.createHorizontalStrut(10));

    // Buttons Panel
    JPanel panelButtons = new JPanel();
    panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.X_AXIS));
    panelButtons.add(Box.createHorizontalGlue());
    createButtons(panelButtons);

    // Add main components to the main panel
    mainPanel.add(Box.createVerticalStrut(10));
    mainPanel.add(windowPageTitle);
    mainPanel.add(panelUnknown);
    mainPanel.add(panelDisplay);
    mainPanel.add(panelButtons);

    // Set the window content pane
    mainWindow.setContentPane(mainPanel);

    // Show the mainWindow
    mainWindow.pack();
    mainWindow.setVisible(true);
  }

  private static void createButtons(JPanel parentPanel) {
    JButton[] buttons = {
            new JButton("Clear"),
            new JButton("Calculate")
    };

    for (JButton btn : buttons) {
      parentPanel.add(btn);
    }

    // Set tooltip text
    buttons[0].setToolTipText("Clear all the inputs and outputs.");
    buttons[1].setToolTipText("Analyze the hydraulic properties.");

    // Set reference to buttons
    btnClear = buttons[0];
    btnCalculate = buttons[1];

    btnClear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        btnClearPressed();
      }
    });

    parentPanel.add(Box.createHorizontalStrut(10));
  }

  // Button listers
  private static void btnClearPressed() {
    try {
      for (JTextField tf : inputFields) {
        tf.setText("");
      }

      JOptionPane.showMessageDialog(null, "All inputs and outputs are cleared!");
    } catch (Exception e) {
      System.out.println("An error has occurred: " + e);
    }

  }

  private static void createInputComponents(JPanel parentPanel) {
    JLabel[] inputLabels = {
            new JLabel("Discharge"),
            new JLabel("Bed Slope"),
            new JLabel("Water Depth"),
            new JLabel("Channel Width"),
            new JLabel("Manning's Roughness")
    };
    JTextField[] textFields = {
            new JTextField(5),
            new JTextField(5),
            new JTextField(5),
            new JTextField(5),
            new JTextField(5)
    };

    int rowCount = inputLabels.length;

    JPanel panel;

    for (int i=0; i<rowCount; i++) {
      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
      panel.add(inputLabels[i]);
      panel.add(Box.createHorizontalGlue());
      panel.add(textFields[i]);
      parentPanel.add(panel);

      textFields[i].setHorizontalAlignment(SwingConstants.RIGHT);
    }

    for (JTextField tf : textFields) {
      // Add to array of input textfields
      inputFields.add(tf);
    }
  }

  private static void createOutputComponents(JPanel parentPanel) {
    JLabel[] labels = {
            new JLabel("Average Velocity"),
            new JLabel("Wetted Perimeter"),
            new JLabel("Wetted Area"),
            new JLabel("Hydraulic Radius"),
            new JLabel("Froude Number"),
            new JLabel("Flow Type")
    };
    JTextField[] textFields = {
            new JTextField(5),
            new JTextField(5),
            new JTextField(5),
            new JTextField(5),
            new JTextField(5),
            new JTextField(5)
    };

    int rowCount = labels.length;

    JPanel panel;

    for (int i=0; i<rowCount; i++) {
      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
      panel.add(labels[i]);
      panel.add(Box.createHorizontalGlue());
      panel.add(textFields[i]);
      parentPanel.add(panel);
      textFields[i].setHorizontalAlignment(SwingConstants.RIGHT);
    }
  }
}
