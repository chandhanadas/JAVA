public class program1{
    String pcode;
    String pname;
    int price;

    public program1(String pcode_get, String pname_get, int price_get) {
        pcode = pcode_get;
        pname = pname_get;
        price = price_get;
    }

    public int get_price() {
        return price;
    }

    public static void main(String[] args) {
        program1 p_1 = new program1("A123", "TV", 15000);
        program1 p_2 = new program1("B123", "RADIO", 8000);
        program1 p_3 = new program1("C123", "DVD", 7000);

        if (p_1.price <= p_3.price && p_1.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_1.pcode);
        if (p_3.price <= p_1.price && p_3.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_3.pcode);
        if (p_2.price <= p_3.price && p_2.price <= p_1.price) 
            System.out.println("Lowest product ID is  : " + p_2.pcode);

    }
}
