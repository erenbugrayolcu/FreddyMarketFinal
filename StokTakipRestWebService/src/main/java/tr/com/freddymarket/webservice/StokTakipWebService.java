package tr.com.freddymarket.webservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/urun")
public class StokTakipWebService {
	
	private static final List<String> URUN_LISTESI = new ArrayList<>();
	
	static {
		URUN_LISTESI.add("Bakliyat");
		URUN_LISTESI.add("Sebze");
	}
	
	@GetMapping("/")
	public List<String> listele(){
		return URUN_LISTESI;
	}
	
}