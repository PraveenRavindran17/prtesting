package org.lang;

public class LanguageInfo extends StateDetails {
private void tamilLanguage() {
	System.out.println("Tamil Language is Spoken in 4 States ");

}
private void englishLanguage() {
 System.out.println("English Language is Spoken in All States ");

}
private void hindiLanguage() {
	System.out.println("Hindi Language is Spoken in 4 States ");

}
public static void main(String[] args) {
	LanguageInfo e = new LanguageInfo();
    e.tamilLanguage();
    e.englishLanguage();
    e.hindiLanguage();
    e.southIndia();
    e.northIndia();
    
}

}

