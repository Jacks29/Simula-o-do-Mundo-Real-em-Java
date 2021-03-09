import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Natureza {
    DecimalFormat df = new DecimalFormat("###,##0.00");
        boolean passaroRelaxado=false;
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        Passaro passaro= new Passaro();
        passaro.setNome("Aroldo");
        passaro.setFaseDaVida("Adulto");
        passaro.setEstado("Cansado");
        System.out.println("Quantos quilos o Aroldo pesa?");
        double peso = sc.nextDouble();
        passaro.setPeso(peso);
        double aguenta;
        String tamanhoArvoreFinal;
        double tamanhoArvore;
        do{
            Arvore arvore = new Arvore();
            arvore.setEspecie("Carvalho");
            arvore.setIdade(30);
            tamanhoArvore= gerador.nextDouble()*40;
            tamanhoArvoreFinal=df.format(tamanhoArvore);
            arvore.setTamanho(tamanhoArvoreFinal);
            System.out.println("Quantos quilos a árvore pode suportar?");
            aguenta = sc.nextDouble();
            arvore.setForcaDoGalio(aguenta);
        
            System.out.println("O passaro Aroldo esta " + passaro.getEstado() +" e vai tentar pousar na árvore");
            if(peso<=aguenta){
               passaro.setEstado("Tranquilo");
               System.out.println("Ele consegui, agora ele esta "+ passaro.getEstado() + " nesta árvore de carvalho que tem "+ arvore.getTamanho()+ " metros de altura.");
               passaroRelaxado=true;
            }
            else{
                System.out.println("Ele tentou, mas a árvore não aguentou seu peso");
                System.out.println("Ele vai para outra para ver se consegue descansar");              
            }
        }while(passaroRelaxado == false);
        passaroRelaxado=false;
        Passaro oracio= new Passaro();
        oracio.setNome("Oracio");
        oracio.setFaseDaVida("Jovem");
        oracio.setPorte("Medio");
        oracio.setEstado("Cansado e carente");
        System.out.println("Agora surgiu um novo passaro o Oracio, ele tambem quer descansar e quer ficar na mesma árvore que Aroldo.");
        System.out.println("Quantos quilos o Oracio pesa?");
        double peso2 = sc.nextDouble();
        oracio.setPeso(peso2);
        double pesoTotal=peso+peso2;
        do{
            Arvore arvore = new Arvore();
            System.out.println("O passaro Aroldo esta " + oracio.getEstado() +" e vai tentar pousar na árvore");
            if(pesoTotal<=aguenta){
               oracio.setEstado("Tranquilo e acompanhado de seu companheiro");
               System.out.println("Ele consegui, agora ele esta "+ oracio.getEstado() + " nesta árvore de carvalho que tem  "+ tamanhoArvoreFinal + " metros de altura.");
               passaroRelaxado=true;
            }
            else{
                System.out.println("Ele tentou, mas a árvore não aguentou os dois");
                System.out.println("Eles vão para outra para ver se conseguem descansar");
                arvore.setEspecie("Carvalho");
                arvore.setIdade(30);
                tamanhoArvore= gerador.nextDouble()*40;
                tamanhoArvoreFinal=df.format(tamanhoArvore);
                arvore.setTamanho(tamanhoArvoreFinal);
                System.out.println("Quantos quilos a árvore pode suportar?");
                aguenta = sc.nextDouble();
                arvore.setForcaDoGalio(aguenta);
            }
           
            
        }while(passaroRelaxado==false);
    }
}