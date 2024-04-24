/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formatacao_campos;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
/**
 *
 * @author Admin
 */
public class Formatacao_Campos extends JFrame{
    JLabel rotuloCEP, rotuloTel, rotuloCPF, rotuloData;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaraCEP, mascaraTel, mascaraCPF, mascaraData;
    
        public Formatacao_Campos(){
            super("Exemplo com JTextField");
            Container tela = getContentPane();
            setLayout(null);
            
            rotuloCEP = new JLabel("CEP");
            rotuloTel = new JLabel("Telefone");
            rotuloCPF = new JLabel("CPF");
            rotuloData = new JLabel("Data");
            
            rotuloCEP.setBounds(50, 40, 100, 20);
            rotuloTel.setBounds(50, 80, 100, 20);
            rotuloCPF.setBounds(50, 120, 100, 20);
            rotuloData.setBounds(50, 160, 100, 20);
            
            try{
                mascaraCEP = new MaskFormatter("#####-###");
                mascaraTel = new MaskFormatter("(##)####-####");
                mascaraCPF = new MaskFormatter("#########-##");
                mascaraData = new MaskFormatter("##/##/####");
                
                mascaraCEP.setPlaceholderCharacter('_');
                mascaraTel.setPlaceholderCharacter('_');
                mascaraCPF.setPlaceholderCharacter('_');
                mascaraData.setPlaceholderCharacter('_');
            }
            catch(ParseException excp){}
            
            cep = new JFormattedTextField(mascaraCEP);
            tel = new JFormattedTextField(mascaraTel);
            cpf = new JFormattedTextField(mascaraCPF);
            data = new JFormattedTextField(mascaraData);
            
            cep.setBounds(150, 40, 100, 20);
            tel.setBounds(150, 80, 100, 20);
            cpf.setBounds(150, 120, 100, 20);
            data.setBounds(150, 160, 100, 20);
        
            tela.add(rotuloCEP);
            tela.add(rotuloTel);
            tela.add(rotuloCPF);
            tela.add(rotuloData);
            tela.add(cep);
            tela.add(tel);
            tela.add(cpf);
            tela.add(data);
            
            setSize(400, 250);
            setVisible(true);
            
        }   
    public static void main(String[] args) {
        Formatacao_Campos app = new Formatacao_Campos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
