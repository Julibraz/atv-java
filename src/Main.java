import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        SmartTv tv = new SmartTv();

        System.out.println("A TV esta Ligada? "+ tv.estaLigada);
        if(tv.estaLigada){
            System.out.println("No canal "+ tv.canal +" no volume "+ tv.volume);
            //"s" para definir o canal "n" para sair e "m" para altera manualmente
            tv.chamaCanal();
            //"+" para aumentar o volume, "-" para diminuir o volume e "s" para sair
            tv.chamaVolume();
        }else{
            System.out.println("Tv desligada.");
            System.out.println("Deseja ligar a Tv? s/n");
            String resposta = scan.nextLine();
            if(resposta.equals("s")){
                tv.ligar();
                System.out.println("\nA TV foi ligada no canal "+ tv.canal +" no volume "+ tv.volume);

                //"s" para definir o canal "n" para sair e "m" para altera manualmente
                tv.chamaCanal();
                //"+" para aumentar o volume, "-" para diminuir o volume, "s" para sair e "c" para retornar a mudança de canal
                tv.chamaVolume();
            }else{

                System.exit(0);
            }
        }
    } 

}