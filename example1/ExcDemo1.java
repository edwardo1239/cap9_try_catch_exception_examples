package example1;
class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        //Generate an index out-of-bounds exception.
        nums[7] = 10;
    }
}

class ExcDemo1 {
    public static void main(String args[]) {
    
        try {
            System.out.println("Before exception is generated.");
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            //cathc exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}