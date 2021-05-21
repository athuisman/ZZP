
// Opstartklasse voor een applicatie
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.*;

public class FactuurInvoer extends JFrame {

	public static void main(String[] args) {

		// Maak een frame
		JFrame frame = new FactuurInvoer();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MpMetaal ZZP");
		JPanel Paneel = new Paneel();
		frame.setContentPane(Paneel);
		frame.setVisible(true);
	}
}

class Paneel extends JPanel {
	private JTextArea naamTxt, gewerkteUrenTxt, geredenUrenTxt, geredenKilometersTxt, kilometerPrijsTxt, uurloonNettoTxt, uurloonBrutoTxt, reisurenNettoTxt, reisurenBrutoTxt, dagvergoedingTxt;
	private JLabel naamLb, gewerkteUrenLb, geredenUrenLb, geredenKilometersLb, kilometerPrijsLb, uurloonNettoLb, uurloonBrutoLb, reisurenNettoLb, reisurenBrutoLb, dagvergoedingLb;
	public String naam;
	public double gewerkteUren, geredenUren, geredenKilometers, kilometerPrijs, uurloonNetto, uurloonBruto, reisurenNetto, reisurenBruto, dagvergoeding;

	public Paneel()
	{
		// Aaanmaken layout
		this.setLayout(null);

		//Aanmaken textvakken
		naamTxt = new JTextArea(10,10);
		gewerkteUrenTxt = new JTextArea(10,10);
		geredenUrenTxt = new JTextArea(10,10);
		geredenKilometersTxt = new JTextArea(10,10);
		kilometerPrijsTxt = new JTextArea(10,10);
		uurloonNettoTxt = new JTextArea(10,10);
		uurloonBrutoTxt = new JTextArea(10,10);
		reisurenNettoTxt = new JTextArea(10,10);
		reisurenBrutoTxt = new JTextArea(10,10);
		dagvergoedingTxt = new JTextArea(10,10);

		naamLb = new JLabel("Naam :");
		gewerkteUrenLb = new JLabel("Gewerkte uren :");
		geredenUrenLb = new JLabel("Gereden uren :");
		geredenKilometersLb = new JLabel("Gereden kilometers :");
		kilometerPrijsLb = new JLabel("Kilometer prijs :");
		uurloonNettoLb = new JLabel("Uurloon netto :");
		uurloonBrutoLb = new JLabel("Uurloon bruto :");
		reisurenNettoLb = new JLabel("Reisuren netto :");
		reisurenBrutoLb = new JLabel("Reisuren bruto :");
		dagvergoedingLb = new JLabel("Dagvergoeding :");


		// Set bounds (x, y, widht, height)

		//Naam
		naamTxt.setBounds(140,30,175,20);
		naamLb.setBounds(10,30, 140,15);
		add(naamTxt);
		add(naamLb);

		// Gewerkte uren
		gewerkteUrenTxt.setBounds(140,60,175,20);
		gewerkteUrenLb.setBounds(10,60, 140,15);
		add(gewerkteUrenTxt);
		add(gewerkteUrenLb);

		// Gereden uren
		geredenUrenTxt.setBounds(140,90,175,20);
		geredenUrenLb.setBounds(10,90, 140,15);
		add(geredenUrenTxt);
		add(geredenUrenLb);

		// geredenKilometers
		geredenKilometersTxt.setBounds(140,120,175,20);
		geredenKilometersLb.setBounds(10,120, 140,15);
		add(geredenKilometersTxt);
		add(geredenKilometersLb);

		// kilometerPrijs
		kilometerPrijsTxt.setBounds(140,150,175,20);
		kilometerPrijsLb.setBounds(10,150, 140,15);
		add(kilometerPrijsTxt);
		add(kilometerPrijsLb);

		// uurloonNetto
		uurloonNettoTxt.setBounds(140,180,175,20);
		uurloonNettoLb.setBounds(10,180, 140,15);
		add(uurloonNettoTxt);
		add(uurloonNettoLb);

		// uurloonBruto
		uurloonBrutoTxt.setBounds(140,210,175,20);
		uurloonBrutoLb.setBounds(10,210, 140,15);
		add(uurloonBrutoTxt);
		add(uurloonBrutoLb);

		// reisurenNetto
		reisurenNettoTxt.setBounds(140,240,175,20);
		reisurenNettoLb.setBounds(10,240, 140,15);
		add(reisurenNettoTxt);
		add(reisurenNettoLb);

		// reisurenBruto
		reisurenBrutoTxt.setBounds(140,270,175,20);
		reisurenBrutoLb.setBounds(10,270, 140,15);
		add(reisurenBrutoTxt);
		add(reisurenBrutoLb);

		// Dagvergoeding
		dagvergoedingTxt.setBounds(140,300,175,20);
		dagvergoedingLb.setBounds(10,300, 140,15);
		add(dagvergoedingTxt);
		add(dagvergoedingLb);
	}
}
