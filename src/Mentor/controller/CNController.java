package Mentor.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Mentor.model.Item;
import Mentor.model.ItemService;

@RestController
@RequestMapping("/123")
public class CNController {
	
	@Autowired
	ItemService itemService;
	//正確答案ccca
	@PostMapping("/m1")
	public @ResponseBody String m1(@RequestBody String data) throws JSONException, ClassNotFoundException, SQLException {
		JSONObject json  = new JSONObject(data);
		System.out.println(json);
		String q1 = json.getString("1");
		String q2 = json.getString("2");
		String q3 = json.getString("3");
		String q4 = json.getString("4");
		System.out.println("q1="+q1+",q2="+q2+",q3="+q3+",q4="+q4);
		String account = json.getString("account");
		System.out.println("account="+account);
		int score = 0;
		if(q1.equals("c")) {
			score+=25;
		}
		if(q2.equals("c")) {
			score+=25;
		}
		if(q3.equals("c")) {
			score+=25;
		}
		if(q4.equals("a")) {
			score+=25;
		}
		
		Item item = new Item();
		item.setItemName("CN");
		item.setItemScore(score);
		item.setStudentId(account);
		
		itemService.insert(item);
		return "分數:"+score;
	}

	
	
}
