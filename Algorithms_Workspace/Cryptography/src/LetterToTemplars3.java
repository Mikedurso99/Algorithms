
public class LetterToTemplars3 {
	public static void main(String[] args) {
		String cipher = "ydonoaT4ethh1tpStefeo1e30brmKuinor7saighsgndareanwsaretr-n-aatrsityangdaalunopelaTmltwhnsirexptecoonuaoYibteceorrtedpuaet13nhoOocthft1e30broaBck(l7aiy)rdFodnvncadtasceitriceehrobeyusinngogllniqadssdseiauncfisoteadTctsyraleohbaerhmcesntasheadlelsrtstteealdmalotiransiovffietweitcsichhatehoeopgtretmonhennotadnrfeteobrmnieohtohegfnOtct3h11e30brotnosad7tilyrctolwtolfsitrenhotnsciuaninotctthedoeIrfyodwifltuaoyrouamoveesslreewihrtabnulelcredpendtwaneeaorrefv-t-assektecdanfeyoroalsvereufnaiadstoountleestdrneaoumtileorwlrznedaigclefoipTchereoaplsoePlinowlokayobctlhipPiuaVsdIhpoepevleoiwnhsdtregtasiellhwyhtePutpnedepuosrsuperwHileerehattrlstplnoeaFnctriucrcsheinnsadhtgeaiateossrcpetgrnhosnofudotriceehhneeitstnhaetvPhoptetlastfieciondsoenhiiutpuorspsyooufrtnloteyRethenhooothpfl-spur-erofayutnhthtiiawleonesnsaterymoudandobeLrrytouihw";
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
		int first = 6;
		int second = 4;
		int third = 1;
		int fourth = 5;
		int fifth = 0;
		int sixth = 2;
		int seventh = 3;
		//int y = 0;
		for (int x = 7; x <= cipher.length(); x += 7) {
			done = done + cipher.charAt(first);
			done = done + cipher.charAt(second);
			done = done + cipher.charAt(third);
			done = done + cipher.charAt(fourth);
			done = done + cipher.charAt(fifth);
			done = done + cipher.charAt(sixth);
			done = done + cipher.charAt(seventh);

	
			first += 7;
			second += 7;
			third += 7;
			fourth += 7;
			fifth += 7;
			sixth += 7;
			seventh += 7;

		
			}
		System.out.println("\n" + done);



	}
}
