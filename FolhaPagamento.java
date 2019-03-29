
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
		
		public double getHoraTrabalhada() {
			return horaTrabalhada;
		}
		public void setHoraTrabalhada(double horaTrabalhada) {
			this.horaTrabalhada = horaTrabalhada;
		}
		public double getsalHora() {
			return salHora;
		}
		public void setdepend(double salHora) {
			this.salHora = salHora;
		}
		public int getdepend() {
			return depend;
		}
		public void setHoraTrabalhada(int depend) {
			this.depend = depend;
		}
		
		public double salBruto () {
			return getHoraTrabalhada() * getsalHora() +(50* getdepend());
				
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
