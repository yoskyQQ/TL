//package Mentor.controller;
//
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/en")
//public class ENController {
//	//正確答案acda
//	@PostMapping("/m2")
//	public String en1(@RequestBody String data) throws JSONException {
//		JSONObject json  = new JSONObject(data);
//		System.out.println(json);
//		String enq1 = json.getString("enq1");
//		String enq2 = json.getString("enq2");
//		String enq3 = json.getString("enq3");
//		String enq4 = json.getString("enq4");
//		System.out.println("q1="+enq1+",q2="+enq2+",q3="+enq3+",q4="+enq4);
//		String account = json.getString("account");
//		System.out.println("account="+account);
//		int score = 0;
//		if(enq1.equals("b")) {
//			score+=25;
//		}
//		if(enq2.equals("a")) {
//			score+=25;
//		}
//		if(enq3.equals("c")) {
//			score+=25;
//		}
//		if(enq4.equals("a")) {
//			score+=25;
//		}
//		return "分數:"+score;
//	}
//
//}