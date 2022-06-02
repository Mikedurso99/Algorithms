
public class LetterToTemplars2 {
	public static void main(String[] args) {
		String cipher = "eHavcyouionsederadthrtouePopmCletensiheVssalroaFhencHmanseresideoinPeitinrsaidAvngnonandnotiARomendheisddpenoentrnougKineHavcyouionsederwdhotthesimehintselaottwtceneurivsharefurtheedeveloptdinahepustotrcinizerswerefihstCtrissiantandsheneubjoctsefthgKinwsNoythebaremecomingnoreoatiinalnstaedferlmoyelooaltithenrKimgdodsanKthesingidesoremnreiedepnndehceTfereooreiurKvngstiewahePOpalrrdeasthatspynbecondtounsriekanddingwomsiithencrnasisgmistruetTheyarnsoitdeboedttyoumhattainiainhngtceireurrintltfesmylesakenituelikhlythattieywvlleeerbeabletorApayolthyughrouaeethglareesttxisaingondmostctmbaeexpnrieacedyrmyrouafeinvactserytcatderewAfeoschslarehavorecnmmeadedcnewarusodetKour-ingf-sooarsdgoohButseisoupptsednofieancsthiiactyonbtdesiroyongyduanfconaiscgtinryoueassutsOnrKiigPhplipsIViuinsechdeepdmbtaoongrthetswiuhyotthasheisconridetingshiseuggostin";
		String holder = "";
		//String plaintxt = "eHavcyouionsederadthrtouePopmCletensiheVssalroaFhencHmanseresideoinPeitinrsaidAvngnonandnotiARomendheisddpenoentrnougKineHavcyouionsederwdhotthesimehintselaottwtceneurivsharefurtheedeveloptdinahepustotrcinizerswerefihstCtrissiantandsheneubjoctsefthgKinwsNoythebaremecomingnoreoatiinalnstaedferlmoyelooaltithenrKimgdodsanKthesingidesoremnreiedepnndehceTfereooreiurKvngstiewahePOpalrrdeasthatspynbecondtounsriekanddingwomsiithencrnasisgmistruetTheyarnsoitdeboedttyoumhattainiainhngtceireurrintltfesmylesakenituelikhlythattieywvlleeerbeabletorApayolthyughrouaeethglareesttxisaingondmostctmbaeexpnrieacedyrmyrouafeinvactserytcatderewAfeoschslarehavorecnmmeadedcnewarusodetKour-";
		String plaintxt = "";
		System.out.println(cipher);
//		int j = 0;
//		for (int i = 2; i <= cipher.length(); i++) {
//			holder = cipher.substring(j, i);
//			if (i % 2 == 0) {
//				holder = holder + " ";
//				plaintxt = plaintxt + holder;
//			}
//			j = j + 1;
//		}
		//System.out.println("\n" + plaintxt);
		
		String done = "";
		int first = 1;
		int second = 2;
		int third = 3;
		int fourth = 0;
		//int y = 0;
		for (int x = 4; x <= cipher.length(); x += 4) {
			done = done + cipher.charAt(first);
			done = done + cipher.charAt(second);
			done = done + cipher.charAt(third);
			done = done + cipher.charAt(fourth);
			//done = done + " ";
			//y += 1;
			first += 4;
			second += 4;
			third += 4;
			fourth += 4;

		
			}
		System.out.println("\n" + done);



	}
}





