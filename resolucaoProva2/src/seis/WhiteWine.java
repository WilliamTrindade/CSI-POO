/*
 * imprime : " wine chardonnay "
 * 3
 */
package seis;

public class WhiteWine extends Wine {
    
    @Override
    public void getGrape() {
        System.out.println("chardonnay");
    }
    
    public static void main(String[] args) {
        Wine v = new WhiteWine();
        v.getGrape();
    }
    
}
