package chapter9;

 class Balance {
    String name;
    double bal;

    Balance(String name, double bal){
        name = name;
        bal = bal;
    }

    void show(){
        if(bal< 0){
            System.out.print("--> " );
            System.out.println(name +": $" + bal);
        }
    }
}
