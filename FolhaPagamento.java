
public class FolhaPagamento {
		//atributo
		private double horaTrabalhada;
		private double salHora;
		private int depend;
		
		public FolhaPagamento(double horaTrabalhada, double salHora, int depend) {
			this.horaTrabalhada = horaTrabalhada;
			this.salHora = salHora;
			this.depend = depend;
		}
		
		public double salBruto () {
			return horaTrabalhada * salHora +(50* depend);
				
		}
		double descInss () {
			if(salBruto()<=1000) {
				return (salBruto() *8.5) /100;
			}else if(salBruto()>1000){
				return (salBruto() *9) /100;
			} else {
				return 0;
			}
		
		}
		double descIr () {
			if(salBruto()<=500) {
				return 0;
			}else if(salBruto()>500 && salBruto()<=1000){
				return (salBruto() *5) /100;
			}else if(salBruto() > 1000) {
				return (salBruto() *7) /100;
			}else {
				return 0;
			}
		
		}
		public double salLiq () {
			return salBruto() - descInss() -descIr() ;
				
		}
		
}
