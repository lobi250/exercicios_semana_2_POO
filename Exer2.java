import javax.swing.JOptionPane;
   public class Exer2{
      public static void main(String[] args)
      {
         int numero;
         
         //JOptionPane.showInputDialog(), recebe uma string, para mudar para inteiro, terá que fazer um cast.
         numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
         
         System.out.println("O valor do numero digitado eh: " + numero);
      }
   }
   