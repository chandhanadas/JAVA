public class program3 {
    int real;
    int imaginary;

    public program3(int real_get,int imag_get){
        this.real = real_get;
        this.imaginary = imag_get;
    }
    public static program3 sum(program3 c1,program3 c2){
        program3 obj = new program3(0,0);
        obj.real = c1.real + c2.real;
        obj.imaginary = c1.imaginary + c2.imaginary;
        return obj;
    }
    public static void main(String []args){
        program3 first = new program3(1,2);
        program3 second = new program3(32,22);
        program3 obj = sum(first,second);
        System.out.println("Sum is : " + obj.real + "+" +obj.imaginary + "i");
    }
}
