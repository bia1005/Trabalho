
public class TestePagamento {
	public static void main(String[] args) {
		FolhaPagamento salario = new FolhaPagamento(40,150.0,3);
		System.out.println("Salario Bruto: " + salario.salBruto() );
		System.out.println("Desconto INSS: " + salario.descInss() );
		System.out.println("Desconto IR: " + salario.descIr() );
		System.out.println("Salario Liquido: " + salario.salLiq() );
	}
}
