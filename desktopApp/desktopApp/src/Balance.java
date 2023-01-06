class Balance {
    private String user_name;
    private double chequering_balance;
    private double saving_balance;
    private int limit;

    public Balance(String user_name, int limit) throws Exception {
        if (user_name.length() < 2){
            throw new Exception();
        }
        this.user_name = user_name;
        this.chequering_balance = 0.0;
        this.saving_balance = 0.0;
        this.limit = limit;
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

    public void set_limit(int new_limit) throws Exception {
        if (new_limit < 500){
            throw new Exception();
        }
        this.limit = new_limit;
    }

    public int get_limit(){
        return this.limit;
    }
}
