package me.Lorinth.RandomDungeon.Objects;

public class Vector3 {

	private int x;
	private int y;
	private int z;
	
	public Vector3(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Vector3 add(Vector3 other){
		return new Vector3(
				x + other.getX(),
				y + other.getY(),
				z + other.getZ()
		);
	}

	public boolean isBetween(Vector3 a, Vector3 b){
		return a.getX() <= x && x <= b.getX() &&
				a.getY() <= y && y <= b.getY() &&
				a.getZ() <= z && z <= b.getZ();
	}

}
