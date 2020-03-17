import javax.swing.JOptionPane;

public class Exer4{
   public static void main(String[] args){
      double peso;
      
      peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
      
      System.out.println("O peso informado foi " + peso + "kg");
   
   
   }
}