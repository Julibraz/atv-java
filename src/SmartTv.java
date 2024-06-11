import java.util.Scanner;

public class SmartTv {
    Scanner scan = new Scanner(System.in);
    public boolean estaLigada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar(){
        estaLigada = true;
    }
    public void desligar(){
        estaLigada = false;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
    }

    public void chamaCanal(){
        //"s" para definir o canal "n" para sair e "m" para altera manualmente
        System.out.println("Deseja definir o canal ou alterar manualmente? s/n/m");
        String defCanal = scan.nextLine();
        if(defCanal.equals("s")){
            System.out.println("Ir para qual canal? ");
            int canal = scan.nextInt();
            definirCanal(canal);
            System.out.println("Alterado para o canal "+ canal);
        }else if(defCanal.equals("m")){
            String op;
            do{
                System.out.print("Aperte '+' para aumentar o canal, '-' para diminuir e 's' para selecionar: ");
                op = scan.nextLine();
                if(op.equals("+")){
                    aumentarCanal();
                    System.out.println("Canal: "+ canal);
                }else if(op.equals("-")){
                    diminuirCanal();
                    System.out.println("Canal: "+ canal);
                }
            }while(!op.equals("s"));
        }
    }

    public void chamaVolume(){
        System.out.println("Aperte '+' para aumentar o volume ou '-' para diminuir o volume, 's' para sair e 'c' para retornar a mudança de canal");
        String op;
        do{
            op = scan.nextLine();
            if(op.equals("+")){
                aumentarVolume();
                System.out.println("Volume: "+ volume);
            }else if(op.equals("-")){
                diminuirVolume();
                System.out.println("Volume: "+ volume);
            }else if(op.equals("c")){
                chamaCanal();
            }
            else if(op.equals("s")){
                System.out.println("Volume definido em "+ volume);
            }
            else{
                System.out.println("Opção inválida!");
            }
        }while(!op.equals("s"));
    }
}
