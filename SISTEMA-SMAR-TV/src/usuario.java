public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTV smartTv = new smartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atualc: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("TV Ligada ? " + smartTv.ligado);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligado);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligado);
    }
}
