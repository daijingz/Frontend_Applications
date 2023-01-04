
using System;
using System.Windows.Forms;

public class Program{
    public static Homepage form = new Homepage();
    [STAThread]
    static void Main(string[] args){
        form.FormLayout();;
        Application.Run(form);
    }
}
