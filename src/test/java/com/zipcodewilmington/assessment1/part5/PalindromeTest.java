package com.zipcodewilmington.assessment1.part5;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void solution0(){
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("aaa");
        Integer expected = 6;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution1(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("abccba");
        Integer expected = 9;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution2(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("daata");
        Integer expected = 7;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution3(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("lrfkqyuqfj");
        Integer expected = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution4(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("kxyqvnrtys");
        Integer expected = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void solution5(){
        // Should assert to true
        Palindrome palindrome = new Palindrome();
        Integer actual = palindrome.countPalindromes("ltvzkqtpvolphckcyufdqmlglimklfzktgygdttnhcvpfdfbrpzlkvshwywshtdgmbqbkkxcvgumonmwvytbytnuqhmfjaqtgngcwkuzyamnerphfmwevhwlezohyeehbrcewjxvceziftiqtntfsrptugtiznorvonzjfeacgamayapwlmbzitzszhzkosvnknberbltlkggdgpljfisyltmmfvhybljvkypcflsaqevcijcyrgmqirzniaxakholawoydvchveigttxwpukzjfhxbrtspfttotafsngqvoijxuvqbztvaalsehzxbshnrvbykjqlrzzfmlvyoshiktodnsjjpqplciklzqrxloqxrudygjtyzleizmeainxslwhhjwslqendjvxjyghrveuvphknqtsdtwxcktmwwwsdthzmlmbhjkmouhpbqurqfxgqlojmwsomowsjvpvhznbsilhhdkbdxqgrgedpzchrgefeukmcowoeznwhpiiduxdnnlbnmyjyssbsococdzcuunkrfduvouaghhcyvmlkzaajpfpyljtyjjpyntsefxiswjutenuycpbcnmhfuqmmidmvknyxmywegmtunodvuzygvguxtrdsdfzfssmeluodjgdgzfmrazvndtaurdkugsbdpawxitivdubbqeonycaegxfjkklrfkraoheucsvpiteqrswgkaaaohxxzhqjtkqaqhkwberbpmglbjipnujywogwczlkyrdejaqufowbigrsnjniegvdvotugocedktcbbufnxorixibbdfrzuqsyrfqghoyqevcuanuujszitaoaowsxyglafbwzddoznrvjqeyqignpitruijvyllsibobjltusrypanvybsfrxtlfmpdidtyozoolzslgdgowijatklvjzscizrkupmsoxftumyxifyunxucubvkfctkqlroqgzjvjwzizppvsomflvioemycnp");
        Integer expected = 1084;
        Assert.assertEquals(expected, actual);

    }
}
