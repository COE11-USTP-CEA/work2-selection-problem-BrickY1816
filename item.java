class Item{
    String name;
    String cname;
    float price;

    public void Setname(String n){
        name = n;
    }
    public void Setcname(String c){
        categoryname = c;
    }
    public void Setprice(float p){
        price = p;
    }
    public String Getname(){
        return name;
    }
    public String Getcategoryname(){
        return cname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String n, String c, float p){
        name = n;
        categoryname = c;
        price = p;
    }
}
