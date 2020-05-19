package com.intellekta;

public class test_1 {

    public static void main(String[] args) {
        Cubist cub = new Cubist("First", null, "Last", 5, 555);
        Impressionist imp = new Impressionist("First2", "Name2", null, 52, 144);
        Client cli = new Client(null, "Name2", "Last2", 111, 1234);

        System.out.println(cub.preferredStyleOfDrawings());
        System.out.println(imp.preferredStyleOfDrawings());
        System.out.println(cli.preferredStyleOfDrawings());

        System.out.println(cub.toString());
        System.out.println(imp.toString());
        System.out.println(cli.toString());
    }
}