public class UsuarioSmartTV {
    public static void main(String[] args) {
    
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo StatusTV Ligada ? " + smartTv.ligada);




}
    
}
