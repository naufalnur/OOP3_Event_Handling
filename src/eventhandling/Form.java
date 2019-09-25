package eventhandling;

import java.awt.event.*;
import javax.swing.*;

public class Form extends JFrame {

    //deklarasi variabel
    JLabel judul = new JLabel("Slip Gaji Pegawai");

    JLabel lnama = new JLabel("Nama Lengkap");
    JTextField tfnama = new JTextField();

    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rbPria = new JRadioButton("Laki-Laki");
    JRadioButton rbWanita = new JRadioButton("perempuan ");
    JTextField tfjeniskel = new JTextField("Belum dipilih");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    JTextField tfagama = new JTextField("Islam");

    JLabel lbidang = new JLabel("Bagian / Penempatan");
    JCheckBox cbLapangan = new JCheckBox("Lapangan");
    JCheckBox cbKantor = new JCheckBox("Kantor");
    JTextField tfbidang = new JTextField("Belum dipilih");

    JLabel gaji = new JLabel("Nominal Gaji");
    JTextField gaji1 = new JTextField("Rp. 8.000.000,-");
    JTextField gaji2 = new JTextField("Rp. 12.000.000,-");
    JTextField gaji3 = new JTextField("Rp. 16.000.000,-");
    JTextField tfgaji = new JTextField();

    JButton btnSave = new JButton("Sumbit");

    public Form() {
        //membuat java frame
        setTitle("D A T A   K E U A N G A N");
        setDefaultCloseOperation(3);
        setSize(350, 450);
        setVisible(true);

        //supaya hanya dapat memilih satu opsi pilihan
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        group.add(cbLapangan);
        group.add(cbKantor);

        //mengatur layout dan memasukan variabel ke java frame
        setLayout(null);
        add(judul);
        add(lnama);
        add(tfnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(tfjeniskel);
        add(lagama);
        add(cmbAgama);
        add(tfagama);
        add(lbidang);
        add(cbLapangan);
        add(cbKantor);
        add(tfbidang);
        add(gaji);
        add(gaji1);
        add(gaji2);
        add(gaji3);
        add(tfgaji);
        add(btnSave);

        //mengatur bounds
        judul.setBounds(125, 10, 100, 20);
        lnama.setBounds(10, 40, 120, 20);
        tfnama.setBounds(130, 40, 190, 20);
        ljeniskelamin.setBounds(10, 65, 120, 20);
        rbPria.setBounds(130, 65, 100, 20);
        rbWanita.setBounds(230, 65, 100, 20);
        tfjeniskel.setBounds(130, 95, 190, 20);
        tfjeniskel.setEditable(false);
        lagama.setBounds(10, 130, 150, 20);
        cmbAgama.setBounds(130, 130, 150, 20);
        tfagama.setBounds(130, 155, 190, 20);
        tfagama.setEditable(false);
        lbidang.setBounds(10, 180, 120, 20);
        cbLapangan.setBounds(130, 180, 100, 20);
        cbKantor.setBounds(230, 180, 150, 20);
        tfbidang.setBounds(130, 210, 190, 20);
        tfbidang.setEditable(false);
        gaji.setBounds(10, 235, 120, 20);
        gaji1.setBounds(130, 235, 120, 20);
        gaji1.setEditable(false);
        gaji2.setBounds(130, 260, 120, 20);
        gaji2.setEditable(false);
        gaji3.setBounds(130, 285, 120, 20);
        gaji3.setEditable(false);
        tfgaji.setBounds(130, 315, 190, 30);
        tfgaji.setEditable(false);
        btnSave.setBounds(125, 370, 100, 20);

        //membuat aksi item listener pada button JENIS KELAMIN
        rbPria.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbPria) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    tfjeniskel.setText("Laki-Laki");
                }
            }
        });
        rbWanita.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbWanita) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    tfjeniskel.setText("Perempuan");
                }
            }
        });
        //membuat aksi item listener pada combobox AGAMA
        cmbAgama.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                if (cmbAgama.equals(0)) {
                    tfagama.setText("Islam");
                } else if (cmbAgama.equals(1)) {
                    tfagama.setText("Kristen");
                } else if (cmbAgama.equals(2)) {
                    tfagama.setText("Katholik");
                } else if (cmbAgama.equals(3)) {
                    tfagama.setText("Hindu");
                } else if (cmbAgama.equals(4)) {
                    tfagama.setText("Budha");
                }
            }
        });
        //membuat aksi item listener pada checkbox BIDANG
        cbLapangan.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbLapangan) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    tfbidang.setText("Penempatan di : Lapangan");
                }
            }
        });
        cbKantor.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbKantor) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    tfbidang.setText("Penempatan di : Kantor");
                }
            }
        });
        //membuat aksi mouse listener pada GAJI
        gaji1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tfgaji.setText(gaji1.getText());
            }
        });
        gaji2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tfgaji.setText(gaji2.getText());
            }
        });
        gaji3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tfgaji.setText(gaji3.getText());
            }
        });
    }
}
