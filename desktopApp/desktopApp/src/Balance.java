class Balance {
    private String user_name;
    private double chequering_balance;
    private double saving_balance;

    public Balance(String user_name) throws Exception {
        if (user_name.length() < 2){
            throw new Exception();
        }
        this.user_name = user_name;
        this.chequering_balance = 0.0;
        this.saving_balance = 0.0;
    }

    public void set_user_name(String new_user_name) throws Exception {
        if (user_name.length() < 2){
            throw new Exception();
        }
        this.user_name = new_user_name;
    }

    public String get_user_name(){
        return this.user_name;
    }

    public void set_chequering_balance(double new_balance){
        this.chequering_balance = new_balance;
    }

    public double get_chequering_balance(){
        return this.chequering_balance;
    }

    public void set_saving_balance(double new_balance){
        this.saving_balance = new_balance;
    }

    public double get_saving_balance(){
        return this.saving_balance;
    }
}
