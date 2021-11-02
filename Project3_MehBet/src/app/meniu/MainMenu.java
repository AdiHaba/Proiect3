package app.meniu;


import app.bjhl.VisualBJ;
import app.bjhl.VisualHL;
import app.gui.AdminGui;
import app.gui.SlotMachine;

import javax.sound.sampled.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class MainMenu extends JFrame {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("")
	public MainMenu() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super("MehBet Launcher");


		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon(getClass().getResource("dice2.png")).getImage(),
				new Point(0,0),"DiceCursor"));

		Color c = new Color(175, 12, 12);
		Color c2 = new Color(40, 39, 38);

		setLayout(new BorderLayout());


		setContentPane(new JLabel(new ImageIcon(getClass().getResource("mehbetimage.jpg"))));


		Box left = Box.createVerticalBox();


		JButton slots = new JButton(""), //slots
				exit = new JButton("Exit MehBet"), //exit
				hl = new JButton(""),  //high and low
				bj = new JButton(""),//blackjack
				admin = new JButton("Admin"),
				bet = new JButton("");//betting




		left.setPreferredSize(new Dimension(150, 150));

		// buton slots
		JPanel slotsPanel = new JPanel();
		slotsPanel.setOpaque(false);
		slotsPanel.setLayout(new GridLayout(0, 1, 0, 0));
		slotsPanel.setBounds(700, 40, 330, 300);
		slotsPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		slots.setFocusPainted(false);
		slots.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(97, 93, 92)));
		slots.setBounds(900, 20, 330, 300);
		slots.setForeground(new Color(57,57,57));
		slots.setFont(new Font("Arial", Font.PLAIN, 20));
		slots.setBackground(c2);
		slots.setOpaque(false);
		slots.setContentAreaFilled(false);
		slots.setBorderPainted(false);


		//hl panel
		JPanel hlPanel = new JPanel();
		hlPanel.setOpaque(false);
		hlPanel.setLayout(new GridLayout(0, 1, 0, 0));
		hlPanel.setBounds(750, 330, 300, 300);
		hlPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		hl.setFocusPainted(false);
		hl.setBorder(BorderFactory.createMatteBorder(5, 50, 5, 0, new Color(97, 93, 92)));
		hl.setForeground(new Color(57,57,57));
		hl.setFont(new Font("Arial", Font.PLAIN, 20));
		hl.setBackground(c2);
		hl.setOpaque(false);
		hl.setContentAreaFilled(false);
		hl.setBorderPainted(false);


		//bj buton
		JPanel bjPanel = new JPanel();
		bjPanel.setOpaque(false);
		bjPanel.setLayout(new GridLayout(0, 1, 0, 0));
		bjPanel.setBounds(40, 300, 300, 300);
		bjPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		bj.setFocusPainted(false);
		bj.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(97, 93, 92)));
		bj.setForeground(new Color(57,57,57));
		bj.setFont(new Font("Arial", Font.PLAIN, 20));
		bj.setBackground(c2);
		bj.setOpaque(false);
		bj.setContentAreaFilled(false);
		bj.setBorderPainted(false);

		//bet panel si buton
		JPanel betPanel = new JPanel();
		betPanel.setOpaque(false);
		betPanel.setLayout(new GridLayout(0, 1, 0, 0));
		betPanel.setBounds(20, 30, 300, 250);
		betPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		bet.setFocusPainted(false);
		bet.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(12, 3, 3)));
		bet.setForeground(new Color(183,0,0));
		bet.setFont(new Font("Arial", Font.PLAIN, 20));
		bet.setBackground(c2);
		bet.setOpaque(false);
		bet.setContentAreaFilled(false);
		bet.setBorderPainted(false);

		//admin buton

		JPanel adminPanel = new JPanel();
		adminPanel.setOpaque(false);
		adminPanel.setLayout(new GridLayout(0, 1, 0, 0));
		adminPanel.setBounds(450, 340, 200, 100);
		adminPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		admin.setFocusPainted(false);
		admin.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(12, 3, 3)));
		admin.setForeground(new Color(183, 0, 0));
		admin.setFont(new Font("Arial", Font.PLAIN, 20));
		admin.setBackground(c2);
		admin.setOpaque(true);
		admin.setContentAreaFilled(true);
		admin.setBorderPainted(true);



		//exit buton pane

		JPanel exitPanel = new JPanel();
		exitPanel.setOpaque(false);
		exitPanel.setLayout(new GridLayout(0, 1, 0, 0));
		exitPanel.setBounds(450, 405, 200, 100);
		exitPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 40, 0));

		exit.setFocusPainted(false);
		exit.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, new Color(12, 3, 3)));
		exit.setForeground(new Color(183, 0, 0));
		exit.setFont(new Font("Arial", Font.PLAIN, 20));
		exit.setBackground(c2);
		exit.setOpaque(true);
		exit.setContentAreaFilled(true);
		exit.setBorderPainted(true);


	   AudioInputStream stream;
	    AudioFormat format;
	    DataLine.Info info;
	    Clip clip;

	    File background_music = new File("C:\\Users\\Daniel\\Desktop\\Proiect3\\Project3_MehBet\\src\\app\\meniu\\bankrupt.wav");

	    stream = AudioSystem.getAudioInputStream(background_music);
	    format = stream.getFormat();
	    info = new DataLine.Info(Clip.class, format);
	    clip = (Clip) AudioSystem.getLine(info);
	    clip.open(stream);
		clip.start();

		AudioInputStream stream2;
		AudioFormat format2;
		DataLine.Info info2;
		Clip clip2;

		File background_music2 = new File("C:\\Users\\Daniel\\Desktop\\Proiect3\\Project3_MehBet\\src\\app\\meniu\\bankrupt2.wav");

		stream2 = AudioSystem.getAudioInputStream(background_music2);
		format2 = stream.getFormat();
		info2 = new DataLine.Info(Clip.class, format2);
		clip2 = (Clip) AudioSystem.getLine(info2);
		clip2.open(stream2);
		clip2.start();

		MouseAdapter ml = new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {

				AudioClip sound = null;
				try {
					sound = Applet.newAudioClip(getClass().getResource("button_hover.wav"));
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				sound.play();
				((AbstractButton) e.getSource()).setBorderPainted(true);
				((JComponent) e.getSource()).setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, c));
			}

			public void mouseExited(MouseEvent e) {
				((AbstractButton) e.getSource()).setBorderPainted(false);
				((JComponent) e.getSource()).setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, Color.GRAY));
			}

			public void mouseClicked(MouseEvent e) {

				AudioClip sound = null;
				sound = Applet.newAudioClip(getClass().getResource("action.wav"));
				sound.play();
				clip.stop();
			}
		};

	    exit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
				clip.stop();
            }
        });



		slots.addMouseListener(ml);
		exit.addMouseListener(ml);
		hl.addMouseListener(ml);
		bj.addMouseListener(ml);
		bet.addMouseListener(ml);
		admin.addMouseListener(ml);


		slotsPanel.add(slots);
		hlPanel.add(hl);
		bjPanel.add(bj);
		betPanel.add(bet);
		adminPanel.add(admin);
		exitPanel.add(exit);


		add(slotsPanel);
		add(hlPanel);
		add(betPanel);
		add(bjPanel);
		add(adminPanel);
		add(exitPanel);

		Box top = Box.createHorizontalBox();
		top.add(left);

		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		content.add(top, BorderLayout.WEST);


		setSize(1050, 498);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        setLocation((int) width/2-427, (int) height/2 - 235);
		setUndecorated(true);
		setVisible(true);

		hl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VisualHL("HighLow").show();
                clip.stop();
				clip2.stop();
				dispose();
			}
		});

		bj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new VisualBJ("BlackJack").show();
				clip.stop();
				clip2.stop();
				dispose();
			}
		});

		admin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminGui();
				clip.stop();
				clip2.stop();
				dispose();
			}
		});

		slots.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SlotMachine();
				clip.stop();
				clip2.stop();
				dispose();
			}
		});

		show();
	}

	public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		MainMenu app = new MainMenu();

		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}