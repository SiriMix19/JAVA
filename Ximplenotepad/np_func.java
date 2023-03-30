package Ximplenotepad;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class np_func {
    notepad npgui;
    String fName;
    String fAdress;

    public np_func(notepad npgui) {
        this.npgui = npgui;
    }

    public void newFile() {
        npgui.textArea.setText("");
        npgui.notepadWin.setTitle("NewNotep[A]d");
        fName = null;
        fAdress = null;
    }

    public void Open() {
        FileDialog fd = new FileDialog(npgui.notepadWin, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            fName = fd.getFile();
            fAdress = fd.getDirectory();
            npgui.notepadWin.setTitle(fName);
        }
        System.out.println("fAdress and fName" + fAdress + fName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(fAdress + fName));
            npgui.textArea.setText("");
            String line = null;
            while ((line = br.readLine()) != null) {
                npgui.textArea.append(line + "\n");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File not Open");
        }
    }

    public void newWindow() {
        notepad newNotepad = new notepad();
        newNotepad.notepadWin.setTitle("NewNotep[A]d2");
        newNotepad.notepadWin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newNotepad.notepadWin.setVisible(true);
        newNotepad.notepadWin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                newNotepad.notepadWin.dispose();
            }
        });
    }

    public void fSave() {
        if (fName == null) {
            fSaveas();
        } else {
            try {
                FileWriter fw = new FileWriter(fAdress + fName);
                fw.write(npgui.textArea.getText());
                npgui.notepadWin.setTitle(fName);
                fw.close();
            } catch (Exception e) {
                System.out.println("Something Wrong!!");
            }
        }
    }

    public void fSaveas() {
        FileDialog fd = new FileDialog(npgui.notepadWin, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            fName = fd.getFile();
            fAdress = fd.getDirectory();
            npgui.notepadWin.setTitle(fName);
        }
        try {
            FileWriter fw = new FileWriter(fAdress + fName);
            fw.write(npgui.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("Something Wrong!!");
        }
    }

    public void npExit() {
        System.exit(0);

    }
}
