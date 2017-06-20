package me.Lorinth.RandomDungeon.Objects;

import java.util.ArrayList;

import org.bukkit.Material;

public class DungeonStyle {

	private Material Floor;
	private Material FloorBorder;
	private ArrayList<Material> Floors;
	private ArrayList<MaterialPattern> FloorDesign;
	private Material Wall;
	private Material WallBorder;
	private ArrayList<Material> Walls;
	private ArrayList<MaterialPattern> WallDesign;
	private Material Ceiling;
	private Material CeilingBorder;
	private ArrayList<Material> Ceilings;
	private ArrayList<MaterialPattern> CeilingDesign;
	private Material Door;
	
	public Material getMainFloorMaterial(){
		return Floor;
	}
	
	public void setMainFloorMaterial(Material mat){
		Floor = mat;
	}
	
	public Material getFloorBorder(){
		return FloorBorder;
	}
	
	public void setFloorBorder(Material mat){
		FloorBorder = mat;
	}
	
	public ArrayList<Material> getAllFloorTypes(){
		return Floors;
	}
	
	public void setAllFloorTypes(ArrayList<Material> mat){
		Floors = mat;
	}
	
	public ArrayList<MaterialPattern> getFloorPattern(){
		return FloorDesign;
	}
	
	public void setFloorPattern(ArrayList<MaterialPattern> patterns){
		FloorDesign = patterns;
	}
	
	public Material getMainWallMaterial(){
		return Wall;
	}
	
	public void setMainWallMaterial(Material mat){
		Wall = mat;
	}
	
	public Material getWallBorder(){
		return WallBorder;
	}
	
	public void setWallBorder(Material mat){
		WallBorder = mat;
	}
	
	public ArrayList<Material> getAllWallTypes(){
		return Walls;
	}
	
	public void setAllWallTypes(ArrayList<Material> mat){
		Walls = mat;
	}
	
	public ArrayList<MaterialPattern> getWallPattern(){
		return WallDesign;
	}
	
	public void setWallPattern(ArrayList<MaterialPattern> patterns){
		WallDesign = patterns;
	}
	
	public Material getMainCeilingMaterial(){
		return Ceiling;
	}
	
	public void setMainCeilingMaterial(Material mat){
		Ceiling = mat;
	}
	
	public Material getCeilingBorder(){
		return CeilingBorder;
	}
	
	public void setCeilingBorder(Material mat){
		CeilingBorder = mat;
	}
	
	public ArrayList<Material> getAllCeilingTypes(){
		return Ceilings;
	}
	
	public void setAllCeilingTypes(ArrayList<Material> mat){
		Ceilings = mat;
	}
	
	public ArrayList<MaterialPattern> getCeilingPattern(){
		return CeilingDesign;
	}
	
	public void setCeilingPattern(ArrayList<MaterialPattern> patterns){
		CeilingDesign = patterns;
	}
	
	public Material getDoorMaterial(){
		return Door;
	}
	
	public void setDoorMaterial(Material mat){
		Door = mat;
	}
	
}
