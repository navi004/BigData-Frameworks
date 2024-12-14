// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.print("Displaying odd numbers between 1 -100:\n");
        for(int i=1; i<=100;i++){
            if(i%2 != 0){
                System.out.print(i+"\t");
            }
        }
    }
}
