import javax.swing.JOptionPane;

public class Exer3{
   public static void main(String[] args)
   {
      int dia;
      int mes;
      int ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
      mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes: "));
      ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
      
      System.out.println(dia + "/" + mes + "/" + ano);
         
   }
}