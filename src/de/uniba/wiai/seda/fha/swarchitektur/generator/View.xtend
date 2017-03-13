package de.uniba.wiai.seda.fha.swarchitektur.generator

import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextArea
import javax.swing.JButton
import javax.swing.JTextField
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.JScrollPane
import javax.swing.ScrollPaneConstants
import java.awt.BorderLayout
import javax.swing.JFileChooser
import javax.swing.UIManager
import javax.swing.UnsupportedLookAndFeelException
import java.awt.image.BufferedImage
import java.awt.Graphics
import javax.swing.BorderFactory
import java.awt.Color
import java.awt.Rectangle
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.JLabel
import javax.swing.SwingConstants
import java.awt.Font
import javax.swing.JSeparator
import javax.swing.JOptionPane

/**
 * grafische Benutzeroberfläche
 */
class View {
	
	/**
	 * Text für Buttons
	 */
	public static final String CHOOSE_INPUT_TEXT = "Ecore-Modell wählen"
	public static final String CHOOSE_OUTPUT_TEXT = "Verzeichnis wählen"
	public static final String START_GENERATOR_TEXT = "Start >"
	public static final String BACK_TEXT = "< Zurück"
	
	/**
	 * Pfade von verwendeten Bildern
	 */
	public static final String IMAGE_PATH = "/de/uniba/wiai/seda/fha/swarchitektur/resources/"
	public static final String HEADER_IMAGE = "header.png"
	public static final String NO_INPUT_IMAGE = "noInput.gif"
	public static final String INPUT_OK = "inputOk.gif"
	public static final String INPUT_NOT_OK = "inputNotOk.gif"
	
	/**
	 * Referenz auf Quellcodegenerator
	 */
	private Generator generator
	
	/**
	 * GUI-Elemente
	 */
	private JFrame startFrame
	private JPanel startPanel
	private JPanel headerPanel
	private JPanel inputValid
	
	private JLabel inputLabel
	private JLabel inputValidLabel
	private JTextField inputFile
	private JLabel outputLabel
	private JTextField outputDir
	
	private JButton chooseInputButton
	private JButton chooseOutputButton
	private JButton startButton
	private JButton backButton
	
	private JSeparator separator
	
	private JPanel generatorPanel
	private JScrollPane generatorScrollPane
	private JTextArea logArea
	private String statusText

	def initView() {
		statusText = ""
		setLookAndFeel()
		initGeneratorPanelComonents()
		initComponents()
		initStartPanel()
		initStartFrame()
	}

	/**
	 * Startet das Hauptfenster
	 */
	def initStartFrame() {
		startFrame = new JFrame()
		startFrame.setSize(585, 445)
		startFrame.setResizable(false)
		startFrame.setTitle("Vom SOM-GP zum Softwareartefakt: Codegenerierung")
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		startFrame.setLocationRelativeTo(null)
		startFrame.add(startPanel)
		startFrame.setVisible(true)
	}

	/**
	 * Startet das Panel des Hauptfensters
	 */
	def initStartPanel() {
		startPanel = new JPanel()
		startPanel.setLayout(null)
		startPanel.add(headerPanel)
		startPanel.add(separator)
		startPanel.add(startButton)
		startPanel.add(backButton)
		showInputOutputComponents()
	}

	/**
	 * initialisiiert alle Komponenten
	 */
	def initComponents() {
		headerPanel = initHeaderPanel()
		headerPanel.setBounds(0, 0, 579, 70)
		
		inputLabel = new JLabel("Eingabe");
		inputLabel.setBounds(new Rectangle(45, 92, 69, 33));
		inputLabel.setHorizontalAlignment(SwingConstants.LEFT);
		inputLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		inputLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		outputLabel = new JLabel("Ausgabe");
		outputLabel.setBounds(new Rectangle(45, 216, 69, 33));
		outputLabel.setHorizontalAlignment(SwingConstants.LEFT);
		outputLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		outputLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		inputFile = new JTextField()
		inputFile.setBounds(45, 122, 321, 35)
		inputFile.setEditable(false);
		outputDir = new JTextField()
		outputDir.setBounds(45, 246, 321, 35)
		outputDir.setEditable(false);
		
		inputValid = initInputValidPanel(NO_INPUT_IMAGE)
		inputValidLabel = new JLabel("Ecore-Modell valide");
		inputValidLabel.setBounds(92, 168, 200, 25)
		
		var actionListener = new GeneratorActionListener(this, generator)
		chooseInputButton = new JButton(CHOOSE_INPUT_TEXT)
		chooseInputButton.setBounds(380, 126, 157, 27)
		chooseInputButton.addActionListener(actionListener)
		chooseOutputButton = new JButton(CHOOSE_OUTPUT_TEXT)
		chooseOutputButton.setBounds(380, 250, 157, 27)
		chooseOutputButton.addActionListener(actionListener)
		
		separator = new JSeparator(JSeparator.HORIZONTAL)
		separator.setBounds(20, 343, 538, 1)
		
		startButton = new JButton(START_GENERATOR_TEXT)
		startButton.setBounds(436, 364, 100, 27)
		startButton.addActionListener(actionListener)
		backButton = new JButton(BACK_TEXT)
		backButton.setBounds(330, 364, 100, 27)
		backButton.addActionListener(actionListener)
		
		generatorPanel = new JPanel()
		generatorPanel.setLayout(new BorderLayout())
		generatorPanel.add(generatorScrollPane)
		generatorPanel.setBounds(19, 75, 539, 263)
	}
	
	/** 
	 * initialisiert das Header-Panel mit Banner
	 */
	def initHeaderPanel() {
		var JPanel panel = new ImagePanel(IMAGE_PATH + HEADER_IMAGE);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray));
		return panel
	}
	
	/**
	 * initialisiert das Input-Valide-Bild
	 */
	def initInputValidPanel(String image) {
		var JPanel panel = new ImagePanel(IMAGE_PATH + image)
		panel.setLayout(null)
		panel.setBounds(63, 173, 16, 16)
		return panel
	}
	
	/**
	 * setzt das Inputfile auf valide/nicht-valide
	 */
	def setInputValid(boolean isInputValid) {
		startPanel.remove(inputValid)
		if (isInputValid) {
			inputValid = initInputValidPanel(INPUT_OK)
		} else {
			inputValid = initInputValidPanel(INPUT_NOT_OK)
		}
		startPanel.add(inputValid)
		startPanel.validate
		startPanel.repaint
	}
	
	/**
	 * zeigt Komponenten an, die für das Wählen von Dateien benötigt werden
	 */
	def showInputOutputComponents() {
		startPanel.remove(generatorPanel)
		startPanel.add(inputLabel)
		startPanel.add(outputLabel)
		startPanel.add(inputFile)
		startPanel.add(outputDir)
		startPanel.add(chooseInputButton)
		startPanel.add(chooseOutputButton)
		startPanel.add(inputValid)
		startPanel.add(inputValidLabel)
		startButton.setEnabled(true)
		backButton.setEnabled(false)
		startPanel.validate
		startPanel.repaint
	}
	
	/**
	 * zeigt Komponenten an, die während der Generierung benötigt werden
	 */
	def showGeneratorComponents() {
		startPanel.remove(inputLabel)
		startPanel.remove(outputLabel)
		startPanel.remove(inputFile)
		startPanel.remove(outputDir)
		startPanel.remove(chooseInputButton)
		startPanel.remove(chooseOutputButton)
		startPanel.remove(inputValid)
		startPanel.remove(inputValidLabel)
		startPanel.add(generatorPanel)
		startButton.setEnabled(false)
		backButton.setEnabled(false)
		startPanel.validate
		startPanel.repaint
	}
	
	/**
	 * setzt das Look and Feel auf den Systemstandard
	 */
	def setLookAndFeel() {
		try {
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	    	e.printStackTrace
	    }
	    catch (ClassNotFoundException e) {
	    	e.printStackTrace
	    }
	    catch (InstantiationException e) {
	    	e.printStackTrace
	    }
	    catch (IllegalAccessException e) {
	       e.printStackTrace
	    }
    }
    
    /**
     * startet das Panel zur Generierung von Code
     */
	def initGeneratorPanelComonents() {
		generatorScrollPane = new JScrollPane()
		logArea = new JTextArea()
		logArea.setEditable(false)
		generatorScrollPane.setViewportView(logArea)
		generatorScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS)
		generatorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS)
	}
	
	/**
	 * löscht Statustext
	 */
	def clearStatusText() {
		statusText = ""
		generatorPanel.repaint
	}
	
	/**
	 * generiert Statustext
	 */
	def addStatusText(String text) {
		statusText = statusText + text + "\n"
		logArea.setText(statusText)
		logArea.setCaretPosition(logArea.getDocument().getLength());
		generatorPanel.repaint
	}
	
	/**
	 * setzt das zu transformierende Modell
	 */
	def openFile() {
		var JFileChooser fc = new JFileChooser();
		var returnVal = fc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			var file = fc.getSelectedFile
			if (file.canRead) {
				try {
					generator.setModel(file.absolutePath)
					inputFile.setText(file.absolutePath)
					setInputValid(true)
				} catch (Exception e) {
					setInputValid(false)
					e.printStackTrace
					showException(e)
				}
			} else {
				showError("ausgewählte Datei nicht lesbar")
			}
        } 
	}
	
	/**
	 * setzt das Ausgabeverzeichnis
	 */
	def openDir() {
		var JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		var returnVal = fc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			var file = fc.selectedFile
			if (file.isDirectory) {
				generator.setTargetDir(file.absolutePath)
				outputDir.setText(file.absolutePath)
			} else {
				showError("kein Verzeichnis ausgewählt")
			}
        } 
	}
	
	/**
	 * zeigt eine Exception an
	 */
	def showException(Exception e) {
		val showException = showError(e.localizedMessage, #["Ok", "Exception anzeigen"])
		if (showException > 0) {
			var text = "Exception:\n" + e.class.name + "\n\n"
			text = text + "Stack Trace:\n"
			var lineCount = 25
			var lastLine = "..."
			if (e.stackTrace.length < lineCount) {
				lineCount = e.stackTrace.length
				lastLine = ""
			}
			for (i : 0 ..< lineCount) {
				text = text + e.stackTrace.get(i) + "\n" 
			}  
			text = text + lastLine
			showError(text)
		}
	}
	
	/**
	 * zeigt eine Fehlermeldung an
	 */
	def showError(String message) {
		return showError(message, #["Ok"])
	}
	
	/**
	 * zeigt eine Fehlermeldung an
	 */
	def showError(String message, String[] buttons) {
		return JOptionPane.showOptionDialog(null, message, 
			"Codegenerierung - Fehler",	JOptionPane.ERROR_MESSAGE, 
			0, null, buttons, buttons.get(0));
	}
	/**
	 * setzt eine Referenz auf den Generator
	 */
	def setGenerator(Generator generator) {
		this.generator = generator
	}
	
	/**
	 * setzt die Generierung auf "beendet"
	 */
	def setGeneratorFinished() {
		backButton.setEnabled(true)
	}
	
}

/**
 * ActionListener zur Reaktion auf Button-Klicks
 */
class GeneratorActionListener implements ActionListener {
	
	private View view
	private Generator generator
	
	new(View view, Generator generator) {
		this.view = view
		this.generator = generator
	}
	
	override actionPerformed(ActionEvent e) {
		if (e.source instanceof JButton) {
			var button = e.source as JButton
			if (button.text.equals(View.START_GENERATOR_TEXT)) {
				view.showGeneratorComponents
				val Runnable runnable = [|
					try { 
						generator.generate
					} catch (Exception exception) {
						view.setGeneratorFinished
						view.showException(exception)
					}
				]
				val Thread thread = new Thread(runnable)
				thread.start
			}
			if (button.text.equals(View.BACK_TEXT)) {
				view.showInputOutputComponents
			}
			if (button.text.equals(View.CHOOSE_INPUT_TEXT)) {
				view.openFile
			}
			if (button.text.equals(View.CHOOSE_OUTPUT_TEXT)) {
				view.openDir
			}
		}
	}
}

/**
 * Panel zur Anzeige von Bildern
 */
class ImagePanel extends JPanel {
	private final BufferedImage IMAGE
	new(String imageRessource) {
		this.IMAGE = getImage(imageRessource)
	}
	override void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(IMAGE, 0, 0, this);
	}
	def BufferedImage getImage(String imgPath) {
		var java.net.URL imgUrl = getClass().getResource(imgPath);
		try {
			return ImageIO.read(imgUrl);
		} catch (IOException e) {
			throw new IllegalStateException("Image not found: " + imgPath);
		}
	}
}