package tr.com.freddymarket.webservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/urun")
public class StokTakipWebService {
	
	record Urun (String ad, int stok) {}
	
	private static final List<Urun> URUN_LISTESI = new ArrayList<>();
	
	static {
		URUN_LISTESI.add(new Urun("Bakliyat", 5));
		URUN_LISTESI.add(new Urun("Sebze", 23));
		URUN_LISTESI.add(new Urun("Icecek", 251));
	}
	
	@GetMapping("/")
	public List<Urun> listele(){
		return URUN_LISTESI;
	}
	
}