package step3;
/*
 * # 2Â÷¿ø¹è¿­[Á¤·Ä]
 * ¿µÈñ : °¨
 * ¿µÈñ : ±è¹ä
 * ¿µÈñ : »ç°ú
 * Ã¶¼ö : ±è¹ä
 * Ã¶¼ö : »ç°ú
 */
public class Ex13_2 {

	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
		};
		
		for(int i = 0; i<jang.length; i++) {
			String maxStr = jang[i][0];
			int maxIdx = i;
			for(int j = i; j<jang.length; j++) {
				if(jang[i][0].compareTo(jang[j][0]) > 0) {
				// jang[i][0]º¸´Ù jang[j][0]°¡ »çÀüÀûÀ¸·Î ¼ø¼­°¡ ¾ÕÀÌ¸é
					maxStr = jang[j][0];
					maxIdx = j;
				}
			}
			// jang[i] ¿Í jang[j] °ª ±³È¯ ( jang[i][0]jang[i][1] ÅëÂ°·Î )
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
		}
		
		for(int i = 0; i<jang.length; i++) {
			String maxStr = jang[i][0];
			int maxIdx = i;
			for(int j = i; j<jang.length; j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(jang[i][1].compareTo(jang[j][1]) > 0) {
						maxStr = jang[j][1];
						maxIdx = j;
					}
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;		
			
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}

}
