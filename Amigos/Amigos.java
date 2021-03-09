import java.util.Scanner;

public class Amigos {
    public static void main(String[] args) {
        Gabriel gabriel= new Gabriel();
        gabriel.setNome("Gabriel");
        gabriel.setIdade(20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Gabriel vai pilotar o carro?(S/N)");
        String resposta= sc.nextLine();
        Pessoa joao =new Pessoa();
        joao.setNome("João");
        joao.setIdade(25);
        Pessoa carla= new Pessoa();
        carla.setNome("Carla");
        carla.setIdade(22);
        Roberta roberta = new Roberta();
        roberta.setNome("Roberta");
        roberta.setIdade(19);
        if(resposta.equals("S")){
            gabriel.setVaiPilotar("Sim");
            gabriel.setEstarNoCarro(true);
            joao.setEstarNoCarro(true);
            carla.setEstarNoCarro(true);
            System.out.println("Roberta vai com quantos amigos?");
            int amigos= sc.nextInt();
            roberta.setVaiComQuantosAmigos(amigos);
            if(amigos>2){
                roberta.setEstarNoCarro(false);
                System.out.println("Roberta e seus amigos vão de ônibus, enquanto o resto da galera vai de carro para faculdade.");
            }
            else{
                roberta.setEstarNoCarro(true);
                System.out.println("Todos vão de carro para a faculdade.");
            }
                
        }
        else{
            gabriel.setVaiPilotar("Não");
            gabriel.setEstarNoCarro(false);
            joao.setEstarNoCarro(false);
            carla.setEstarNoCarro(false);
            roberta.setEstarNoCarro(false);
            
            System.out.println("Todos vão de ônibus para faculdade.");
        }
        
        
    }
}
