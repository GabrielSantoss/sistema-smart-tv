package estudos;

public class SmartTv {

	public boolean ligada = false;
	public int canal = 1;
	public int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Volume aumentado para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Volume diminuido para: " + volume);
	}
	
	public void aumentarCanal() {
		canal++;
		System.out.println("Canal aumentado para: " + canal);
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Volume diminuido para: " + canal);
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
}
