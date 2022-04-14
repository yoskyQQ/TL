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
//@RequestMapping("/math")
//public class MathController {
//	//正確答案baca
//	@PostMapping("/m2")
//	public String math1(@RequestBody String data) throws JSONException {
//		JSONObject json  = new JSONObject(data);
//		System.out.println(json);
//		String mathq1 = json.getString("math1");
//		String mathq2 = json.getString("math2");
//		String mathq3 = json.getString("math3");
//		String mathq4 = json.getString("math4");
//		System.out.println("q1="+mathq1+",q2="+mathq2+",q3="+mathq3+",q4="+mathq4);
//		String account = json.getString("account");
//		System.out.println("account="+account);
//		int score = 0;
//		if(mathq1.equals("b")) {
//			score+=25;
//		}
//		if(mathq2.equals("a")) {
//			score+=25;
//		}
//		if(mathq3.equals("c")) {
//			score+=25;
//		}
//		if(mathq4.equals("a")) {
//			score+=25;
//		}
//		return "分數:"+score;
//	}
//
//}
