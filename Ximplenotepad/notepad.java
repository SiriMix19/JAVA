package Ximplenotepad;

import javax.swing.*;
import java.awt.event.*;

/* ------------------Hello Fucking World---------------------------- */
public class notepad implements ActionListener {
    JFrame notepadWin;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuF, menuE, menuFm, menuV, menusV, menuH, menuC, menusC;
    JMenuItem itemN, itemNW, itemO, itemS, itemSa, itemEx, itemC, itemCp, itemP,
            itemD, itemFt, itemZmI, itemZmO, itemH, itemCl;
    /* ------------------Call Function---------------------------- */
    np_func file = new np_func(this);

    /* ------------------Hello Fucking World---------------------------- */
    public notepad() {
        createnotepadWin();
        createtextArea();
        createMenuBar();
        createFMenu();
        createEMenu();
        createFmMenu();
        createVMenu();
        createHMenu();
        createCMenu();
        notepadWin.setVisible(true);
    }

    /* ------------------Notepad Program---------------------------- */
    public void createnotepadWin() {
        notepadWin = new JFrame("This is a Notepad from java Swing");
        notepadWin.setSize(600, 500);
        notepadWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /* ------------------Tex Area for Typing---------------------------- */
    public void createtextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        notepadWin.add(scrollPane);
    }

    /*------------------Create menuBar & Add Menu bar--------------------------- */
    public void createMenuBar() {
        menuBar = new JMenuBar();
        notepadWin.setJMenuBar(menuBar);
        menuF = new JMenu("File");
        menuBar.add(menuF);
        menuE = new JMenu("Edit");
        menuBar.add(menuE);
        menuFm = new JMenu("Format");
        menuBar.add(menuFm);
        menuV = new JMenu("View");
        menuBar.add(menuV);
        menuH = new JMenu("Help");
        menuBar.add(menuH);
        menuC = new JMenu("Color");
        menuBar.add(menuC);
    }

    public void createFMenu() {
        itemN = new JMenuItem("New");
        itemN.addActionListener(this);
        itemN.setActionCommand("New");
        menuF.add(itemN);

        itemNW = new JMenuItem("New Window");
        itemNW.addActionListener(this);
        itemNW.setActionCommand("New Window");
        menuF.add(itemNW);

        itemO = new JMenuItem("Open");
        itemO.addActionListener(this);
        itemO.setActionCommand("Open");
        menuF.add(itemO);

        menuF.addSeparator();
        itemS = new JMenuItem("Save");
        itemS.addActionListener(this);
        itemS.setActionCommand("Save");
        menuF.add(itemS);

        itemSa = new JMenuItem("Save As");
        itemSa.addActionListener(this);
        itemSa.setActionCommand("Save As");
        menuF.add(itemSa);

        menuF.addSeparator();
        itemEx = new JMenuItem("Exit");
        itemEx.addActionListener(this);
        itemEx.setActionCommand("Exit");
        menuF.add(itemEx);
    }

    public void createEMenu() {
        itemC = new JMenuItem("Cut");
        menuE.add(itemC);
        itemCp = new JMenuItem("Copy");
        menuE.add(itemCp);
        itemP = new JMenuItem("Paste");
        menuE.add(itemP);
        itemD = new JMenuItem("Delete");
        menuE.add(itemD);
    }

    public void createFmMenu() {
        itemFt = new JMenuItem("Font");
        menuFm.add(itemFt);
    }

    private void createVMenu() {
        menusV = new JMenu("Zoom");
        itemZmI = new JMenuItem("Zoom In");
        menusV.add(itemZmI);
        itemZmO = new JMenuItem("Zoom Out");
        menusV.add(itemZmO);
        menuV.add(menusV);
    }

    public void createHMenu() {
        itemH = new JMenuItem("View Help");
        menuH.add(itemH);
    }

    public void createCMenu() {
        menusC = new JMenu("Color");
        itemCl = new JMenuItem("Black");
        menusC.add(itemCl);
        itemCl = new JMenuItem("White");
        menusC.add(itemCl);
        menuC.add(menusC);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New":
                file.newFile();
                break;
            case "Open":
                file.Open();
                break;
            case "New Window":
                file.newWindow();
                break;
            case "Save":
                file.fSave();
                break;
            case "Save As":
                file.fSaveas();
                break;
            case "Exit":
                file.npExit();
                break;
        }
    }

    /* ------------------Run the Program MAin---------------------------- */
    public static void main(String[] args) {
        new notepad();
    }

}
