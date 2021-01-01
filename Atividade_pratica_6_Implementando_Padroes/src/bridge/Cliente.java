package bridge;

public class Cliente {
	public static void main(String[] args) {
            Refrigerante refrigerante = new RefrigeranteCoca (new TamanhoRefrigerante200ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteCoca (new TamanhoRefrigerante300ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteCoca (new TamanhoRefrigerante600ml());
            refrigerante.exibe();
            
            System.out.println();
            
            refrigerante = new RefrigeranteFanta (new TamanhoRefrigerante200ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteFanta (new TamanhoRefrigerante300ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteFanta (new TamanhoRefrigerante600ml());
            refrigerante.exibe();
            
            System.out.println();
           
            refrigerante = new RefrigeranteSprite (new TamanhoRefrigerante200ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteSprite (new TamanhoRefrigerante300ml());
            refrigerante.exibe();
            refrigerante = new RefrigeranteSprite (new TamanhoRefrigerante600ml());
            refrigerante.exibe();
            
            System.out.println();
	}
}
