
public class LetterToTemplars1 {


public static void main(String[] args) {
	String cipher = "aJuqseymedrarfeidnlPaeeserdahtsielttrenitiestnriteIyitosufmtsoitpmroatcnAeysuoacemothtHeloLynaadasoynukginhgttehergiontfehrcsudareistneherignoawaspporcaihgntiesdna(ppor1x72)0oYTumelprahsvabecemosertnoagdnopewfrlu--oypuorivedodruipglirsmiwhtrptoceitnonohtiejruonryetsrhuohghtdenaegorsuomnuatniuorsgeoisnrfmoaJffvaaiaRlmtaJoresulamehtawtrnitgehorbbreasdnhteievTsaosssiytuoOrdrrenasdmilpfityehuspproftortmehaviruoasersafouEorepoywurefeerderfmoataxitnonaodhtreefsehTsierustldenioybucemoniagtStawetiihantStaaednoywureneaelruytnuohcbaelybhtwerodllsaeedsrtOehtrahtnahytuoeltnominseofirtnresewtihhcsicautlaylofbrdiedAndnamyneldarefsledleelpiyynuodrbeItrnceneytaesroywureoetfnenioyruehdauqraetsrniiLamsslonoyCrpsunAyduoeldaamynenogittaoisnotahevhtPeircnsefouEorepsaistsnihtdeserideerocqneuirgnfohtHeloLynaIdtnehenogittaoisnoysurtvideotxelcduteehniidivudlaeTpmalgroosdofCrpyurfsortmxataoiInOntcbore3160oycumoemcndehtjeuonryeotrFnaecotohontrehniivatitnofooPeplCmenetsehtVtoeheldareosbftoOhdrreosKfinhgstT(melpranaHdsoipatllret)dosiucsswtpoiotntsehnuoiontfehrOedsrnapderaparitnofonawercsudae";
	String holder = "";
	String plaintxt = "";
	System.out.println(cipher);
	int j = 0;
	for (int i = 2; i <= cipher.length(); i++) {
		holder = cipher.substring(j, i);
		if (i % 2 == 0) {
			holder = holder + " ";
			plaintxt = plaintxt + holder;
		}
		j = j + 1;
	}
	System.out.println("\n" + plaintxt);
	
	String done = "";
	int y = 0;
	for (int x = 1; x <= plaintxt.length(); x += 3) {
		done = done + plaintxt.charAt(x);
		done = done + plaintxt.charAt(y);
		done = done + " ";
		y += 3;
	
		}
	System.out.println("\n" + done);



}
}
