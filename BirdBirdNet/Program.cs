
using System;
using System.Windows.Forms;

public class Program{
    public static Homepage form0 = new Homepage();
    [STAThread]
    static void Main(string[] args){
        form0.FormLayout();;
        Application.Run(form0);
    }
}
