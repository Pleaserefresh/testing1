package com.jacode;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toLowerCase());

        var textBox3 = new TextBox();
        var textBox4 = textBox3;
        textBox3.setText("Hi it's box 3");
        System.out.println(textBox4.text);
    }
}
