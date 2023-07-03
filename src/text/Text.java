package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<String> szovegek = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
        ));
        textModifier(szovegek);
        for (String szoveg : szovegek) {
            System.out.println(szoveg);
        }
    }

    public static void textModifier(List<String> texts) {
        for (int i = 0; i < texts.size(); i++) {
            String text = texts.get(i);
            if (text.length() > 25) {
                String modifiedText = text.substring(0, 20) + "...";
                texts.set(i, modifiedText);
            }
        }
    }
}
