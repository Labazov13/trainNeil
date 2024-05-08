class file4{
    public static void main(String[] args) {
        System.out.println("HELLO");
        sayHi();
        System.out.println(sayGoodbye());
    }

    public static void sayHi(){
        System.out.println("Hi");
    }

    public static String sayGoodbye(){
        return "BYE";
    }

    public static String say(String word){
        return word;
    }
}

