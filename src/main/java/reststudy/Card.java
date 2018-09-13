package reststudy;

import java.util.ArrayList;
import java.util.Map;


public class Card {
	 private String name;
	 private String manaCost;
	 private float cmc;
	 ArrayList < String > colors = new ArrayList < String > ();
	 ArrayList < String > colorIdentity = new ArrayList < String > ();
	 private String type;
	 ArrayList < Map<String, String> > types = new ArrayList < Map<String, String> > ();
	 ArrayList < Map<String, String> > subtypes = new ArrayList < Map<String, String> > ();
	 private String rarity;
	 private String set;
	 private String setName;
	 private String text;
	 private String flavor;
	 private String artist;
	 private String power;
	 private String toughness;
	 private String layout;
	 private float multiverseid;
	 private String imageUrl;
	 ArrayList < String > printings = new ArrayList < String > ();
	 private String originalText;
	 private String originalType;
	 ArrayList < Map<String, String> > legalities = new ArrayList < Map<String, String> > ();
	 private String id;


	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public String getManaCost() {
	  return manaCost;
	 }

	 public int getIntManaCost() {
		 int numb = 0;
		 if(manaCost == null) {
			 return 0;
		 }
		 String temp = manaCost.replace("{", "");
		 temp = temp.replace("}", "");
		 if(!temp.replaceAll("[^0-9]+", "").equals("")) {
			 numb = Integer.parseInt(temp.substring(0, 1));
			 temp = temp.substring(1);
		 }
		 return numb + temp.length();
	 }
	 
	 public int getPower() {
		if (power == null) {
			return 0;
		}
		
		String temp = power.replaceAll("[^0-9]+","");
		if(temp.equals("")) {
			return 0;
		}
		
		return Integer.parseInt(temp);
	 }
	 
	 public ArrayList< String > getColorID() {
		 return colorIdentity;
	 }
	 
	 public ArrayList< String > getColors() {
			 return colors;
	 }
	 
	 public float getCmc() {
	  return cmc;
	 }

	 public String getType() {
	  return type;
	 }

	 public String getRarity() {
	  return rarity;
	 }

	 public String getSet() {
	  return set;
	 }

	 public String getSetName() {
	  return setName;
	 }

	 public String getText() {
	  return text;
	 }

	 public String getFlavor() {
	  return flavor;
	 }

	 public String getArtist() {
	  return artist;
	 }

	 public String getToughness() {
	  return toughness;
	 }

	 public String getLayout() {
	  return layout;
	 }

	 public float getMultiverseid() {
	  return multiverseid;
	 }

	 public String getImageUrl() {
	  return imageUrl;
	 }

	 public String getOriginalText() {
	  return originalText;
	 }

	 public String getOriginalType() {
	  return originalType;
	 }

	 public String getId() {
	  return id;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setManaCost(String manaCost) {
	  this.manaCost = manaCost;
	 }

	 public void setCmc(float cmc) {
	  this.cmc = cmc;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setRarity(String rarity) {
	  this.rarity = rarity;
	 }

	 public void setSet(String set) {
	  this.set = set;
	 }

	 public void setSetName(String setName) {
	  this.setName = setName;
	 }

	 public void setText(String text) {
	  this.text = text;
	 }

	 public void setFlavor(String flavor) {
	  this.flavor = flavor;
	 }

	 public void setArtist(String artist) {
	  this.artist = artist;
	 }

	 public void setPower(String power) {
	  this.power = power;
	 }

	 public void setToughness(String toughness) {
	  this.toughness = toughness;
	 }

	 public void setLayout(String layout) {
	  this.layout = layout;
	 }

	 public void setMultiverseid(float multiverseid) {
	  this.multiverseid = multiverseid;
	 }

	 public void setImageUrl(String imageUrl) {
	  this.imageUrl = imageUrl;
	 }

	 public void setOriginalText(String originalText) {
	  this.originalText = originalText;
	 }

	 public void setOriginalType(String originalType) {
	  this.originalType = originalType;
	 }

	 public void setId(String id) {
	  this.id = id;
	 }
	 
}