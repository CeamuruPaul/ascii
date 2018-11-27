package vet.exceptions;

public class exceptionTest {
    public static void main(String[] args) {
        int y = 10;
        try {
           int x = 1 / 0;
           y++;
        } catch (ArithmeticException e){
            System.out.println("Operatie imposibila");

        }
        catch (Exception e){
            System.out.println("Eroare de executie");
        }
        System.out.println(y);
    }
}
