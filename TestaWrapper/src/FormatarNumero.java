import java.text.NumberFormat;
 class FormatarNumero {

     public static void main(String[] args) {
         //Printando o numero que esta no parentese
         System.out.println(NumberFormat.getCurrencyInstance().format(12345678.90));

         //Fazendo um vetor com numeros declarando os valores a printar
         double n[] = {523.34, 54344.23, 95845.223, 1084.895};

         //objeto que recebe a formatação
         NumberFormat z = NumberFormat.getCurrencyInstance();

         for (int a = 0; a < n.length; a++) {

             if (a != 0)

                 System.out.print("-- ");

             System.out.print(z.format(n[a]));

             System.out.println();
         }

     }
 }
