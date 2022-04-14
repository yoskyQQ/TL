//package Mentor.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import Mentor.model.Item;
//import Mentor.model.ItemService;
//
//
//@RestController
//public class itemController {
//	@Autowired
//	private ItemService iService;
//	
//	@GetMapping("/123/m1")
//	public Item processInsertAction(@RequestBody Item item) {
//		Item item1 = new Item();
//		
//		return iService.insert(item1);
//		
//	}
//	
//	public Item procseeQueryByIdAction(@RequestParam("item_no") Integer item_no) {
//		return iService.findById(null);
//	}
//	public Item procseeDeleteByIdAction() {
//		return iService.findById(null);
//	}
//	public Item procseeUpdateByIdAction() {
//		return iService.findById(null);
//	}
//	
//}
