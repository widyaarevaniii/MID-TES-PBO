/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package central0253;

/**
 *Nama : Widya ERevani Duwila
 *Stb : 13020210253
 */
interface A {
    public void aaa();
}

interface B extends A {
}
public class Central0253 {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Central0253 obj = new Central0253();
        System.out.println("main");
        obj.aaa();
    }
    
}
