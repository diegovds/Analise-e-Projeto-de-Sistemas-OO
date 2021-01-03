package ChainOfResponsability;

public class Cliente {

    public static void main(String[] args) {
        double refrigerante = 1.00, chips = 2.50, total = 0.0;

        MoedaChain moedas = new UmCent();
        moedas.setNext(new CincoCent());
        moedas.setNext(new DezCent());
        moedas.setNext(new VinteECincoCent());
        moedas.setNext(new CinquentaCent());
        moedas.setNext(new UmReal());

        try {
            System.out.println("Iniciando a compra de um refigerante de R$ 1,00:\n");

            moedas.efetuarPagamento(IDMoedas.cinquentaCent);
            total = total + moedas.next.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.vinteECincoCent);
            total = total + moedas.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.dezCent);
            total = total + moedas.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.dezCent);
            total = total + moedas.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.dezCent);
            total = total + moedas.next.next.getValorMoeda();

            System.out.println("\nFoi identificado um valor total de R$ " + total);
            System.out.println("Seu troco no valor de R$ " + String.format("%.2f", total - refrigerante) + "\n");

            System.out.println("Fim da compra do refigerante:\n");

            total = 0.0;

            System.out.println("Iniciando a compra de uma chips de R$ 2,50:\n");

            moedas.efetuarPagamento(IDMoedas.cinquentaCent);
            total = total + moedas.next.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.umReal);
            total = total + moedas.next.next.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.vinteECincoCent);
            total = total + moedas.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.vinteECincoCent);
            total = total + moedas.next.next.next.getValorMoeda();
            moedas.efetuarPagamento(IDMoedas.cinquentaCent);
            total = total + moedas.next.next.next.next.getValorMoeda();

            System.out.println("\nFoi identificado um valor total de R$ " + String.format("%.2f", total));
            System.out.println("Seu troco no valor de R$ " + String.format("%.2f", total - chips) + "\n");

            System.out.println("Fim da compra da chips:\n");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
