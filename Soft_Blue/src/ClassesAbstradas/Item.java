package ClassesAbstradas;

public abstract class Item {
	private int posX;
	private int posY;
	
	//metodo abstrado
	public abstract void pegar();
	
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
