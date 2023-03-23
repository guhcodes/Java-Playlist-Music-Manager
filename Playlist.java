import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Farol das Estrelas");
        listaParaIlhaDeserta.add("Rei da Cacimbinha");
        listaParaIlhaDeserta.add("Cheia de Manias");
        listaParaIlhaDeserta.add("Bonde das Maravilhas");
        listaParaIlhaDeserta.add("Os Muleke É Liso");
        listaParaIlhaDeserta.add("Dança da Mãozinha");
        listaParaIlhaDeserta.add("Olha a Onda");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove(1);
        listaParaIlhaDeserta.remove(2);
        System.out.println(listaParaIlhaDeserta);
        int a = listaParaIlhaDeserta.indexOf("Os Muleke É Liso");
        int b = listaParaIlhaDeserta.indexOf("Cheia de Manias");
        String tempA = listaParaIlhaDeserta.get(a);
        String tempB = listaParaIlhaDeserta.get(b);
        listaParaIlhaDeserta.set(b, tempA);
        listaParaIlhaDeserta.set(a, tempB);
        System.out.println(listaParaIlhaDeserta);
    }
}