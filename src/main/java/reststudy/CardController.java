package reststudy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardController {
	
	@Autowired
	CardConsumer cardConsumer;
	
	@RequestMapping(value = "/cards/{feature}")
	public List<Card> getCardsByFeature(@PathVariable("feature") String feature){
		List<Card> cards = new ArrayList<Card>();
		String featureLow = feature.toLowerCase();
		for(Card c : cardConsumer.getCards()) {
			if(c.getText().toLowerCase().contains(featureLow)) {
				cards.add(c);
			}
		}
		return cards;
	}
	
	@RequestMapping(value = "/images/{feature}", produces = {"text/html"})
	public String getImagesByFeature(@PathVariable("feature") String feature){
		String htm = "<html><head>cards</head><body>";
		String featureLow = feature.toLowerCase();
		for(Card c : cardConsumer.getCards()) {
			if(c.getText().toLowerCase().contains(featureLow)) {
				htm+="<p><img src=\"" + c.getImageUrl()+"\"/></p>";
			}
		}
		htm += "</body></html>";
		return htm;
	}
	
	@RequestMapping(value = "/mana/{feature}", produces = {"text/html"})
	public String getImagesByMana(@PathVariable("feature") String feature){
		String htm = "<html><head>cards</head><body>";
		int manaCost = Integer.parseInt(feature);
		for(Card c : cardConsumer.getCards()) {
			if(c.getIntManaCost() == manaCost) {
				htm+="<p><img src=\"" + c.getImageUrl()+"\"/></p>";
			}
		}
		htm += "</body></html>";
		return htm;
	}
	
	@RequestMapping(value = "/power/{feature}", produces = {"text/html"})
	public String getImagesByPower(@PathVariable("feature") String feature){
		String htm = "<html><head>cards</head><body>";
		int power = Integer.parseInt(feature);
		for(Card c : cardConsumer.getCards()) {
			if(c.getPower() == power) {
				htm+="<p><img src=\"" + c.getImageUrl()+"\"/></p>";
			}
		}
		htm += "</body></html>";
		return htm;
	}
	
	@RequestMapping(value = "/color/{feature}", produces = {"text/html"})
	public String getImagesByColor(@PathVariable("feature") String feature){
		String htm = "<html><head>cards</head><body>";
		String color = feature.toLowerCase();
		for( Card c : cardConsumer.getCards() ) {
			for( String col : c.getColors() )
				if( col.toLowerCase().equals(color) ) {
					htm+="<p><img src=\"" + c.getImageUrl()+"\"/></p>";
				}
			}
		htm += "</body></html>";
		return htm;
	}
}
