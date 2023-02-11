class Addition {
    // Declaring the instance variables.
    int a;
    int b;
    int c;
    int d;
    // Declaring the parameterize constructor and initializing the parameters.
    Addition(int p, int q) {
        a = p;
        b = q;
        int ab = a + b;
        System.out.println("Addition of a and b : " + ab);
    }

    // Declaring an instance method and initializing parameters.
    void addition(int x, int y) {
        c = x;
        d = y;
        int cd = c + d;
        System.out.println("addition of c and d : " + cd);
    }

    public static void main(String[] args) {

        // Creating an anonymous object and passing the values to the constructor and calling method.
        new Addition(2,5).addition(3,5);
    }
}